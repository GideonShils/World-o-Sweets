package WorldOfSweets;
import GameObjects.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CardPanel{

	private JPanel cards_panel;
	private JButton _drawCardButton = new JButton("Draw Card");
    private JLabel cardLabel = new javax.swing.JLabel();
    private JLabel deckLabel = new javax.swing.JLabel();
    private JLabel deckText = new JLabel("Deck");
    private JLabel cardText = new JLabel("Card");
    private JLabel singleDoubleText = new JLabel("Single");
	private GameState gameState;

    public static DeckManager dm;

	//        cards_panel.setLayout(new GridLayout(2));
	public CardPanel(DeckManager dm, GameState gs){
		gameState = gs;
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


        ActionListener cardButtonListener = new CardButtonListener();
        _drawCardButton.addActionListener(cardButtonListener);


        c.weightx = 0.25;
        c.ipady = 0;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridx = 0;
        c.gridy = 2;
        cards_panel.add(_drawCardButton);

        c.weightx = 0.25;
        c.gridx = 1;
        c.gridy = 2;
        cards_panel.add(singleDoubleText, c);
        singleDoubleText.setText(currentCard.isDoubleText());


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
		return cards_panel;
	}

    public void changeCard(Card card){
        cardLabel.setBackground(card.getColor());
        singleDoubleText.setText(card.isDoubleText());
    }

    private class CardButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            changeCard(dm.draw());
			JOptionPane.showMessageDialog(null, "Player " + gameState.getCurrentPlayer() + "'s turn!");
        }
    }
}