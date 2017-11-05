package WorldOfSweets;
import GameObjects.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CardPanel{

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
    private JLabel cardValue = new JLabel("Single");
	private JLabel turnNumber = new JLabel("Player");
	private GameState gameState;

    public static DeckManager dm;
	
	//        cards_panel.setLayout(new GridLayout(2));
	public CardPanel(DeckManager dm, GameState gs){
		this.dm = dm;

		cards_panel = new javax.swing.JPanel();

		cards_panel.setPreferredSize(new java.awt.Dimension(250, 310));
        
        cards_panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        Card currentCard = dm.draw();
        cardLabel.setBackground(currentCard.getColor());
        cardLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardLabel.setOpaque(true);


        deckLabel.setBackground(new java.awt.Color(255, 0, 0));
        deckLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deckLabel.setOpaque(true);

        c.weightx = 0.25;
        c.gridx = 0;
        c.gridy = 0;
        cards_panel.add(deckText, c);

        c.gridx = 1;
        c.gridy = 0;
        cards_panel.add(cardText, c);


        c.weightx = 0.5;
        c.ipady = 100;
        c.gridx = 0;
        c.gridy = 1;
        cards_panel.add(deckLabel, c);

        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        cards_panel.add(cardLabel, c);


        /*c.weightx = 0.25;
        c.ipady = 0;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridx = 0;
        c.gridy = 3;
        cards_panel.add(_drawCardButton);*/

        c.weightx = 0.25;
        c.gridx = 0;
        c.gridy = 2;
        cards_panel.add(deckCount, c);
        deckCount.setText(Integer.toString(dm.getCount()));

        c.weightx = 0.25;
        c.gridx = 1;
        c.gridy = 2;
        cards_panel.add(cardValue, c);
        cardValue.setText(currentCard.getCardText());


        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(250, 100));
        buttonPanel.add(_drawCardButton);

        ActionListener cardButtonListener = new CardButtonListener();
        _drawCardButton.addActionListener(cardButtonListener);

		
		//USED FOR TURNS
		gameState = gs;
		turnsPanel = new javax.swing.JPanel();
		turnsPanel.setPreferredSize(new java.awt.Dimension(250, 310));
		turnsPanel.add(turnNumber);
		turnNumber.setText("Player " + gameState.getCurrentPlayer() + "'s turn!");
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

        if (card.skip()){
            String labelText = String.format("<html><div width=%d>Player " + gameState.skipPlayer() + "'s turn has been skipped! Player " + gameState.getCurrentPlayer() + "'s turn!</div></html>", 250);
            turnNumber.setText(labelText);
            //turnNumber.setText("<html>Player " + gameState.skipPlayer() + "'s turn has been skipped! Player " + gameState.getCurrentPlayer() + "'s turn!</html>");
        }
        else{
            turnNumber.setText("Player " + gameState.getCurrentPlayer() + "'s turn!");
        }

		       
    }

    private class CardButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            changeCard(dm.draw());
		}
    }
}