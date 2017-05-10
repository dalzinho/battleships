package battleships;

public class Square {
	boolean isFull;
	
	Square(){
		this.isFull = false;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}
	
	
}
