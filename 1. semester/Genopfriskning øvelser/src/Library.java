import java.util.ArrayList;

public class Library {

  public static void main(String[] args) {
    new Library().go();
  }

  private ArrayList<Bog> books = new ArrayList<>();
  Bog bog1 = new Bog("13231-23123-13221", "test1", 2002);
  Bog bog2 = new Bog("13231-231234-1323211", "test2", 2005);


  public void go() {
    books.add(bog1);
    System.out.println(checkLibraryInventory(books, books.get(0).getISBN()));
  }


  public boolean checkLibraryInventory(ArrayList<Bog> books, String getISBN) {
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).getISBN() == getISBN) {
        return true;
      } else {

      }
    }
    return false;
  }

}
