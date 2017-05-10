package battleships;

public class TrackingBoard {
	Square[][] squares;
	
	TrackingBoard(Square[][] squares){
		this.squares = squares;
		makeAllSquaresInvisible();
	}
	
	private void makeAllSquaresInvisible(){
		for(int row = 0; row < squares.length; row++){
			for(int column = 0; column < squares[row].length; column++){
				squares[row][column].setVisible(false);
			}
		}
	}
}
