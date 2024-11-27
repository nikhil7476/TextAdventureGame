public class Adventurer {
    private Room currentRoom;

    public Adventurer(Room startingRoom) {
        this.currentRoom = startingRoom;
    }

    public String move(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return "You moved to: " + currentRoom.getDescription();
        }
        return "You can't go that way.";
    }

    public String look() {
        return currentRoom.getDescription();
    }

    public String take(String item) {
        return "You can't take that right now.";
    }

    public String drop(String item) {
        return "You can't drop that right now.";
    }
}
