package fr.ddd.DomainDrivenDev.entity.TP2_Adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * TP2 class - Foo
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foo {
	private String name;
	
	public String hello() {
		return this.name + " says : 'Hello'";
	}
}
