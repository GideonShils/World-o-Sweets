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
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        non_board_panel = new javax.swing.JPanel();
        cards_panel = new javax.swing.JPanel();
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
        board_panel.add(jLabel11);
        board_panel.add(jLabel24);
        board_panel.add(jLabel25);
        board_panel.add(jLabel26);
        board_panel.add(jLabel27);
        board_panel.add(jLabel28);
        board_panel.add(jLabel29);
        board_panel.add(jLabel30);
        board_panel.add(jLabel31);
        board_panel.add(jLabel32);
        board_panel.add(jLabel33);

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13));
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-house-icon-94831.png")));
        board_panel.add(jLabel34);

        jLabel35.setBackground(new java.awt.Color(0, 255, 0));
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel35.setOpaque(true);
        board_panel.add(jLabel35);

        jLabel36.setBackground(new java.awt.Color(0, 0, 255));
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel36.setOpaque(true);
        board_panel.add(jLabel36);

        jLabel37.setBackground(new java.awt.Color(255, 255, 0));
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel37.setOpaque(true);
        board_panel.add(jLabel37);

        jLabel38.setBackground(new java.awt.Color(255, 0, 0));
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel38.setOpaque(true);
        board_panel.add(jLabel38);
        board_panel.add(jLabel39);
        board_panel.add(jLabel40);
        board_panel.add(jLabel41);
        board_panel.add(jLabel42);
        board_panel.add(jLabel43);
        board_panel.add(jLabel44);
        board_panel.add(jLabel45);
        board_panel.add(jLabel46);
        board_panel.add(jLabel47);

        jLabel48.setBackground(new java.awt.Color(255, 153, 0));
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel48.setOpaque(true);
        board_panel.add(jLabel48);

        jLabel49.setBackground(new java.awt.Color(0, 255, 0));
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel49.setOpaque(true);
        board_panel.add(jLabel49);

        jLabel50.setBackground(new java.awt.Color(0, 0, 255));
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel50.setOpaque(true);
        board_panel.add(jLabel50);

        jLabel51.setBackground(new java.awt.Color(255, 255, 0));
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel51.setOpaque(true);
        board_panel.add(jLabel51);
        board_panel.add(jLabel52);
        board_panel.add(jLabel53);
        board_panel.add(jLabel54);
        board_panel.add(jLabel55);
        board_panel.add(jLabel56);
        board_panel.add(jLabel57);
        board_panel.add(jLabel58);
        board_panel.add(jLabel59);
        board_panel.add(jLabel60);

        jLabel61.setBackground(new java.awt.Color(255, 0, 0));
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel61.setOpaque(true);
        board_panel.add(jLabel61);
        board_panel.add(jLabel62);
        board_panel.add(jLabel63);

        jLabel64.setBackground(new java.awt.Color(0, 255, 0));
        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel64.setOpaque(true);
        board_panel.add(jLabel64);

        jLabel65.setBackground(new java.awt.Color(255, 153, 0));
        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel65.setOpaque(true);
        board_panel.add(jLabel65);

        jLabel66.setBackground(new java.awt.Color(255, 0, 0));
        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel66.setOpaque(true);
        board_panel.add(jLabel66);
        board_panel.add(jLabel67);

        jLabel68.setBackground(new java.awt.Color(255, 255, 0));
        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel68.setOpaque(true);
        board_panel.add(jLabel68);

        jLabel69.setBackground(new java.awt.Color(0, 0, 255));
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel69.setOpaque(true);
        board_panel.add(jLabel69);

        jLabel70.setBackground(new java.awt.Color(0, 255, 0));
        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel70.setOpaque(true);
        board_panel.add(jLabel70);

        jLabel71.setBackground(new java.awt.Color(255, 153, 0));
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel71.setOpaque(true);
        board_panel.add(jLabel71);
        board_panel.add(jLabel72);
        board_panel.add(jLabel73);

        jLabel74.setBackground(new java.awt.Color(0, 0, 255));
        jLabel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel74.setOpaque(true);
        board_panel.add(jLabel74);
        board_panel.add(jLabel75);

        jLabel76.setBackground(new java.awt.Color(255, 255, 0));
        jLabel76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel76.setOpaque(true);
        board_panel.add(jLabel76);
        board_panel.add(jLabel77);

        jLabel78.setBackground(new java.awt.Color(255, 0, 0));
        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel78.setOpaque(true);
        board_panel.add(jLabel78);
        board_panel.add(jLabel79);
        board_panel.add(jLabel80);
        board_panel.add(jLabel81);
        board_panel.add(jLabel82);
        board_panel.add(jLabel83);

        jLabel84.setBackground(new java.awt.Color(255, 255, 0));
        jLabel84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel84.setOpaque(true);
        board_panel.add(jLabel84);
        board_panel.add(jLabel85);

        jLabel86.setBackground(new java.awt.Color(0, 0, 255));
        jLabel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel86.setOpaque(true);
        board_panel.add(jLabel86);
        board_panel.add(jLabel87);

        jLabel88.setBackground(new java.awt.Color(255, 153, 0));
        jLabel88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel88.setOpaque(true);
        board_panel.add(jLabel88);

        jLabel89.setBackground(new java.awt.Color(0, 255, 0));
        jLabel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel89.setOpaque(true);
        board_panel.add(jLabel89);

        jLabel90.setBackground(new java.awt.Color(0, 0, 255));
        jLabel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel90.setOpaque(true);
        board_panel.add(jLabel90);

        jLabel91.setBackground(new java.awt.Color(255, 255, 0));
        jLabel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel91.setOpaque(true);
        board_panel.add(jLabel91);
        board_panel.add(jLabel92);
        board_panel.add(jLabel93);

        jLabel94.setBackground(new java.awt.Color(255, 0, 0));
        jLabel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel94.setOpaque(true);
        board_panel.add(jLabel94);
        board_panel.add(jLabel95);

        jLabel96.setBackground(new java.awt.Color(255, 153, 0));
        jLabel96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel96.setOpaque(true);
        board_panel.add(jLabel96);
        board_panel.add(jLabel97);
        board_panel.add(jLabel98);
        board_panel.add(jLabel99);
        board_panel.add(jLabel100);

        jLabel101.setBackground(new java.awt.Color(255, 0, 0));
        jLabel101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel101.setOpaque(true);
        board_panel.add(jLabel101);
        board_panel.add(jLabel102);
        board_panel.add(jLabel103);

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
        board_panel.add(jLabel105);

        jLabel106.setBackground(new java.awt.Color(0, 255, 0));
        jLabel106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel106.setOpaque(true);
        board_panel.add(jLabel106);

        jLabel107.setBackground(new java.awt.Color(255, 0, 0));
        jLabel107.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel107.setOpaque(true);
        board_panel.add(jLabel107);

        jLabel108.setBackground(new java.awt.Color(255, 255, 0));
        jLabel108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel108.setOpaque(true);
        board_panel.add(jLabel108);

        jLabel109.setBackground(new java.awt.Color(0, 0, 255));
        jLabel109.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel109.setOpaque(true);
        board_panel.add(jLabel109);

        jLabel110.setBackground(new java.awt.Color(0, 255, 0));
        jLabel110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel110.setOpaque(true);
        board_panel.add(jLabel110);

        jLabel111.setBackground(new java.awt.Color(255, 153, 0));
        jLabel111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel111.setOpaque(true);
        board_panel.add(jLabel111);
        board_panel.add(jLabel112);
        board_panel.add(jLabel113);
        board_panel.add(jLabel114);
        board_panel.add(jLabel115);
        board_panel.add(jLabel116);
        board_panel.add(jLabel117);
        board_panel.add(jLabel118);
        board_panel.add(jLabel119);
        board_panel.add(jLabel120);
        board_panel.add(jLabel121);
        board_panel.add(jLabel122);

        game_container_panel.add(board_panel);

        non_board_panel.setPreferredSize(new java.awt.Dimension(250, 620));

        cards_panel.setPreferredSize(new java.awt.Dimension(250, 310));

        javax.swing.GroupLayout cards_panelLayout = new javax.swing.GroupLayout(cards_panel);
        cards_panel.setLayout(cards_panelLayout);
        cards_panelLayout.setHorizontalGroup(
            cards_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        cards_panelLayout.setVerticalGroup(
            cards_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        non_board_panel.add(cards_panel);

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
    private javax.swing.JPanel cards_panel;
    private javax.swing.JPanel game_container_panel;
    private javax.swing.JLabel header_label;
    private javax.swing.JPanel instructions_panel;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel non_board_panel;
}
