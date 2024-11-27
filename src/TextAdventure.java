import java.util.HashMap;

public class TextAdventure {
    private final AdventureModel model;
    private final Adventurer adventurer;

    public TextAdventure() {
        model = new AdventureModel();
        adventurer = new Adventurer(model.getStartingRoom());
    }

    public String processCommand(String command) {
        String[] parts = command.trim().toLowerCase().split(" ");
        String action = parts[0];

        switch (action) {
            case "go":
                if (parts.length > 1) {
                    return adventurer.move(parts[1]);
                }
                return "Specify a direction to go.";
            case "look":
                return adventurer.look();
            case "take":
                if (parts.length > 1) {
                    return adventurer.take(parts[1]);
                }
                return "Specify an item to take.";
            case "drop":
                if (parts.length > 1) {
                    return adventurer.drop(parts[1]);
                }
                return "Specify an item to drop.";
            case "exit":
                return "Goodbye!";
            default:
                return "Unknown command.";
        }
    }
}
