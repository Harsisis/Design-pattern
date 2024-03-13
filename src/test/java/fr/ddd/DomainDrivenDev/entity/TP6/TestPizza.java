package fr.ddd.DomainDrivenDev.entity.TP6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.ddd.DomainDrivenDev.entity.TP6_Observer.Pizza;
import fr.ddd.DomainDrivenDev.entity.TP6_Observer.PizzaOrderer;
import fr.ddd.DomainDrivenDev.entity.TP6_Observer.Printer;

@SpringBootTest
public class TestPizza {
	
	private static List<Pizza> pizzas;
	private static PizzaOrderer orderer;
	private static Printer printer;

	@BeforeAll
	public static void init() {
		pizzas = new ArrayList<Pizza>();
		pizzas.add(new Pizza("Margarita", 10d));
		pizzas.add(new Pizza("4 fromages", 13d));
		pizzas.add(new Pizza("Mexicaine", 13.5d));
		pizzas.add(new Pizza("Saumon", 14d));
		
		orderer = new PizzaOrderer();
		printer = new Printer();
	}
	
	@Test
	public void test_pizza_bill_should_be() {
		
		assertEquals("You must pay : 50.5 €", orderer.order(pizzas, printer));
	}
}
