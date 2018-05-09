package clean.code.problems.solutions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LychrelNumberCounterTest
{
	
	@Before
	public void setUp() throws Exception
	{
	}
	
	@Test
	public void shouldProveANumberIsLychrelUntilNTimesEvenIfItWillFindAPalindrome()
	{
		LychrelNumberCounter lychrelNumberCounter = LychrelNumberCounter.proveAValueIsLychrelNumberWithMax(2);
		CountInterval countInterval = new CountInterval(349L, 349L);
		Long foundLychrel = lychrelNumberCounter.countBeetwen(countInterval);
		
		assertEquals((long) foundLychrel, 1);
	}
	
	@Test
	public void shouldCountAllLychrelNumberInMaxNTimes()
	{
		LychrelNumberCounter lychrelNumberCounter = LychrelNumberCounter.proveAValueIsLychrelNumberWithMax(3);
		CountInterval countInterval = new CountInterval(349L, 349L);
		Long foundLychrel = lychrelNumberCounter.countBeetwen(countInterval);
		
		assertEquals((long) foundLychrel, 0);
	}
	
	@Test
	public void shouldCountAllLychrelNumberBetween1And10000()
	{
		LychrelNumberCounter lychrelNumberCounter = LychrelNumberCounter.proveAValueIsLychrelNumberWithMax(50);
		CountInterval countInterval = new CountInterval(1l, 10000l);
		Long foundLychrel = lychrelNumberCounter.countBeetwen(countInterval);
		
		assertEquals((long) foundLychrel, 249);
	}
	
}
