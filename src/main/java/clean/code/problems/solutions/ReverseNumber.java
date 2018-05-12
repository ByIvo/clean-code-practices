package clean.code.problems.solutions;

import java.math.BigInteger;

public class ReverseNumber {
	
	public BigInteger reverse(BigInteger number) {
		
		char[] numberDigits = number.toString().toCharArray();
		
		char[] reversedNumberDigitis = new char[numberDigits.length];
		
		int lastIndexFromArray = numberDigits.length - 1;
		
		for (int i = 0; i < numberDigits.length; i++) {
			reversedNumberDigitis[i] = numberDigits[lastIndexFromArray - i];
		}
		
		return new BigInteger(new String(reversedNumberDigitis));
		
		
	}

}
