package fr.ddd.DomainDrivenDev.entity.TP1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestFoo {
	
	@Test
	public void test_hello_from_bar_printer() {
		Foo foo = new Foo("Foo", new Bar());
		
		assertEquals("Foo says : 'Hello!'", foo.hello());
	}
	
	@Test
	public void test_hello_from_qux_printer() {
		Foo foo = new Foo("Foo", new Qux());
		
		assertEquals("Foo says : 'Bonjour!'", foo.hello());
	}

}
