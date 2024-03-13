package fr.ddd.DomainDrivenDev.entity.TP4_Command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HelloCommandWithHandler implements Command {
	
	private Robot robot;
	private Handler handler;

	@Override
	public String exec() {
		return handler.sayMyName() + " : " + robot.hello();
	}

}
