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
		else if (card_type <= 4) {
		    if(card_type == 4){
				if(current_pos != sweets_spaces[4]){
				    JOptionPane.showMessageDialog(null, "You have been sent to Pie Land, draw another sweets card to return","", JOptionPane.WARNING_MESSAGE);
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
	    // Renable the button
	    card_panel.toggleDrawButton();
	    card_panel.toggleBoomButton();
			
	    gameState.changeTxt(2);							
	}
	else if (tokens[current_player].getPosition() == sweets_spaces[4]){
	    if(!card.goTo()){
		card_panel.toggleDrawButton();
		card_panel.toggleBoomButton();

		JOptionPane.showMessageDialog(null, "You didn't draw another sweets card!","", JOptionPane.WARNING_MESSAGE);
		
		gameState.changeTxt(1);

		// Update the instruction to draw card
		gameState.changeInstruction(1);
	    }
	    else if(card.pie()){
		card_panel.toggleDrawButton();
		card_panel.toggleBoomButton();
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
	    // Renable the button
	    card_panel.toggleDrawButton();
	    card_panel.toggleBoomButton();
			
	    gameState.changeTxt(2);							
	}
	else{
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
		else{
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

		// Renable the button
		card_panel.toggleDrawButton();
		card_panel.toggleBoomButton();

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


    // loads the given Gamemanager
    public void loadGameManager(GameManager gm){
    	this.tokens = gm.tokens;
    	this.current_player = gm.current_player;
    }
}
