package Opgave1;

public class HogwartsStudent implements Comparable<HogwartsStudent> {

  private String firstName;
  private String lastName;
  private House myHouse;


  HogwartsStudent(String studentName, String studentLastName, House house) {
    setFirstName(studentName);
    setLastName(studentLastName);
    setHouse(house);
  }


  void setHouse(House newHouse) {
    if (newHouse == null) {
      throw new RuntimeException("house must be a real valid house");
    }
    this.myHouse = newHouse;
  }

  House getHouse() {
    return myHouse;
  }

  void setFirstName(String studentName) {
    this.firstName = studentName;
  }

  void setLastName(String studentLastName) {
    this.lastName = studentLastName;
  }


  @Override
  public int compareTo(HogwartsStudent other) {
    return this.lastName.compareTo(other.lastName);
    //return this.age - other.age;
  }

  @Override
  public String toString() {
    return lastName + "\n";
  }
}
