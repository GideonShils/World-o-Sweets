package WorldOfSweets;
import javax.swing.*;

public class GameState{
	
    int response = 0;		
    int totalPlayers = 0;	// Number of total players
    int currentPlayer = 0;
	
	
    public GameState(){
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
	
}

