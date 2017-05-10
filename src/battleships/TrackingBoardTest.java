package battleships;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrackingBoardTest {
	
	Board board;
	TrackingBoard tracker;
			

	@Before
	public void setUp() throws Exception {
		board = new Board();
		Square[][] boardSquares = board.squares;
		tracker = new TrackingBoard(new Board().squares);
	}

	@Test
	public void trackerConstructorSetsSquaresToNotVisible() {
		assertTrue(board.squares[0][0].isVisible());
		assertFalse(tracker.squares[0][0].isVisible());
	}

}
