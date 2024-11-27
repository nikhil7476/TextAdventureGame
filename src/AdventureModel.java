import java.util.HashMap;

public class AdventureModel {
    private final HashMap<String, Room> rooms;

    public AdventureModel() {
        rooms = new HashMap<>();
        initializeRooms();
    }

    private void initializeRooms() {
        Room forest = new Room("Forest", "You are in a dark forest.");
        Room cave = new Room("Cave", "You are in a cold, damp cave.");
        Room village = new Room("Village", "You are in a small, quiet village.");

        forest.addExit("north", cave);
        cave.addExit("south", forest);
        cave.addExit("east", village);
        village.addExit("west", cave);

        rooms.put("forest", forest);
        rooms.put("cave", cave);
        rooms.put("village", village);
    }

    public Room getStartingRoom() {
        return rooms.get("forest");
    }
}
