class TestStudent {

  public static void main(String[] args) {
    Student s1 = new Student(2016);
    s1.setName("Mike");
    System.out.println(s1.getName());
    s1.setName("");
    System.out.println(s1.getName());

    s1.setPhone("20 20 20 20");
    System.out.println(s1.getPhone());

    System.out.println("Year: " + s1.getYearOfBirth());
  }
}
