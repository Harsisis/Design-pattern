package fr.ddd.DomainDrivenDev.entity.TP1;

public class Qux implements Printable {

	@Override
	public String print(String sender) {
		return sender + " says : 'Bonjour!'";
	}

}
