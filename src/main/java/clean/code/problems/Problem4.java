package clean.code.problems;

import clean.code.solutions.problem4.LargestPalindromeFinderForProductThreeDigit;

public class Problem4 {

  public static void main(String[] args) {

    LargestPalindromeFinderForProductThreeDigit largestPalindromeFinder = new LargestPalindromeFinderForProductThreeDigit();
    int largestPalindromeForThreeDigits = largestPalindromeFinder.find();

    System.out.println(largestPalindromeForThreeDigits);
  }

}
