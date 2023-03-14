package CommandPattern;

public class ToggleCommand implements Command {
	private Light light;
	
	public ToggleCommand(Light light) {
		this.light = light;
	}
	
	
	public void execute() {
		// TODO Auto-generated method stub
		//light.connect();
		//light.isBluetoothEnabled();
		//light.isOn();
		//boolean isEnergySavingModeEnabled = EngerySavingMode.isOn();
		//if(isEnergySavingModeEnabled){
		//	light.dontToggle();
		//}
		//else{
		//	light.toggle();
		//}
		//light.disconnect();
		//
		
		light.toggle();
	}

}
