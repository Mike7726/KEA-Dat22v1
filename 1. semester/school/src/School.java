public class School {

  public static void main(String[] args) {
    Student anna = new Student(21313113,"Anna", 12); //kalder på konstruktøren
    Student claus = new Student(12431231,"Claus", 13);

    anna.setCourses(new Course("3. semester programming"));
    claus.setCourses(new Course("2. semester programming"));

    System.out.println(anna.getCpr());
    System.out.println(claus.getCpr());

    System.out.println(anna.getCourses());
    System.out.println(claus.getCourses());


  }



}
