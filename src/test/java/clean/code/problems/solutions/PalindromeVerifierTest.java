package clean.code.problems.solutions;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;


public class PalindromeVerifierTest
{
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void oneDigitValueIsNotAPalidrome()
	{
		PalindromeVerifier palindromeVerifier = new PalindromeVerifier(9L);
		boolean isPalindrome = palindromeVerifier.isPalindrome();
		assertFalse(isPalindrome);
	}
	
	@Test
	public void allEqualsDigitsArePalindrome()
	{
		PalindromeVerifier palindromeVerifier = new PalindromeVerifier(2222L);
		boolean isPalindrome = palindromeVerifier.isPalindrome();
		assertTrue(isPalindrome);
	}
	
	@Test
	public void oddDigitsNumberCanAlsoBePalindrome()
	{
		PalindromeVerifier palindromeVerifier = new PalindromeVerifier(91519L);
		boolean isPalindrome = palindromeVerifier.isPalindrome();
		assertTrue(isPalindrome);
	}
	
	@Test
	public void canVerifyPalindromesEvenWithBigIntegerConstructor()
	{
		PalindromeVerifier palindromeVerifier = new PalindromeVerifier(BigInteger.valueOf(91519L));
		boolean isPalindrome = palindromeVerifier.isPalindrome();
		assertTrue(isPalindrome);
	}
	
	@Test
	public void notPalindromeProducesFalseReturn()
	{
		PalindromeVerifier palindromeVerifier = new PalindromeVerifier(96517L);
		boolean isPalindrome = palindromeVerifier.isPalindrome();
		assertFalse(isPalindrome);
	}
	
}
