Text-Based Adventure Game

A simple interactive fiction game where players explore rooms, interact with objects, and complete adventures by typing commands. Built using Java, this game leverages object-oriented principles and data structures like arrays and hash maps.

Game Overview
The player takes on the role of an "Adventurer" who navigates different rooms in a fictional world. The adventurer follows commands given by the player, such as Go, Look, Take, Drop, Use, and Exit. The goal is to explore rooms, find items, and complete objectives based on the commands.

Project Structure
TextAdventureGame/ 
├── src/ 
│ ├── Main.java #Entry point of the game 
│ ├── TextAdventure.java #Main game loop and command processing 
│ ├── AdventureModel.java #Sets up rooms and the game world 
│ ├── Adventurer.java #Represents the player and actions they can take 
│ ├── Room.java #Represents each room, its description, and exits 
└── README.md #Documentation for the project

Features
- Room Navigation: Move between connected rooms by typing commands (e.g., go north).
- Basic Commands: Interact with the environment using commands like look, take, drop, and use.
- Player Tracking: The game keeps track of the player's current room and actions.
- Flexible Structure: Easily add more rooms, commands, and items by expanding the model.


Technologies Required
- Java programming language
- Java objects and classes
- Data structures: Arrays and HashMaps

Getting Started

- Prerequisites
— Java Development Kit (JDK) installed on your machine.
— A code editor like [Visual Studio Code](https://code.visualstudio.com/) with Java extensions.

- Setup Instructions
1. Clone the Repository:
— git clone https://github.com/nikhil7476/TextAdventureGame.git

2. Navigate to Project Folder:
— cd TextAdventureGame

3. Open in Visual Studio Code:
— code .

Building and Running the Game
1. Open the src folder in VS Code.
2. Compile and run the game using the terminal or the Run/Debug option in VS Code:
- Navigate to src folder
— cd src
- Compile the Java files
— javac Main.java TextAdventure.java AdventureModel.java Adventurer.java Room.java
- Run the game
— java Main
3. Interact with the Game: Use commands like go north, look, take item, and exit to play.

How to Play
- Commands: Type a command and press Enter. Valid commands include:
— go [direction] — Move to an adjacent room (e.g., go north).
— look — Look around in the current room.
— take [item] — Take an item from the room.
— drop [item] — Drop an item in the room.
— use [item] — Use an item (if applicable).
— exit — Exit the game.

- Example Commands:
— go north
— look
— take key
— use potion
— exit

Customization
The project is designed to be extensible. To add more rooms, items, or commands:

1. Modify AdventureModel.java to set up new rooms or items.
2. Update Adventurer.java with additional interactions or behaviors.
3. Enhance TextAdventure.java to handle new commands.

Future Enhancements
1. Add more complex items with specific behaviors.
2. Implement inventory limits.
3. Introduce NPCs or interactive characters.
4. Add puzzles and objectives for the player to solve.

Contributing
Feel free to fork this repository and submit pull requests if you'd like to contribute new features or improvements. Please ensure all contributions maintain the code structure and follow Java best practices.


License
This project is licensed under the MIT License. See the LICENSE file for details.

Happy adventuring!
This README.md file provides a clear overview of the project, installation instructions, usage, customization details, and potential future improvements. It also includes a contribution section if others wish to collaborate.
