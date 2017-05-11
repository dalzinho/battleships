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
	
	public void fillSquare(int row, int column){
		squares[row][column].setFull(true);
		fullSquares++;
	}

	// contemplate placeShip method/class, with regard to starting position, length and orientation
	public boolean place(Ship ship, int targetRow, int targetColumn, boolean isHorizontal){
		if(isHorizontal){
			for(int column = targetColumn; column < ship.getLength() + targetColumn; column++){
				fillSquare(targetRow, column);
			}
			return true;
		} else {
			for(int row = targetRow; row < ship.getLength() + targetRow; row ++){
				fillSquare(row, targetColumn);
			}
			return true;
			
		}
	}
}
