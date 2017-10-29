package WorldOfSweets;
import GameObjects.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class WorldOfSweets extends JFrame {

    /**
     * Creates new form WorldOfSweets
     */
    public WorldOfSweets(int num_players) {
        initComponents(num_players);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(int num_players) {
        java.awt.GridBagConstraints gridBagConstraints;

        header_label = new JLabel();
        game_container_panel = new JPanel();
        board_panel = new JPanel();
        jPanel11 = new JPanel();
        jPanel24 = new JPanel();
        jPanel25 = new JPanel();
        jPanel26 = new JPanel();
        jPanel27 = new JPanel();
        jPanel28 = new JPanel();
        jPanel29 = new JPanel();
        jPanel30 = new JPanel();
        jPanel31 = new JPanel();
        jPanel32 = new JPanel();
        jPanel33 = new JPanel();
        jLabel34 = new JLabel();
        jPanel35 = new JPanel();
        jPanel36 = new JPanel();
        jPanel37 = new JPanel();
        jPanel38 = new JPanel();
        jPanel39 = new JPanel();
        jPanel40 = new JPanel();
        jPanel41 = new JPanel();
        jPanel42 = new JPanel();
        jPanel43 = new JPanel();
        jPanel44 = new JPanel();
        jPanel45 = new JPanel();
        jPanel46 = new JPanel();
        jPanel47 = new JPanel();
        jPanel48 = new JPanel();
        jPanel49 = new JPanel();
        jPanel50 = new JPanel();
        jPanel51 = new JPanel();
        jPanel52 = new JPanel();
        jPanel53 = new JPanel();
        jPanel54 = new JPanel();
        jPanel55 = new JPanel();
        jPanel56 = new JPanel();
        jPanel57 = new JPanel();
        jPanel58 = new JPanel();
        jPanel59 = new JPanel();
        jPanel60 = new JPanel();
        jPanel61 = new JPanel();
        jPanel62 = new JPanel();
        jPanel63 = new JPanel();
        jPanel64 = new JPanel();
        jPanel65 = new JPanel();
        jPanel66 = new JPanel();
        jPanel67 = new JPanel();
        jPanel68 = new JPanel();
        jPanel69 = new JPanel();
        jPanel70 = new JPanel();
        jPanel71 = new JPanel();
        jPanel72 = new JPanel();
        jPanel73 = new JPanel();
        jPanel74 = new JPanel();
        jPanel75 = new JPanel();
        jPanel76 = new JPanel();
        jPanel77 = new JPanel();
        jPanel78 = new JPanel();
        jPanel79 = new JPanel();
        jPanel80 = new JPanel();
        jPanel81 = new JPanel();
        jPanel82 = new JPanel();
        jPanel83 = new JPanel();
        jPanel84 = new JPanel();
        jPanel85 = new JPanel();
        jPanel86 = new JPanel();
        jPanel87 = new JPanel();
        jPanel88 = new JPanel();
        jPanel89 = new JPanel();
        jPanel90 = new JPanel();
        jPanel91 = new JPanel();
        jPanel92 = new JPanel();
        jPanel93 = new JPanel();
        jPanel94 = new JPanel();
        jPanel95 = new JPanel();
        jPanel96 = new JPanel();
        jPanel97 = new JPanel();
        jPanel98 = new JPanel();
        jPanel99 = new JPanel();
        jPanel100 = new JPanel();
        jPanel101 = new JPanel();
        jPanel102 = new JPanel();
        jPanel103 = new JPanel();
        start_panel = new JPanel();
        jPanel105 = new JPanel();
        jPanel106 = new JPanel();
        jPanel107 = new JPanel();
        jPanel108 = new JPanel();
        jPanel109 = new JPanel();
        jPanel110 = new JPanel();
        jPanel111 = new JPanel();
        jPanel112 = new JPanel();
        jPanel113 = new JPanel();
        jLabel114 = new JLabel();
        jPanel115 = new JPanel();
        jPanel116 = new JPanel();
        jPanel117 = new JPanel();
        jPanel118 = new JPanel();
        jPanel119 = new JPanel();
        jPanel120 = new JPanel();
        jPanel121 = new JPanel();
        jPanel122 = new JPanel();
        non_board_panel = new JPanel();
        instructions_panel = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(872, 690));

        header_label.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24));
        header_label.setHorizontalAlignment(SwingConstants.CENTER);
        header_label.setText("Welcome to the World of Sweets!");
        header_label.setMaximumSize(new java.awt.Dimension(248, 50));
        header_label.setMinimumSize(new java.awt.Dimension(248, 50));
        header_label.setPreferredSize(new java.awt.Dimension(248, 50));
        getContentPane().add(header_label, java.awt.BorderLayout.PAGE_START);

        game_container_panel.setPreferredSize(new java.awt.Dimension(850, 600));

        board_panel.setBackground(new java.awt.Color(181, 255, 143));
        board_panel.setPreferredSize(new java.awt.Dimension(600, 620));
        board_panel.setLayout(new java.awt.GridLayout(10, 10));
	jPanel11.setOpaque(false);
        board_panel.add(jPanel11);
	jPanel24.setOpaque(false);
        board_panel.add(jPanel24);
	jPanel25.setOpaque(false);
        board_panel.add(jPanel25);
	jPanel26.setOpaque(false);
        board_panel.add(jPanel26);
	jPanel27.setOpaque(false);
        board_panel.add(jPanel27);
	jPanel28.setOpaque(false);
        board_panel.add(jPanel28);
	jPanel29.setOpaque(false);
        board_panel.add(jPanel29);
	jPanel30.setOpaque(false);
        board_panel.add(jPanel30);
	jPanel31.setOpaque(false);
        board_panel.add(jPanel31);
	jPanel32.setOpaque(false);
        board_panel.add(jPanel32);
	jPanel33.setOpaque(false);
        board_panel.add(jPanel33);

        jLabel34.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel34.setIcon(new ImageIcon(getClass().getResource("/home-house-icon-94831.png")));

        board_panel.add(jLabel34);

        jPanel35.setBackground(new java.awt.Color(0, 255, 0));
        jPanel35.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel35.setOpaque(true);
	jPanel35.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel35);

        jPanel36.setBackground(new java.awt.Color(0, 0, 255));
        jPanel36.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.setOpaque(true);
	jPanel36.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel36);

        jPanel37.setBackground(new java.awt.Color(255, 255, 0));
        jPanel37.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel37.setOpaque(true);
	jPanel37.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel37);

        jPanel38.setBackground(new java.awt.Color(255, 0, 0));
        jPanel38.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	jPanel38.setLayout(new java.awt.GridLayout(2, 2));
        jPanel38.setOpaque(true);
        board_panel.add(jPanel38);
	jPanel39.setOpaque(false);
        board_panel.add(jPanel39);
	jPanel40.setOpaque(false);
        board_panel.add(jPanel40);
	jPanel41.setOpaque(false);
        board_panel.add(jPanel41);
	jPanel42.setOpaque(false);
        board_panel.add(jPanel42);
	jPanel43.setOpaque(false);
        board_panel.add(jPanel43);
	jPanel44.setOpaque(false);
        board_panel.add(jPanel44);
	jPanel45.setOpaque(false);
        board_panel.add(jPanel45);
	jPanel46.setOpaque(false);
        board_panel.add(jPanel46);
	jPanel47.setOpaque(false);
        board_panel.add(jPanel47);

        jPanel48.setBackground(new java.awt.Color(255, 153, 0));
        jPanel48.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel48.setOpaque(true);
	jPanel48.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel48);

        jPanel49.setBackground(new java.awt.Color(0, 255, 0));
        jPanel49.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel49.setOpaque(true);
	jPanel49.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel49);

        jPanel50.setBackground(new java.awt.Color(0, 0, 255));
        jPanel50.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel50.setOpaque(true);
	jPanel50.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel50);

        jPanel51.setBackground(new java.awt.Color(255, 255, 0));
        jPanel51.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	jPanel51.setLayout(new java.awt.GridLayout(2, 2));
        jPanel51.setOpaque(true);
        board_panel.add(jPanel51);
	jPanel52.setOpaque(false);
        board_panel.add(jPanel52);
	jPanel53.setOpaque(false);
        board_panel.add(jPanel53);
	jPanel54.setOpaque(false);
        board_panel.add(jPanel54);
	jPanel55.setOpaque(false);
        board_panel.add(jPanel55);
	jPanel56.setOpaque(false);
        board_panel.add(jPanel56);
	jPanel57.setOpaque(false);
        board_panel.add(jPanel57);
	jPanel58.setOpaque(false);
        board_panel.add(jPanel58);
	jPanel59.setOpaque(false);
        board_panel.add(jPanel59);
	jPanel60.setOpaque(false);
        board_panel.add(jPanel60);


        jPanel61.setBackground(new java.awt.Color(255, 0, 0));
        jPanel61.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel61.setOpaque(true);
	jPanel61.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel61);
	jPanel62.setOpaque(false);
        board_panel.add(jPanel62);
	jPanel63.setOpaque(false);
        board_panel.add(jPanel63);

        jPanel64.setBackground(new java.awt.Color(0, 255, 0));
        jPanel64.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel64.setOpaque(true);
	jPanel64.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel64);

        jPanel65.setBackground(new java.awt.Color(255, 153, 0));
        jPanel65.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel65.setOpaque(true);
	jPanel65.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel65);

        jPanel66.setBackground(new java.awt.Color(255, 0, 0));
        jPanel66.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel66.setOpaque(true);
	jPanel66.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel66);
	jPanel67.setOpaque(false);
        board_panel.add(jPanel67);

        jPanel68.setBackground(new java.awt.Color(255, 255, 0));
        jPanel68.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel68.setOpaque(true);
	jPanel68.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel68);

        jPanel69.setBackground(new java.awt.Color(0, 0, 255));
        jPanel69.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel69.setOpaque(true);
	jPanel69.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel69);

        jPanel70.setBackground(new java.awt.Color(0, 255, 0));
        jPanel70.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel70.setOpaque(true);
	jPanel70.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel70);

        jPanel71.setBackground(new java.awt.Color(255, 153, 0));
        jPanel71.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel71.setOpaque(true);
	jPanel71.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel71);
	jPanel72.setOpaque(false);
        board_panel.add(jPanel72);
	jPanel73.setOpaque(false);
        board_panel.add(jPanel73);

        jPanel74.setBackground(new java.awt.Color(0, 0, 255));
        jPanel74.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel74.setOpaque(true);
	jPanel74.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel74);
        jPanel75.setOpaque(false);
        board_panel.add(jPanel75);

        jPanel76.setBackground(new java.awt.Color(255, 255, 0));
        jPanel76.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel76.setOpaque(true);
	jPanel76.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel76);
        jPanel77.setOpaque(false);
        board_panel.add(jPanel77);

        jPanel78.setBackground(new java.awt.Color(255, 0, 0));
        jPanel78.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	jPanel78.setLayout(new java.awt.GridLayout(2, 2));
        jPanel78.setOpaque(true);
        board_panel.add(jPanel78);
        jPanel79.setOpaque(false);
        board_panel.add(jPanel79);
        jPanel80.setOpaque(false);
        board_panel.add(jPanel80);
        jPanel81.setOpaque(false);
        board_panel.add(jPanel81);
        jPanel82.setOpaque(false);
        board_panel.add(jPanel82);
        jPanel83.setOpaque(false);
        board_panel.add(jPanel83);

        jPanel84.setBackground(new java.awt.Color(255, 255, 0));
        jPanel84.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel84.setOpaque(true);
	jPanel84.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel84);
        jPanel85.setOpaque(false);
        board_panel.add(jPanel85);

        jPanel86.setBackground(new java.awt.Color(0, 0, 255));
        jPanel86.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	jPanel86.setLayout(new java.awt.GridLayout(2, 2));
        jPanel86.setOpaque(true);
        board_panel.add(jPanel86);
        jPanel87.setOpaque(false);
        board_panel.add(jPanel87);

        jPanel88.setBackground(new java.awt.Color(255, 153, 0));
        jPanel88.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel88.setOpaque(true);
	jPanel88.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel88);

        jPanel89.setBackground(new java.awt.Color(0, 255, 0));
        jPanel89.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel89.setOpaque(true);
	jPanel89.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel89);

        jPanel90.setBackground(new java.awt.Color(0, 0, 255));
        jPanel90.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel90.setOpaque(true);
	jPanel90.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel90);

        jPanel91.setBackground(new java.awt.Color(255, 255, 0));
        jPanel91.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel91.setOpaque(true);
	jPanel91.setLayout(new java.awt.GridLayout(2, 2));
	board_panel.add(jPanel91);
        jPanel92.setOpaque(false);
        board_panel.add(jPanel92);
        jPanel93.setOpaque(false);
        board_panel.add(jPanel93);

        jPanel94.setBackground(new java.awt.Color(255, 0, 0));
        jPanel94.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel94.setOpaque(true);
	jPanel94.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel94);
        jPanel95.setOpaque(false);
        board_panel.add(jPanel95);

        jPanel96.setBackground(new java.awt.Color(255, 153, 0));
        jPanel96.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel96.setOpaque(true);
	jPanel96.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel96);
        jPanel97.setOpaque(false);
        board_panel.add(jPanel97);
        jPanel98.setOpaque(false);
        board_panel.add(jPanel98);
        jPanel99.setOpaque(false);
        board_panel.add(jPanel99);
        jPanel100.setOpaque(false);
        board_panel.add(jPanel100);

        jPanel101.setBackground(new java.awt.Color(255, 0, 0));
        jPanel101.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel101.setOpaque(true);
	jPanel101.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel101);
        jPanel102.setOpaque(false);
        board_panel.add(jPanel102);
        jPanel103.setOpaque(false);
        board_panel.add(jPanel103);

        start_panel.setBackground(new java.awt.Color(255, 255, 255));
        start_panel.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	start_panel.setLayout(new java.awt.GridLayout(2, 2));
	for(int i = 0; i < num_players; i++){
	    JLabel label = new JLabel();
	    label.setIcon(new ImageIcon(getClass().getResource("/tokens/player" + (i+1) + ".png")));
	    Token t = new Token("/tokens/player" + (i+1) + ".png", label);
	    start_panel.add(label);	    
	}
	/*JLabel label = new JLabel();
	/*BufferedImage image = null;
	try{	 
	    image = ImageIO.read(getClass().getResource("/tokens/player1.png"));
	}
	catch(Exception e){
	    System.out.println("Error with tokens");
	}
	ImageIcon icon = new ImageIcon(image);
	if(icon == null){
	    System.out.println("null");
	    }
	    label.setIcon(icon);
	    start_panel.add(label);*/
        board_panel.add(start_panel);
        jPanel105.setOpaque(false);
        board_panel.add(jPanel105);

        jPanel106.setBackground(new java.awt.Color(0, 255, 0));
        jPanel106.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel106.setOpaque(true);
	jPanel106.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel106);

        jPanel107.setBackground(new java.awt.Color(255, 0, 0));
        jPanel107.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel107.setOpaque(true);
	jPanel107.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel107);

        jPanel108.setBackground(new java.awt.Color(255, 255, 0));
        jPanel108.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel108.setOpaque(true);
	jPanel108.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel108);

        jPanel109.setBackground(new java.awt.Color(0, 0, 255));
        jPanel109.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel109.setOpaque(true);
	jPanel109.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel109);

        jPanel110.setBackground(new java.awt.Color(0, 255, 0));
        jPanel110.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel110.setOpaque(true);
	jPanel110.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel110);

        jPanel111.setBackground(new java.awt.Color(255, 153, 0));
        jPanel111.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel111.setOpaque(true);
	jPanel111.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel111);
        jPanel112.setOpaque(false);
        board_panel.add(jPanel112);
        jPanel113.setOpaque(false);
        board_panel.add(jPanel113);

	jLabel114.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel114.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel114.setText("Start");
        jLabel114.setVerticalAlignment(SwingConstants.TOP);
        jLabel114.setOpaque(false);
        board_panel.add(jLabel114);
        jPanel115.setOpaque(false);
        board_panel.add(jPanel115);
        jPanel116.setOpaque(false);
        board_panel.add(jPanel116);
        jPanel117.setOpaque(false);
        board_panel.add(jPanel117);
        jPanel118.setOpaque(false);
        board_panel.add(jPanel118);
        jPanel119.setOpaque(false);
        board_panel.add(jPanel119);
        jPanel120.setOpaque(false);
        board_panel.add(jPanel120);
        jPanel121.setOpaque(false);
        board_panel.add(jPanel121);
        jPanel122.setOpaque(false);
        board_panel.add(jPanel122);

        game_container_panel.add(board_panel);

        non_board_panel.setPreferredSize(new java.awt.Dimension(250, 620));


        CardPanel cards_panel = new CardPanel(dm);
        non_board_panel.add(cards_panel.getCardsPanel());


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

        game_container_panel.add(non_board_panel);

        getContentPane().add(game_container_panel, java.awt.BorderLayout.CENTER);

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	//GAMESTATE
	GameState gameState = new GameState();

	// create deck manager object
        // create the deck itself
        // shuffle the deck
        dm = new DeckManager();
        dm.createDeck(10, 2);
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
            }
        });

	

    }
    private JPanel board_panel;
    private JPanel game_container_panel;
    private JLabel header_label;
    private JPanel instructions_panel;
    private JPanel jPanel100;
    private JPanel jPanel101;
    private JPanel jPanel102;
    private JPanel jPanel103;
    private static JPanel start_panel;
    private JPanel jPanel105;
    private JPanel jPanel106;
    private JPanel jPanel107;
    private JPanel jPanel108;
    private JPanel jPanel109;
    private JPanel jPanel11;
    private JPanel jPanel110;
    private JPanel jPanel111;
    private JPanel jPanel112;
    private JPanel jPanel113;
    private JLabel jLabel114;
    private JPanel jPanel115;
    private JPanel jPanel116;
    private JPanel jPanel117;
    private JPanel jPanel118;
    private JPanel jPanel119;
    private JPanel jPanel120;
    private JPanel jPanel121;
    private JPanel jPanel122;
    private JPanel jPanel24;
    private JPanel jPanel25;
    private JPanel jPanel26;
    private JPanel jPanel27;
    private JPanel jPanel28;
    private JPanel jPanel29;
    private JPanel jPanel30;
    private JPanel jPanel31;
    private JPanel jPanel32;
    private JPanel jPanel33;
    private JLabel jLabel34;
    private JPanel jPanel35;
    private JPanel jPanel36;
    private JPanel jPanel37;
    private JPanel jPanel38;
    private JPanel jPanel39;
    private JPanel jPanel40;
    private JPanel jPanel41;
    private JPanel jPanel42;
    private JPanel jPanel43;
    private JPanel jPanel44;
    private JPanel jPanel45;
    private JPanel jPanel46;
    private JPanel jPanel47;
    private JPanel jPanel48;
    private JPanel jPanel49;
    private JPanel jPanel50;
    private JPanel jPanel51;
    private JPanel jPanel52;
    private JPanel jPanel53;
    private JPanel jPanel54;
    private JPanel jPanel55;
    private JPanel jPanel56;
    private JPanel jPanel57;
    private JPanel jPanel58;
    private JPanel jPanel59;
    private JPanel jPanel60;
    private JPanel jPanel61;
    private JPanel jPanel62;
    private JPanel jPanel63;
    private JPanel jPanel64;
    private JPanel jPanel65;
    private JPanel jPanel66;
    private JPanel jPanel67;
    private JPanel jPanel68;
    private JPanel jPanel69;
    private JPanel jPanel70;
    private JPanel jPanel71;
    private JPanel jPanel72;
    private JPanel jPanel73;
    private JPanel jPanel74;
    private JPanel jPanel75;
    private JPanel jPanel76;
    private JPanel jPanel77;
    private JPanel jPanel78;
    private JPanel jPanel79;
    private JPanel jPanel80;
    private JPanel jPanel81;
    private JPanel jPanel82;
    private JPanel jPanel83;
    private JPanel jPanel84;
    private JPanel jPanel85;
    private JPanel jPanel86;
    private JPanel jPanel87;
    private JPanel jPanel88;
    private JPanel jPanel89;
    private JPanel jPanel90;
    private JPanel jPanel91;
    private JPanel jPanel92;
    private JPanel jPanel93;
    private JPanel jPanel94;
    private JPanel jPanel95;
    private JPanel jPanel96;
    private JPanel jPanel97;
    private JPanel jPanel98;
    private JPanel jPanel99;
    private JPanel non_board_panel;

    private static DeckManager dm;
}
