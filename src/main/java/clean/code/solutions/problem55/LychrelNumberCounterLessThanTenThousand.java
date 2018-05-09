package clean.code.solutions.problem55;

public class LychrelNumberCounterLessThanTenThousand {

  private static final int MAX_NUMBER_TO_CHECK = 10000;
  private LychrelNumberCheckerUnderFiftyIterations lychrelNumberChecker = new LychrelNumberCheckerUnderFiftyIterations();

  public int count() {
    int lychrelNumbers = 0;

    for (int number = 1; number < MAX_NUMBER_TO_CHECK; number++) {
      if (isLychrelNumber(number)) {
        lychrelNumbers++;
      }
    }

    return lychrelNumbers;
  }

  private boolean isLychrelNumber(int number) {
    return lychrelNumberChecker.is(Integer.toString(number));
  }

}
