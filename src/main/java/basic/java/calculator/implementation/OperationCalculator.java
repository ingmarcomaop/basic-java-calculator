package basic.java.calculator.implementation;

public class OperationCalculator implements IOperationCalculator {

	@Override
	public Double addition(Double firstNumber, Double secondNumber) {

		return firstNumber + secondNumber;

	}

	@Override
	public Double subtraction(Double firstNumber, Double secondNumber) {
		
		return firstNumber - secondNumber;
		
	}

}
