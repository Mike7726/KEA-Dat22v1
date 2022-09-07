public class TestBike {

  public void go() {
    int count1, count2;
    Bike b1 = new Bike();
    Bike b2 = new Bike();
    count1 = Bike.getCount();
    Bike b3 = new Bike();
    Bike b4 = new Bike();
    count2 = Bike.getCount();
    Bike b5 = new Bike();

    System.out.println("B1: " + b1.getSpeed());
    System.out.println("B2: " + b2.getSpeed());
    System.out.println(count1);
    System.out.println("B3: " + b3.getSpeed());
    System.out.println("B4: " + b4.getSpeed());
    System.out.println("B5: " + b5.getSpeed());

    System.out.println(count2);
    System.out.println(Bike.getCount());
  }

  public static void main(String[] args) {
 new TestBike().go();


  }
}
