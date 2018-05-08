package clean.code.problems.solutions;


import java.util.Optional;

public class LargestPalindromeDiscover
{
	
	public Long withNDigitis(Long digits) {
		
		if(digits > 1) {
			return findLargestPalindromeInNumbersWithN(digits);
		} else {
			throw unnableToFindPalindromeWith(digits);
		}
	}

	private Long findLargestPalindromeInNumbersWithN(Long digits)
	{
		Long largestFactor = calculateGreatestNumberWithNDigits(digits);
		Long smallestFactor = calculateSmallestNumberWithNDigits(digits);
		
		return findPalindromeBetweenOptimizedFactors(largestFactor, smallestFactor);
	}

	private long calculateGreatestNumberWithNDigits(Long digits)
	{
		return (long)(Math.pow(10, digits) - 1);
	}

	private long calculateSmallestNumberWithNDigits(Long digits)
	{
		return (long)(Math.pow(10, digits - 1));
	}

	private Long findPalindromeBetweenOptimizedFactors(Long largestFactor, Long smallestFactor)
	{
		Long largestPalindromeFound = 0L;
		
		for(long i=largestFactor; i>=smallestFactor; i--) {
			Optional<Long> optNewPalindromeFound = findFirstPalindrome(i, smallestFactor);
			
			if(optNewPalindromeFound.isPresent()) {
				largestPalindromeFound = getGreaterPalindromeBetween(largestPalindromeFound, optNewPalindromeFound.get());
			}
		}
		
		return largestPalindromeFound;
	}
	
	private Optional<Long> findFirstPalindrome(long fatherFactor, Long smallestFactor)
	{
		for(long j=fatherFactor; j>=smallestFactor; j--) {					
			long product = fatherFactor * j;
			
			PalindromeVerifier palindromeVerifier = new PalindromeVerifier(product);
			boolean isPalindrome = palindromeVerifier.isPalindrome();
			
			if(isPalindrome) {
				return Optional.of(product);
			}
		}
		
		return Optional.empty(); 
	}

	private Long getGreaterPalindromeBetween(Long largestPalindromeFound, Long newPalindromeFound)
	{
		boolean palindromeFoundIsGreater = newPalindromeFound > largestPalindromeFound;
		
		if(palindromeFoundIsGreater) {
			return newPalindromeFound;
		} else {
			return largestPalindromeFound;
		}
	}


	private RuntimeException unnableToFindPalindromeWith(Long digits)
	{
		String message = String.format("It was not possible to find any palindrome with %1$s", digits);
		return new RuntimeException(message);
	}

}
