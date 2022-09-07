package Opgave3;

import java.util.ArrayList;

public class Users {

  private int currentID = 0;
  static ArrayList<User> users = new ArrayList<User>();

  public void createUser(String name, Role role) {
    User user = new User(name, currentID, role);
    currentID++;
    users.add(user);
  }

  ArrayList<User> getUserByRole(Role role) {

    ArrayList<User> specificRole = new ArrayList<User>();
    for (User bruger : users) {
      if (bruger.getRole() == role) {
        specificRole.add(bruger);
      }
    }
    return specificRole;
  }



  public static void main(String[] args) {

    User user1 = new User("Birgitte", 11, Role.ADMIN);
    User user2 = new User("Ole", 14, Role.READER);
    User user3 = new User("Hans", 12, Role.EDITOR);
    users.add(user1);
    users.add(user2);
    users.add(user3);

    System.out.println(users);


  }
}
