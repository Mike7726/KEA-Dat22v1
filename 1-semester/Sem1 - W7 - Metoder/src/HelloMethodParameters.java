public class HelloMethodParameters {

  String HelloWorld = "Hello, World!";

  public static void main(String[] args) {
    HelloMethodParameters demo = new HelloMethodParameters();
    demo.printString();

  }
public void printString() {
  System.out.println(HelloWorld);

  }
}
