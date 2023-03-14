package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	
	private List<Light> lights = new ArrayList<Light>();
	private List<Fan> fans =  new ArrayList<Fan>();
	
	
	public Mediator() {
	}
	
	public boolean registerElectronicAppliance(List<ElectronicAppliance> electronicAppliances ) {
		for(ElectronicAppliance eA: electronicAppliances) {
			if(Fan.class.isInstance(eA)) {
				this.fans.add((Fan) eA);
			}else {
				this.lights.add((Light) eA);
			}
		}
		return true;
	}
	
	public void onAllLights() {
		for(Light light: lights) {
			if(!light.isOn()) {
				light.toggle();
			}
		}
	}
	
	public void offAllLights() {
		for(Light light: lights) {
			if(light.isOn()) {
				light.toggle();
			}
		}
	}

	public void onAllFans() {
		// TODO Auto-generated method stub
		for(Fan fan: fans) {
			if(!fan.isOn()) {
				fan.toggle();
			}
		}
	}
	
}
