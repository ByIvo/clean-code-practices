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
	
}
