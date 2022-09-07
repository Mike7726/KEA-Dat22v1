public class Bog {
  private String ISBN;
  private String title;
  private int yearOfRelease;

  public Bog(String ISBN, String title, int yearOfRelease) {
    this.ISBN = ISBN;
    this.title = title;
    this.yearOfRelease = yearOfRelease;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYearOfRelease() {
    return yearOfRelease;
  }

  public void setYearOfRelease(int yearOfRelease) {
    this.yearOfRelease = yearOfRelease;
  }
}
