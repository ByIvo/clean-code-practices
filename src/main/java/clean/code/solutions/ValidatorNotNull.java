package clean.code.solutions;

import java.util.Objects;

public class ValidatorNotNull {

  public void validate(String arg) {
    if (Objects.isNull(arg)) {
      throw new UnsupportedOperationException("Parâmetro nulo");
    }
  }

}
