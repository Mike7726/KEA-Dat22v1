package test;

import java.util.ArrayList;


public class Tekst {

  private ArrayList<String> tekstLinjer = new ArrayList<>();


  public void tilføj(String tekst) {
    tekstLinjer.add(tekst);
  }

  public int findAntalUnikke() {
    int tæller = 0;
    for (int i = 0; i < tekstLinjer.size(); i++) {
      boolean isAlreadyInList = false;
      for (int j = 0; j < i; j++) {
        if (tekstLinjer.get(i) == tekstLinjer.get(j)) {
          isAlreadyInList = true;

        }

      }
      if (isAlreadyInList) {
        tæller++;
      }

    }
    return tæller;
  }

}

