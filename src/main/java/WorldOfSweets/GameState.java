package WorldOfSweets;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class GameState{

    int response = 0;
    int totalPlayers = 0;	// Number of total players
    int currentPlayer = 0;

	public GameState(){

	}

	public void promptPlayers(){
		//initialize panel and combo box
		JPanel panel = new JPanel();
		DefaultComboBoxModel model = new DefaultComboBoxModel();

	    //Add number of player choices to the dropdown
	    model.addElement("2");
	    model.addElement("3");
	    model.addElement("4");

	    JComboBox selection = new JComboBox(model);

	    panel.add(selection);
	    response = JOptionPane.showConfirmDialog(null, selection, "Number of Players", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

	    if (response != JOptionPane.OK_OPTION){
	        System.exit(0);
	    } else {
	        totalPlayers = Integer.parseInt(selection.getSelectedItem().toString());
	    }
  	}

    public int getPlayers(){
		  return totalPlayers;
    }

    // Used for turns
    public int getCurrentPlayer(){
      if (currentPlayer == totalPlayers){
          currentPlayer = 1;
          return 1;
      } else {
          currentPlayer += 1;
          return currentPlayer;
      }
    }

		public int returnCurrPlayer(){
			return currentPlayer;
		}

JLabel temp_label;
public JPanel turnPanel(){
	//Create the label and set the font + size
	temp_label = new JLabel("Player "+getCurrentPlayer()+"'s Turn!");
	temp_label.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16));

	//Add label to panel
	JPanel tp = new JPanel();
	tp.add(temp_label);


	return tp;
}

public void changeTxt(int num){
	if (num == 1){
		//change player number
		temp_label.setText("Player " + getCurrentPlayer() + "'s turn!");
	} else if (num == 2){
		String labelText = String.format("<html><div width=%d>Player " + currentPlayer + "'s turn has been skipped! Player " + getCurrentPlayer() + "'s turn!</div></html>", 250);
		temp_label.setText(labelText);
	}

}


}
