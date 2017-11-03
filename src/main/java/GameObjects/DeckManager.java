package GameObjects;

import java.util.ArrayList;
import java.util.Collections;

public class DeckManager{
	
	/*
		Using ArrayList to act as a stack. Need to track the current index.

		(totalCardCount - 1) will be the index of the card on top of the deck.
		0 will be the index of the card at the bottom of the deck.
	*/
	private ArrayList<Card> deck;
	private int totalCardCount;
	private int currentIndex;
	private int numCards;

	private int numSingles;
	private int numDoubles;
	private int numSkips;
	private int numGoToMiddle;

	public DeckManager(){
		deck = new ArrayList<Card>();
		totalCardCount = 0;
		currentIndex = 0;
	}

	public boolean createDeck(int singles, int doubles){
		return createDeck(singles, doubles, 0, 0);
	}

	public boolean createDeck(int singles, int doubles, int skips, int goToMiddles){

		if (singles <= 0 || doubles <= 0){
			System.out.println("Parameters must be a non-zero input.");
			return false;
		}

		// generates the specified number of singles for each color
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

		// store the total number of singles
		numSingles = singles * 5;

		// generates the specified number of doubles for each color
		for (int i = 0; i < doubles; i++){
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

		// store the total number of doubles
		numDoubles = doubles * 5;

		// generates the specified number of skips
		for (int i = 0; i < skips; i++){
			Card skip = new Card("", false, true, false);
			deck.add(skip);
		}

		// store the total number of skips
		numSkips = skips;

		for (int i = 0; i < goToMiddles; i++){
			Card goToMiddle = new Card("", false, false, true);
			deck.add(goToMiddle);
		}

		// store the total number of goToMiddles
		numGoToMiddle = goToMiddles;

		totalCardCount = numSingles + numDoubles + numSkips + numGoToMiddle;

		// subtract 1 from totalCardCount to make currentIndex 0-index
		currentIndex = totalCardCount - 1;

		return true;
	}

	public int getTotalCardCount(){
		return totalCardCount;
	}

	public int getSinglesCount(){
		return numSingles;
	}

	public int getDoublesCount(){
		return numDoubles;
	}

	public int getSkipsCount(){
		return numSkips;
	}

	public int getGoToMiddleCount(){
		return numGoToMiddle;
	}

	// returns current number of cards in deck
	// currentIndex is 0-indexed, so need to add 1
	public int getCount(){
		return currentIndex + 1;
	}

	// return the card at the top of the deck
	// currentIndex designates which card is currently at the top
	public Card draw(){

		// if the deck is empty, need to shuffle
		if (currentIndex < 0){
			shuffle();
		}

		Card top = deck.get(currentIndex);
		currentIndex--;
		return top;
	}

	// shuffle and reset pointer for the stack
	public void shuffle(){
		System.out.println("Shuffle!");
		Collections.shuffle(deck);
		currentIndex = totalCardCount - 1;
	}



}