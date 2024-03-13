package fr.ddd.DomainDrivenDev.entity.TP4_Command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Human implements Handler {

	private String name;
	
	@Override
	public String sayMyName() {
		return "I'm " + this.name;
	}

}
