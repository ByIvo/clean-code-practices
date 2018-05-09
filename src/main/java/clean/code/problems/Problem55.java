package clean.code.problems;

import java.util.Scanner;

import clean.code.problems.solutions.CountInterval;
import clean.code.problems.solutions.LychrelNumberCounter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem55 {

  private static int iterations = 0;
  private static boolean isLychrelNumber = false;

  public static void main(String[] args) {
    lychrelNumbers();
  }

  private static void lychrelNumbers() {
    List<BigInteger> lychrelNumbers = new ArrayList<BigInteger>();

    int largestNumber = 10000;
    for (int i = 1; i <= largestNumber; i++) {
      iterations = 0;
      isLychrelNumber = false;
      isLychrelNumber(BigInteger.valueOf(i));
      if(isLychrelNumber){
        lychrelNumbers.add(BigInteger.valueOf(i));
      }
    }

    System.out.println("How many? "+lychrelNumbers.size());

  }

  private static void isLychrelNumber(BigInteger numberToVerify) {
    iterations++;
    if(iterations > 50){
      isLychrelNumber = true;
    }
    BigInteger reverseNumber = reverseNumber(numberToVerify);
    BigInteger result = numberToVerify.add(reverseNumber);
    if(!isPalindrome(result) && !isLychrelNumber){
      isLychrelNumber(result);
    }
  }


  private static boolean isPalindrome(BigInteger result) {
    String resultString = String.valueOf(result);
    String resultReverse = String.valueOf(reverseNumber(result));
    return resultReverse.equals(resultString);
  }

  private static BigInteger reverseNumber(BigInteger toReverse){
    String resultString = String.valueOf(toReverse);
    String resultReverse = new StringBuffer(resultString).reverse().toString();
    return new BigInteger(resultReverse);
  }

}
