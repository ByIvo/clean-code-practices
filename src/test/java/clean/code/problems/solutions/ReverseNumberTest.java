package clean.code.problems.solutions;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

import clean.code.problems.solutions.ReverseNumber;

public class ReverseNumberTest {

	@Test
	public void mustReverseIntegerNumber() {
		
		BigInteger number = BigInteger.valueOf(74863L);
		BigInteger expectedReverseNumber = BigInteger.valueOf(36847L);
		
		BigInteger reverseNumber = new ReverseNumber().reverse(number);
		
		assertEquals(expectedReverseNumber, reverseNumber);
		
	}

}
