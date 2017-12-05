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
    JLabel boom_label;
    JLabel instruction_label;
    int game_mode = 0;      // 0 for classic, 1 for strategic
    String[] namesArr;      // Used for names
    boolean[] isPlayerAI;   // Indicates if player is AI

    Boomerang br;
    Card currCard;
    Boolean target = false;


    public GameState(Boomerang br) {
	    this.br = br;
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

        JCheckBox aiPlayer1 = new JCheckBox("AI");
        JCheckBox aiPlayer2 = new JCheckBox("AI");
        JCheckBox aiPlayer3 = new JCheckBox("AI");
        JCheckBox aiPlayer4 = new JCheckBox("AI");

        JComboBox selection = new JComboBox(model);
        JComboBox selectionTwo = new JComboBox(typeOfGame);

        panel.add(new JLabel("Number of Players"));
        panel.add(selection);
        panel.add(new JLabel("Type of Game"));
        panel.add(selectionTwo);
        UIManager.put("OptionPane.minimumSize",new Dimension(300,100));
        response = JOptionPane.showConfirmDialog(null, panel, "Number of Players + Type of Game", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);


        JTextField player1 = new JTextField("Player 1");
        JPanel player1_plus_options = new JPanel();
        player1_plus_options.add(player1);
        player1_plus_options.add(aiPlayer1);
        player1_plus_options.setLayout(new javax.swing.BoxLayout(player1_plus_options, javax.swing.BoxLayout.X_AXIS));

        JTextField player2 = new JTextField("Player 2");
        JPanel player2_plus_options = new JPanel();
        player2_plus_options.add(player2);
        player2_plus_options.add(aiPlayer2);
        player2_plus_options.setLayout(new javax.swing.BoxLayout(player2_plus_options, javax.swing.BoxLayout.X_AXIS));

        JTextField player3 = new JTextField("Player 3");
        JPanel player3_plus_options = new JPanel();
        player3_plus_options.add(player3);
        player3_plus_options.add(aiPlayer3);
        player3_plus_options.setLayout(new javax.swing.BoxLayout(player3_plus_options, javax.swing.BoxLayout.X_AXIS));

        JTextField player4 = new JTextField("Player 4");
        JPanel player4_plus_options = new JPanel();
        player4_plus_options.add(player4);
        player4_plus_options.add(aiPlayer4);
        player4_plus_options.setLayout(new javax.swing.BoxLayout(player4_plus_options, javax.swing.BoxLayout.X_AXIS));

        JPanel combinedPanel = new JPanel(new GridLayout(0, 1));

        if (response != JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            totalPlayers = Integer.parseInt(selection.getSelectedItem().toString());
            gameType = selectionTwo.getSelectedItem().toString();

            if (gameType.equals("Strategic")){
                game_mode = 1;
            }

            if (totalPlayers == 2){
                combinedPanel.add(new JLabel("Player 1's Name"));
                combinedPanel.add(player1_plus_options);
                combinedPanel.add(new JLabel("Player 2's Name"));
                combinedPanel.add(player2_plus_options);

            } else if (totalPlayers == 3){
                combinedPanel.add(new JLabel("Player 1's Name"));
                combinedPanel.add(player1_plus_options);
                combinedPanel.add(new JLabel("Player 2's Name"));
                combinedPanel.add(player2_plus_options);
                combinedPanel.add(new JLabel("Player 3's Name"));
                combinedPanel.add(player3_plus_options);
            } else if (totalPlayers == 4){
                combinedPanel.add(new JLabel("Player 1's Name"));
                combinedPanel.add(player1_plus_options);
                combinedPanel.add(new JLabel("Player 2's Name"));
                combinedPanel.add(player2_plus_options);
                combinedPanel.add(new JLabel("Player 3's Name"));
                combinedPanel.add(player3_plus_options);
                combinedPanel.add(new JLabel("Player 4's Name"));
                combinedPanel.add(player4_plus_options);
            }

            int result = JOptionPane.showConfirmDialog(null, combinedPanel, "Player Names", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            namesArr = new String[totalPlayers+1];

            // Create bool array where 1 indicates that player is AI
            isPlayerAI = new boolean[totalPlayers+1];

            if (result != JOptionPane.OK_OPTION) {
                System.exit(0);
            } else {
                if (totalPlayers == 2){
                    namesArr[1] = player1.getText();
                    namesArr[2] = player2.getText();
                    if (aiPlayer1.isSelected()){
                        isPlayerAI[1] = true;
                    }
                    if (aiPlayer2.isSelected()){
                        isPlayerAI[2] = true;
                    }
                } else if (totalPlayers == 3){
                    namesArr[1] = player1.getText();
                    namesArr[2] = player2.getText();
                    namesArr[3] = player3.getText();
                    if (aiPlayer1.isSelected()){
                        isPlayerAI[1] = true;
                    }
                    if (aiPlayer2.isSelected()){
                        isPlayerAI[2] = true;
                    }
                    if (aiPlayer3.isSelected()){
                        isPlayerAI[3] = true;
                    }

                } else if (totalPlayers == 4){
                    namesArr[1] = player1.getText();
                    namesArr[2] = player2.getText();
                    namesArr[3] = player3.getText();
                    namesArr[4] = player4.getText();
                    if (aiPlayer1.isSelected()){
                        isPlayerAI[1] = true;
                    }
                    if (aiPlayer2.isSelected()){
                        isPlayerAI[2] = true;
                    }
                    if (aiPlayer3.isSelected()){
                        isPlayerAI[3] = true;
                    }
                    if (aiPlayer4.isSelected()){
                        isPlayerAI[4] = true;
                    }
                }
            }
        }
    }

    public boolean isAI(int playerNum){
        return isPlayerAI[playerNum];
    }

    public String getPlayerName(int playerNum){
        return namesArr[playerNum];
    }

    public int getPlayerNumber(String name){
        for(int i = 1; i < namesArr.length; i++){
            if(namesArr[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    public int getPlayers() {
	    return totalPlayers;
    }

    public int getMode(){
	    return game_mode;
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

    public int getPlayer(){
	    return curr_player;
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

    public JPanel boomPanel(){
        boom_label = new JLabel(br.getNumLeft(currentPlayer) + " boomerangs left");
        boom_label.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16));

        JPanel tp = new JPanel();
        tp.add(boom_label);

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

        if (gameType == "Strategic"){
            boom_label.setText(br.getNumLeft(currentPlayer) + " boomerangs left");
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
