package WorldOfSweets;

import GameObjects.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class GameState {

    int response = 0;
    int totalPlayers = 0;	// Number of total players
    int currentPlayer = 0;
    int curr_player = 1;
	JLabel temp_label;
	JLabel instruction_label;

	Card currCard;

	public GameState() {

	}

	public void promptPlayers() {
		// Initialize panel and combo box
		JPanel panel = new JPanel();
		DefaultComboBoxModel model = new DefaultComboBoxModel();

	    // Add number of player choices to the dropdown
	    model.addElement("2");
	    model.addElement("3");
	    model.addElement("4");

	    JComboBox selection = new JComboBox(model);

	    panel.add(selection);
	    response = JOptionPane.showConfirmDialog(null, selection, "Number of Players", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

	    if (response != JOptionPane.OK_OPTION) {
	        System.exit(0);
	    } else {
	        totalPlayers = Integer.parseInt(selection.getSelectedItem().toString());
	    }
  	}

    public int getPlayers() {
		  return totalPlayers;
    }

    // Used for turns
    public int getNextPlayer() {
      if (currentPlayer == totalPlayers) {
          currentPlayer = 1;
          return 1;
      } else {
          currentPlayer += 1;
          return currentPlayer;
      }
    }

	public int returnCurrPlayer() {
      if (curr_player == totalPlayers) {
        curr_player = 1;
        return totalPlayers;
      } else {
        return curr_player++;
      }
	}

	public JPanel turnPanel() {
		//Create the label and set the font + size
		temp_label = new JLabel("Player "+getNextPlayer()+"'s Turn!");
		temp_label.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16));

		//Add label to panel
		JPanel tp = new JPanel();
		tp.add(temp_label);

		return tp;
	}

	public void changeTxt(int num) {
		if (num == 1) {
			//change player number
			temp_label.setText("Player " + getNextPlayer() + "'s turn!");
		} else if (num == 2) {
			String labelText = String.format("<html><div width=%d>Player " + currentPlayer + "'s turn has been skipped! Player " + getNextPlayer() + "'s turn!</div></html>", 250);
			temp_label.setText(labelText);
		}

	}

	public JPanel currentInstruction() {
		instruction_label = new JLabel("Please draw a card.");

		instruction_label.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16));

		//Add label to panel
		JPanel tp = new JPanel();
		tp.add(instruction_label);

		return tp;
	}

	public void changeInstruction(int num) {
		if (num == 1) {
			instruction_label.setText("Please draw a card.");
		} else {
			instruction_label.setText("Click the highlighted box");
		}
	}

	public void setCurrCard(Card newCard) {
		currCard = newCard;
	}

	public Card getCurrCard() {
		return currCard;
	}
}
