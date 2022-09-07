package comparablestuff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestCake {

  public void go() {

    ArrayList<Cake> cakes = new ArrayList<>();
    cakes.add(new Cake("Citronmåne", 22));
    cakes.add(new Cake("Prositkage", 77));
    cakes.add(new Cake("Cintronstjerne", 31));
    cakes.add(new Cake("Napoleonshat", 43213));
    cakes.add(new Cake("Jordbærtærte", 3123));
    cakes.add(new Cake("Citronsol", 3121));

    System.out.println(cakes);

    Collections.sort(cakes);

    System.out.println(cakes);
  }

  public void go2() {

    ArrayList<Cake> cakes = new ArrayList<>();
    cakes.add(new Cake("Citronmåne", 22));
    cakes.add(new Cake("Prositkage", 77));
    cakes.add(new Cake("Cintronstjerne", 31));
    cakes.add(new Cake("Napoleonshat", 43213));
    cakes.add(new Cake("Jordbærtærte", 3123));
    cakes.add(new Cake("Citronsol", 3121));

    CakeByWeight cakeByWeight = new CakeByWeight();

    System.out.println(cakes);

    Collections.sort(cakes, cakeByWeight);

    System.out.println(cakes);

  }

  public static void main(String[] args) {
   // new TestCake().go();
    new TestCake().go2();
  }
}
