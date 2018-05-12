package clean.code.problems.solutions;

import java.math.BigInteger;

public class LychrelNumberDiscover
{
	
	private BigInteger value;
	private int maxInterations;
	
	private LychrelNumberDiscover(BigInteger value, int maxIterations)
	{
		this.value = value;
		this.maxInterations = maxIterations;
	}
	
	public static LychrelNumberDiscover discoverIfValueIsLychrelUntilNIterations(Long value, int maxIterations) {
		return new LychrelNumberDiscover(BigInteger.valueOf(value), maxIterations);
	}

	public boolean isLychrelNumber()
	{
		BigInteger valueToBeSummed = this.value;
		
		return sumReverseUntilProveItIsALychrelNumber(valueToBeSummed);
	}

	private boolean sumReverseUntilProveItIsALychrelNumber(BigInteger valueToBeSummed)
	{
		for(int i=0; i< maxInterations; i++) {
			BigInteger reversedSum = calculateReversedSumOf(valueToBeSummed);
			
			if(isPalindrome(reversedSum)) {
				return false;			
			} else {
				valueToBeSummed = reversedSum;
			}
		}
		
		return true;
	}

	private BigInteger calculateReversedSumOf(BigInteger value)
	{
		BigInteger reversedValue = reverse(value);
		return value.add(reversedValue);
	}
	
	private boolean isPalindrome(BigInteger reverseSum)
	{
		PalindromeVerifier palindromeVerifier = new PalindromeVerifier(reverseSum);
		return palindromeVerifier.isPalindrome();
	}

	private BigInteger reverse(BigInteger value) {
		NumberReversor numberReversor = new NumberReversor(value);
		return numberReversor.reverse();
	}
	
}
