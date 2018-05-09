package clean.code.problems;

import java.util.Scanner;

import clean.code.problems.solutions.CountInterval;
import clean.code.problems.solutions.LychrelNumberCounter;

public class Problem55
{
	public static void main(String[] args)
	{
		final Scanner scanner = new Scanner(System.in);
		
		System.out.println("Which will be the biggest number I will prove to be a Lychrel number?");
		Long lastNumber = scanner.nextLong();
		System.out.println("How many times should I try to prove its reverse sum is a palindrome?");
		Integer maxIterations = scanner.nextInt();
		
		LychrelNumberCounter lychrelNumberCounter = LychrelNumberCounter.proveAValueIsLychrelNumberWithMax(maxIterations);
		CountInterval countInterval = new CountInterval(1L, lastNumber);
		Long lychrelNumbersCountage = lychrelNumberCounter.countBeetwen(countInterval);
		
		System.out.println(lychrelNumbersCountage);
		scanner.close();
	}
}
