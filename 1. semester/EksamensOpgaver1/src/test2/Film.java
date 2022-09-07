package test2;

import java.time.LocalDateTime;


public class Film {

  private String filmTitel;
  private int udgivelsesÅr;
  private Producer producer;

  public Film(String filmTitel, int udgivelsesÅr) {
    setFilmTitel(filmTitel);
    setUdgivelsesÅr(udgivelsesÅr);
  }

  public Film(String filmTitel) {
    setFilmTitel(filmTitel);
    udgivelsesÅr = 2022;
  }

  public Film() {

  }

  public void setFilmTitel(String filmTitel) {
    this.filmTitel = filmTitel;
  }

  public String getFilmTitel() {
    return filmTitel;
  }

  public void setUdgivelsesÅr(int udgivelsesÅr) {
    this.udgivelsesÅr = udgivelsesÅr;
  }

  public int getUdgivelsesÅr() {
    return udgivelsesÅr;
  }

  public void setProducer(Producer producer) {
    this.producer = producer;
  }

  public Producer getProducer() {
    return producer;

  }
}
