package clean.code.problems.solutions;

public class LychrelNumbersBelowTenThousand {
	
	public int calculate() {
				
		int lychrelNumbersCount = 0;
		
		LychrelNumber lychrelNumber = new LychrelNumber();
		
		for (int currentNumber = 10; currentNumber < 10000; currentNumber++) {
			if (lychrelNumber.isLychrelNumber(currentNumber)) {
				lychrelNumbersCount++;
			}			
		}
		
		return lychrelNumbersCount;
	}

}
