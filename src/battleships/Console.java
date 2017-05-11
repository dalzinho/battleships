package battleships;

import java.util.Scanner;

public class Console {
	Scanner sc;
	
	Console(){
		sc = new Scanner(System.in);
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
