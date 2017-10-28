package WorldOfSweets;
import GameObjects.*;

public class WorldOfSweets extends javax.swing.JFrame {

    /**
     * Creates new form WorldOfSweets
     */
    public WorldOfSweets() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        header_label = new javax.swing.JLabel();
        game_container_panel = new javax.swing.JPanel();
        board_panel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        jPanel99 = new javax.swing.JPanel();
        jPanel100 = new javax.swing.JPanel();
        jPanel101 = new javax.swing.JPanel();
        jPanel102 = new javax.swing.JPanel();
        jPanel103 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jPanel105 = new javax.swing.JPanel();
        jPanel106 = new javax.swing.JPanel();
        jPanel107 = new javax.swing.JPanel();
        jPanel108 = new javax.swing.JPanel();
        jPanel109 = new javax.swing.JPanel();
        jPanel110 = new javax.swing.JPanel();
        jPanel111 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jPanel114 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        jPanel117 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jPanel119 = new javax.swing.JPanel();
        jPanel120 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jPanel122 = new javax.swing.JPanel();
        non_board_panel = new javax.swing.JPanel();
        instructions_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(872, 690));

        header_label.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24));
        header_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-house-icon-94831.png")));

        board_panel.add(jLabel34);

        jPanel35.setBackground(new java.awt.Color(0, 255, 0));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel35.setOpaque(true);
	jPanel35.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel35);

        jPanel36.setBackground(new java.awt.Color(0, 0, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.setOpaque(true);
	jPanel36.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel36);

        jPanel37.setBackground(new java.awt.Color(255, 255, 0));
        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel37.setOpaque(true);
	jPanel37.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel37);

        jPanel38.setBackground(new java.awt.Color(255, 0, 0));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel48.setOpaque(true);
	jPanel48.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel48);

        jPanel49.setBackground(new java.awt.Color(0, 255, 0));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel49.setOpaque(true);
	jPanel49.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel49);

        jPanel50.setBackground(new java.awt.Color(0, 0, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel50.setOpaque(true);
	jPanel50.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel50);

        jPanel51.setBackground(new java.awt.Color(255, 255, 0));
        jPanel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel61.setOpaque(true);
	jPanel61.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel61);
	jPanel62.setOpaque(false);
        board_panel.add(jPanel62);
	jPanel63.setOpaque(false);
        board_panel.add(jPanel63);

        jPanel64.setBackground(new java.awt.Color(0, 255, 0));
        jPanel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel64.setOpaque(true);
	jPanel64.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel64);

        jPanel65.setBackground(new java.awt.Color(255, 153, 0));
        jPanel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel65.setOpaque(true);
	jPanel65.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel65);

        jPanel66.setBackground(new java.awt.Color(255, 0, 0));
        jPanel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel66.setOpaque(true);
	jPanel66.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel66);
	jPanel67.setOpaque(false);
        board_panel.add(jPanel67);

        jPanel68.setBackground(new java.awt.Color(255, 255, 0));
        jPanel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel68.setOpaque(true);
	jPanel68.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel68);

        jPanel69.setBackground(new java.awt.Color(0, 0, 255));
        jPanel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel69.setOpaque(true);
	jPanel69.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel69);

        jPanel70.setBackground(new java.awt.Color(0, 255, 0));
        jPanel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel70.setOpaque(true);
	jPanel70.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel70);

        jPanel71.setBackground(new java.awt.Color(255, 153, 0));
        jPanel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel71.setOpaque(true);
	jPanel71.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel71);
	jPanel72.setOpaque(false);
        board_panel.add(jPanel72);
	jPanel73.setOpaque(false);
        board_panel.add(jPanel73);

        jPanel74.setBackground(new java.awt.Color(0, 0, 255));
        jPanel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel74.setOpaque(true);
	jPanel74.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel74);
        jPanel75.setOpaque(false);
        board_panel.add(jPanel75);

        jPanel76.setBackground(new java.awt.Color(255, 255, 0));
        jPanel76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel76.setOpaque(true);
	jPanel76.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel76);
        jPanel77.setOpaque(false);
        board_panel.add(jPanel77);

        jPanel78.setBackground(new java.awt.Color(255, 0, 0));
        jPanel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel84.setOpaque(true);
	jPanel84.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel84);
        jPanel85.setOpaque(false);
        board_panel.add(jPanel85);

        jPanel86.setBackground(new java.awt.Color(0, 0, 255));
        jPanel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	jPanel86.setLayout(new java.awt.GridLayout(2, 2));
        jPanel86.setOpaque(true);
        board_panel.add(jPanel86);
        jPanel87.setOpaque(false);
        board_panel.add(jPanel87);

        jPanel88.setBackground(new java.awt.Color(255, 153, 0));
        jPanel88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel88.setOpaque(true);
	jPanel88.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel88);

        jPanel89.setBackground(new java.awt.Color(0, 255, 0));
        jPanel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel89.setOpaque(true);
	jPanel89.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel89);

        jPanel90.setBackground(new java.awt.Color(0, 0, 255));
        jPanel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel90.setOpaque(true);
	jPanel90.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel90);

        jPanel91.setBackground(new java.awt.Color(255, 255, 0));
        jPanel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel91.setOpaque(true);
	jPanel91.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel91);
        jPanel92.setOpaque(false);
        board_panel.add(jPanel92);
        jPanel93.setOpaque(false);
        board_panel.add(jPanel93);

        jPanel94.setBackground(new java.awt.Color(255, 0, 0));
        jPanel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel94.setOpaque(true);
	jPanel94.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel94);
        jPanel95.setOpaque(false);
        board_panel.add(jPanel95);

        jPanel96.setBackground(new java.awt.Color(255, 153, 0));
        jPanel96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel101.setOpaque(true);
	jPanel101.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel101);
        jPanel102.setOpaque(false);
        board_panel.add(jPanel102);
        jPanel103.setOpaque(false);
        board_panel.add(jPanel103);

        jLabel104.setBackground(new java.awt.Color(0, 0, 0));
        jLabel104.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); 
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("Start");
        jLabel104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel104.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel104.setOpaque(true);
        jLabel104.setVerifyInputWhenFocusTarget(false);
        board_panel.add(jLabel104);
        jPanel105.setOpaque(false);
        board_panel.add(jPanel105);

        jPanel106.setBackground(new java.awt.Color(0, 255, 0));
        jPanel106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel106.setOpaque(true);
	jPanel106.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel106);

        jPanel107.setBackground(new java.awt.Color(255, 0, 0));
        jPanel107.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel107.setOpaque(true);
	jPanel107.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel107);

        jPanel108.setBackground(new java.awt.Color(255, 255, 0));
        jPanel108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel108.setOpaque(true);
	jPanel108.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel108);

        jPanel109.setBackground(new java.awt.Color(0, 0, 255));
        jPanel109.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel109.setOpaque(true);
	jPanel109.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel109);

        jPanel110.setBackground(new java.awt.Color(0, 255, 0));
        jPanel110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel110.setOpaque(true);
	jPanel110.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel110);

        jPanel111.setBackground(new java.awt.Color(255, 153, 0));
        jPanel111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel111.setOpaque(true);
	jPanel111.setLayout(new java.awt.GridLayout(2, 2));
        board_panel.add(jPanel111);
        jPanel112.setOpaque(false);
        board_panel.add(jPanel112);
        jPanel113.setOpaque(false);
        board_panel.add(jPanel113);
        jPanel114.setOpaque(false);
        board_panel.add(jPanel114);
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

        javax.swing.GroupLayout instructions_panelLayout = new javax.swing.GroupLayout(instructions_panel);
        instructions_panel.setLayout(instructions_panelLayout);
        instructions_panelLayout.setHorizontalGroup(
            instructions_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        instructions_panelLayout.setVerticalGroup(
            instructions_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorldOfSweets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorldOfSweets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorldOfSweets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorldOfSweets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorldOfSweets().setVisible(true);
            }
        });
    }
    private javax.swing.JPanel board_panel;
    private javax.swing.JPanel game_container_panel;
    private javax.swing.JLabel header_label;
    private javax.swing.JPanel instructions_panel;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JPanel non_board_panel;

    private static DeckManager dm;
}
