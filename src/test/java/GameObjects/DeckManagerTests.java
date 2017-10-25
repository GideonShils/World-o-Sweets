import static org.junit.Assert.*;
import org.junit.*;


import GameObjects.DeckManager;

public class DeckManagerTests {

	DeckManager dm;

	@Before
	public void setup(){
		dm = new DeckManager();
	}

	/* 
		test that passing parameters of 10 singles and 2 doubles generates a deck of 60 cards
	*/
	@Test
	public void deckCountTest60(){
		dm.createDeck(10, 2);
		assertEquals(60, dm.getTotalCardCount());
	}

	// test that passing parameters of 1 single and 1 double generates a deck of 10 cards
	@Test
	public void deckCountTest10(){
		dm.createDeck(1, 1);
		assertEquals(10, dm.getTotalCardCount());
	}

	// test that deck is rejected when 0 is passed as parameter for singles
	@Test
	public void deck0InputTest1(){
		assertFalse(dm.createDeck(0, 5));
	}

	// test that deck is rejected when 0 is passed as parameter for doubles
	@Test
	public void deck0InputTest2(){
		assertFalse(dm.createDeck(5, 0));
	}

	// test that deck is rejected when negative number is passed as parameter for singles
	@Test
	public void deckNegativeInputTest1(){
		assertFalse(dm.createDeck(-1, 5));
	}

	// test that deck is rejected when negative number is passed as parameter for doubles
	@Test
	public void deckNegativeInputTest2(){
		assertFalse(dm.createDeck(5, -1));
	}


}