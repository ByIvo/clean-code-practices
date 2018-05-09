package clean.code.solutions.problem55;

import clean.code.solutions.StringChecker;
import clean.code.solutions.ValidatorNotNull;

import java.math.BigInteger;

import clean.code.solutions.PalindromeChecker;

public class LychrelNumberCheckerUnderFiftyIterations implements StringChecker {

  private static final int MAX_ITERATIONS_TO_CHECK = 50;
  private ValidatorNotNull validatorNotNull = new ValidatorNotNull();
  private Reverter reverter = new Reverter();
  private PalindromeChecker palindromeChecker = new PalindromeChecker();

  public boolean is(String value) {
    validateNotNull(value);

    BigInteger number = new BigInteger(value);

    for (int i = 0; i < MAX_ITERATIONS_TO_CHECK; i++) {
      BigInteger reverted = revert(number);
      number = number.add(reverted);

      if (isPalindrome(number)) {
        return false;
      }

    }
    return true;
  }

  private BigInteger revert(BigInteger number) {
    String numberStr = number.toString();
    String reverted = reverter.revert(numberStr);
    return new BigInteger(reverted);
  }

  private void validateNotNull(String number) {
    validatorNotNull.validate(number);
  }

  private boolean isPalindrome(BigInteger number) {
    return palindromeChecker.is(number.toString());
  }

}
