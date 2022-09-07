package Opgave2;

import java.util.ArrayList;

public class Main {

  void go() {

    Beer beer1 = new Beer();
    beer1.setPrice(20);

    try {
      beer1.setAlcoholPercentage(101);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }

    Beer beer2 = new Beer();
    beer2.setPrice(30);

    Beer beer3 = new Beer();
    beer3.setPrice(40);

    ArrayList<Beer> averagePriceOfBeer = new ArrayList<Beer>();
    averagePriceOfBeer.add(beer1);
    averagePriceOfBeer.add(beer2);
    averagePriceOfBeer.add(beer3);

    int sum = beerPriceSum(averagePriceOfBeer);
    System.out.println(sum);
  }

  int beerPriceSum(ArrayList<Beer> beers) {
    int sum = 0;

    for (Beer beer:beers) {
      sum = sum + beer.getPrice();
    }

    return sum;
  }

  public static void main(String[] args) {
    new Main().go();

  }
}
