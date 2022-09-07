import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileStuff {
  static File output = new File ("output");

  public void go() throws FileNotFoundException {
    PrintStream ps = new PrintStream(output);
  }

  public static void main(String[] args) throws FileNotFoundException {

   // File file = new File("fil.txt");
    File file = new File("fil.txt");
    String filename = "fil.txt";
    PrintStream ps = new PrintStream(file);
    PrintWriter pw = new PrintWriter(filename);
  }
}
