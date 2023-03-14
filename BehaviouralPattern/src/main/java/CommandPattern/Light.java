package CommandPattern;


//receiver
public class Light {
	
	private boolean isOn =false;
	
	public boolean isOn() {
		return isOn;
	}
	
	public Light() {
		
	}
	
	public void toggle() {
		if(isOn) {
			Off();
			isOn = !isOn;
		}else {
			On();
			isOn = !isOn;
		}
	}

	private void On() {
		// TODO Auto-generated method stub
		System.out.println("Turning on Light");
	}

	public void Off() {
		// TODO Auto-generated method stub
		isOn = true;
		System.out.println("Turning off Light");
	}

}
