package clean.code.problems.solutions;

import static org.junit.Assert.*;

import org.junit.Test;

public class LichrelNumberTest {

	@Test
	public void mustReturnTrueWhenANumberIsALichrelNumber() {
		
		LychrelNumber lichrelNumber = new LychrelNumber();
		
		boolean isLichrelNumber = lichrelNumber.isLychrelNumber(196);
		
		assertEquals(true, isLichrelNumber);		
		
	}
	
	@Test
	public void mustReturnFalseWhenANumberIsALichrelNumber() {
		
		LychrelNumber lichrelNumber = new LychrelNumber();
		
		boolean isLichrelNumber = lichrelNumber.isLychrelNumber(10);
		
		assertEquals(false, isLichrelNumber);		
		
	}

}
