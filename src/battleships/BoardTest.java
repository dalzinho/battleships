package battleships;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {

	Board board;
	
	@Before
	public void setUp() throws Exception {
		board = new Board();
	}
	
	@Test 
	public void populatesWithSquares(){
		assertEquals(false, board.squares[0][0].isFull());
		assertEquals(false, board.squares[4][4].isFull());
		assertEquals(false, board.squares[9][9].isFull());
	}
	
	@Test
	public void consistsOf100objects() {
		int objects = 0;
		for(int i = 0; i < board.squares.length; i++){
			objects += board.squares[i].length;
		}
		assertEquals(100, objects);
	}
	
}
