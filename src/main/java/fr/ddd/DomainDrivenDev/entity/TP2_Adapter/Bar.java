package fr.ddd.DomainDrivenDev.entity.TP2_Adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * TP2 class - Bar
 */
@Getter
@Setter
@AllArgsConstructor
public class Bar {
	private Foo foo;
	
	public void log() {
		System.out.println(foo.hello());
	}
}
