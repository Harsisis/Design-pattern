package fr.ddd.DomainDrivenDev.entity.TP4_Command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HelloCommand implements Command {
	
	private Robot robot;

	@Override
	public String exec() {
		return robot.hello();
		
	}
}
