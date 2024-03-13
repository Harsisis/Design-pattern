package fr.ddd.DomainDrivenDev.entity.TP3_AbstractFactory;

public class IVehiculeFactory {

	public IVehicule createVehicule(VehiculeEnum type) {
		return type.getSupplier().get();
	}
}
