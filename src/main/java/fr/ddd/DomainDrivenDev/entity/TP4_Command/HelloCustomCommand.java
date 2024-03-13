package fr.ddd.DomainDrivenDev.entity.TP4_Command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HelloCustomCommand implements Command {
	
	private final String sender = "****";
	
	private Robot robot;

	@Override
	public String exec() {
		this.robot.setName(this.sender);
		return this.robot.hello();
	}

}
