package fr.ddd.DomainDrivenDev.entity.TP3_AbstractFactory;

import java.util.function.Supplier;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VehiculeEnum {
	MOTO(() -> {
		return new MotoFactory().createBasicVehicule();
	}), CAR(() -> {
		return new CarFactory().createBasicVehicule();
	});

	private final Supplier<IVehicule> supplier;
}
