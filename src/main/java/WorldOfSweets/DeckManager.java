package WorldOfSweets;

import java.util.ArrayList;
import java.util.Collections;
import java.io.Serializable;

import GameObjects.*;

public class DeckManager implements Serializable{
	
    /*
      Using ArrayList to act as a stack. Need to track the current index.

      (totalCardCount - 1) will be the index of the card on top of the deck.
      0 will be the index of the card at the bottom of the deck.
    */
    public ArrayList<Card> deck;
    public int totalCardCount;
    public int currentIndex;

    public int numSingles;
    public int numDoubles;
    public int numSkips;
    public int numGoTo;

    public GameManager gm;

    public DeckManager() {
		deck = new ArrayList<Card>();
		totalCardCount = 0;
		currentIndex = 0;
    }

    public boolean createDeck(int singles, int doubles) {
	return createDeck(singles, doubles, 0);
    }

    public boolean createDeck(int singles, int doubles, int skips) {

	if (singles <= 0 || doubles <= 0) {
	    System.out.println("Parameters must be a non-zero input.");
	    return false;
	}

	// Generates the specified number of singles for each color
	for (int i = 0; i < singles; i++){
	    Card green = new Card("green", false);
	    Card blue = new Card("blue", false);
	    Card red = new Card("red", false);
	    Card yellow = new Card("yellow", false);
	    Card orange = new Card("orange", false);

	    deck.add(green);
	    deck.add(blue);
	    deck.add(red);
	    deck.add(yellow);
	    deck.add(orange);
	}

	// Store the total number of singles
	numSingles = singles * 5;

	// Generates the specified number of doubles for each color
	for (int i = 0; i < doubles; i++) {
	    Card green = new Card("green", true);
	    Card blue = new Card("blue", true);
	    Card red = new Card("red", true);
	    Card yellow = new Card("yellow", true);
	    Card orange = new Card("orange", true);

	    deck.add(green);
	    deck.add(blue);
	    deck.add(red);
	    deck.add(yellow);
	    deck.add(orange);
	}

	// Store the total number of doubles
	numDoubles = doubles * 5;

	// Generates the specified number of skips
	for (int i = 0; i < skips; i++) {
	    Card skip = new Card("", false, true, false, 0);
	    deck.add(skip);
	}

	numSkips = skips;

	for (int i = 0; i < 5; i++){
	    Card middle = new Card("pink", false, false, true, i);
	    deck.add(middle);
	}
	        
	numGoTo = 5; 
	totalCardCount = numSingles + numDoubles + numSkips + numGoTo;

	// Subtract 1 from totalCardCount to make currentIndex 0-index
	currentIndex = totalCardCount - 1;

	return true;
    }

    public int getTotalCardCount() {
		return totalCardCount;
    }

    public int getSinglesCount() {
		return numSingles;
    }

    public int getDoublesCount() {
		return numDoubles;
    }

    public int getSkipsCount() {
		return numSkips;
    }

    public int getGoToCount() {
		return numGoTo;
    }

    // Returns current number of cards in deck
    // currentIndex is 0-indexed, so need to add 1
    public int getCount() {
		return currentIndex + 1;
    }

    // Return the card at the top of the deck
    // currentIndex designates which card is currently at the top
    public Card draw() {

		// If the deck is empty, need to shuffle
		if (currentIndex < 0) {
		    shuffle();
		}

		Card top = deck.get(currentIndex);
		currentIndex--;
		return top;
    }


    /*
    *	Grabs current positions for dad.
    *	Searches through the whole deck for the card that sets player closest to start.
    *	Swaps that card with the card that would've been next so that Dad draws it.
    */
    public Card drawWorstCardForward(){

    	// If the deck is empty, need to shuffle
		if (currentIndex < 0) {
		    shuffle();
		}

		// current position of dad
    	int currPosition = gm.tokens[gm.gameState.curr_player - 1].getPosition();
    	
    	// grab next card on deck
    	Card minCard = deck.get(currentIndex);
    	// find the position that this card will put dad at and set it as minimum
    	int minPos = gm.findNextDadMode(minCard.getColor(), currPosition, getType(minCard));
    	// keep track of which card in deck is minimum
    	int minCardPos = currentIndex;
    	// keep track of if we find another card smaller
    	boolean found = false;

    	// iterate through whole deck
    	for (int i = currentIndex - 1; i >= 0; i--){
    		Card currentCard = deck.get(i);

    		int pos = gm.findNextDadMode(currentCard.getColor(), currPosition, getType(currentCard));
   
    		// if pie land is drawn, skip it. Dad would always draw pie land on first turn otherwise
    		if (pos == -1 && i == currentIndex){
    			currentIndex--;
    			return currentCard;
    		}
    		else if (pos == -1 && i != currentIndex)
    			continue;

    		// only use skip card if it's the next card. Otherwise Dad will draw all skip cards while on START
    		if (pos == -2 && i == currentIndex){
    			currentIndex--;
    			return currentCard;
    		}
    		else if (pos == -2 && i != currentIndex)
    			continue;

    		// if the ending position is less than the min, assign new card as min card
    		if (pos < minPos && pos >= 0){
    			minPos = pos;
    			minCard = currentCard;
    			minCardPos = i;
    			found = true;
    		}
    	}

    	// swap card out so that it isn't used again
    	if (found)
    		swapCards(currentIndex, minCardPos);

    	currentIndex--;

    	return minCard;
    }

    public void swapCards(int index, int index2){
    	Card temp = deck.get(index);

    	deck.set(index, deck.get(index2));
    	deck.set(index2, temp);

    }


    // enter card and receive numeric representation of the card type
    public int getType(Card card) {
    	switch(card.getCardText()) {
    	    case "Single":
				return 6;
    	    case "Double":
				return 7;
    	    case "Skip":
				return 5;
    	    case "Ice Cream":
				return 0;
	    	case "Cake":
				return 1;
	    	case "Cookie":
				return 2;
	    	case "Cupcake":
				return 3;
	    	case "Pie":
				return 4; 	
        }
        
	    return -1;
    }

    // Shuffle and reset pointer for the stack
    public void shuffle() {
		System.out.println("Shuffle!");
		Collections.shuffle(deck);
		currentIndex = totalCardCount - 1;
    }

    public void loadDeck(DeckManager newDeck){
    	deck = newDeck.deck;
    	totalCardCount = newDeck.totalCardCount;
    	currentIndex = newDeck.currentIndex;
    	numSingles = newDeck.numSingles;
    	numDoubles = newDeck.numDoubles;
    	numSkips = newDeck.numSkips;
    	numGoTo = newDeck.numGoTo;
    }
}
