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

	public Card(String color, boolean isDouble){
		this.isDouble = isDouble;

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
				System.out.println("Invalid color for card. Default color is RGB(0,0,0). Use setColor() to update the color.");
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
				System.out.println("Invalid color for card. Default color is RGB(0,0,0). Use setColor() to update the color.");
				this.color = black;
				return -1;
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

	public String isDoubleText(){
		if (isDouble)
			return "Double";
		else
			return "Single";
	}

}