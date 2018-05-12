package clean.code.problems.solutions;

import java.math.BigInteger;

public class NumberReversor
{
		
	private BigInteger number;

	public NumberReversor(Long number)
	{
		this.number = BigInteger.valueOf(number);
	}
	
	public NumberReversor(BigInteger number)
	{
		super();
		this.number = number;
	}

	public BigInteger reverse() {
		String reversedNumberAsString = reverseNumberAsString();
		return new BigInteger(reversedNumberAsString);
	}

	private String reverseNumberAsString()
	{
		String numberAsString = number.toString();
		String reversedNumberAsString = "";
		int lastCharIndex = numberAsString.length()-1;
		
		for(int i=lastCharIndex; i>=0; i--) {
			reversedNumberAsString += numberAsString.charAt(i);
		}
		
		return reversedNumberAsString;
	}
	
}
