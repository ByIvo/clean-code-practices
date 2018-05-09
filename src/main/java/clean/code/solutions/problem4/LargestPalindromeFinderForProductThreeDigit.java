package clean.code.solutions.problem4;

<<<<<<< HEAD
<<<<<<< HEAD
import clean.code.solutions.PalindromeChecker;

=======
>>>>>>> Problem 4 solution
=======
import clean.code.solutions.PalindromeChecker;

>>>>>>> Problem 55 solution and extracting common class
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
<<<<<<< HEAD
<<<<<<< HEAD
    return palindromeChecker.is(Integer.toString(product));
=======
    return palindromeChecker.isPalindrome(Integer.toString(product));
>>>>>>> Problem 4 solution
=======
    return palindromeChecker.is(Integer.toString(product));
>>>>>>> Problem 55 solution and extracting common class
  }

}
