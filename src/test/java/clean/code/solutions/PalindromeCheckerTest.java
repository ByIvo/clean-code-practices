package clean.code.solutions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeCheckerTest {

  private PalindromeChecker palindromeChecker = new PalindromeChecker();

  @Test(expected = UnsupportedOperationException.class)
  public void deveLancarExcecaoSeForNulo() {
    palindromeChecker.is(null);
  }

  @Test
  public void deveRetornarVerdadeiroSeForVazio() {
    boolean isPalindrome = palindromeChecker.is("");

    assertTrue(isPalindrome);
  }

  @Test
  public void deveRetornarVerdadeiroSeTiverUmDigito() {
    String number = "1";

    boolean isPalindrome = palindromeChecker.is(number);

    assertTrue(isPalindrome);
  }

  @Test
  public void deveRetornarVerdadeiroSeForPalindromo() {
    String number = "9009";

    boolean isPalindrome = palindromeChecker.is(number);

    assertTrue(isPalindrome);
  }

  @Test
  public void deveRetornarFalsoSeNaoForPalindromo() {
    String number = "900";

    boolean isPalindrome = palindromeChecker.is(number);

    assertFalse(isPalindrome);
  }

}
