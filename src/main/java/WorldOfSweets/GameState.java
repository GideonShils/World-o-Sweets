package WorldOfSweets;
import javax.swing.*;



public class GameState{
	
	int response = 0;		
	int totalPlayers = 0;	//Number of total players
	
	public GameState(){
		//initialize panel and combo box
		JPanel panel = new JPanel();
		panel.add(new JLabel("Welcome to the World-o-Sweets, the GAME of games.  How many people are playing? :"));
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		
		//Add my elements to the dropdown
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
	
	
	
}

