package clean.code.solutions.problem4;

import clean.code.solutions.PalindromeChecker;

<<<<<<< HEAD
=======

import clean.code.solutions.PalindromeChecker;

public class LargestPalindromeFinderForProductThreeDigit {

  private static final int MAXIMUM_THREE_DIGIT_NUMBER = 999;
  private static final int MINIMUM_THREE_DIGIT_NUMBER = 100;
  private PalindromeChecker palindromeChecker = new PalindromeChecker();

  public int find() {
    int largestProduct = -1;
    int product;

    for (int firstMultiplier = MAXIMUM_THREE_DIGIT_NUMBER; firstMultiplier > MINIMUM_THREE_DIGIT_NUMBER; firstMultiplier--) {
      for (int secondMultiplier = firstMultiplier; secondMultiplier > MINIMUM_THREE_DIGIT_NUMBER; secondMultiplier--) {
        product = firstMultiplier * secondMultiplier;

        if (isPalindromeAndGreaterThatCurrent(largestProduct, product)) {
          largestProduct = product;
        }
      }
    }

    return largestProduct;
  }

  private boolean isPalindromeAndGreaterThatCurrent(int largestProduct, int product) {
    return isPalindrome(product) && product > largestProduct;
  }

  private boolean isPalindrome(int product) {
    return palindromeChecker.is(Integer.toString(product));
  }
}
