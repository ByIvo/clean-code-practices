package clean.code.problems.solutions;

import static org.junit.Assert.*;

import org.junit.Test;

public class LychrelNumbersBelowTenThousandTest {

	@Test
	public void mustCalculateHowManyLychrelNumbersBelowTenThousand() {
		
		LychrelNumbersBelowTenThousand lychrelNumbersBelowTenThousand = new LychrelNumbersBelowTenThousand();
				
		long result = lychrelNumbersBelowTenThousand.calculate();		
		
		assertEquals(249L, result);
	}

}
