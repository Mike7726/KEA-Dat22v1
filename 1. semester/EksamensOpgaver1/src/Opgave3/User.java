package Opgave3;

public class User {

  private String username;
  private int userid;
  private Role role;

  public User (String name, int ID, Role role) {
    setUsername(name);
    setUserid(ID);
    this.role = role;
  }

  public Role getRole() {
    return role;
  }


  public void setUsername (String name) {
    this.username = name;
  }

  public String getUsername () {
    return username;
  }

  public void setUserid (int ID) {
    this.userid = ID;
  }

  public int setUserid() {
    return userid;

  }

  @Override
  public String toString() {
    return "User{" +
        "username='" + username + '\'' +
        ", userid=" + userid +
        ", role=" + role +
        '}';
  }
}
