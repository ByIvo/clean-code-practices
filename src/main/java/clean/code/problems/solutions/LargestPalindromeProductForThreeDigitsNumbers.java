package clean.code.problems.solutions;

import java.math.BigInteger;

public class LargestPalindromeProductForThreeDigitsNumbers {
	
	private static final int LARGEST_THREE_DIGITS_NUMBER = 999;
	private static final int LESSER_THREE_DIGITS_NUMBER  = 100;		
	
	public long calculate() {
		
		
		long largestThreeDigitsResultPalindrome = 0;
		
		PalindromeChecker palindromeChecker = new PalindromeChecker();
		
		for (int firstThreeDigitsNumber = LARGEST_THREE_DIGITS_NUMBER; firstThreeDigitsNumber > LESSER_THREE_DIGITS_NUMBER; firstThreeDigitsNumber--) {
			
			for (int secondThreeDigitsNumber = LARGEST_THREE_DIGITS_NUMBER; secondThreeDigitsNumber >  LESSER_THREE_DIGITS_NUMBER; secondThreeDigitsNumber--) {
				
				BigInteger actualProduct =  BigInteger.valueOf(secondThreeDigitsNumber * firstThreeDigitsNumber);
				
				if (palindromeChecker.isAPalindrome(actualProduct)) {
					largestThreeDigitsResultPalindrome = actualProduct.longValue() > largestThreeDigitsResultPalindrome ? actualProduct.longValue() : largestThreeDigitsResultPalindrome;
				}
			}
			
		}
		
		return largestThreeDigitsResultPalindrome;
		
	}
	

}
