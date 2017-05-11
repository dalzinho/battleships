package battleships;

public class Game {
	public static void main(String[] args) {
		Player player1 = new Player("Player One");
		Player player2 = new Player("Player Two");
		
		player1.setupBoard();
		player2.setupBoard();
		
		player1.setTrackingBoard(player2.board);
		player2.setTrackingBoard(player1.board);
		
		boolean p1turn = true;
		while (!player1.checkWin() || !player2.checkWin()){
			// this will loop infinitely until the console works!
			if(p1turn){
				player1.fire(0, 0);
			} else {
				player2.fire(0, 0);
			}
			p1turn = (!p1turn);
		}
	}
}
