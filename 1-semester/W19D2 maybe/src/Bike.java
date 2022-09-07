import java.util.Random;

public class Bike {
  private int speed;
  private static int count;

  Bike() {
    Random r = new Random();
    speed = r.nextInt(100);
    count++;
  }

  public static int getCount() {
    return count;
  }

  public int getSpeed() {
    return speed;
  }
}
