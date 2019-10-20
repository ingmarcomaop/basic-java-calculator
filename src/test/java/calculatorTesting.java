import static org.junit.Assert.*;


import basic.java.calculator.implementation.*;

import org.junit.Test;

public class calculatorTesting {
	
	IOperationCalculator operation = new OperationCalculator();

	@Test
	public void addition() {
		
		Double actual = operation.addition(10.0, 1.0);
		Double expected = 11.0;
		
		String actualStr = String.valueOf(actual);
		String expectedStr = String.valueOf(expected);
		
		assertEquals(expectedStr, actualStr);	
		
	}
	
	@Test
	public void subtraction() {
		
		Double actual = operation.subtraction(10.0, 7.0);
		Double expected = 3.0;
		
		String actualStr = String.valueOf(actual);
		String expectedStr = String.valueOf(expected);
		
		assertEquals(expectedStr, actualStr);	
		
	}

}
