package fr.ddd.DomainDrivenDev.entity.TP4_Command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Robot {
	private String name;

	public String hello() {
		return this.name + " says : \"Hello World !\"";
	}
}
