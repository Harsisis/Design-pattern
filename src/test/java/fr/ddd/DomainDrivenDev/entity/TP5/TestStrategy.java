package fr.ddd.DomainDrivenDev.entity.TP5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.ddd.DomainDrivenDev.entity.TP5_Strategy.Calculator;
import fr.ddd.DomainDrivenDev.entity.TP5_Strategy.CalculatorTypeEnum;

@SpringBootTest
public class TestStrategy {

	
	private static List<BigDecimal> numbers;
	
	private static Calculator calculator;
	
	@BeforeEach
	public void init() {
		numbers = new ArrayList<BigDecimal>();
		numbers.add(BigDecimal.valueOf(20));
		numbers.add(BigDecimal.valueOf(40));
		numbers.add(BigDecimal.valueOf(30));
		numbers.add(BigDecimal.valueOf(10));
		
		calculator = new Calculator();
	}
	
	@Test
	public void test_should_be_equal_when_sum() {
		assertEquals(BigDecimal.valueOf(100), calculator.calculate(numbers, CalculatorTypeEnum.SUM));
	}

	@Test
	public void test_should_be_equal_when_substract() {
		assertEquals(BigDecimal.valueOf(-100), calculator.calculate(numbers, CalculatorTypeEnum.SUBSTRACT));
	}

	@Test
	public void test_should_be_equal_when_multiply() {
		assertEquals(BigDecimal.valueOf(240000), calculator.calculate(numbers, CalculatorTypeEnum.MULTIPLY));
	}

	@Test
	public void test_should_be_equal_when_divide() {
		numbers = new ArrayList<BigDecimal>();
		numbers.add(BigDecimal.valueOf(100));
		numbers.add(BigDecimal.valueOf(5));
		numbers.add(BigDecimal.valueOf(2));
		assertEquals(BigDecimal.valueOf(10), calculator.calculate(numbers, CalculatorTypeEnum.DIVIDE));
	}
}
