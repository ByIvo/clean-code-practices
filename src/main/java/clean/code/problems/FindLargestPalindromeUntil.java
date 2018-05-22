package clean.code.problems;

public class FindLargestPalindromeUntil
{
	public static void main(String[] args)
	{
		FindLargestPalindromeUntil problem4 = new FindLargestPalindromeUntil(999);
		int largestPalindrome = problem4.findLargestPalindome();
		System.out.println("Largest Palindrome from 3 digits: " + largestPalindrome);
	}
	
	private int largestNumber;
	
	public FindLargestPalindromeUntil(int largestNumber)
	{
		this.largestNumber = largestNumber;
	}

	public int findLargestPalindome()
	{
		int largestPalindromeFound = 0;
		
		for (int fatherMultiplicator = 1; fatherMultiplicator <= largestNumber; fatherMultiplicator++)
		{
			int largestChildPalindrome = findLargestChildPalindrome(fatherMultiplicator);
			if(largestChildPalindrome > largestPalindromeFound) {
				largestPalindromeFound = largestChildPalindrome;
			}
		}
		
		return largestPalindromeFound;
	}
	
	private int findLargestChildPalindrome(int fatherMultiplicator)
	{
		for (int childMultiplicador = largestNumber; childMultiplicador > 0; childMultiplicador--)
		{
			int product = fatherMultiplicator * childMultiplicador;
			if (isPalindrome(product))
			{
				return product;
			}
		}
		
		return -1;
	}
	
	private boolean isPalindrome(int product)
	{
		String productAsString = String.valueOf(product);
		String reversedProductAsString = new StringBuilder(productAsString).reverse().toString();
		
		boolean productIsTheSameWhenReserverd = reversedProductAsString.equals(productAsString);
		return productIsTheSameWhenReserverd;
	}
}
