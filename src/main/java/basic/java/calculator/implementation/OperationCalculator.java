package basic.java.calculator.implementation;

public class OperationCalculator implements IOperationCalculator {

	@Override
	public Double addition(Double firstNumber, Double secondNumber) {

		Double result = firstNumber + secondNumber;
		return result;

	}

	@Override
	public Double subtraction(Double firstNumber, Double secondNumber) {
		
		Double result = firstNumber - secondNumber;
		return result;
		
	}

}
