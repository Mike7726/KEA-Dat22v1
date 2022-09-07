package Opgave1;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

  void run() {
    HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Erik", "Hansen", House.SLYTHERIN);
    HogwartsStudent hogwartsStudent2 = new HogwartsStudent("Lise", "Johansen",House.HUFFLEPUF);
    HogwartsStudent hogwartsStudent3 = new HogwartsStudent("Harry", "Potter",House.GRYFFINDOR);

    ArrayList<HogwartsStudent> sortStudents = new ArrayList<HogwartsStudent>();
    sortStudents.add(hogwartsStudent3);
    sortStudents.add(hogwartsStudent2);
    sortStudents.add(hogwartsStudent1);

    // not sorted
    System.out.println("### not sorted ###");
    System.out.println(sortStudents);

    //sort arraylist
    Collections.sort(sortStudents);

    // sorted
    System.out.println("\n### sorted ###");
    System.out.println(sortStudents);
  }


  public static void main(String[] args) {
    new TestStudent().run();
  }
}
