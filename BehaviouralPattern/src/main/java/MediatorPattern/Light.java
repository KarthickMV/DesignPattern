package MediatorPattern;

public class Light implements ElectronicAppliance {
	
	private boolean isOn = false;
	
	public Light() {
		
	}
	
	public void toggle() {
		if(!isOn) {
			isOn = true;
			on();
		}else {
			isOn = false;
			off();
		}
	}
	
	public boolean isOn() {
		return isOn;
	}

	public  void off() {
		// TODO Auto-generated method stub
		System.out.println("Turning Off Light");
	}

	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Turning on Light");
	}

	
	
}
