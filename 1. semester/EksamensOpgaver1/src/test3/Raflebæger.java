package test3;

public class Raflebæger {

  private int antalTerninger;

  Raflebæger(int antalTerninger) {
    setAntalTerninger(antalTerninger);
  }


  public int ryst() {
    int antalØjne = 0;
    for (int i = 0; i < antalTerninger; i++) {
      antalØjne += (Math.random() * 5) + 1;

    }
    return antalØjne;
  }


  public void setAntalTerninger(int antalTerninger) {
    this.antalTerninger = antalTerninger;
  }

  public int getAntalTerninger() {
    return antalTerninger;
  }


}
