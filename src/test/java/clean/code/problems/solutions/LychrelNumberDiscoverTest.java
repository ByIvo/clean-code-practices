package clean.code.problems.solutions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LychrelNumberDiscoverTest
{
	
	@Before
	public void setUp() throws Exception
	{
	}
	
	@Test
	public void shouldFindAPalindromeAsResultOfSummingItsReverse()
	{
		LychrelNumberDiscover lychrelNumberDiscover = LychrelNumberDiscover.discoverIfValueIsLychrelUntilNIterations(47L, 50);
		
		boolean isLychrelNumber = lychrelNumberDiscover.isLychrelNumber();
		
		assertFalse(isLychrelNumber);
	}
	
	@Test
	public void shouldSumReverseUntilFindAPalindrome()
	{
		LychrelNumberDiscover lychrelNumberDiscover = LychrelNumberDiscover.discoverIfValueIsLychrelUntilNIterations(349L, 50);
		
		boolean isLychrelNumber = lychrelNumberDiscover.isLychrelNumber();
		
		assertFalse(isLychrelNumber);
	}
	
	@Test
	public void whenReachesTheLimitIterationWithoutFindAPalindromeShuldConsiderItAsLychrelNumber()
	{
		LychrelNumberDiscover lychrelNumberDiscover = LychrelNumberDiscover.discoverIfValueIsLychrelUntilNIterations(196L, 50);
		
		boolean isLychrelNumber = lychrelNumberDiscover.isLychrelNumber();
		
		assertTrue(isLychrelNumber);
	}
	
}
