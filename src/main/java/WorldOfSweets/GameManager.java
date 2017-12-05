package WorldOfSweets;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Container;
import java.io.Serializable;
import java.util.Random;

import GameObjects.*;

public class GameManager implements Serializable{
    public JPanel[] array;
    public CardPanel card_panel;
    public Token[] tokens;
    public int current_player;
    public JLabel end;
    public GameState gameState;
    public int[] sweets_spaces;
    public Boomerang br;

    public GameManager(JPanel[] array, CardPanel card_panel, Token[] tokens, JLabel end, GameState gs, int[] sweets_spaces, Boomerang br) {
		gameState = gs;
		this.array = array;
		this.card_panel = card_panel;
		this.tokens = tokens;
		this.current_player = 0;
		this.end = end;
		this.sweets_spaces = sweets_spaces;
		this.br = br;
    }

    public void findNext(Color color, int current_pos, int card_type) {

		// Regular single / double
		if (card_type > 5) {
		    if(current_pos != sweets_spaces[4]){
				int pos = -1;
				int j = 0;
				for (int i = 0; i < card_type - 5; i++) {
				    for (j = current_pos+1; j < array.length; j++) {
						if(array[j].getBackground().equals(color)) {
						    pos = j;
						    current_pos = j;
						    break;
						}
				    }
				    if (j == array.length) {
						tokens[current_player].setPosition(pos);
						endGame();
				    }
				}

				if (j != array.length) {
				    tokens[current_player].setPosition(pos);
				    array[pos].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0,0,0)));
				    array[pos].addMouseListener(new PositionListener(current_pos, pos));
				}
		    }
		}
		// Special cards
		else if (card_type <= 4) {
			// Pie (jail)
		    if(card_type == 4){
				if(current_pos != sweets_spaces[4]){
				    JOptionPane.showMessageDialog(null, "You have been sent to Pie Land, draw another sweets card to return","", JOptionPane.WARNING_MESSAGE);
				}
				else{
				    return;
				}
			}
			// Other specials
		    int location = sweets_spaces[card_type];

		    tokens[current_player].setPosition(location);
		    array[location].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0,0,0)));
		    array[location].addMouseListener(new PositionListener(current_pos, location));
		}
		// Skip
		else {
		    JOptionPane.showMessageDialog(null, "Your turn was skipped!","", JOptionPane.WARNING_MESSAGE);
		}

    }

    public int findNextDadMode(Color color, int current_pos, int card_type) {

		if (card_type > 5) {
		    if(current_pos != sweets_spaces[4]){
				int pos = -1;
				int j = 0;

				// searches board array for color
				for (j = current_pos+1; j < array.length; j++) {
					if(array[j].getBackground().equals(color)) {
						pos = j;
						break;
					}
				}

				if (card_type == 7){
					for (j = pos+1; j < array.length; j++) {
						if(array[j].getBackground().equals(color)) {
							pos = j;
							break;
						}
					}
				}

				return pos;
		    }
		}
		else if (card_type <= 4) {
		    if(card_type == 4){
				return -1;
		    }
		    return sweets_spaces[card_type];
		}

		return -2;
    }

    public void turn(Card card) {
		current_player = gameState.returnCurrPlayer() - 1;
		if (card.skip()) {
			// Renable the buttons
			card_panel.toggleDrawButton();
			card_panel.toggleBoomButton();
			card_panel.togglePlayForMeButton();


			/*
			int current = gameState.curr_player;
			if (gameState.isAI(current)){
				card_panel.togglePlayForMeButton(false);
			} else {
				card_panel.togglePlayForMeButton(true);
			}
			*/

			gameState.changeTxt(2);
		}
		else if (tokens[current_player].getPosition() == sweets_spaces[4]){
			if(!card.goTo()){
				card_panel.toggleDrawButton();
				card_panel.toggleBoomButton();
				card_panel.togglePlayForMeButton();

				JOptionPane.showMessageDialog(null, "You didn't draw another sweets card!","", JOptionPane.WARNING_MESSAGE);

				gameState.changeTxt(1);

				// Update the instruction to draw card
				gameState.changeInstruction(1);
			}
			else if(card.pie()){
				card_panel.toggleDrawButton();
				card_panel.toggleBoomButton();
				card_panel.togglePlayForMeButton();
			}
			else{
				gameState.changeInstruction(2);
			}
		}
		else {
			gameState.changeInstruction(2);
		}


		findNext(card_panel.getCardColor(), tokens[current_player].getPosition(), card_panel.getType());
    }

    public void boomerang(int boom_player){
		if (card_panel.getType() == 5) {
			// Renable the buttons
			card_panel.toggleDrawButton();
			card_panel.toggleBoomButton();
			card_panel.togglePlayForMeButton();


			/*

			int current = gameState.curr_player;
			if (gameState.isAI(current)){
				card_panel.togglePlayForMeButton(false);
			} else {
				card_panel.togglePlayForMeButton(true);
			}
			*/

			gameState.changeTxt(2);
		}
		else {
			current_player = boom_player-1;

			Color color = card_panel.getCardColor();
			int current_pos = tokens[(boom_player-1)].getPosition();
			if(current_pos == sweets_spaces[4]){
				current_pos = tokens[gameState.getPlayer()-1].getPosition();
			}
			int card_type = card_panel.getType();

			if (card_type > 5) {
			int pos = -1;
			int j = 0;
			for (j = current_pos-1; j > -1; j--) {
				if(array[j].getBackground().equals(color)) {
				pos = j;
				current_pos = j;
				break;
				}
			}

			if (j == -1) {
				pos = 0;
				tokens[current_player].setPosition(0);
				array[pos].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0,0,0)));
				array[pos].addMouseListener(new PositionListener(current_pos, pos));
			}
			else {
				tokens[current_player].setPosition(pos);
				array[pos].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0,0,0)));
				array[pos].addMouseListener(new PositionListener(current_pos, pos));
			}
			}
			else if (card_type <= 4) {
			if(card_type == 4){
				if(current_pos != sweets_spaces[4]){
					JOptionPane.showMessageDialog(null, gameState.getPlayerName(boom_player) + " has been sent to Pie Land, draw another sweets card to return","", JOptionPane.WARNING_MESSAGE);
				}
				else{
					return;
				}
			}
			int location = sweets_spaces[card_type];

			tokens[current_player].setPosition(location);
			array[location].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0,0,0)));
			array[location].addMouseListener(new PositionListener(current_pos, location));
			}
			else {
				JOptionPane.showMessageDialog(null, "Your turn was skipped!","", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	// This method deals with the ai logic for a single turn
	public void aiTurn(Card currentCard) {
		current_player = gameState.returnCurrPlayer() - 1;

		System.out.println("AI turn for p" + current_player);
		Random rand = new Random();

		// Check if the player has any boomerangs left
		if (br.getNumLeft(current_player+1) >= 0) {
			// If so, randomly choose whether to boomerang or play normally
			int n = rand.nextInt(1);
			
			// If 0, move to spot
			if (n == 0 || n == 1) {
				aiStandard(currentCard, current_player);

				// Find the correct space
				int newPosition = findLocation(card_panel.getCardColor(), tokens[current_player].getPosition(), card_panel.getType());
				System.out.println("location: " + newPosition);
				
				// Move the token if necessary
				if (newPosition != -1) {
					aiMove(current_player, currentCard, newPosition);
				}
			}
			/*
			// Otherwise, boomerang
			else {
				// Randomly choose player to boomerang (make sure its not current player)			
				while (true) {
					n = rand.nextInt(gameState.getPlayers() - 1);

					// Ensure choice isn't current player
					if (n != player) {
						break;
					}
				}
			}
			*/

		} else {
			// If no boomerangs, draw card
		}
	}

	public void aiStandard(Card currentCard, int player) {
		// If its a skip card
		if (currentCard.skip()) {
			System.out.println("skip!");
			// Renable the buttons
			card_panel.toggleDrawButton();
			card_panel.toggleBoomButton();
			card_panel.togglePlayForMeButton();
			
			// Display skip text
			gameState.changeTxt(2);
		}
		// If player is on the pie card (seperate from rest of board)
		else if (tokens[player].getPosition() == sweets_spaces[4]){
			System.out.println("On pie!");
			// If new card isnt a goto card, they cant move (jail)
			if(!currentCard.goTo()){
				// Reenable buttons
				card_panel.toggleDrawButton();
				card_panel.toggleBoomButton();
				card_panel.togglePlayForMeButton();

				JOptionPane.showMessageDialog(null, "You didn't draw another sweets card!","", JOptionPane.WARNING_MESSAGE);

				gameState.changeTxt(1);

				// Update the instruction to draw card
				gameState.changeInstruction(1);
			}
			// If its a pie card, they stay there
			else if(currentCard.pie()){
				System.out.println("Still on pie!");
				// Reenable buttons
				card_panel.toggleDrawButton();
				card_panel.toggleBoomButton();
				card_panel.togglePlayForMeButton();
			}
			// Tell them to click highlighted box
			else {
				System.out.println("Clickity click");
				gameState.changeInstruction(2);
			}
		}
		// Tell to click the highlighted box
		else {
			System.out.println("Clickity click 2");
			gameState.changeInstruction(2);
		}
	}

	public void aiBoomerang() {

	}

	public void aiMove(int player, Card currentCard, int newPosition) {
		// Move the token 
		Container parent = tokens[player].getLabel().getParent();
		parent.remove(tokens[player].getLabel());
		parent.validate();
		parent.repaint();

		array[newPosition].setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		array[newPosition].add(tokens[player].getLabel());

		// Renable the buttons
		card_panel.toggleDrawButton();
		card_panel.toggleBoomButton();
		card_panel.togglePlayForMeButton();

		// Update player text
		gameState.changeTxt(1);

		// Update the instruction to draw card
		gameState.changeInstruction(1);

		// ADD IN LOGIC FOR END OF GAME
	}

    private class PositionListener implements MouseListener {
		private int previous, next;

		private PositionListener(int previous, int next) {
			this.previous = previous;
			this.next = next;
		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {

		}

		public void mouseExited(MouseEvent e) {

		}

		public void mouseClicked(MouseEvent e) {

			if (e.getSource().getClass().equals(array[0].getClass()) && gameState.targetClicked() == false) {
				// Show that the target spot has been clicked
				gameState.setTargetClicked(true);


				((JPanel) e.getSource()).setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
				Container parent = tokens[current_player].getLabel().getParent();
				parent.remove(tokens[current_player].getLabel());
				parent.validate();
				parent.repaint();
				array[next].add(tokens[current_player].getLabel());

				// Renable the buttons
				card_panel.toggleDrawButton();
				card_panel.toggleBoomButton();
				card_panel.togglePlayForMeButton();

				gameState.changeTxt(1);

				// Update the instruction to draw card
				gameState.changeInstruction(1);

			}

			if (e.getSource().getClass().equals(end.getClass())) {
				JOptionPane.showMessageDialog(null, "Player " + (current_player+1) + " won the game!");
				System.exit(0);
			}
		}
    }

    public void endGame() {
		end.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0,0,0)));
		end.addMouseListener(new PositionListener(0, 0));
	}
	
	public void endGameAi() {
		JOptionPane.showMessageDialog(null, "Player " + (current_player+1) + " won the game!");
		System.exit(0);
	}


    // loads the given Gamemanager
    public void loadGameManager(GameManager gm){
    	this.tokens = gm.tokens;
    	this.current_player = gm.current_player;
	}
	
	public int findLocation(Color color, int current_pos, int card_type) {
		int pos = -1;

		// Regular single / double
		if (card_type > 5) {
			// Make sure not in jail
			if(current_pos != sweets_spaces[4]) {
				pos = -1;
				int j = 0;
				for (int i = 0; i < card_type - 5; i++) {
					// Determine next spot of correct color
					for (j = current_pos+1; j < array.length; j++) {
						if(array[j].getBackground().equals(color)) {
							pos = j;
							current_pos = j;
							break;
						}
					}
					// If end of game
					if (j == array.length) {
						tokens[current_player].setPosition(pos);
						endGameAi();
					}
				}

				if (j != array.length) {
					tokens[current_player].setPosition(pos);
				}
			}
		}

		// Special cards
		else if (card_type <= 4) {
			// Pie (jail) special message
			if(card_type == 4){
				if(current_pos != sweets_spaces[4]){
					JOptionPane.showMessageDialog(null, "You have been sent to Pie Land, draw another sweets card to return","", JOptionPane.WARNING_MESSAGE);
				}
			}

			pos = sweets_spaces[card_type];

			tokens[current_player].setPosition(pos);
		}
		// Skip
		else {
			JOptionPane.showMessageDialog(null, "Your turn was skipped!","", JOptionPane.WARNING_MESSAGE);
		}

		return pos;
	}
}
