package GameObjects;

import java.util.ArrayList;

public class DeckManager{
	
	/*
		Using ArrayList to act as a stack. Need to track the current index.

		(totalCardCount - 1) will be the index of the card on top of the deck.
		0 will be the index of the card at the bottom of the deck.
	*/
	private ArrayList<Card> Deck;
	private int totalCardCount;
	private int currentIndex;

	public DeckManager(){
		Deck = new ArrayList<Card>();
		totalCardCount = 0;
		currentIndex = 0;		
	}

	public boolean createDeck(int singles, int doubles){

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

			Deck.add(green);
			Deck.add(blue);
			Deck.add(red);
			Deck.add(yellow);
			Deck.add(orange);
		}

		// generates the specified number of doubles for each color
		for (int i = 0; i < doubles; i++){
			Card green = new Card("green", true);
			Card blue = new Card("blue", true);
			Card red = new Card("red", true);
			Card yellow = new Card("yellow", true);
			Card orange = new Card("orange", true);

			Deck.add(green);
			Deck.add(blue);
			Deck.add(red);
			Deck.add(yellow);
			Deck.add(orange);
		}

		totalCardCount = singles*5 + doubles*5;
		currentIndex = totalCardCount - 1;

		return true;
	}

	public int getTotalCardCount(){
		return totalCardCount;
	}
}