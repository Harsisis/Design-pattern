package fr.ddd.DomainDrivenDev.entity.TP5_Strategy;

import java.math.BigDecimal;
import java.util.List;

public interface ICalculatorType {
	public BigDecimal calculate(List<BigDecimal> numbers);
}
