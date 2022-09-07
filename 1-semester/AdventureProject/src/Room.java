public class Room {

  private String name;
  private String description;
  private Room North;
  private Room West;
  private Room South;
  private Room East;
  private Room currentRoom;

  Room(String name, String description) {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Room getNorth() {
    return North;
  }

  public void setNorth(Room north) {
    this.North = north;
  }

  public Room getWest() {
    return West;
  }

  public void setWest(Room west) {
    this.West = west;
  }

  public Room getSouth() {
    return South;
  }

  public void setSouth(Room south) {
    this.South = south;
  }

  public Room getEast() {
    return East;
  }

  public void setEast(Room east) {
    this.East = east;
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }
}
