package CommandPattern;

import java.util.List;

public class AllLightToggleCommand implements Command {

	private List<Light> lights;
	
	public AllLightToggleCommand(List<Light> lights) {
		this.lights = lights;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		for(Light light:lights) {
			if(light.isOn()) {
				light.toggle();
				
				
			}
		}
	}

}
