package clean.code.solutions;

public class PalindromeChecker implements StringChecker {

  private ValidatorNotNull validatorNotNull = new ValidatorNotNull();

  public boolean is(String number) {
    validateNotNull(number);

    for (int forward = 0, backward = number.length() - 1; forward < backward; forward++, backward--) {

      if (areDifferent(number.charAt(forward), number.charAt(backward))) {
        return false;
      }
    }

    return true;
  }

  private void validateNotNull(String number) {
    validatorNotNull.validate(number);
  }

  private boolean areDifferent(char charForward, char charBackward) {
    return charForward != charBackward;
  }

}
