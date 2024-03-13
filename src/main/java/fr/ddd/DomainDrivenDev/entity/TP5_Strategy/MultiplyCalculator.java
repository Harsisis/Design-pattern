package fr.ddd.DomainDrivenDev.entity.TP5_Strategy;

import java.math.BigDecimal;
import java.util.List;

public class MultiplyCalculator implements ICalculatorType {

	@Override
	public BigDecimal calculate(List<BigDecimal> numbers) {
		BigDecimal result = BigDecimal.ONE;
		for(BigDecimal number : numbers) {
			result = result.multiply(number);
		}
		return result;
	}

}