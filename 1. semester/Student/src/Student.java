public class Student {
  private String name;
  private String phone;
  private int yearOfBirth;

  Student () { } //Tom konstruktør

  Student (int y) { //Konstruktør som sætter/modtager yearOfBirth
    yearOfBirth = y;
  }

  void setName(String n) {
    if (!n.equals(""))
      name = n;
    else
      name = "N/A";
  }

  String getName() {
    return name;
  }

  void setPhone(String p) {
    phone = p;
  }

  String getPhone() {
    return phone;
  }
int getYearOfBirth() {
    return yearOfBirth; //getter yearOfBirth
  }
}
