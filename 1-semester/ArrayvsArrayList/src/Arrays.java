import java.util.ArrayList;
import java.util.List;

public class Arrays {

  public static void main(String[] args) {
   String[] names = {"Harry", "Ron", "Hermione"};
   ArrayList<String> people = new ArrayList<>(List.of(names));
    System.out.println(people);
    people.add("Draco");
    people.add("Neville");
    people.remove("Draco");
    people.add("Luna");
    List youThree = people.subList(0,3);
    people.add(1,"Cho");
    System.out.println(people);
    people.set(1,"Ginny");
    people.addAll(List.of(new String[]{"Fred", "George"}));
    System.out.println(people);
    int result = people.indexOf("Fred");
    people.remove(result);
    System.out.println(people);

  }

}
