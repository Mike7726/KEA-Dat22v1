public class Loops {

  public static void main(String[] args) {

    int i = 10;
    int j = 20;

    i = Integer.MAX_VALUE;
    System.out.println(i);
    System.out.println(++i);

    while (i > 0 || j > 0) {
      i -= 100;
      System.out.println(i);

    }
  }
}
