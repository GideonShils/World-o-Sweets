package WorldOfSweets;

import GameObjects.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.io.Serializable;

public class GameState implements Serializable {

    int response = 0;
    public String gameType = "";   //Type of game
    int totalPlayers = 0;	// Number of total players
    public int currentPlayer = 0;
    public int curr_player = 1;
    JLabel temp_label;
    JLabel instruction_label;
    String[] namesArr;      //Used for names

    Card currCard;
    Boolean target = false;


	public GameState() {
	}


    public void promptPlayers() {
	// Initialize panel and combo box
	JPanel panel = new JPanel(new GridLayout(0, 1));
	DefaultComboBoxModel model = new DefaultComboBoxModel();
    DefaultComboBoxModel typeOfGame = new DefaultComboBoxModel();

	// Add number of player choices to the dropdown
	model.addElement("2");
	model.addElement("3");
	model.addElement("4");

    typeOfGame.addElement("Classic");
    typeOfGame.addElement("Strategic");

	JComboBox selection = new JComboBox(model);
    JComboBox selectionTwo = new JComboBox(typeOfGame);

    panel.add(new JLabel("Number of Players"));
	panel.add(selection);
    panel.add(new JLabel("Type of Game"));
    panel.add(selectionTwo);
	response = JOptionPane.showConfirmDialog(null, panel, "Number of Players + Type of Game", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);


    JTextField player1 = new JTextField("Player 1");
    JTextField player2 = new JTextField("Player 2");
    JTextField player3 = new JTextField("Player 3");
    JTextField player4 = new JTextField("Player 4");
    JPanel namesPanel = new JPanel(new GridLayout(0, 1));

	    if (response != JOptionPane.OK_OPTION) {
	        System.exit(0);
	    } else {
	        totalPlayers = Integer.parseInt(selection.getSelectedItem().toString());
            gameType = selectionTwo.getSelectedItem().toString();

            if (gameType.equals("Strategic")){
                //SPECIAL GAME
            }

            if (totalPlayers == 2){
                namesPanel.add(new JLabel("Player 1's Name"));
                namesPanel.add(player1);
                namesPanel.add(new JLabel("Player 2's Name"));
                namesPanel.add(player2);

            } else if (totalPlayers == 3){
                namesPanel.add(new JLabel("Player 1's Name"));
                namesPanel.add(player1);
                namesPanel.add(new JLabel("Player 2's Name"));
                namesPanel.add(player2);
                namesPanel.add(new JLabel("Player 3's Name"));
                namesPanel.add(player3);
            } else if (totalPlayers == 4){
                namesPanel.add(new JLabel("Player 1's Name"));
                namesPanel.add(player1);
                namesPanel.add(new JLabel("Player 2's Name"));
                namesPanel.add(player2);
                namesPanel.add(new JLabel("Player 3's Name"));
                namesPanel.add(player3);
                namesPanel.add(new JLabel("Player 4's Name"));
                namesPanel.add(player4);
            }

            int result = JOptionPane.showConfirmDialog(null, namesPanel, "Player Names", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            namesArr = new String[totalPlayers + 1];

            if (result != JOptionPane.OK_OPTION) {
    	        System.exit(0);
    	    } else {
                if (totalPlayers == 2){
                    namesArr[1] = player1.getText();
                    namesArr[2] = player2.getText();
                } else if (totalPlayers == 3){
                    namesArr[1] = player1.getText();
                    namesArr[2] = player2.getText();
                    namesArr[3] = player3.getText();
                } else if (totalPlayers == 4){
                    namesArr[1] = player1.getText();
                    namesArr[2] = player2.getText();
                    namesArr[3] = player3.getText();
                    namesArr[4] = player4.getText();
                }
            }


        }
  	}

    public String getPlayerName(int tmp){
        return namesArr[tmp];
    }

    public int getPlayers() {
	return totalPlayers;
    }

    // get next player without changing whose turn it is
    public int getNextPlayer() {
    	if (currentPlayer == totalPlayers) {
    	    return 1;
    	} else {
    	    return currentPlayer + 1;
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
	temp_label = new JLabel(getPlayerName(getNextPlayer())+"'s Turn!");
	temp_label.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16));

	//Add label to panel
	JPanel tp = new JPanel();
	tp.add(temp_label);

	return tp;
    }

    public void changeTxt(int num) {
	if (num == 1) {
	    //change player number
	    temp_label.setText(getPlayerName(getNextPlayer()) + "'s turn!");
	} else if (num == 2) {
	    String labelText = String.format("<html><div width=%d>" + getPlayerName(currentPlayer) + "'s turn has been skipped! " + getNextPlayer() + "'s turn!</div></html>", 250);
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
	} else if (num == 2) {
	    instruction_label.setText("Click the highlighted box");
	} else {
	    instruction_label.setText("");
	}
    }

    public void setCurrCard(Card newCard) {
	currCard = newCard;
    }

    public Card getCurrCard() {
	return currCard;
    }

    public Boolean targetClicked() {
	return target;
    }

    public void setTargetClicked(Boolean bool) {
	target = bool;
    }

    public void loadGameState(GameState gs){
    	this.response = gs.response;
    	this.totalPlayers = gs.totalPlayers;
    	this.currentPlayer = gs.currentPlayer;
    	this.curr_player = gs.curr_player;

    	this.currCard = gs.currCard;
    	this.target = gs.target;

        this.namesArr = gs.namesArr;


    }
}
