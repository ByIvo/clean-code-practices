package clean.code.solutions.problem4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestPalindromeFinderForProductThreeDigitTest {

  private LargestPalindromeFinderForProductThreeDigit largestPalindromeFinder = new LargestPalindromeFinderForProductThreeDigit();

  @Test
  public void deveRetornarMaiorPalindromoGeradoPeloProdutoDeDoisNumerosComTresDigitos() {
    int largestPalindrome = largestPalindromeFinder.find();

    assertEquals(largestPalindrome, 906609);
  }

}
