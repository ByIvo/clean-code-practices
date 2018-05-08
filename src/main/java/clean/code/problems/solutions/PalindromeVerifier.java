package clean.code.problems.solutions;


public class PalindromeVerifier
{
	private String valueChars;
	
	public PalindromeVerifier(Long value) {
		valueChars = value.toString();
	}
	
	public boolean isPalindrome() {
		if(valueChars.length() == 1) {
			return false;
		}
		
		return compareEndToEndValueChars();
	}

	private boolean compareEndToEndValueChars()
	{
		int middleCharIndex = calculateIndexOfMiddleChar();
		int lastIndexAvailable = valueChars.length()-1;
		
		for(int i=0; i<middleCharIndex; i++) {
			int firstEndIndex = i;
			int lastEndIndex = lastIndexAvailable -i;

			boolean sameEnds = areTheSameEnds(firstEndIndex, lastEndIndex);
			if(!sameEnds) {
				return false;
			}
		}
		
		return true;
	}
	
	private int calculateIndexOfMiddleChar()
	{
		return (int) Math.ceil(valueChars.length() / 2.0);
	}

	private boolean areTheSameEnds(int firstEndIndex, int lastEndIndex)
	{
		char firstEnd = valueChars.charAt(firstEndIndex);
		char lastEnd = valueChars.charAt(lastEndIndex);
		
		return firstEnd == lastEnd;
	}
}
