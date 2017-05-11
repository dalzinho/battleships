package battleships;

public class Renderer {
	public StringBuilder renderRow(Square[] squares){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < squares.length; i++){
			sb.append(translateSquare(squares[i]) + " | ");
		}
		
		return sb;
	}
	
	public char translateSquare(Square square){
		if(!square.isVisible()){
			return '.';
		} else {
			if(square.isFull()){
				return 'X';
			} else {
				return '~';
			}
		}
	}
}
