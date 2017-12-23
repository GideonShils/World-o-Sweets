package GameObjects;

import WorldOfSweets.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.Serializable;

public class CardPanel implements Serializable {

    private JPanel cards_panel;
    private JPanel buttonPanel;
    private JPanel combinedPanel;
    private JButton _drawCardButton = new JButton("Draw Card");
    private JButton _boomerangButton = new JButton("Boomerang");
    public JButton _playForMeButton = new JButton("Play For Me");
    private JLabel cardLabel = new JLabel();
    private JLabel deckLabel = new JLabel();
    private JLabel deckText = new JLabel("Deck");
    private JLabel cardText = new JLabel("Card");
    private JLabel deckCount = new JLabel("0");
    private JLabel cardValue = new JLabel();
    private GameState gameState;
    private GameManager gm;
    private Boomerang br;
    private int togglestate;

    private Card currentCard;

    private int width = 250;
    private int height = 620;

    public static DeckManager dm;

    public CardPanel(DeckManager dm, GameState gs, Boomerang br) {

        togglestate = 0;

        this.dm = dm;
        this.gm = null;
        this.br = br;
        gameState = gs;

        //-------------------------------------------------------
        // set min, preferred, and max sizes in order to prevent JLabels from
        // resizing when values change

        deckText.setMinimumSize(new Dimension(width / 2, height / 12));
        deckText.setPreferredSize(new Dimension(width / 2, height / 12));
        deckText.setMaximumSize(new Dimension(width / 2, height / 12));

        cardText.setMinimumSize(new Dimension(width / 2, height / 12));
        cardText.setPreferredSize(new Dimension(width / 2, height / 12));
        cardText.setMaximumSize(new Dimension(width / 2, height / 12));

        deckLabel.setMinimumSize(new Dimension(width / 2, height / 6));
        deckLabel.setPreferredSize(new Dimension(width / 2, height / 6));
        deckLabel.setMaximumSize(new Dimension(width / 2, height / 6));

        cardLabel.setMinimumSize(new Dimension(width / 2, height / 6));
        cardLabel.setPreferredSize(new Dimension(width / 2, height / 6));
        cardLabel.setMaximumSize(new Dimension(width / 2, height / 6));

        deckCount.setMinimumSize(new Dimension(width / 2, height / 12));
        deckCount.setPreferredSize(new Dimension(width / 2, height / 12));
        deckCount.setMaximumSize(new Dimension(width / 2, height / 12));

        cardValue.setMinimumSize(new Dimension(width / 2, height / 12));
        cardValue.setPreferredSize(new Dimension(width / 2, height / 12));
        cardValue.setMaximumSize(new Dimension(width / 2, height / 12));

        //-----------------------------------------------------------

        cards_panel = new javax.swing.JPanel();

        cards_panel.setPreferredSize(new java.awt.Dimension(width, height / 3));

        cards_panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        // Card currentCard = dm.draw();
        cardLabel.setBackground(new java.awt.Color(0, 0, 0));
        cardLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardLabel.setOpaque(true);

        deckLabel.setBackground(new java.awt.Color(0, 0, 0));
        deckLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deckLabel.setOpaque(true);

        // Add component to display 'Deck'
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

        // Create button panel
        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(width, 100));

        // Add draw button
        buttonPanel.add(_drawCardButton);

        // Add boomerang button
        if (gs.getMode() == 1) {
            buttonPanel.add(_boomerangButton);
        }

        // Add AI button
        buttonPanel.add(_playForMeButton);

        // Create & set action listeners
        ActionListener cardButtonListener = new CardButtonListener();
        _drawCardButton.addActionListener(cardButtonListener);

        ActionListener boomerangListner = new BoomerangListener();
        _boomerangButton.addActionListener(boomerangListner);

        ActionListener playForMeListener = new PlayForMeListener();
        _playForMeButton.addActionListener(playForMeListener);

        // Combine card panel and turn panel
        combinedPanel = new javax.swing.JPanel();
        combinedPanel.setLayout(new BoxLayout(combinedPanel, BoxLayout.Y_AXIS));

        combinedPanel.add(cards_panel);
        combinedPanel.add(buttonPanel);

    }

    public JPanel getCardsPanel() {
        return combinedPanel;
    }

    public void changeCard(Card card) {
        cardLabel.setBackground(card.getColor());
        cardValue.setText(card.getCardText());
        deckCount.setText(Integer.toString(dm.getCount()));
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    private class CardButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // Disable the buttons
            toggleDrawButton();
            toggleBoomButton();
            togglePlayForMeButton();

            // Draw a new card
            if (gameState.getPlayerName(gameState.getCurrPlayer()).toUpperCase().equals("DAD")) {
                currentCard = dm.drawWorstCardForward();
            } else {
                currentCard = dm.draw();
            }

            changeCard(currentCard);

            // Update gamestate to hold the current card
            gameState.setCurrCard(currentCard);

            // Reenable clicking on board
            gameState.setTargetClicked(false);

            gm.turn(currentCard);
        }
    }

    private class BoomerangListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Disable the buttons
            toggleDrawButton();
            toggleBoomButton();
            togglePlayForMeButton();

            //Choose player
            int player = choosePlayer();
            if (player == -1) {
                return;
            }

            currentCard = dm.draw();
            changeCard(currentCard);

            // Update gamestate to hold the current card
            gameState.setCurrCard(currentCard);

            // Reenable clicking on board
            gameState.setTargetClicked(false);

            gm.boomerang(player);

        }

        private int choosePlayer() {
            // Initialize panel and combo box
            JPanel panel = new JPanel(new GridLayout(0, 1));
            DefaultComboBoxModel model = new DefaultComboBoxModel();

            int cur = gameState.getCurrPlayer();
            br.useBoom(cur);

            for (int i = 0; i < gameState.getPlayers(); i++) {
                if (i != cur) {
                    model.addElement(gameState.getPlayerName(i));
                }
            }

            JComboBox selection = new JComboBox(model);

            panel.add(new JLabel("Choose a Player"));
            panel.add(selection);
            UIManager.put("OptionPane.minimumSize", new Dimension(300, 100));
            int response = JOptionPane.showConfirmDialog(null, panel, "Boomerang", JOptionPane.DEFAULT_OPTION);

            if (response != JOptionPane.OK_OPTION) {
                return -1;
            } else {
                return gameState.getPlayerNumber(selection.getSelectedItem().toString());
            }
        }
    }

    private class PlayForMeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // Special case for dad mode
            if (gameState.getPlayerName(gameState.getCurrPlayer()).toUpperCase().equals("DAD")) {
                currentCard = dm.drawWorstCardForward();
            } else {
                currentCard = dm.draw();
            }

            changeCard(currentCard);

            // Update gamestate to hold the current card
            gameState.setCurrCard(currentCard);

            gm.aiTurn(currentCard);
        }
    }

    public Color getCardColor() {
        return cardLabel.getBackground();
    }

    public int getType() {
        switch (cardValue.getText()) {
        case "Single":
            return 6;
        case "Double":
            return 7;
        case "Skip":
            return 5;
        case "Ice Cream":
            return 0;
        case "Cake":
            return 1;
        case "Cookie":
            return 2;
        case "Cupcake":
            return 3;
        case "Pie":
            return 4;

        }

        return -1;
    }

    public void setGameManager(GameManager gm) {
        this.gm = gm;
    }

    public void toggleDrawButton() {
        if (_drawCardButton.isEnabled()) {
            _drawCardButton.setEnabled(false);
        } else {
            _drawCardButton.setEnabled(true);
        }
    }

    public void toggleBoomButton() {
        if (togglestate == 0) {
            _boomerangButton.setEnabled(false);
            togglestate = 1;
        } else {
            if (br.getNumLeft(gameState.getCurrPlayer()) != 0) {
                _boomerangButton.setEnabled(true);
                togglestate = 0;
            }
        }
    }

    public void togglePlayForMeButton() {
        if (_playForMeButton.isEnabled()) {
            _playForMeButton.setEnabled(false);
        } else {
            _playForMeButton.setEnabled(true);
        }
    }
}
