package clean.code.problems.solutions;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;


public class NumberReversorTest
{
	
	@Before
	public void setUp() throws Exception
	{
	}
	
	@Test
	public void shouldReverseTheNumber()
	{
		NumberReversor numberReversor = new NumberReversor(753L);
		
		BigInteger reversedNumber = numberReversor.reverse();
		
		assertEquals(BigInteger.valueOf(357L), reversedNumber);
	}
	
	@Test
	public void shouldReverseTheNumberEventIfItStartsAsBigInteger()
	{
		NumberReversor numberReversor = new NumberReversor(BigInteger.valueOf(753L));
		
		BigInteger reversedNumber = numberReversor.reverse();
		
		assertEquals(BigInteger.valueOf(357L), reversedNumber);
	}
	
	@Test
	public void shouldReverseEvenOneCHarNumber()
	{
		NumberReversor numberReversor = new NumberReversor(7L);
		
		BigInteger reversedNumber = numberReversor.reverse();
		
		assertEquals(BigInteger.valueOf(7L), reversedNumber);
	}
	
}
