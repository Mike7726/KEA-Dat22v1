public class ForLoopAlfabetAssignment {

  public static void main(String[] args) {
    ForLoopAlfabetAssignment demo = new ForLoopAlfabetAssignment();
    demo.fromAtoZ();

  }
  public void fromAtoZ() {
    for (char c = 'A'; c <= 'Z'; c++)
      System.out.print(c);
      System.out.println();
    for (char c = 'Z'; c >= 'A'; c--)
      System.out.print(c);

  }
}
