package Arv;

public class Vehicle {
  //you can make this abstract and it would be the same, but you would have to specify the vehicle when creating an object -
  // add abstract before class

  private String model;
  private String horn;
  private String color;


  public Vehicle(String model, String horn, String color) {
    setModel(model);
    setHorn(horn);
    changeColor(color);
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public void useHorn() {
    System.out.println(horn);
  }

  public void setHorn(String horn) {
    this.horn = horn;
  }

  public String getHorn() {
    return horn;
  }

  public void changeColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }


}
