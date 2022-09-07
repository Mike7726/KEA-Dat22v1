public class Vehicle {

  private boolean engineStarted = false;
  private String name;

  Vehicle(String name) {
    this.name = name;
  }

  void startEngine() {
    engineStarted = true;
  }

  void engineIsStarted() {
    startEngine();
    System.out.println(engineStarted);
  }

  void startEnginePrint() {
      System.out.println("Engine started.");
    }

    public String getName() {
    return name;
    }
  }
