package WorldOfSweets;
import GameObjects.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.io.Serializable;

public class WorldOfSweets extends JFrame implements Serializable{
    /**
     * Creates new form WorldOfSweets
     */
    public WorldOfSweets(int num_players) {
        initComponents(num_players);
    }

    @SuppressWarnings("unchecked")
    public void initComponents(int num_players) {
        this.num_players = num_players;
        java.awt.GridBagConstraints gridBagConstraints;
	positions = new JPanel[36];

        header_label = new JLabel();
        game_container_panel = new JPanel();

        board_panel = new JPanel();
        grandmas_house = new JLabel();
        blue = new JPanel();
        blue_one = new JPanel();
        blue_two = new JPanel();
        blue_three = new JPanel();
        blue_four = new JPanel();
	blue_five = new JPanel();
        yellow = new JPanel();
        yellow_one = new JPanel();
        yellow_two = new JPanel();
        yellow_three = new JPanel();
        yellow_four = new JPanel();
        red = new JPanel();
        red_one = new JPanel();
        red_two = new JPanel();
        red_three = new JPanel();
        orange = new JPanel();
        orange_one = new JPanel();
        orange_two = new JPanel();
        green = new JPanel();
        green_one = new JPanel();
        green_two = new JPanel();
        green_three = new JPanel();
        green_four = new JPanel();
        orange_three = new JPanel();
        blue_five = new JPanel();
        yellow_five = new JPanel();
        red_four = new JPanel();
        orange_four = new JPanel();
        red_five = new JPanel();
        start_panel = new JPanel();
        green_five = new JPanel();
        cupcake = new JPanel();
        cake = new JPanel();
        ice_cream = new JPanel();
	pie = new JPanel();
	cookie = new JPanel();
        orange_five = new JPanel();
        start_label = new JLabel();
        non_board_panel = new JPanel();
        instructions_panel = new JPanel();

	//adding the jpanels() to the position array
	int pos = 0;
	positions[pos++] = start_panel;
	positions[pos++] = red_four;
	positions[pos++] = yellow_two;
	positions[pos++] = blue_two;
	positions[pos++] = green_two;
	positions[pos++] = ice_cream; //Go To One, Position 5
	positions[pos++] = orange_two;
	positions[pos++] = red_two;
	positions[pos++] = yellow_three;
	positions[pos++] = blue_four;
	positions[pos++] = green_five;
	positions[pos++] = orange_five;
	positions[pos++] = cake; //Go To Two, Position 12
	positions[pos++] = red_five;
	positions[pos++] = yellow_five;
	positions[pos++] = blue_five;
	positions[pos++] = green_four;
	positions[pos++] = orange_four;
	positions[pos++] = cookie; //Go To Three, Position 18
	positions[pos++] = red_three;
	positions[pos++] = yellow_four;
	positions[pos++] = blue_three;
	positions[pos++] = green_three;
	positions[pos++] = orange_three;
	positions[pos++] = red_one;
	positions[pos++] = yellow_one;
	positions[pos++] = blue_one;
	positions[pos++] = cupcake; //Go To Four, Position 27
	positions[pos++] = green_one;
	positions[pos++] = orange_one;
	positions[pos++] = red;
	positions[pos++] = yellow;
	positions[pos++] = blue;
	positions[pos++] = green;
	positions[pos++] = orange;
	positions[pos++] = pie; //Go To Five, off map, Position 35


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setPreferredSize(new java.awt.Dimension(872, 690));
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        header_label.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24));
        header_label.setHorizontalAlignment(SwingConstants.CENTER);
        header_label.setText("World of Sweets!");
        header_label.setMaximumSize(new java.awt.Dimension(248, 50));
        header_label.setMinimumSize(new java.awt.Dimension(248, 50));
        header_label.setPreferredSize(new java.awt.Dimension(248, 50));
        getContentPane().add(header_label, java.awt.BorderLayout.PAGE_START);

        game_container_panel.setPreferredSize(new java.awt.Dimension(850, 600));

        board_panel.setBackground(new java.awt.Color(181, 255, 143));
        board_panel.setPreferredSize(new java.awt.Dimension(600, 620));
        board_panel.setLayout(new java.awt.GridLayout(10, 10));

	for (int x = 1; x <= 9; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

	pie.setBackground(new java.awt.Color(255, 218, 218));
        pie.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pie.setOpaque(true);
	pie.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(pie);

	temp_panel = new JPanel();
	temp_panel.setOpaque(false);
	board_panel.add(temp_panel);

        grandmas_house.setHorizontalAlignment(SwingConstants.CENTER);
        grandmas_house.setIcon(new ImageIcon(getClass().getResource("/home-house-icon-94831.png")));
        board_panel.add(grandmas_house);

        orange.setBackground(new java.awt.Color(255, 153, 0));
        orange.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        orange.setOpaque(true);
	orange.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(orange);

        green.setBackground(new java.awt.Color(0, 255, 0));
        green.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        green.setOpaque(true);
	green.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(green);

        blue.setBackground(new java.awt.Color(0, 0, 255));
        blue.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blue.setOpaque(true);
	blue.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(blue);

        yellow.setBackground(new java.awt.Color(255, 255, 0));
        yellow.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yellow.setOpaque(true);
	yellow.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(yellow);

	for (int x = 1; x <= 9; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

        red.setBackground(new java.awt.Color(255, 0, 0));
        red.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	red.setLayout(new java.awt.GridLayout(2, 2));
        red.setOpaque(true);
        board_panel.add(red);

        orange_one.setBackground(new java.awt.Color(255, 153, 0));
        orange_one.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        orange_one.setOpaque(true);
	orange_one.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(orange_one);

        green_one.setBackground(new java.awt.Color(0, 255, 0));
        green_one.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        green_one.setOpaque(true);
	green_one.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(green_one);

	cupcake.setBackground(new java.awt.Color(255, 218, 218));
        cupcake.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cupcake.setOpaque(true);
	cupcake.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(cupcake);

	for (int x = 1; x <= 9; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

        blue_one.setBackground(new java.awt.Color(0, 0, 255));
        blue_one.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blue_one.setOpaque(true);
	blue_one.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(blue_one);

	for (int x = 1; x <= 2; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

	green_two.setBackground(new java.awt.Color(0, 255, 0));
        green_two.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        green_two.setOpaque(true);
	green_two.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(green_two);

	ice_cream.setBackground(new java.awt.Color(255, 218, 218));
        ice_cream.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ice_cream.setOpaque(true);
	ice_cream.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(ice_cream);

	orange_two.setBackground(new java.awt.Color(255, 153, 0));
        orange_two.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        orange_two.setOpaque(true);
	orange_two.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(orange_two);

	temp_panel = new JPanel();
	temp_panel.setOpaque(false);
	board_panel.add(temp_panel);

	green_three.setBackground(new java.awt.Color(0, 255, 0));
        green_three.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        green_three.setOpaque(true);
	green_three.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(green_three);

	orange_three.setBackground(new java.awt.Color(255, 153, 0));
        orange_three.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        orange_three.setOpaque(true);
	orange_three.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(orange_three);

	red_one.setBackground(new java.awt.Color(255, 0, 0));
        red_one.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        red_one.setOpaque(true);
	red_one.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(red_one);

        yellow_one.setBackground(new java.awt.Color(255, 255, 0));
        yellow_one.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	yellow_one.setLayout(new java.awt.GridLayout(2, 2));
        yellow_one.setOpaque(true);
        board_panel.add(yellow_one);

	for (int x = 1; x <= 2; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}


	blue_two.setBackground(new java.awt.Color(0, 0, 255));
        blue_two.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blue_two.setOpaque(true);
	blue_two.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(blue_two);


	temp_panel = new JPanel();
	temp_panel.setOpaque(false);
	board_panel.add(temp_panel);

        red_two.setBackground(new java.awt.Color(255, 0, 0));
        red_two.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        red_two.setOpaque(true);
	red_two.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(red_two);

	temp_panel = new JPanel();
	temp_panel.setOpaque(false);
	board_panel.add(temp_panel);

	blue_three.setBackground(new java.awt.Color(0, 0, 255));
        blue_three.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blue_three.setOpaque(true);
	blue_three.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(blue_three);

	for (int x = 1; x <= 5; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

        yellow_two.setBackground(new java.awt.Color(255, 255, 0));
        yellow_two.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yellow_two.setOpaque(true);
	yellow_two.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(yellow_two);

	temp_panel = new JPanel();
	temp_panel.setOpaque(false);
	board_panel.add(temp_panel);


        yellow_three.setBackground(new java.awt.Color(255, 255, 0));
        yellow_three.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yellow_three.setOpaque(true);
	yellow_three.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(yellow_three);


	temp_panel = new JPanel();
	temp_panel.setOpaque(false);
	board_panel.add(temp_panel);

        yellow_four.setBackground(new java.awt.Color(255, 255, 0));
        yellow_four.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yellow_four.setOpaque(true);
	yellow_four.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(yellow_four);

        red_three.setBackground(new java.awt.Color(255, 0, 0));
        red_three.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	red_three.setLayout(new java.awt.GridLayout(2, 2));
        red_three.setOpaque(true);
        board_panel.add(red_three);

        cookie.setBackground(new java.awt.Color(255, 218, 218));
        cookie.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cookie.setOpaque(true);
	cookie.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(cookie);

	orange_four.setBackground(new java.awt.Color(255, 153, 0));
        orange_four.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        orange_four.setOpaque(true);
	orange_four.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(orange_four);

	for (int x = 1; x <= 2; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

        red_four.setBackground(new java.awt.Color(255, 0, 0));
        red_four.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        red_four.setOpaque(true);
	red_four.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(red_four);

	temp_panel = new JPanel();
	temp_panel.setOpaque(false);
	board_panel.add(temp_panel);

        blue_four.setBackground(new java.awt.Color(0, 0, 255));
        blue_four.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	blue_four.setLayout(new java.awt.GridLayout(2, 2));
        blue_four.setOpaque(true);
        board_panel.add(blue_four);

	for (int x = 1; x <= 4; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

	green_four.setBackground(new java.awt.Color(0, 255, 0));
        green_four.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        green_four.setOpaque(true);
	green_four.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(green_four);

	for (int x = 1; x <= 2; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

	start_panel.setBackground(new java.awt.Color(255, 255, 255));
        start_panel.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	start_panel.setLayout(new java.awt.GridLayout(2, 2));
	tokens = new Token[num_players];
	for(int i = 0; i < num_players; i++){
	    JLabel label = new JLabel();
	    label.setIcon(new ImageIcon(getClass().getResource("/tokens/player" + (i+1) + ".png")));
	    Token t = new Token(label);
        t.setPosition(0);
	    tokens[i] = t;
	    start_panel.add(label);
	}
        board_panel.add(start_panel);

	temp_panel = new JPanel();
	temp_panel.setOpaque(false);
	board_panel.add(temp_panel);

	green_five.setBackground(new java.awt.Color(0, 255, 0));
        green_five.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        green_five.setOpaque(true);
	green_five.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(green_five);

	orange_five.setBackground(new java.awt.Color(255, 153, 0));
        orange_five.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        orange_five.setOpaque(true);
	orange_five.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(orange_five);

	cake.setBackground(new java.awt.Color(255, 218, 218));
        cake.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cake.setOpaque(true);
	cake.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(cake);

        red_five.setBackground(new java.awt.Color(255, 0, 0));
        red_five.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        red_five.setOpaque(true);
	red_five.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(red_five);

        yellow_five.setBackground(new java.awt.Color(255, 255, 0));
        yellow_five.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yellow_five.setOpaque(true);
	yellow_five.setLayout(new java.awt.GridLayout(2, 2));
	board_panel.add(yellow_five);

        blue_five.setBackground(new java.awt.Color(0, 0, 255));
        blue_five.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	blue_five.setLayout(new java.awt.GridLayout(2, 2));
        blue_five.setOpaque(true);
        board_panel.add(blue_five);

	for (int x = 1; x <= 2; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

	start_label.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13));
        start_label.setHorizontalAlignment(SwingConstants.CENTER);
        start_label.setText("Start");
        start_label.setVerticalAlignment(SwingConstants.TOP);
        start_label.setOpaque(false);
        board_panel.add(start_label);

	for (int x = 1; x <= 8; x++){
	    temp_panel = new JPanel();
	    temp_panel.setOpaque(false);
	    board_panel.add(temp_panel);
	}

        game_container_panel.add(board_panel);

        non_board_panel.setPreferredSize(new java.awt.Dimension(250, 620));

        //Add turn panel + card panel to same panel
        card_panel = new CardPanel(dm, gameState, br);
        combinedPanel = new javax.swing.JPanel();
      	combinedPanel.setLayout(new BoxLayout(combinedPanel, BoxLayout.Y_AXIS));
        turn_panel = gameState.turnPanel();
	boom_panel = gameState.boomPanel();
        combinedPanel.add(card_panel.getCardsPanel());
        combinedPanel.add(turn_panel);
	combinedPanel.add(boom_panel);



        non_board_panel.add(combinedPanel);

        JPanel current_instruction = gameState.currentInstruction();
        non_board_panel.add(current_instruction);

        //Long.toString(System.currentTimeMillis())
        JPanel timer_panel = timer.getTimerPanel();
        non_board_panel.add(timer_panel);

        game_container_panel.add(non_board_panel);



        getContentPane().add(game_container_panel, java.awt.BorderLayout.CENTER);

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {



        //create and begin timer
        timer = new TimeCounter();
        timer.run();

        // Initialize game sate and bring up dialog
        // asking for number of players

	gameState = new GameState(br);

        gameState.promptPlayers();

	// Create deck manager object
        dm = new DeckManager();
        // Create the deck itself
        dm.createDeck(10, 2, 5);
        // Shuffle the deck
        dm.shuffle();

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorldOfSweets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorldOfSweets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorldOfSweets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorldOfSweets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
		public void run() {

		    WorldOfSweets wos = new WorldOfSweets(gameState.getPlayers());
		    lsh = new LoadSaveHandler(wos);
		    wos.createMenuBar();
		    wos.setVisible(true);


		    timer.action();  //Start the timer
		    gm = new GameManager(positions, card_panel, tokens, grandmas_house, gameState, sweets_spaces, br);
		    card_panel.setGameManager(gm);
            dm.gm = gm;
		}
	    });



    }

    public void createMenuBar(){
        // creating and adding the menu bar
        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_A);
        fileMenu.getAccessibleContext().setAccessibleDescription("Used for Save/Load operations.");
        menuBar.add(fileMenu);

        fileMenu.add(lsh.createSaveMenuItem());
        fileMenu.add(lsh.createLoadMenuItem());

        backgroundMenu = new JMenu("Background");
        backgroundMenu.getAccessibleContext().setAccessibleDescription("Used for changing the background color.");
        menuBar.add(backgroundMenu);

        color_handler = new BackgroundColorHandler(this);

        backgroundMenu.add(color_handler.backgroundRed());
        backgroundMenu.add(color_handler.backgroundBlue());
        backgroundMenu.add(color_handler.backgroundGreen());

        // adding menu bar to JFrame
        this.setJMenuBar(menuBar);
    }

    public void loadGameBoard(LoadSaveObject w) {

        // updates card panel with correct color
        Card c = w.card_panel.getCurrentCard();
        
        if (c != null)    
            this.card_panel.changeCard(c);

        //replaces deck with loaded deck
        dm.loadDeck(w.dm);


        // removes tokens on start space
        for (int i = 0; i < num_players; i++){
            Container parent = tokens[i].getLabel().getParent();
            parent.remove(tokens[i].getLabel());
            parent.validate();
            parent.repaint();
        }

        this.num_players = w.num_players;
        this.tokens = w.tokens;
        this.current_token = w.current_token;

        // updates token locations
        for (int i = 0; i < num_players; i++){
            positions[tokens[i].getPosition()].add(tokens[i].getLabel());
        }

        // load gamestate
        gameState.loadGameState(w.gs);
        // loads gamemanager
        gm.loadGameManager(w.gm);

        // updates the instruction text
        gameState.temp_label.setText(gameState.getPlayerName(gameState.currentPlayer) + "'s turn!");
        gameState.changeInstruction(1);

        timer.old_time_elapsed = w.old_time_elapsed;

        // Tell timer that this is a loaded game
        timer.loaded = true;

        // Reset start time to current time
        timer.timeAtStart = System.currentTimeMillis();

        this.revalidate();
        this.repaint();

    }



    public JLabel header_label;
    public JLabel start_label;
    public JPanel blue;
    public JPanel blue_five;
    public JPanel blue_four;
    public JPanel blue_one;
    public JPanel blue_three;
    public JPanel blue_two;
    public JPanel board_panel;
    public JPanel cake;
    public JPanel cookie;
    public JPanel cupcake;
    public JPanel game_container_panel;
    public JPanel green;
    public JPanel green_five;
    public JPanel green_four;
    public JPanel green_one;
    public JPanel green_three;
    public JPanel green_two;
    public JPanel ice_cream;
    public JPanel orange;
    public JPanel orange_five;
    public JPanel orange_four;
    public JPanel orange_one;
    public JPanel orange_three;
    public JPanel orange_two;
    public JPanel pie;
    public JPanel red;
    public JPanel red_five;
    public JPanel red_four;
    public JPanel red_one;
    public JPanel red_three;
    public JPanel red_two;
    public JPanel temp_panel;
    public JPanel yellow;
    public JPanel yellow_five;
    public JPanel yellow_four;
    public JPanel yellow_one;
    public JPanel yellow_three;
    public JPanel yellow_two;
    public static JLabel grandmas_house;
    public static JPanel non_board_panel;
    public static JPanel start_panel;
    public static JMenuBar menuBar;
    public static JMenu fileMenu;
    public static JMenu backgroundMenu;
    public JPanel current_instruction;
    public JPanel timer_panel;

    public static CardPanel card_panel;
    public static LoadSaveHandler lsh;
    public static TimeCounter timer;
    public static DeckManager dm;
    public static GameState gameState;
    public static BackgroundColorHandler color_handler;
    public static int num_players;
    public static Token[] tokens;
    public static Token current_token;
    public static JPanel[] positions;
    public static GameManager gm;
    public static Boomerang br = new Boomerang(); 
    public JPanel instructions_panel;
    public JPanel combinedPanel;
    public JPanel turn_panel;
    public JPanel boom_panel;


    public final static int[] sweets_spaces = new int[]{5, 12, 18, 27, 35};
    public final static String[] sweets = new String[]{"Ice Cream", "Cake", "Cookie", "Cupcake", "Pie"};


}
