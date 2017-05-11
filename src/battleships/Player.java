package battleships;

import java.util.ArrayList;

public class Player {
	Board board;
	String name;
	ArrayList<Ship> fleet;
	
	Player(String name){
		this.board = new Board();
		this.name = name;
		this.fleet = ShipYard.buildFleet();
	}
	
	public void setupBoard(){
		for(int i = 0; i < fleet.size(); i++){
		board.place(fleet.get(i), i, 0, true);
		}
	}
}
