package GameObjects;

public class Card{
	private final java.awt.Color green = new java.awt.Color(0, 255, 0);
	private final java.awt.Color blue = new java.awt.Color(0, 0, 255);
	private final java.awt.Color red = new java.awt.Color(255, 0, 0);
	private final java.awt.Color yellow = new java.awt.Color(255, 255, 0);
	private final java.awt.Color orange = new java.awt.Color(255, 153, 0);
	private final java.awt.Color black = new java.awt.Color(0, 0, 0);

	private java.awt.Color color;
	private boolean isDouble;
	private boolean skip;
	private boolean goToMiddle;


	public Card(String color, boolean isDouble){
		this(color, isDouble, false, false);
	}

	public Card(String color, boolean isDouble, boolean skip, boolean goToMiddle){
		this.isDouble = isDouble;
		this.skip = skip;
		this.goToMiddle = goToMiddle;

		switch (color){
			case "green":
				this.color = green;
				break;
			case "blue":
				this.color = blue;
				break;

			case "red":
				this.color = red;
				break;

			case "yellow":
				this.color = yellow;
				break;

			case "orange":
				this.color = orange;
				break;

			default:
				this.color = black;
				break;

		}
	}

	/*
		Sets the color of the card.
		Return 1 for success, return -1 for failure.
	*/
	public int setColor(String color){
		switch (color){
			case "green":
				this.color = green;
				return 1;
			case "blue":
				this.color = blue;
				return 1;
			case "red":
				this.color = red;
				return 1;
			case "yellow":
				this.color = yellow;
				return 1;
			case "orange":
				this.color = orange;
				return 1;
			default:
				this.color = black;
				return 1;
		}
	}

	public java.awt.Color getColor(){
		return color;
	}

	public void setDouble(boolean isDouble){
		this.isDouble = isDouble;
	}

	public boolean isDouble(){
		return isDouble;
	}

	public boolean skip(){
		return skip;
	}

	public boolean goToMiddle(){
		return goToMiddle;
	}

	// this method has been made obsolete due to skip and go to middle cards, but will keep so that I don't break anything
	public String isDoubleText(){
		if (isDouble)
			return "Double";
		else
			return "Single";
	}

	// now that skip and 'Go to middle' cards have been created, want to return text for any of the cards
	// if skip and goToMiddle are both true, will return Skip instead of Go to Middle
	public String getCardText(){
		if (skip)
			return "Skip";

		if (goToMiddle)
			return "Go to Middle";

		if (isDouble)
			return "Double";
		else
			return "Single";
	}

}