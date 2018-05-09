package clean.code.solutions.problem55;

import static org.junit.Assert.*;

import org.junit.Test;

public class LychrelNumberCounterLessThanTenThousandTest {

  private LychrelNumberCounterLessThanTenThousand lychrelNumberCounter = new LychrelNumberCounterLessThanTenThousand();

  @Test
  public void deveContarNumerosLychrelMenoresQueDezMil() {
    int lychrelNumbers = lychrelNumberCounter.count();

    assertEquals(249, lychrelNumbers);
  }

}
