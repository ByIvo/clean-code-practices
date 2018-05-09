package clean.code.solutions.problem55;

import static org.junit.Assert.*;

import org.junit.Test;

public class LychrelNumberCheckerUnderFiftyIterationsTest {

  private LychrelNumberCheckerUnderFiftyIterations lychrelChecker = new LychrelNumberCheckerUnderFiftyIterations();

  @Test(expected = UnsupportedOperationException.class)
  public void deveLancarExcecaoCasoSejaNulo() {
    lychrelChecker.is(null);
  }

  @Test
  public void deveRetornarVerdadeiroSeONumeroForLychrel() {
    boolean isLychrel = lychrelChecker.is("196");

    assertTrue(isLychrel);
  }

  @Test
  public void deveRetornarFalsoSeONumeroNaoForLychrel() {
    boolean isLychrel = lychrelChecker.is("47");

    assertFalse(isLychrel);
  }

}
