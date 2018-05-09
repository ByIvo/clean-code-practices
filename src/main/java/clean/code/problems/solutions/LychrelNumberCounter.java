package clean.code.problems.solutions;


public class LychrelNumberCounter
{
	private int maxIterations;
	
	public LychrelNumberCounter(int maxIterations)
	{
		super();
		this.maxIterations = maxIterations;
	}

	public static LychrelNumberCounter proveAValueIsLychrelNumberWithMax(int maxIterations) {
		return new LychrelNumberCounter(maxIterations);
	}

	public Long countBeetwen(CountInterval countInterval) {
		Long firstNumber = countInterval.getFirstNumber();
		Long lastNumber = countInterval.getLastNumber();
		
		return countLychrelNumbersBetween(firstNumber, lastNumber);
	}

	private Long countLychrelNumbersBetween(Long firstNumber, Long lastNumber)
	{
		Long lychrelNumbersFound = 0l;
		
		for(long i=firstNumber; i<=lastNumber; i++) {
			if(isLychrelNumber(i)) {
				lychrelNumbersFound++;
			}
		}
		
		return lychrelNumbersFound;
	}

	private boolean isLychrelNumber(Long value)
	{
		LychrelNumberDiscover lychrelNumberDiscover = LychrelNumberDiscover.discoverIfValueIsLychrelUntilNIterations(value, maxIterations);
		return lychrelNumberDiscover.isLychrelNumber();
	}
	
	
}
