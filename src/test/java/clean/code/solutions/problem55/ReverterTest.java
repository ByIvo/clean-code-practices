package clean.code.solutions.problem55;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverterTest {

  private Reverter reverter = new Reverter();

  @Test(expected = UnsupportedOperationException.class)
  public void deveLancarExcecaoSeForNulo() {
    reverter.revert(null);
  }

  @Test
  public void deveRetornarAPropriaStringSeEstiverVazia() {
    String str = "";
    String reverse = reverter.revert(str);

    assertEquals(reverse, str);
  }

  @Test
  public void deveRetornarAPropriaStringSeTiverApenasUmCaracter() {
    String str = "A";
    String reverse = reverter.revert(str);

    assertEquals(reverse, str);
  }

  @Test
  public void deveRetornarAStringRevertida() {
    String reverse = reverter.revert("AB");

    assertEquals(reverse, "BA");
  }

}
