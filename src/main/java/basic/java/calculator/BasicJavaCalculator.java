package basic.java.calculator;

import basic.java.calculator.implementation.*;

public class BasicJavaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		IOperationCalculator operationcalculator = new OperationCalculator();
		
		Double firstNumber = 1.0;
		Double secondNumber = 2.0;
		
		Double addition = operationcalculator.add(firstNumber, secondNumber);
		Double subtraction = operationcalculator.sub(firstNumber, secondNumber);
		
		System.out.println("Addition result: " + addition + "\nSubtraction result: " + subtraction);
		System.out.println("Testing auto commit");
		
	}

}
