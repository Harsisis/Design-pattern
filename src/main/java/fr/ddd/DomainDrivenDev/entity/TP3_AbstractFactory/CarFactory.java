package fr.ddd.DomainDrivenDev.entity.TP3_AbstractFactory;

public class CarFactory {
	
	public Car createBasicVehicule() {
		Car car = new Car("red");
		return car;
	}
}
