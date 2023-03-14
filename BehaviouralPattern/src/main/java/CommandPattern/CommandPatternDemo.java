package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandPatternDemo {
	
	public static void main(String[] args) {
		//receiver
		Light light1 = new Light();
		Light light2 = new Light();
		Light light3 = new Light();
		//LightManipulator.manipulateLightObject(light1);
		//ConcreteCommand
		Command toggleCommand = new ToggleCommand(light1);
		//Invoker
		Switch LightSwitch = new Switch();
		
		LightSwitch.executeCommand(toggleCommand);
		toggleCommand = new ToggleCommand(light2);
		LightSwitch.executeCommand(toggleCommand);
		
		//macro
		List<Light> lights = new ArrayList<Light>();
		lights.add(light1);
		lights.add(light2);
		lights.add(light3);
		
		Command allLightCommand = new AllLightToggleCommand(lights);
		
		Command allLightOnCommand = new AllLightsOnCommand(lights);
		
		LightSwitch.executeCommand(allLightCommand);
		
	}

}
