public class GoCar {

  Car c1 = new Car("Citroen", "C3", "DYT DYT");

  public static void main(String[] args) {
    GoCar Car = new GoCar();
    Car.sound();
    Car.drive();
    Car.park();
  }
    void sound() {
        System.out.println(c1.getHonk());
    }

    void drive() {
      System.out.println(c1.getBrand() + " " + c1.getModel() + " is driving");
    }

    void park() {
      System.out.println(c1.getBrand() + " " + c1.getModel() + " is parking");
    }
  }
