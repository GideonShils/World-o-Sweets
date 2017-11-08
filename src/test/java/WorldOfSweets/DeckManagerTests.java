import static org.junit.Assert.*;
import org.junit.*;


import WorldOfSweets.DeckManager;
import GameObjects.Card;

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

	// test that 50 singles were added to deck
	@Test
	public void deckContains50Singles(){
		dm.createDeck(10, 2, 5, 3);
		assertEquals(50, dm.getSinglesCount());
	}

	// test that 50 singles were added to deck by checking entire deck
	@Test
	public void deckContains50SinglesTest2(){
		dm.createDeck(10, 2, 5, 3);
		int singleCount = 0;

		for (int i = 0; i < dm.getTotalCardCount(); i++){
			Card c = dm.draw();

			if (c.getCardText().equals("Single"))
				singleCount++;
		}

		assertEquals(50, singleCount);
	}

	// test that 10 doubles were added to deck
	@Test
	public void deckContains10Doubles(){
		dm.createDeck(10, 2, 5, 3);
		assertEquals(10, dm.getDoublesCount());
	}

	// test that 10 doubles were added to deck by checking entire deck
	@Test
	public void deckContains10DoublesTest2(){
		dm.createDeck(10, 2, 5, 3);
		int doubleCount = 0;

		for (int i = 0; i < dm.getTotalCardCount(); i++){
			Card c = dm.draw();

			if (c.isDouble())
				doubleCount++;
		}

		assertEquals(10, doubleCount);
	}

	// test that 5 skips were added to deck
	@Test
	public void deckContains5Skips(){
		dm.createDeck(10, 2, 5, 3);
		assertEquals(5, dm.getSkipsCount());
	}

	// test that 5 skips were added to deck by checking entire deck
	@Test
	public void deckContains5SKipTest2(){
		dm.createDeck(10, 2, 5, 3);
		int skipCount = 0;

		for (int i = 0; i < dm.getTotalCardCount(); i++){
			Card c = dm.draw();

			if (c.skip())
				skipCount++;
		}

		assertEquals(5, skipCount);
	}

	// test that 3 Go To Middles were added to deck
	@Test
	public void deckContains3GoToMiddle(){
		dm.createDeck(10, 2, 5, 3);
		assertEquals(3, dm.getGoToMiddleCount());
	}

	// test that 3 Go To Middle cards were added by checking entire deck
	@Test
	public void deckContains3GoToMiddleTest2(){
		dm.createDeck(10, 2, 5, 3);
		int goToMiddleCount = 0;

		for (int i = 0; i < dm.getTotalCardCount(); i++){
			Card c = dm.draw();

			if (c.goToMiddle())
				goToMiddleCount++;
		}

		assertEquals(3, goToMiddleCount);
	}



}