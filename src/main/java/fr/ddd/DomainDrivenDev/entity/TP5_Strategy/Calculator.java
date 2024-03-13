package fr.ddd.DomainDrivenDev.entity.TP5_Strategy;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {

	public BigDecimal calculate(List<BigDecimal> numbers, CalculatorTypeEnum type) {
		return type.getCalculation().get().calculate(numbers);
	}
}
