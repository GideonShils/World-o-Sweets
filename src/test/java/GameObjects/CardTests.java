import static org.junit.Assert.*;
import org.junit.*;

import GameObjects.Card;

public class CardTests {

	// create green single card and test that green color and single were set correctly
	@Test
	public void greenSingleTest(){
		Card c = new Card("green", false);
		java.awt.Color green = new java.awt.Color(0, 255, 0);

		assertEquals(c.getColor(), green);
		assertEquals(c.isDouble(), false);	

	}

	// create green double card and test that green color and double were set correctly
	@Test
	public void greenDoubleTest(){
		Card c = new Card("green", true);
		java.awt.Color green = new java.awt.Color(0, 255, 0);

		assertEquals(c.getColor(), green);
		assertEquals(c.isDouble(), true);	

	}

	// create blue single card and test that blue color and single were set correctly
	@Test
	public void blueSingleTest(){
		Card c = new Card("blue", false);
		java.awt.Color blue = new java.awt.Color(0, 0, 255);

		assertEquals(c.getColor(), blue);
		assertEquals(c.isDouble(), false);	

	}

	// create blue double card and test that blue color and double were set correctly
	@Test
	public void blueDoubleTest(){
		Card c = new Card("blue", true);
		java.awt.Color blue = new java.awt.Color(0, 0, 255);

		assertEquals(c.getColor(), blue);
		assertEquals(c.isDouble(), true);	

	}

	// create red single card and test that red color and single were set correctly
	@Test
	public void redSingleTest(){
		Card c = new Card("red", false);
		java.awt.Color red = new java.awt.Color(255, 0, 0);
		assertEquals(c.getColor(), red);
		assertEquals(c.isDouble(), false);	

	}

	// create red double card and test that red color and double were set correctly
	@Test
	public void redDoubleTest(){
		Card c = new Card("red", true);
		java.awt.Color red = new java.awt.Color(255, 0, 0);

		assertEquals(c.getColor(), red);
		assertEquals(c.isDouble(), true);	

	}

	// create yellow single card and test that yellow color and single were set correctly
	@Test
	public void yellowSingleTest(){
		Card c = new Card("yellow", false);
		java.awt.Color yellow = new java.awt.Color(255, 255, 0);
		assertEquals(c.getColor(), yellow);
		assertEquals(c.isDouble(), false);	

	}

	// create yellow double card and test that yellow color and double were set correctly
	@Test
	public void yellowDoubleTest(){
		Card c = new Card("yellow", true);
		java.awt.Color yellow = new java.awt.Color(255, 255, 0);

		assertEquals(c.getColor(), yellow);
		assertEquals(c.isDouble(), true);	

	}

	// create orange single card and test that orange color and single were set correctly
	@Test
	public void orangeSingleTest(){
		Card c = new Card("orange", false);
		java.awt.Color orange = new java.awt.Color(255, 153, 0);
		assertEquals(c.getColor(), orange);
		assertEquals(c.isDouble(), false);	

	}

	// create orange double card and test that orange color and double were set correctly
	@Test
	public void orangeDoubleTest(){
		Card c = new Card("orange", true);
		java.awt.Color orange = new java.awt.Color(255, 153, 0);

		assertEquals(c.getColor(), orange);
		assertEquals(c.isDouble(), true);	

	}


	// test that getColor() method returns the correct color
	@Test
	public void cardGetColorTest(){
		Card c = new Card("red", true);
		java.awt.Color red = new java.awt.Color(255, 0, 0);

		assertEquals(c.getColor(), red);
	}

	// test that setting the color to a new color actually work
	@Test
	public void cardSetColorTest(){
		Card c = new Card("orange", true);

		c.setColor("red");

		java.awt.Color red = new java.awt.Color(255, 0, 0);

		assertEquals(c.getColor(), red);
	}

	// test that text for a single card is returned correctly when IsDoubleText() is called
	@Test
	public void getSingleTextTest(){
		Card c = new Card("red", false);

		String value = c.isDoubleText();

		assertEquals("Single", value);
	}

	@Test
	public void getDoubleTextTest(){
		Card c = new Card("red", true);

		String value = c.isDoubleText();

		assertEquals("Double", value);
	}

	// check to make sure card can be identified as a skip
	@Test
	public void createSkipCard(){
		Card c = new Card("red", false, true, false);

		assertEquals(true, c.skip());
	}

	// check to make sure the correct text is returned for Skip card
	@Test
	public void getSkipText(){
		Card c = new Card("red", false, true, false);

		assertEquals("Skip", c.getCardText());
	}

	// check to make sure card can be identified as a Go To Middle card
	@Test
	public void createGoToMiddleCard(){
		Card c = new Card("red", false, false, true);

		assertEquals(true, c.goTo());
	}

	//check to make sure correct text is returned for Go To Middle card
	@Test
	public void getGoToMiddleText(){
		Card c = new Card("red", false, false, true);

		assertEquals("Go to Middle", c.getCardText());
	}

}
