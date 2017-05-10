# Battleships

## Languages and Frameworks

This model is written in pure Java and is intended to run in the terminal. I have used junit for unit testing.

## Building a board

* The board consists of a 10x10 2D array of Square objects.
* Squares have a boolean instance variable `isFull` that states whether this square contains part of a ship.
* The board has a variable `fullSquares` that will track the number of squares filled.

## Tracking Board

* A tracking board is contructed using a `Square[][]` array. This will be passed from one player's primary board to the other once players have positioned their ships.
* Another instance variable `isVisible` was added to the `Square` class. This boolean will control whether players can see whether the square is full or not.
* The tracking board's constructor calls a private method that sets all squares on the board to invisible.
