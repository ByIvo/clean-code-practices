package clean.code.problems.solutions;

import java.math.BigInteger;

public class PalindromeChecker {
	
	public boolean isAPalindrome(BigInteger number) {
		
		BigInteger reverseNumber = new ReverseNumber().reverse(number);
		
		return number.intValue() == reverseNumber.intValue();
	}

}
