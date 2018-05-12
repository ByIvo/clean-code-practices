package clean.code.problems.solutions;

import java.math.BigInteger;

public class LychrelNumber {
	
	private ReverseNumber reverseNumber = new ReverseNumber();
	private PalindromeChecker palindromeChecker = new PalindromeChecker();
	
	public boolean isLychrelNumber(int number) {
		
		BigInteger result = BigInteger.valueOf(number);
		
		for (int i = 0; i < 50; i++) {
			
			BigInteger reverseCurrentResult = reverseNumber.reverse(result);
			
			result = result.add(reverseCurrentResult);
			
			if (palindromeChecker.isAPalindrome(result)) {
				return false;
			}
			
		}
		
		return true;
	}

}
