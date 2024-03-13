package fr.ddd.DomainDrivenDev.entity.TP5_Strategy;

import java.util.function.Supplier;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CalculatorTypeEnum {
	SUM(() -> new SumCalculator()),
	SUBSTRACT(() -> new SubstractCalculator()),
	MULTIPLY(() -> new MultiplyCalculator()),
	DIVIDE(() -> new DivideCalculator());
	
	private final Supplier<ICalculatorType> calculation;
}
