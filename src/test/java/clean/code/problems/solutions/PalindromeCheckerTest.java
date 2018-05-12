package clean.code.problems.solutions;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

import clean.code.problems.solutions.PalindromeChecker;


public class PalindromeCheckerTest {
	
	@Test
	public void mustReturnTrueWhenANumberIsAPalindrome() {
		
		BigInteger number = BigInteger.valueOf(906609L);
		
		boolean isAPalindromeNumber = new PalindromeChecker().isAPalindrome(number);
		
		assertEquals(true, isAPalindromeNumber);
		
	}
	
	@Test
	public void mustReturnFalseWhenANumberIsNotAPalindrome() {
		
		BigInteger number = BigInteger.valueOf(10L);
		
		boolean isAPalindromeNumber = new PalindromeChecker().isAPalindrome(number);
		
		assertEquals(false, isAPalindromeNumber);
		
	}

}
