package clean.code.solutions.problem4;

import java.util.Objects;

public class PalindromeChecker {

  public boolean isPalindrome(String number) {
    validateNotNull(number);

    for (int forward = 0, backward = number.length() - 1; forward < backward; forward++, backward--) {

      if (areDifferent(number.charAt(forward), number.charAt(backward))) {
        return false;
      }
    }

    return true;
  }

  private boolean areDifferent(char charForward, char charBackward) {
    return charForward != charBackward;
  }

  private void validateNotNull(String number) {
    if (Objects.isNull(number)) {
      throw new UnsupportedOperationException("Parâmetro nulo");
    }
  }

}
