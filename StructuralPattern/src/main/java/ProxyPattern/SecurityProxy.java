package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

	private Object obj;
	
	private SecurityProxy(Object obj) {
		this.obj = obj;
	}
	
	public static Object newInstance(Object obj) {
		InvocationHandler iH = new SecurityProxy(obj);
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader()
				, obj.getClass().getInterfaces()
				, iH);
	}
	
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		try {
			if(method.getName().contains("post")) {
				throw new IllegalAccessException("Post method is not allowed");
			}
			result = method.invoke(obj, args);
			//String response = proxy.getTimeline(args);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}

}
