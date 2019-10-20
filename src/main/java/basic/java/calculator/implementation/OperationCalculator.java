package basic.java.calculator.implementation;

public class OperationCalculator implements IOperationCalculator {

	@Override
	public Double add(Double firstNumber, Double secondNumber) {

		Double result = firstNumber + secondNumber;
		return result;

	}

	@Override
	public Double sub(Double firstNumber, Double secondNumber) {
		
		Double result = firstNumber - secondNumber;
		return result;
		
	}

}
