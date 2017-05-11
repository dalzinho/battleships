package battleships;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {

	Board board;
	Ship ship;
	
	@Before
	public void setUp() throws Exception {
		board = new Board();
		ship = new Ship(2);
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

	@Test
	public void horizontalPlacementSetsSquaresFull(){
		board.place(ship, 0, 0, true);
		assertTrue(board.squares[0][0].isFull());
		assertTrue(board.squares[0][1].isFull());
		// since ship is two squares long,
		// third square in row should still be empty
		assertFalse(board.squares[0][2].isFull());
		
	}

	
	@Test
	public void verticalPlacementSetsSquaresFull(){
		board.place(ship, 0, 0, false);
		assertTrue(board.squares[0][0].isFull());
		assertTrue(board.squares[1][0].isFull());
		assertFalse(board.squares[2][0].isFull());
	}
	
	@Test
	public void placementIncrementsFullCounter(){
		board.place(ship, 0, 0, true);
		assertEquals(2, board.fullSquares);
	}
	
}
