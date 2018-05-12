package clean.code.problems.solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import clean.code.problems.solutions.LargestPalindromeProductForThreeDigitsNumbers;

public class LargestPalindromeProductForThreeDigitsNumbersTest {

	@Test
	public void mustCalculateLargestPalindromeProduct() {
		
		int largestPalindromeProduct = 906609;
		
		
		long result = new LargestPalindromeProductForThreeDigitsNumbers().calculate();
		
		assertEquals(largestPalindromeProduct, result);
		
	}

}
