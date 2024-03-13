package fr.ddd.DomainDrivenDev.entity.TP2_Adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * TP2 class - Baz
 */
@Getter
@Setter
@AllArgsConstructor
public class Baz{
	private String name;
	
	public String bonjour() {
		return this.name + " dit : 'Bonjour !'";
	}
}
