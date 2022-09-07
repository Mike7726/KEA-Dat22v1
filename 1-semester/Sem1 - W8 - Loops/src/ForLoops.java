public class ForLoops {
  public static void main(String[] args) {

    for (char c = '1'; c <= '9'; c++)
      System.out.print(c);
    System.out.print("\n");
    System.out.print((int)' ' + "\n");


    int i;
    for (i = -10; i <= 10; i++)
      System.out.print(i + ", ");
    System.out.print("\n" + "(" + i + ")");

  }
}
