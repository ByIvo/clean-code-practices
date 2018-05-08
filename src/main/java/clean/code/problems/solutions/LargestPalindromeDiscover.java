package clean.code.problems.solutions;


public class LargestPalindromeDiscover
{
	
	public Long withNDigitis(Long digits) {
		Long largestNumberPossible = (long)(Math.pow(10, digits) - 1);
		
		for(long i=largestNumberPossible; i<=largestNumberPossible; i--) {
			long product = largestNumberPossible * i;
			
			PalindromeVerifier palindromeVerifier = new PalindromeVerifier(product);
			boolean isPalindrome = palindromeVerifier.isPalindrome();
			
			if(isPalindrome) {
				return product;
			}
		}
		
		return -1L;
	}
}
