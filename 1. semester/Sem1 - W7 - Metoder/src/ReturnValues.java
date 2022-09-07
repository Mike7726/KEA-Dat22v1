public class ReturnValues {


  public static void main(String[] args) {
   new ReturnValues().execute();

   
  }
  public void execute() {
    int result;
    result = sum(4, 9);
    printString("" + result);
  }


  public void printString(String str) {
    System.out.println(str);
  }

  public int sum(int i1, int i2) {
    int result = i1 + i2;
    return result;
  }
}
