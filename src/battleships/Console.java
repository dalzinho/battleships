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
		
		for(int i = 0; i < target.length; i++){
			String displayItem = null;
			switch (i){
				case 0: displayItem = "row";
						break;
				case 1: displayItem = "column";
						break;
			}
			
			display("Enter " + displayItem + "! (This is zero-indexed)");
			target[i] = sc.nextInt();
			// catch out of bounds
			while(target[i] > 9){
				display("out of bounds, try again!");
				target[i] = sc.nextInt();
			}
		}	
		return target;
	}
	
	public void display(String string){
		System.out.println(string);
	}
}
