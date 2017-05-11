package battleships;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player("Player One");
		Player player2 = new Player("Player Two");
		Player currentPlayer = null;
		Console console = new Console();
		
		player1.setupBoard();
		player2.setupBoard();
		
		player1.setTrackingBoard(player2.board);
		player2.setTrackingBoard(player1.board);
		
		boolean p1turn = true;
		
		while (true){	
			
			if(p1turn){
				currentPlayer = player1;
			} else {
				currentPlayer = player2;
			}
			
				console.renderGrid(currentPlayer.trackingBoard);
				console.display("Fire at will, " + currentPlayer.name);
				int[] target = console.getFireTarget();
				if(currentPlayer.fire(target[0], target[1])){
					console.display("HIT!");
				} else {
					console.display("miss :(");
				}
		
			
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(currentPlayer.checkWin()){
				break;
			}
			p1turn = (!p1turn);
		}
		
		console.display(currentPlayer.name + " wins!");
	}
}
