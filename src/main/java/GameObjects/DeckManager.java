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

	public DeckManager(){
		deck = new ArrayList<Card>();
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

			deck.add(green);
			deck.add(blue);
			deck.add(red);
			deck.add(yellow);
			deck.add(orange);
		}

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

		totalCardCount = singles*5 + doubles*5;
		currentIndex = totalCardCount - 1;

		return true;
	}

	public int getTotalCardCount(){
		return totalCardCount;
	}

	public int getCount(){
		return currentIndex;
	}

	// return the card at the top of the deck
	// currentIndex designates which card is currently at the top
	public Card draw(){

		// if the deck is empty, need to shuffle
		if (currentIndex == 0){
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