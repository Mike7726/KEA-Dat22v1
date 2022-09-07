public class Car {
  private String brand;
  private String model;
  private String honk;

Car () {}

  Car (String brand, String model, String honk) { //this. gør det lokalt - altså i dette scope (denne konstruktør)
    this.brand = brand;
    this.model = model;
    this.honk = honk;
  }

  String getBrand() { //setter
    return brand;
  }

  String getModel() { //setter
    return model;
  }

  String getHonk() { //setter
    return honk;
  }

}
