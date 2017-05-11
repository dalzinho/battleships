package battleships;

import java.util.ArrayList;

public class Player {
	Board board;
	String name;
	ArrayList<Ship> fleet;
	TrackingBoard trackingBoard;
	int hits;
	
	Player(String name){
		this.board = new Board();
		this.name = name;
		this.fleet = ShipYard.buildFleet();
		this.trackingBoard = null;
		this.hits = 0;
	}
	
	public void setupBoard(){
		for(int i = 0; i < fleet.size(); i++){
		board.place(fleet.get(i), i, 0, true);
		}
	}
	
	public void setTrackingBoard(Board board){
		this.trackingBoard = new TrackingBoard(board.squares);
	}
	
	public void fire(int row, int column){
		Square targetSquare = trackingBoard.squares[row][column];
		targetSquare.setVisible(true);
		if (targetSquare.isFull()){
			hits++;
		}
		
	}
	
}
