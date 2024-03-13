package fr.ddd.DomainDrivenDev.entity.TP3_AbstractFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Moto implements IVehicule {
	private String color;

	@Override
	public String drive() {
		return "BRAAAAAP";
	}
}
