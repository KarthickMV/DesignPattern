package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class MediatorDemo {
	
	public static Mediator registerHomeDevices() {
		Mediator mediator = new Mediator();
		List<ElectronicAppliance> appliances = new ArrayList<ElectronicAppliance>();
		appliances.add(new Light());
		appliances.add(new Fan());
		appliances.add(new Light());
		mediator.registerElectronicAppliance(appliances);
		return mediator;
	}
	
	public static void main(String[] args) {
		Mediator mediator = registerHomeDevices();
		Command allLightsOnCommand = new AllLightsOnCommand(mediator);
		allLightsOnCommand.execute();
		Command allFanCommand =  new AllFansOnCommand(mediator);
		allFanCommand.execute();
	}

}
