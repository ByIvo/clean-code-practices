package clean.code.solutions;

import org.junit.Test;

public class ValidatorNotNullTest {

  private ValidatorNotNull validatorNotNull = new ValidatorNotNull();

  @Test(expected = UnsupportedOperationException.class)
  public void deveLancarExcecaoSeEstiverNulo() {
    validatorNotNull.validate(null);
  }

  @Test
  public void naoDeveLancarExcecaoSeEstiverDiferenteDeNulo() {
    validatorNotNull.validate("");
  }

}
