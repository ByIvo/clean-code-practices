package clean.code.solutions.problem55;

import clean.code.solutions.ValidatorNotNull;

public class Reverter {

  private ValidatorNotNull validatorNotNull = new ValidatorNotNull();

  public String revert(String str) {
    validateNotNull(str);

    StringBuilder sb = new StringBuilder(str);
    StringBuilder reverse = sb.reverse();
    return reverse.toString();
  }

  private void validateNotNull(String str) {
    validatorNotNull.validate(str);
  }

}
