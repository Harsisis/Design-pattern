package fr.ddd.DomainDrivenDev.entity.TP5_Strategy;

import java.math.BigDecimal;
import java.util.List;

public class SumCalculator implements ICalculatorType {

	@Override
	public BigDecimal calculate(List<BigDecimal> numbers) {
		return numbers.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
	}

}
