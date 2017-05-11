package battleships;

public class Game {
	public static void main(String[] args) {
		Player player1 = new Player("Player One");
		Player player2 = new Player("Player Two");
		
		player1.setupBoard();
		player2.setupBoard();
		
		player1.setTrackingBoard(player2.board);
		player2.setTrackingBoard(player1.board);
		
	}
}
