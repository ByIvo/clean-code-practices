package clean.code.solutions.problem4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeCheckerTest {

  private PalindromeChecker palindromeChecker = new PalindromeChecker();

  @Test(expected = UnsupportedOperationException.class)
  public void deveLancarExcecaoSeForNulo() {
    palindromeChecker.isPalindrome(null);
  }

  @Test
  public void deveRetornarVerdadeiroSeForVazio() {
    boolean isPalindrome = palindromeChecker.isPalindrome("");

    assertTrue(isPalindrome);
  }

  @Test
  public void deveRetornarVerdadeiroSeTiverUmDigito() {
    String number = "1";

    boolean isPalindrome = palindromeChecker.isPalindrome(number);

    assertTrue(isPalindrome);
  }

  @Test
  public void deveRetornarVerdadeiroSeForPalindromo() {
    String number = "9009";

    boolean isPalindrome = palindromeChecker.isPalindrome(number);

    assertTrue(isPalindrome);
  }

  @Test
  public void deveRetornarFalsoSeNaoForPalindromo() {
    String number = "900";

    boolean isPalindrome = palindromeChecker.isPalindrome(number);

    assertFalse(isPalindrome);
  }

}
