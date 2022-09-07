package comparablestuff;

public class Cake implements Comparable<Cake> {
  private String name;
  private int weight;

  public Cake(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public int compareTo(Cake other) {
    return this.weight - other.weight;
  }


  /*
 // Dette er den helt vildt besværlige måde at gøre det på! -
  //Hvor man ligger de instantierede objekter(kager) op i alfabetisk rækkefølge
  @Override
  public int compareTo(Cake other) {
    if (this.name.compareTo(other.name) < 0)
      return -1;
    else if (this.name.compareTo(other.name) > 0)
      return 1;
    else
      return 0;
  }
   */

  @Override
  public String toString() {
    return "Cake{" +
        "name='" + name + '\'' +
        ", weight=" + weight +
        "}\n";

  }
}
