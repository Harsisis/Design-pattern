package fr.ddd.DomainDrivenDev.entity.TP5_Strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class DivideCalculator implements ICalculatorType {

	@Override
	public BigDecimal calculate(List<BigDecimal> numbers) {
		BigDecimal result = numbers.remove(0);
		for(BigDecimal number : numbers) {
			result = result.divide(number, 0, RoundingMode.HALF_UP);
		}
		return result;
	}

}