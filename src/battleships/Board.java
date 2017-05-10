package battleships;

public class Board {
	
	Square[][] squares;
	int fullSquares;
	
	Board(){
		squares = new Square[10][10];
		fullSquares = 0;
		
		for(int row = 0; row < squares.length; row++){
			for(int column = 0; column < squares[row].length; column++){
				squares[row][column] = new Square();
			}
		}
	}
}
