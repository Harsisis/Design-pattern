package fr.ddd.DomainDrivenDev.entity.TP2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.ddd.DomainDrivenDev.entity.TP2_Adapter.Bar;
import fr.ddd.DomainDrivenDev.entity.TP2_Adapter.Baz;
import fr.ddd.DomainDrivenDev.entity.TP2_Adapter.BazToFooAdapter;
import fr.ddd.DomainDrivenDev.entity.TP2_Adapter.Foo;

@SpringBootTest
public class TestFoo2 {
	
	@Test
	public void test_hello_from_Foo_printer() {
		Bar bar = new Bar(new Foo("Foo"));
		
		assertEquals("Foo says : 'Hello'", bar.getFoo().hello());
	}
	
	@Test
	public void test_hello_from_Baz_printer() {
		Bar bar = new Bar(new BazToFooAdapter(new Baz("Baz")));
		
		assertEquals("Baz dit : 'Bonjour !'", bar.getFoo().hello());
	}

}
