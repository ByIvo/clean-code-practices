package clean.code.problems;

import static org.junit.Assert.*;

import org.junit.Test;


public class FindLargestPalindromeUntilTest
{
	
	@Test
	public void deveRetornar906609QuandoOMaiorNumeroFor999()
	{
		FindLargestPalindromeUntil palindromeFinder = new FindLargestPalindromeUntil(999);
		int largestPalindromeFound = palindromeFinder.findLargestPalindome();
		assertEquals(largestPalindromeFound, 906609);
	}
	
	@Test
	public void deveRetornar9009QuandoOMaiorNumeroFor99() throws Exception
	{
		FindLargestPalindromeUntil palindromeFinder = new FindLargestPalindromeUntil(99);
		int largestPalindromeFound = palindromeFinder.findLargestPalindome();
		assertEquals(largestPalindromeFound, 9009);
	}
	
}
