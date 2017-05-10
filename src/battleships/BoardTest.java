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
	}
	
	@Test
	public void consistsOf100objects() {
		fail("Not yet implemented");
	}

}
