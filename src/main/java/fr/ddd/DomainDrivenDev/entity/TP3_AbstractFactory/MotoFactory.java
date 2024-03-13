package fr.ddd.DomainDrivenDev.entity.TP3_AbstractFactory;

public class MotoFactory extends IVehiculeFactory {
	
	public Moto createBasicVehicule() {
		Moto moto = new Moto("black");
		return moto;
	}
}
