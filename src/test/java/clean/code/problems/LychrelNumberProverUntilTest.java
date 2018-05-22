package clean.code.problems;

import static org.junit.Assert.*;

import org.junit.Test;


public class LychrelNumberProverUntilTest
{
	
	@Test
	public void sholdCount249LychrelNumbersUntil10000()
	{
		LychrelNumberProverUntil lychrelNumbersDiscover = new LychrelNumberProverUntil(10000);
		int lychrelNumbersCounter = lychrelNumbersDiscover.countLychrelNumbers();
		assertEquals(lychrelNumbersCounter, 249);
	}
	
	@Test
	public void sholdCount13LychrelNumbersUntil1000()
	{
		LychrelNumberProverUntil lychrelNumbersDiscover = new LychrelNumberProverUntil(1000);
		int lychrelNumbersCounter = lychrelNumbersDiscover.countLychrelNumbers();
		assertEquals(lychrelNumbersCounter, 13);
	}
	
}
