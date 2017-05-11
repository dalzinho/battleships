package battleships;

public class Player {
	Board board;
	String name;
	
	Player(String name){
		this.board = new Board();
		this.name = name;
	}
}
