package Opgave2;

public class Beer {

  private String name;
  private int alcoholPercentage;
  private int price;

  void setAlcoholPercentage(int alcoholPercentage) {

      if (alcoholPercentage < 0 || alcoholPercentage > 100){
        throw new RuntimeException("Price is negative or above 100");
      }



     // throw new RuntimeException("Price is negative or above 100");
    //}

    this.alcoholPercentage = alcoholPercentage;
  }

  void setPrice(int price) {
    if (price < 0) {
      throw new RuntimeException("Price is negative");
    }
    this.price = price;
  }

  int getPrice() {
    return price;
  }


}