package clean.code.problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LychrelNumberProverUntil
{
	private int largestNumberToProve;
	
	public LychrelNumberProverUntil(int largestNumberToProve)
	{
		this.largestNumberToProve = largestNumberToProve;
	}

	public static void main(String[] args)
	{
		int lychrelNumberCounter = new LychrelNumberProverUntil(10000).countLychrelNumbers();
		System.out.println("How many? " + lychrelNumberCounter);
	}
	
	public int countLychrelNumbers()
	{
		List<BigInteger> lychrelNumbers = new ArrayList<BigInteger>();
		
		for (int i = 1; i <= largestNumberToProve; i++)
		{
			boolean isLychrelNumber = sumItsReversedValueUntilProveItsLychrel(BigInteger.valueOf(i));
			if (isLychrelNumber)
			{
				lychrelNumbers.add(BigInteger.valueOf(i));
			}
		}
		
		return lychrelNumbers.size();
	}
	
	private boolean sumItsReversedValueUntilProveItsLychrel(BigInteger numberToVerify)
	{
		for (int i = 0; i < 50; i++)
		{
			BigInteger sumWithReversedValue = sumWithItsReversedValue(numberToVerify);
			if (isPalindrome(sumWithReversedValue))
			{
				return false;
			}
			else
			{
				numberToVerify = sumWithReversedValue;
			}
		}
		
		return true;
	}

	private BigInteger sumWithItsReversedValue(BigInteger numberToVerify)
	{
		BigInteger reversedNumber = reverseNumber(numberToVerify);
		BigInteger reversedSum = numberToVerify.add(reversedNumber);
		
		return reversedSum;
	}
	
	private boolean isPalindrome(BigInteger number)
	{
		String numberAsString = String.valueOf(number);
		String numberAsReversedString = String.valueOf(reverseNumber(number));
		
		return numberAsReversedString.equals(numberAsString);
	}
	
	private BigInteger reverseNumber(BigInteger toReverse)
	{
		String resultString = String.valueOf(toReverse);
		String resultReverse = new StringBuffer(resultString).reverse().toString();
		
		return new BigInteger(resultReverse);
	}
	
}
