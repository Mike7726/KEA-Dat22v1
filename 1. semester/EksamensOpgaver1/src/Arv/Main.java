package Arv;

public class Main {

  public static void main(String[] args) {

    Vehicle vehicle1 = new Vehicle("Mazda", "DYT1","black");
    Vehicle vehicle2 = new Vehicle("Honda", "DYT2","white");
    Vehicle vehicle3 = new Mercedes("Mercedes", "DYT3","green", true);


    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = vehicle1;
    vehicles[1] = vehicle2;
    vehicles[2] = vehicle3;

    for (Vehicle vehicle : vehicles) {
      vehicle.useHorn();
    }


  }

}
