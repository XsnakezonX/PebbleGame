# ECM 2414 Software Development Pebble Game Simulation Project
## Task Context
This project involves the implementation of a multi-threaded game where players compete by drawing and discarding pebbles from various bags. The game is designed to be thread-safe and requires players to interact with six bags of pebbles, three of which start full and three empty. Players aim to collect pebbles with a total weight of exactly 100 to win the game. The game ensures fair play by randomizing pebble draws and enforcing specific rules for discarding pebbles. 

This README provides detailed instructions on setting up, running, and understanding the game’s mechanics and code structure.

- Code Part: an executable JAR file (pebbles.jar) and a ZIP file (pebblesTest.zip) containing Java classes, test classes, and a README file.

- Report Part: a cover page with pair programming workload allocation, a development log, a design choice document, and a testing document.

## Properties of Game Simulation:
- Bag Management: Once a black bag is empty, all pebbles from the corresponding white bag should be emptied into it (e.g., Bag X filled by Bag A).
- Random Drawing: Drawing pebbles from a black bag should be uniformly at random.
Concurrency: Players should act as concurrent threads, starting before drawing their initial pebbles.
- Atomic Actions: Drawing and discarding should be atomic actions, with discards going to the paired white bag of the last black bag drawn from.
- Minimum Pebbles: Each black bag must contain at least 11 times as many pebbles as players.
- Positive Weights: Pebbles must have strictly positive weights, and the program should detect and warn about illegal values.

# Before running the game...
### Install JDK 17 or higher

## Notes:

#### The "pebbles.jar" has to be placed in the same folder with:

#### - a "player_logs" folder
#### - a pebble input file CSV or txt file
#### - empty the "player_logs" folder after each run of the game

## How to run the game jar:

#### 1. open cmd
#### 2. Use 'cd' command to reach the file location that contains the "pebbles.jar"
#### 3. Enter: "java -jar pebbles.jar" to start the game

