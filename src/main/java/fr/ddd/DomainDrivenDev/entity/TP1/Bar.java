package fr.ddd.DomainDrivenDev.entity.TP1;

public class Bar implements Printable {

	@Override
	public String print(String sender) {
		return sender + " says : 'Hello!'";
	}
}
