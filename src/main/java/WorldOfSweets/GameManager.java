package WorldOfSweets;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Container;
import java.io.Serializable;
import java.util.Random;
import javax.swing.Timer;

import GameObjects.*;

public class GameManager implements Serializable {
	public JPanel[] array;
	public CardPanel card_panel;
	public Token[] tokens;
	public int currentPlayer;
	public JLabel end;
	public GameState gameState;
	public int[] sweets_spaces;
	public Boomerang br;

	public GameManager(JPanel[] array, CardPanel card_panel, Token[] tokens, JLabel end, GameState gs, int[] sweets_spaces, Boomerang br) {
		gameState = gs;
		this.array = array;
		this.card_panel = card_panel;
		this.tokens = tokens;
		this.currentPlayer = 0;
		this.end = end;
		this.sweets_spaces = sweets_spaces;
		this.br = br;
	}

	public void findNext(Color color, int current_pos, int card_type) {

		// Regular single / double
		if (card_type > 5) {
			if (current_pos != sweets_spaces[4]) {
				int pos = -1;
				int j = 0;
				for (int i = 0; i < card_type - 5; i++) {
					for (j = current_pos + 1; j < array.length; j++) {
						if (array[j].getBackground().equals(color)) {
							pos = j;
							current_pos = j;
							break;
						}
					}
					if (j == array.length) {
						tokens[currentPlayer].setPosition(pos);
						endGame();
					}
				}

				if (j != array.length) {
					tokens[currentPlayer].setPosition(pos);
					array[pos].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
					array[pos].addMouseListener(new PositionListener(current_pos, pos));
				}
			}
		}
		// Special cards
		else if (card_type <= 4) {
			// Pie (jail)
			if (card_type == 4) {
				if (current_pos != sweets_spaces[4]) {
					JOptionPane.showMessageDialog(null,
							"You have been sent to Pie Land, draw another sweets card to return", "",
							JOptionPane.WARNING_MESSAGE);
				} else {
					return;
				}
			}
			// Other specials
			int location = sweets_spaces[card_type];

			tokens[currentPlayer].setPosition(location);
			array[location].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
			array[location].addMouseListener(new PositionListener(current_pos, location));
		}
		// Skip
		else {
			JOptionPane.showMessageDialog(null, "Your turn was skipped!", "", JOptionPane.WARNING_MESSAGE);
		}

	}

	public int findNextDadMode(Color color, int current_pos, int card_type) {

		if (card_type > 5) {
			if (current_pos != sweets_spaces[4]) {
				int pos = -1;
				int j = 0;

				// searches board array for color
				for (j = current_pos + 1; j < array.length; j++) {
					if (array[j].getBackground().equals(color)) {
						pos = j;
						break;
					}
				}

				if (card_type == 7) {
					for (j = pos + 1; j < array.length; j++) {
						if (array[j].getBackground().equals(color)) {
							pos = j;
							break;
						}
					}
				}

				return pos;
			}
		} else if (card_type <= 4) {
			if (card_type == 4) {
				return -1;
			}
			return sweets_spaces[card_type];
		}

		return -2;
	}

	public void turn(Card card) {
		// Find current player
		currentPlayer = gameState.getCurrPlayer();

		// Increment to next player
		gameState.incrementPlayer();
		
		// Skip
		if (card.skip()) {
			// Renable the buttons
			card_panel.toggleDrawButton();
			card_panel.toggleBoomButton();
			card_panel.togglePlayForMeButton();

			// Change to skip text
			gameState.changeTxt(2);
		}
		// If currently on pie land
		else if (tokens[currentPlayer].getPosition() == sweets_spaces[4]) {
			// If new card isn't another special, stay put
			if (!card.goTo()) {
				card_panel.toggleDrawButton();
				card_panel.toggleBoomButton();
				card_panel.togglePlayForMeButton();

				JOptionPane.showMessageDialog(null, "You didn't draw another sweets card!", "",
						JOptionPane.WARNING_MESSAGE);

				gameState.changeTxt(1);

				// Update the instruction to draw card
				gameState.changeInstruction(1);
			} 
			// If new card is pie, stay put
			else if (card.pie()) {
				card_panel.toggleDrawButton();
				card_panel.toggleBoomButton();
				card_panel.togglePlayForMeButton();
			}
			// If new card is special and not pie, update to move token
			else {
				gameState.changeInstruction(2);
			}
		} 
		// If not on pie land, update to move toekn
		else {
			gameState.changeInstruction(2);
		}

		// Find the location
		findNext(card_panel.getCardColor(), tokens[currentPlayer].getPosition(), card_panel.getType());
	}

	public void boomerang(int boom_player) {
		// Skip
		if (card_panel.getType() == 5) {
			// Renable the button
			card_panel.toggleDrawButton();
			card_panel.toggleBoomButton();
			card_panel.togglePlayForMeButton();

			gameState.changeTxt(2);
		}

		// Moves
		else {
			// Fix for different indexing (still refers to player to be boomed)
			currentPlayer = boom_player;

			Color color = card_panel.getCardColor();
			int current_pos = tokens[(currentPlayer)].getPosition();

			// Cant move backward from pieland, so move back relative to position of player that chose boomerang
			if (current_pos == sweets_spaces[4]) {
				current_pos = tokens[gameState.getCurrPlayer()].getPosition();
			}
			int card_type = card_panel.getType();

			// Single & double
			if (card_type > 5) {
				int pos = -1;
				int j = 0;
				for (j = current_pos - 1; j > -1; j--) {
					if (array[j].getBackground().equals(color)) {
						pos = j;
						current_pos = j;
						break;
					}
				}

				// If no prior position, set to start
				if (j == -1) {
					pos = 0;
				} 
				
				// Set click border of new position
				tokens[currentPlayer].setPosition(pos);
				array[pos].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
				array[pos].addMouseListener(new PositionListener(current_pos, pos));


			} 
			// Special spots
			else if (card_type <= 4) {
				// Pie land
				if (card_type == 4) {
					// Move to pie land
					if (current_pos != sweets_spaces[4]) {
						JOptionPane.showMessageDialog(null,
								gameState.getPlayerName(boom_player)
										+ " has been sent to Pie Land, draw another sweets card to return",
								"", JOptionPane.WARNING_MESSAGE);
					}
					// Stay put
					else {
						return;
					}
				}
				// Set new location
				int location = sweets_spaces[card_type];

				tokens[currentPlayer].setPosition(location);
				array[location].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
				array[location].addMouseListener(new PositionListener(current_pos, location));
			}
			// Skip
			else {
				JOptionPane.showMessageDialog(null, "Your turn was skipped!", "", JOptionPane.WARNING_MESSAGE);
			}
		}

		// Increment to next player
		gameState.incrementPlayer();
	}

	// This method deals with the ai logic for a single turn
	public void aiTurn(Card currentCard) {
		// Get current player
		currentPlayer = gameState.getCurrPlayer();
		// Increment to next player
		gameState.incrementPlayer();

		Random rand = new Random();

		// For strategic mode, check if boomerangs left
		if (gameState.gameType == "Strategic" && br.getNumLeft(currentPlayer) > 0) {
			// If so, randomly choose whether to boomerang or play normally
			int n = rand.nextInt(2);
			// If 0, move to spot
			if (n == 0) {
				aiStandard(currentCard, currentPlayer);

				// Find the correct space
				int newPosition = findLocation(card_panel.getCardColor(), tokens[currentPlayer].getPosition(),
						card_panel.getType());

				// Move the token if necessary
				if (newPosition != -1) {
					aiMove(currentPlayer, newPosition);
					JOptionPane.showMessageDialog(null,
							gameState.getPlayerName(currentPlayer) + " drew a card and moved!", "",
							JOptionPane.WARNING_MESSAGE);
				}
			}

			// Otherwise, boomerang
			else {
				int boomPlayer;
				// Randomly choose player to boomerang (make sure its not current player)			
				while (true) {
					boomPlayer = rand.nextInt(gameState.getPlayers());

					// Ensure choice isn't current player
					if (boomPlayer != currentPlayer) {
						break;
					}
				}

				br.useBoom(currentPlayer);

				// Uses plus 1 for weird indexing reasons
				int newPosition = findBoomLocation(boomPlayer);

				// Move the token if necessary
				if (newPosition != -1) {
					// Uses plus 1 for weird indexing reasons
					aiMove(boomPlayer, newPosition);
				}

				JOptionPane
						.showMessageDialog(null,
								gameState.getPlayerName(currentPlayer) + " used a boomerang on "
										+ gameState.getPlayerName(boomPlayer) + "!",
								"", JOptionPane.WARNING_MESSAGE);
			}

		} else {
			// If no boomerangs, just move to spot normally (as above)
			aiStandard(currentCard, currentPlayer);

			// Find the correct space
			int newPosition = findLocation(card_panel.getCardColor(), tokens[currentPlayer].getPosition(),
					card_panel.getType());

			// Move the token if necessary
			if (newPosition != -1) {
				aiMove(currentPlayer, newPosition);
				JOptionPane.showMessageDialog(null,
						gameState.getPlayerName(currentPlayer) + " drew a card and moved!", "",
						JOptionPane.WARNING_MESSAGE);
			}
		}

		// Check if next player is AI (This is for when previous move WAS AI)
		checkAi();
	}

	public void aiStandard(Card currentCard, int player) {
		// If its a skip card
		if (currentCard.skip()) {

			// Display skip text
			gameState.changeTxt(2);
		}
		// If player is on the pie card (seperate from rest of board)
		else if (tokens[player].getPosition() == sweets_spaces[4]) {
			// If new card isnt a goto card, they cant move (jail)
			if (!currentCard.goTo()) {

				JOptionPane.showMessageDialog(null, "You didn't draw another sweets card!", "",
						JOptionPane.WARNING_MESSAGE);

				gameState.changeTxt(1);

				// Update the instruction to draw card
				gameState.changeInstruction(1);
			}
			// If its a pie card, they stay there
			else if (currentCard.pie()) {

			}
		}
	}

	public int findBoomLocation(int boom_player) {

		int pos = -1;

		Color color = card_panel.getCardColor();
		int current_pos = tokens[(boom_player)].getPosition();
		if (current_pos == sweets_spaces[4]) {
			current_pos = tokens[gameState.getCurrPlayer() % tokens.length].getPosition();
		}
		int card_type = card_panel.getType();

		// Normal double / single
		if (card_type > 5) {
			int j = 0;
			for (j = current_pos - 1; j > -1; j--) {
				if (array[j].getBackground().equals(color)) {
					pos = j;
					current_pos = j;
					break;
				}
			}

			// Send to beginning
			if (j == -1) {
				pos = 0;
				tokens[boom_player].setPosition(0);
			} else {
				tokens[boom_player].setPosition(pos);

			}
		}
		// Special cards
		else if (card_type <= 4) {
			// Pie (jail)
			if (card_type == 4) {
				if (current_pos != sweets_spaces[4]) {
					JOptionPane.showMessageDialog(null,
							gameState.getPlayerName(boom_player)
									+ " has been sent to Pie Land, draw another sweets card to return",
							"", JOptionPane.WARNING_MESSAGE);
				}

			}
			pos = sweets_spaces[card_type];

			tokens[currentPlayer].setPosition(pos);
		} else {
			JOptionPane.showMessageDialog(null, gameState.getPlayerName(boom_player) + "'s turn was skipped!", "",
					JOptionPane.WARNING_MESSAGE);
		}

		return pos;
	}

	public void aiMove(int player, int newPosition) {
		// Move the token 
		Container parent = tokens[player].getLabel().getParent();
		parent.remove(tokens[player].getLabel());
		parent.validate();
		parent.repaint();

		array[newPosition].setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		array[newPosition].add(tokens[player].getLabel());

		// Update player text
		gameState.changeTxt(1);

		// Update the instruction to draw card
		gameState.changeInstruction(1);

	}

	public void checkAi() {
		int player = gameState.getCurrPlayer();

		// Check if current player is AI
		if (gameState.isAI(player)) {
			Timer timer;

			// Disable the buttons
			card_panel.toggleBoomButton();
			card_panel.toggleDrawButton();
			card_panel.togglePlayForMeButton();

			gameState.changeInstruction(3);

			timer = new Timer(1000, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					// Reenable buttons
					card_panel.togglePlayForMeButton();
					card_panel.toggleBoomButton();
					card_panel.toggleDrawButton();

					// Fake a play for me click
					card_panel._playForMeButton.doClick();
				}
			});
			timer.setRepeats(false);
			timer.start();
		}
	}

	private class PositionListener implements MouseListener {
		private int next;

		private PositionListener(int next) {
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
				Container parent = tokens[currentPlayer].getLabel().getParent();
				parent.remove(tokens[currentPlayer].getLabel());
				parent.validate();
				parent.repaint();
				array[next].add(tokens[currentPlayer].getLabel());

				// Renable the buttons
				card_panel.toggleDrawButton();
				card_panel.toggleBoomButton();
				card_panel.togglePlayForMeButton();

				gameState.changeTxt(1);

				// Update the instruction to draw card
				gameState.changeInstruction(1); 

				// Check if next player is AI (This is for when previous move WASNT AI)
				checkAi();
			}

			if (e.getSource().getClass().equals(end.getClass())) {
				JOptionPane.showMessageDialog(null, "Player " + (currentPlayer) + " won the game!");
				System.exit(0);
			}
		}
	}

	public void endGame() {
		end.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
		end.addMouseListener(new PositionListener(0));
	}

	public void endGameAi() {
		JOptionPane.showMessageDialog(null, "Player " + (currentPlayer) + " won the game!");
		System.exit(0);
	}

	// loads the given Gamemanager
	public void loadGameManager(GameManager gm) {
		this.tokens = gm.tokens;
		this.currentPlayer = gm.currentPlayer;
	}

	public int findLocation(Color color, int current_pos, int card_type) {
		int pos = -1;

		// Regular single / double
		if (card_type > 5) {
			// Make sure not in jail
			if (current_pos != sweets_spaces[4]) {
				pos = -1;
				int j = 0;
				for (int i = 0; i < card_type - 5; i++) {
					// Determine next spot of correct color
					for (j = current_pos + 1; j < array.length; j++) {
						if (array[j].getBackground().equals(color)) {
							pos = j;
							current_pos = j;
							break;
						}
					}
					// If end of game
					if (j == array.length) {
						tokens[currentPlayer].setPosition(pos);
						endGameAi();
					}
				}

				if (j != array.length) {
					tokens[currentPlayer].setPosition(pos);
				}
			}
		}

		// Special cards
		else if (card_type <= 4) {
			// Pie (jail) special message
			if (card_type == 4) {
				if (current_pos != sweets_spaces[4]) {
					JOptionPane.showMessageDialog(null, gameState.getPlayerName(currentPlayer) + 
							" has been sent to Pie Land, draw another sweets card to return", "",
							JOptionPane.WARNING_MESSAGE);
				}
			}

			pos = sweets_spaces[card_type];

			tokens[currentPlayer].setPosition(pos);
		}
		// Skip
		else {

			JOptionPane.showMessageDialog(null, gameState.getPlayerName(currentPlayer) + "'s turn was skipped!", "", JOptionPane.WARNING_MESSAGE);
		}

		return pos;
	}
}