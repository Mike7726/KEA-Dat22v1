import java.util.ArrayList;

public class Opg_1 {
  private ArrayList<String> stringArrayList = new ArrayList<>();
  private String txt = "Something";

  public static void main(String[] args) {
  new Opg_1().go();
  }

  public void go() {
    System.out.println(doesArrayListContainString(stringArrayList, txt));
    System.out.println(doesArrayListContainString(stringArrayList, txt));

  }

  public boolean doesArrayListContainString(ArrayList<String> A, String txt) {
    if (!A.contains(txt)) {
      A.add(txt);
      return false;
    }
    System.out.println("String has been found");
    return true;
  }
}