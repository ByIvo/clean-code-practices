package clean.code.problems;

import java.util.Scanner;

import clean.code.problems.solutions.LargestPalindromeDiscover;

public class Problem4
{
	public static void main(String[] args)
	{
		final Scanner scanner = new Scanner(System.in);
		long digits = scanner.nextLong();
		
		LargestPalindromeDiscover largestPalindromeDiscover = new LargestPalindromeDiscover();
		Long largestPalindromeFound = largestPalindromeDiscover.withNDigitis(digits);
		
		System.out.println(largestPalindromeFound);
		scanner.close();
	}
}
