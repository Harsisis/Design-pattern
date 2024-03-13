package fr.ddd.DomainDrivenDev.entity.TP6_Observer;

import java.util.List;

public class PizzaOrderer {
	
	public String order(List<Pizza> pizzas, Printer printer) {
		double bill = pizzas.stream().map(pizza -> pizza.getPrice()).reduce(0d, (a, b) -> a + b);
		return printer.print("You must pay : " + bill + " €");
	}
}
