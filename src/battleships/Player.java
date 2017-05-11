package battleships;

import java.util.ArrayList;

public class Player {
	Board board;
	String name;
	ArrayList<Ship> fleet;
	TrackingBoard trackingBoard;
	Console console;
	int hits;
	
	
	Player(String name){
		this.board = new Board();
		this.name = name;
		this.fleet = ShipYard.buildFleet();
		this.trackingBoard = null;
		this.hits = 0;
		this.console = new Console();
	}
	
	public void setupBoard(){	
		
		for(int i = 0; i < fleet.size(); i++){
			console.display(name + " place your ship. Length: " + fleet.get(i).length);
			console.renderGrid(board);
			
			int[] target = console.getFireTarget();
			boolean orientation = console.getOrientation();
			
			// need to handle entering letters
			// need to handle out of bounds
		
			if(board.shipOverlaps(fleet.get(i), target[0], target[1], orientation)){
				console.display("Uh-oh! Ships can't overlap! Start again.");
				break;
			} else {
				board.place(fleet.get(i), target[0], target[1], orientation);
			}
		}
		if(board.fullSquares < 17){
			console.display("Something went wrong!");
			board = new Board();
			setupBoard();
		}
	}
	
	
	
	
	public void setTrackingBoard(Board board){
		this.trackingBoard = new TrackingBoard(board.squares);
	}
	
	public boolean fire(int row, int column){
		
		Square targetSquare = trackingBoard.squares[row][column];
		if(!targetSquare.isVisible()){
			targetSquare.setVisible(true);
			if (targetSquare.isFull()){
				hits++;
				return true;
			}
			
			return false;
		}
		console.display("You picked that one before! That was silly.");
		return false;
	}
	
	public boolean checkWin(){
		if(hits == 17){
			return true;
		}
		
		return false;
	}
	
}
