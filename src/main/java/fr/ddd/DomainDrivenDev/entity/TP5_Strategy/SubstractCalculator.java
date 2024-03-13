package fr.ddd.DomainDrivenDev.entity.TP5_Strategy;

import java.math.BigDecimal;
import java.util.List;

public class SubstractCalculator implements ICalculatorType {

	@Override
	public BigDecimal calculate(List<BigDecimal> numbers) {
		return  BigDecimal.ZERO.subtract(numbers.stream().reduce(BigDecimal.ZERO, BigDecimal::add));
	}

}