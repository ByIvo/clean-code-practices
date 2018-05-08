package clean.code.problems.solutions;

import static org.junit.Assert.*;

import org.junit.Test;


public class LargestPalindromeDiscoverTest
{
	
	@Test
	public void shouldReturnTheLargestPalindromeWithTwoDigits()
	{
		LargestPalindromeDiscover largestPalindromeDiscover = new LargestPalindromeDiscover();
			
		Long largestPalindromeFound = largestPalindromeDiscover.withNDigitis(2L);
		assertEquals((Long) 9009L, largestPalindromeFound);
	}
	
	@Test
	public void shouldReturnTheLargestPalindromeWithThreeDigits()
	{
		LargestPalindromeDiscover largestPalindromeDiscover = new LargestPalindromeDiscover();
			
		Long largestPalindromeFound = largestPalindromeDiscover.withNDigitis(3L);
		assertEquals((Long) 906609L, largestPalindromeFound);
	}
	
	@Test(expected=RuntimeException.class)
	public void ifTheNDigitsInformedIsSmallerThan2DigitsThrowsAnException()
	{
		LargestPalindromeDiscover largestPalindromeDiscover = new LargestPalindromeDiscover();
			
		largestPalindromeDiscover.withNDigitis(1L);
	}
	
}
