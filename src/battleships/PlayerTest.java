package battleships;
	
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player player;
	
	@Before
	public void setUp() throws Exception {
		player = new Player("test");
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
}
