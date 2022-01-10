package objectOrientation.Test;
import objectOrientation.Domain.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		char seletor = '-';
		if (seletor == '+') {
			calculator.sum(2,3);
		}else if (seletor == '-') {
			calculator.subtraction(5,4);
		}
		
		
	}
}
