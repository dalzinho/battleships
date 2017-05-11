package battleships;

import java.util.concurrent.TimeUnit;

public class Game {
	public static void main(String[] args) {
		Player player1 = new Player("Player One");
		Player player2 = new Player("Player Two");
		Console console = new Console();
		
		player1.setupBoard();
		player2.setupBoard();
		
		player1.setTrackingBoard(player2.board);
		player2.setTrackingBoard(player1.board);
		
		boolean p1turn = true;
		while (!player1.checkWin() || !player2.checkWin()){	
			
			if(p1turn){
				console.renderGrid(player1.trackingBoard);
				console.display("Fire at will, Player One");
				int[] target = console.getFireTarget();
				if(player1.fire(target[0], target[1])){
					console.display("HIT!");
				};
			} else {
				console.renderGrid(player2.trackingBoard);
				console.display("Fire at will, Player Two");
				int[] target = console.getFireTarget();
				if(!player2.fire(target[0], target[1])){
					console.display("miss :(");
				};
			}
			
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			p1turn = (!p1turn);
		}
	}
}
