package BridgePattern;

import java.util.List;

public class ConsoleFormatter implements Formatter {

	public void format(String Header, List<Detail> details) {

		StringBuilder builder = new StringBuilder();
		builder.append(Header);
		builder.append("\n");
		for(Detail detail: details) {
			builder.append(detail.getName());
			builder.append(":");
			builder.append(detail.getValue());
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}

}
