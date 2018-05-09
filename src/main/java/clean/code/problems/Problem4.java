package clean.code.problems;

public class Problem4 {

public class Problem4 {

  public static void main(String[] args) {
    resolveTheProblem();
  }

  public static void resolveTheProblem() {
    int largest3DigitsNumber = 999;

    int largestPalindrome = 0;

    for (int i = 1; i <= largest3DigitsNumber; i++) {
      for (int j = 1; j <= largest3DigitsNumber; j++) {
        int result = i * j;
        if (isPalindrome(result) && result > largestPalindrome) {
          largestPalindrome = result;
        }
      }
    }
    System.out.println("Largest Palindrome from 3 digits: " + largestPalindrome);
  }

  private static boolean isPalindrome(int result) {
    String resultString = String.valueOf(result);
    String resultReverse = new StringBuffer(resultString).reverse().toString();
    if (resultReverse.equals(resultString)) {
      return true;
    }
    return false;
  }
}
