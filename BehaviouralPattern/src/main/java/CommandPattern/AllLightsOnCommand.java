package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class AllLightsOnCommand implements Command {

	private List<Light> lights = new ArrayList<Light>();
	
	public AllLightsOnCommand(List<Light> lights) {
		this.lights = lights;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		for(Light light: lights) {
			light.Off();
		}
	}

}
