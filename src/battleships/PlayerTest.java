package battleships;
	
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player player;
	Player player2;
	
	@Before
	public void setUp() throws Exception {
		player = new Player("test");
		player2 = new Player("dummy");
	}

	@Test
	public void setUpBoardPlacesShips() {
		player.setupBoard();
		assertTrue(player.board.squares[0][0].isFull());
	}

	@Test
	public void setupFills17squares(){
		player.setupBoard();
		assertEquals(17, player.board.fullSquares);
	}
	
	@Test
	public void instantiatesWithNoTrackingBoard(){
		assertEquals(null, player.trackingBoard);
	}
	
	@Test
	public void trackingBrdSetterWorks(){
		player2.setupBoard();
		player.setTrackingBoard(player2.board);
		// test that there's something there!
		assertNotNull(player.trackingBoard);
		// test that squares are invisible
		assertFalse(player.trackingBoard.squares[4][4].isVisible);
		// test that player 2's ship pattern has passed over
		assertTrue(player.trackingBoard.squares[4][0].isFull);
		assertFalse(player.trackingBoard.squares[5][0].isFull);
		
	}
	
	@Test
	public void fireSetsTargetToVisible(){
		player2.setupBoard();
		player.setTrackingBoard(player2.board);

		assertFalse(player.trackingBoard.squares[5][6].isVisible);
		player.fire(5, 6);
		assertTrue(player.trackingBoard.squares[5][6].isVisible);
	}
	
	@Test
	public void fireIncrementsHitsIfTargetFull(){
		player2.setupBoard();
		player.setTrackingBoard(player2.board);
		
		assertEquals(0, player.hits);
		player.fire(0, 0);
		assertEquals(1, player.hits);
	}
}
