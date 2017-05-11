# Battleships

## Languages and Frameworks

This model is written in pure Java and is intended to run in the terminal. I have used junit for unit testing.

## Building a board

* The board consists of a 10x10 2D array of Square objects.
* Squares have a boolean instance variable `isFull` that states whether this square contains part of a ship.
* The board has a variable `fullSquares` that will track the number of squares filled.
* There is a `place()` method on the board, which sets a given number of squares (either horizontally or vertically from a given target square) to full, based on the length of the ship being placed.
* There is a `Player` class that will have its own board.
* Two Players are instatiated in the `Game` class, and have hard-coded fleet placements.

## Tracking Board

* A tracking board is contructed using a `Square[][]` array. This will be passed from one player's primary board to the other once players have positioned their ships.
* Another instance variable `isVisible` was added to the `Square` class. This boolean will control whether players can see whether the square is full or not.
* The tracking board's constructor calls a private method that sets all squares on the board to invisible.
* The Player class calls a method `setTrackingBoard` that takes the opponent's board positions and generates a tracking board from this.

## Validation

* Initially, boards are hard-coded to be valid (i.e. 5 ships of a given length, placed within bounds in a non-overlapping fashion).

## Determine Winner

* `fire()` method added to player. This takes row and column integers and selects the appropriate square from the tracking board. It sets it to be visible, and if the square is full, increments the player's hits variable. 
* The game is played on a loop based on checking the win status of each player (i.e `hits < 17`. If both are false, players take turns to `fire()` at a square.

## Outstanding issues

* entering character during fire sequence throws inputmismatchexception
* would prefer players to have manual ship entry (and all the exception handling this brings :D )
