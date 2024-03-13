package fr.ddd.DomainDrivenDev.entity.TP2_Adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BazToFooAdapter extends Foo {
	private Baz baz;

	public BazToFooAdapter(Baz baz) {
		super();
		this.baz = baz;
	}
	
	public BazToFooAdapter(String name, Baz baz) {
		super(name);
		this.baz = baz;
	}
	
	@Override
	public String hello() {
		return this.baz.bonjour();
	}

}
