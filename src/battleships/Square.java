package battleships;

public class Square {
	boolean isFull;
	boolean isVisible;
	
	Square(){
		this.isFull = false;
		this.isVisible = true;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	
	
	
}
