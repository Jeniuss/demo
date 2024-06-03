# BFS Algorithm
1. Store each cell as a node with their row, column values and distance from source cell.
2. Start BFS with source cell.
3. Make a visited array with all having “false” values except ‘0’cells which are assigned “true” values as they can not be traversed.
4. Keep updating distance and the parent path from source value in each move.
5. Return distance when destination is met, else return -1 (no path exists in between source and destination).

# How to run the project
using jdk 20.0.2
1. the source code store in "src/main/java/com/example/demo/services/PathService.java"
2. the source code for testing store in "src/test/java/com/example/demo/services/PathServiceTest.java", you can run each test case on this file
