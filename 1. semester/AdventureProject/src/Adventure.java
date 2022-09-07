import java.util.Scanner;

public class Adventure {

  boolean isPlaying = true;

  public static void main(String[] args) {

    Room room1 = new Room("Name1", "Description2");
    Room room2 = new Room("Name2", "Description2");
    Room room3 = new Room("Name3", "Description3");
    Room room4 = new Room("Name4", "Description4");
    Room room5 = new Room("Name5", "Description5");
    Room room6 = new Room("Name6", "Description6");
    Room room7 = new Room("Name7", "Description7");
    Room room8 = new Room("Name8", "Description8");
    Room room9 = new Room("Name9", "Description9");

    Room currentRoom = room1;
    room1.setEast(room2);
    room1.setSouth(room4);

    room2.setWest(room1);
    room2.setEast(room3);

    room3.setWest(room2);
    room3.setSouth(room6);

    room4.setNorth(room1);
    room4.setSouth(room7);

    room5.setSouth(room8);

    room6.setNorth(room3);
    room6.setSouth(room9);

    room7.setNorth(room4);
    room7.setEast(room8);

    room8.setWest(room7);
    room8.setNorth(room5);
    room8.setEast(room9);

    room9.setWest(room8);
    room9.setNorth(room6);

    new Adventure().go();

  }

  void go() {

    char input;
    Scanner scan = new Scanner(System.in);
    PlayerInfo playerName = new PlayerInfo();
    System.out.print("Please enter your name: ");
    playerName.setPlayerName(scan.nextLine());
    System.out.print("Welcome to the Adventure Game, " + playerName.getPlayerName());
    System.out.println();
    System.out.println("\nType [n]orth, [w]est, [e]ast or [s]outh to move on the map. You can type \"[E]xit\" to exit the game and \"[H]elp\" for list of commands: ");
    while (isPlaying) {
      input = scan.next().charAt(0);

      switch (input) {
        case 'n':
          System.out.println("Going North");
          break;
        case 'w':
          System.out.println("Going West");
          break;
        case 'e':
          System.out.println("Going East");
          break;
        case 's':
          System.out.println("Going South");
          break;
        case 'H':
          System.out.println("List of commands:");
          System.out.println("Type [n]orth, [w]est, [e]ast or [s]outh to move on the map. You can type \"[E]xit\" to exit the game:");
          System.out.println();
          break;
        case 'E':
          System.out.println("You have chosen to exit the game. Thanks for playing!");
          isPlaying = false;
      }
    }
  }
}