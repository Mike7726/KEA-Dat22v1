package Arv;

public class Mercedes extends Vehicle {

  private boolean hasLeatherSeats;

  public Mercedes(String model, String horn, String color, boolean hasLeatherSeats) {
    super(model, horn, color);
    this.hasLeatherSeats = hasLeatherSeats;

  }

  public void setHasLeatherSeats (boolean hasLeatherSeats) {
    this.hasLeatherSeats = hasLeatherSeats;
  }

  public boolean getHasLeatherSeats() {
    return hasLeatherSeats;

  }

  public void drive() {
    System.out.println("is driving");
  }

  @Override
  public void useHorn() {
    System.out.println("DYT");
    super.useHorn();
  }

}
