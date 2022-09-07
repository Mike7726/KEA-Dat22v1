package Interface;

public class Main {

  public static void main(String[] args) {

    iMovement winston = new Winston();
    iMovement mei = new Mei();

    iMovement[] charactors = new iMovement[2];
    charactors[0] = winston;
    charactors[1] = mei;

    for (iMovement charactor: charactors) {
      charactor.ultimate();
      charactor.passive();

      if (charactor instanceof Mei) {
        charactor.WASD();
      }

    }

  }

}
