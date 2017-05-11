package battleships;

import java.util.Scanner;

public class Console {
	Scanner sc;
	Renderer rend;
	
	Console(){
		sc = new Scanner(System.in);
		rend = new Renderer();
	}
	
	public void renderGrid(TrackingBoard trackingBoard){
		for(int row = 0; row < trackingBoard.squares.length; row++){
			System.out.println("| " + rend.renderRow(trackingBoard.squares[row]));
		}
	}
	
	public int[] getFireTarget(){
		int[] target = new int[2];
		
		display("What row? (0-indexed!)");
		target[0] = sc.nextInt();
		display("What column? (Also 0-indexed!)");
		target[1] = sc.nextInt();
		
		return target;
	}
	
	public void display(String string){
		System.out.println(string);
	}
}
