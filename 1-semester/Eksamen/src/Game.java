public class Game {

  private int targetNumber = 0;


  public Game(int targetNumber) {
    this.targetNumber = targetNumber;
    targetNumber = (int) (Math.random() * 10) + 1;

  }

  public int getTargetNumber() {
    return targetNumber;
  }

  public int doesInputEqualToTargetNumber(int input) {

    boolean guessRight = false;
    while(guessRight)
    if (targetNumber == input) {
      return 0;
    } else if (targetNumber > input) {
      return 1;
    }
      return -1;
    }
  }

