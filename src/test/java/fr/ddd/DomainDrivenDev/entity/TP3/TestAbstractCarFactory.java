package fr.ddd.DomainDrivenDev.entity.TP3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.ddd.DomainDrivenDev.entity.TP3_AbstractFactory.IVehiculeFactory;
import fr.ddd.DomainDrivenDev.entity.TP3_AbstractFactory.VehiculeEnum;


@SpringBootTest
public class TestAbstractCarFactory {

	@Test
	public void test_AbstractFacotry_generate_basic_moto() {
		IVehiculeFactory motoFacto = new IVehiculeFactory();
		
		assertEquals("BRAAAAAP", motoFacto.createVehicule(VehiculeEnum.MOTO).drive());
	}
	
	@Test
	public void test_AbstractFacotry_generate_basic_car() {
		IVehiculeFactory carFacto = new IVehiculeFactory();
		
		assertEquals("VROOOM", carFacto.createVehicule(VehiculeEnum.CAR).drive());
	}
}
