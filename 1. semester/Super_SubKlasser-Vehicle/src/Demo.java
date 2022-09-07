import java.util.ArrayList;

public class Demo {

  void go() {

    Vehicle v1 = new Vehicle("V1");
    v1.startEnginePrint(); //Starts engine for vehicle (all sub-classes)

    Car c1 = new Car("C1");
    v1.engineIsStarted(); //Checks if engine is true with boolean and prints it
    c1.drive(); //Car driving

    Plane p1 = new Plane("P1");
    p1.fly(); //Plane flying

    Ship s1 = new Ship("S1");
    s1.sail(); //Ship sailing

    System.out.println();

    Vehicle v = new Plane("V"); //Example of typecasting with classes
    if (v instanceof Car)
      ((Car) v).drive();
      else if (v instanceof Plane)
        ((Plane) v).fly();
      else
        System.out.println("You're not in a car or a plane!");

    System.out.println("-----------------------------------");

    ArrayList<Vehicle> vehicles = new ArrayList<>(); //List of vehicles
    vehicles.add(new Car("Car"));
    vehicles.add(new Plane("Plane"));
    vehicles.add(new Ship("Ship"));

    for (int i = 0; i < vehicles.size(); i++) { //fori loop, printing the list + turning engine on for each vehicle
      Vehicle temp = vehicles.get(i);
      System.out.println(temp.getName());
      temp.startEngine();
      if (temp instanceof Car)
        ((Car)temp).drive();
      else if (temp instanceof Plane)
        ((Plane)temp).fly();
      else if (temp instanceof Ship)
        ((Ship)temp).sail();
        }
    }


  public static void main(String[] args) {
    new Demo().go();
  }


  public String toString() {
    return super.toString();
  }
}
