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
	
	public boolean shipOverlaps(Ship ship, int targetRow, int targetColumn, boolean isHorizontal){
		if(isHorizontal){
			for(int column = targetColumn; column < ship.length + targetColumn; column++){
				if(squares[targetRow][column].isFull()){
					return true;
				}
			}
		} else {
			for(int row = targetRow; row < ship.length + targetRow; row++){
				if(squares[row][targetColumn].isFull()){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean shipFits(Ship ship, int targetRow, int targetColumn, boolean isHorizontal){
		if(isHorizontal){
			if(targetColumn + ship.length <= 9) return true;
		} else {
			if(targetRow + ship.length <= 9) return true;
		}
		return false;
	}
	
	// contemplate placeShip method/class, with regard to starting position, length and orientation
	public void place(Ship ship, int targetRow, int targetColumn, boolean isHorizontal){
		if(isHorizontal){
			for(int column = targetColumn; column < ship.getLength() + targetColumn; column++){
				fillSquare(targetRow, column);
			}
		} else {
			for(int row = targetRow; row < ship.getLength() + targetRow; row ++){
				fillSquare(row, targetColumn);
			}
		}
	}
}
