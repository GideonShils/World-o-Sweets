package WorldOfSweets;
import GameObjects.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class WorldOfSweets extends JFrame{
    /**
     * Creates new form WorldOfSweets
     */
    public WorldOfSweets(int num_players) {
        initComponents(num_players);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(int num_players) {
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
        card_panel = new CardPanel(dm, gameState);
        JPanel combinedPanel = new javax.swing.JPanel();
      	combinedPanel.setLayout(new BoxLayout(combinedPanel, BoxLayout.Y_AXIS));
        JPanel turn_panel = gameState.turnPanel();
        combinedPanel.add(card_panel.getCardsPanel());
        combinedPanel.add(turn_panel);
        non_board_panel.add(combinedPanel);

        JPanel current_instruction = gameState.currentInstruction();
        non_board_panel.add(current_instruction);

        /*
        instructions_panel.setPreferredSize(new java.awt.Dimension(250, 310));

        GroupLayout instructions_panelLayout = new GroupLayout(instructions_panel);
        instructions_panel.setLayout(instructions_panelLayout);
        instructions_panelLayout.setHorizontalGroup(
						    instructions_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						    .addGap(0, 250, Short.MAX_VALUE)
						    );
        instructions_panelLayout.setVerticalGroup(
						  instructions_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						  .addGap(0, 310, Short.MAX_VALUE)
						  );
        

        non_board_panel.add(instructions_panel);
        */

        game_container_panel.add(non_board_panel);

        getContentPane().add(game_container_panel, java.awt.BorderLayout.CENTER);

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        // Initialize game sate and bring up dialog
        // asking for number of players
	    gameState = new GameState();
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
		    new WorldOfSweets(gameState.getPlayers()).setVisible(true);
		    GameManager gm = new GameManager(positions, card_panel, tokens, grandmas_house, gameState, sweets_spaces);
		    card_panel.setGameManager(gm);
		}
	    });



    }

    private JLabel header_label;
    private JLabel start_label;
    private JPanel blue;
    private JPanel blue_five;
    private JPanel blue_four;
    private JPanel blue_one;
    private JPanel blue_three;
    private JPanel blue_two;
    private JPanel board_panel;
    private JPanel cake;
    private JPanel cookie;
    private JPanel cupcake;
    private JPanel game_container_panel;
    private JPanel green;
    private JPanel green_five;
    private JPanel green_four;
    private JPanel green_one;
    private JPanel green_three;
    private JPanel green_two;
    private JPanel ice_cream;
    private JPanel instructions_panel;
    private JPanel orange;
    private JPanel orange_five;
    private JPanel orange_four;
    private JPanel orange_one;
    private JPanel orange_three;
    private JPanel orange_two;
    private JPanel pie;
    private JPanel red;
    private JPanel red_five;
    private JPanel red_four;
    private JPanel red_one;
    private JPanel red_three;
    private JPanel red_two;
    private JPanel temp_panel;
    private JPanel yellow;
    private JPanel yellow_five;
    private JPanel yellow_four;
    private JPanel yellow_one;
    private JPanel yellow_three;
    private JPanel yellow_two;
    private static JLabel grandmas_house;
    private static JPanel non_board_panel;
    private static JPanel start_panel;

    private static DeckManager dm;
    private static GameState gameState;
    private static int num_players;
    private static Token[] tokens;
    private static Token current_token;
    private static JPanel[] positions;
    private static CardPanel card_panel;
    private final static int[] sweets_spaces = new int[]{5, 12, 18, 27, 35};
    private final static String[] sweets = new String[]{"Ice Cream", "Cake", "Cookie", "Cupcake", "Pie"};
}
