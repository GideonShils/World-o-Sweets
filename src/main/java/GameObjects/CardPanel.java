package WorldOfSweets;
import GameObjects.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CardPanel{

    private JPanel deckPanel;
    private JPanel cards_panel;
    private JPanel buttonPanel;
    private JPanel turnsPanel;
    private JPanel combinedPanel;
    private JButton _drawCardButton = new JButton("Draw Card");
    private JLabel cardLabel = new javax.swing.JLabel();
    private JLabel deckLabel = new javax.swing.JLabel();
    private JLabel deckText = new JLabel("Deck");
    private JLabel cardText = new JLabel("Card");
    private JLabel deckCount = new JLabel("0");
    private JLabel cardValue = new JLabel();
    private JLabel turnNumber = new JLabel();
    private GameState gameState;
    private GameManager gm;
    private int current_player;

    private int width = 250;
    private int height = 620;

    public static DeckManager dm;
	
    
    public CardPanel(DeckManager dm, GameState gs){
    	this.dm = dm;
    	this.gm = null;
    	current_player = 0; 

        //-------------------------------------------------------
        // set min, preferred, and max sizes in order to prevent JLabel from
        // resizing when values change

        deckText.setMinimumSize(new Dimension(width/2, height/12));
        deckText.setPreferredSize(new Dimension(width/2, height/12));
        deckText.setMaximumSize(new Dimension(width/2, height/12));

        cardText.setMinimumSize(new Dimension(width/2, height/12));
        cardText.setPreferredSize(new Dimension(width/2, height/12));
        cardText.setMaximumSize(new Dimension(width/2, height/12));

        deckLabel.setMinimumSize(new Dimension(width/2, height/6));
        deckLabel.setPreferredSize(new Dimension(width/2, height/6));
        deckLabel.setMaximumSize(new Dimension(width/2, height/6));

        cardLabel.setMinimumSize(new Dimension(width/2, height/6));
        cardLabel.setPreferredSize(new Dimension(width/2, height/6));
        cardLabel.setMaximumSize(new Dimension(width/2, height/6));

        deckCount.setMinimumSize(new Dimension(width/2, height/12));
        deckCount.setPreferredSize(new Dimension(width/2, height/12));
        deckCount.setMaximumSize(new Dimension(width/2, height/12));

        cardValue.setMinimumSize(new Dimension(width/2, height/12));
        cardValue.setPreferredSize(new Dimension(width/2, height/12));
        cardValue.setMaximumSize(new Dimension(width/2, height/12));

        //-----------------------------------------------------------

	cards_panel = new javax.swing.JPanel();

	cards_panel.setPreferredSize(new java.awt.Dimension(width, height/3));
        
        cards_panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        //Card currentCard = dm.draw();
        cardLabel.setBackground(new java.awt.Color(0, 0, 0));
        cardLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardLabel.setOpaque(true);


        deckLabel.setBackground(new java.awt.Color(0, 0, 0));
        deckLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deckLabel.setOpaque(true);

        // add component to display 'Deck'
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.CENTER;
        cards_panel.add(deckText, c);

        // add component to diplay 'Card'
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.CENTER;
        cards_panel.add(cardText, c);

        // add component to display the deck
        c.gridx = 0;
        c.gridy = 1;
        cards_panel.add(deckLabel, c);

        // add component to display the current card
        c.gridx = 1;
        c.gridy = 1;
        cards_panel.add(cardLabel, c);

        // add component to display the card count
        c.gridx = 0;
        c.gridy = 2;
        c.anchor = GridBagConstraints.CENTER;
        cards_panel.add(deckCount, c);
        deckCount.setText(Integer.toString(dm.getCount()));

        // add component to display the card type
        c.gridx = 1;
        c.gridy = 2;
        c.anchor = GridBagConstraints.CENTER;
        cards_panel.add(cardValue, c);
        //cardValue.setText(currentCard.getCardText());


        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(width, 100));
        buttonPanel.add(_drawCardButton);

        ActionListener cardButtonListener = new CardButtonListener();
        _drawCardButton.addActionListener(cardButtonListener);

		
	//USED FOR TURNS
	gameState = gs;
	turnsPanel = new javax.swing.JPanel();
	turnsPanel.setPreferredSize(new java.awt.Dimension(width, height/3));
	turnsPanel.add(turnNumber);
	//turnNumber.setText("Player " + gameState.getCurrentPlayer() + "'s turn!");
	turnNumber.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16));
		
    	//Combine card panel and turn panel
    	combinedPanel = new javax.swing.JPanel();
    	combinedPanel.setLayout(new BoxLayout(combinedPanel, BoxLayout.Y_AXIS));

	combinedPanel.add(cards_panel);
        combinedPanel.add(buttonPanel);
	combinedPanel.add(turnsPanel);
        

		
        //cards_panel.add(deckLabel);
        //cards_panel.add(cardLabel);

        //javax.swing.GroupLayout cards_panelLayout = new javax.swing.GroupLayout(cards_panel);
        //cards_panel.setLayout(cards_panelLayout);
        /*cards_panelLayout.setHorizontalGroup(
	  cards_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	  .addComponent(deckLabel)
	  .addGap(0, 250, Short.MAX_VALUE)
	  );
	  cards_panelLayout.setVerticalGroup(
	  cards_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	  .addGap(0, 310, Short.MAX_VALUE)
	  );*/


    }

    public JPanel getCardsPanel(){
	return combinedPanel;
    }

    public void changeCard(Card card){
        cardLabel.setBackground(card.getColor());
        cardValue.setText(card.getCardText());
        deckCount.setText(Integer.toString(dm.getCount()));
	current_player = gameState.getCurrentPlayer();
        if (card.skip()){
            String labelText = String.format("<html><div width=%d>Player " + gameState.skipPlayer() + "'s turn has been skipped! Player " + current_player + "'s turn!</div></html>", 250);
            turnNumber.setText(labelText);
            //turnNumber.setText("<html>Player " + gameState.skipPlayer() + "'s turn has been skipped! Player " + gameState.getCurrentPlayer() + "'s turn!</html>");
        }
        else{
            turnNumber.setText("Player " + current_player + "'s turn!");
        }

    }

    private class CardButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            changeCard(dm.draw());
            gm.turn();
        }
    }
    
    public Color getCardColor(){
	return cardLabel.getBackground();
    }

    public int getType(){
    	switch(cardValue.getText()){
    	    case "Single":
		return 1;
    	    case "Double":
		return 2;
    	    case "Skip":
		return 3;
    	    case "Go to Middle":
		return 4; 
    	}
	return 0; 
    }

    public int getPlayer(){
	return current_player;
    }

    public void setGameManager(GameManager gm){
	this.gm = gm;
    }
}
