package game;

import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Sound2 extends javax.swing.JFrame {

    public static int contador3 = 0;

    public static int temp = 0;

    public Sound2() {
        initComponents();
        this.getContentPane().setBackground(Color.black);
    }

    AudioClip sonido;

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOne = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFour = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTwo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtThree = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtFive = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtSix = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtSeven = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtEight = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtNine = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/changes.gif")));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/listen.png")));
        btnPlay.setBackground(new java.awt.Color(0, 0, 0));
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/play.png")));
        btnPlay.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        btnStop.setBackground(new java.awt.Color(0, 0, 0));
        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/stop.png")));
        btnStop.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Play");
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stop");
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("I'm hurting, baby, I'm");
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("down");
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("I need your loving, loving, I need it now");
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("When I'm without you, I'm ");
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("weak");
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("You got me begging, begging, I'm on my knees");
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("I don't wanna be needing your love");
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("I just wanna be deep in your love");
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("And it's");
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("me when you're away, ooh, baby, ");
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("'Cause I really don't care where you are");
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("I just ");
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("And I gotta get one little taste");
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" be there where you are");
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Your sugar, Yes, please");
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Won't you come and put it down on me?");
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("I'm right here, 'cause I need");
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Little love, a little sympathy");
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Yeah, you show me good loving, Make it");
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Need a little sweetness in my life, Your sugar");
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Yes, please Won't you come and put it down on me?");
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("My broken pieces, You pick them up");
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Don't leave me hanging, hanging");
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Come give me some, When I'm without ya, I'm so");
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("You are the one thing, one thing, I'm living for");
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("I don't wanna be needing your love, ");
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("And it's killing me when you're away, ooh, baby,");
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("I just wanna be deep in your love,");
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("I just wanna be there where you are And I gotta get one little");
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Your sugar Yes, please");
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Won't you come and put it down on me?");
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("I'm right here, 'Cause I need");
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Little love, a little");
        txtEight.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEightActionPerformed(evt);
            }
        });
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Yeah, you show me good loving Make it alright");
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Need a little ");
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Yes, please (yes, please) Won't you come and put it down on me?");
        txtNine.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNineActionPerformed(evt);
            }
        });
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("in my life Your sugar! (sugar!)");
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Yeah I want that red velvet I want that sugar sweet");
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Don't let nobody touch it Unless that somebody's me");
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("I gotta be your man There ain't no other way");
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("'Cause girl you're hotter than a southern");
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("day");
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("'Cause I really don't care where you are");
        btnInfo.setText("Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        btnReturn.setText("Return to Main Menu");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        btnFinish.setText("Finish Level");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel3).addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4))).addGroup(layout.createSequentialGroup().addComponent(jLabel5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(3, 3, 3).addComponent(jLabel7)).addGroup(layout.createSequentialGroup().addComponent(jLabel8).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtFour, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel9)).addComponent(jLabel10)))).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel48)).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel16).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtThree, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel18)).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel12).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11).addGap(55, 55, 55).addComponent(jLabel40).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtNine, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel42)).addGroup(layout.createSequentialGroup().addGap(4, 4, 4).addComponent(jLabel13).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel14).addGap(128, 128, 128).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel41).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel43).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel45).addComponent(jLabel44))).addGroup(layout.createSequentialGroup().addComponent(jLabel46).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel47)))).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel21).addComponent(jLabel20).addComponent(jLabel22).addGroup(layout.createSequentialGroup().addComponent(jLabel23).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtFive, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jLabel24).addComponent(jLabel25).addComponent(jLabel26).addComponent(jLabel27).addGroup(layout.createSequentialGroup().addComponent(jLabel28).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtSix, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jLabel29).addComponent(jLabel30).addComponent(jLabel32).addComponent(jLabel31).addComponent(jLabel15).addGroup(layout.createSequentialGroup().addComponent(jLabel34).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addComponent(jLabel35).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel36)).addComponent(jLabel37).addGroup(layout.createSequentialGroup().addComponent(jLabel38).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtEight, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jLabel39)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(43, 43, 43).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(26, 26, 26).addComponent(btnInfo).addGap(18, 18, 18).addComponent(btnReturn).addGap(37, 37, 37).addComponent(btnFinish)))))).addGroup(layout.createSequentialGroup().addGap(459, 459, 459).addComponent(jLabel17).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel19))).addContainerGap(333, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(28, 28, 28).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(btnPlay).addComponent(btnStop)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3).addComponent(jLabel4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(txtOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel7).addComponent(jLabel6)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(txtFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel9)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel12).addComponent(jLabel11).addComponent(jLabel40).addComponent(txtNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel42)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(1, 1, 1).addComponent(jLabel41).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel43).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel44).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel45).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel46).addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel47))).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(txtTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel14)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel48).addGap(12, 12, 12).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(txtThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel18)).addGap(1, 1, 1).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(jLabel19)).addGap(18, 18, 18).addComponent(jLabel20).addGap(1, 1, 1).addComponent(jLabel21).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel22).addGap(12, 12, 12).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel23).addComponent(txtFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel25).addGap(21, 21, 21).addComponent(jLabel26).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel27).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel28).addComponent(txtSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel29).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel30).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel32).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel31).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel15).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel34).addComponent(txtSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel35).addComponent(jLabel36)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel37).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel38).addComponent(txtEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btnInfo).addComponent(btnReturn).addComponent(btnFinish)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel39).addGap(139, 139, 139)))));
        pack();
    }

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Sugar.wav"));
        sonido.play();
    }

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {
        sonido.stop();
    }

    private void txtEightActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtNineActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Listen Now\nA mini game where you have to name the instruments listened on every button\nplease write in minus");
    }

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {
        sonido.stop();
        GameMain game = new GameMain();
        game.setVisible(true);
        this.setVisible(false);
    }

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {
        sonido.stop();
        contador3 = 0;
        temp = 0;
        String one, two, three, four, five, six, seven, eight, nine, ten;
        one = txtOne.getText();
        txtOne.setText("");
        two = txtTwo.getText();
        txtTwo.setText("");
        three = txtThree.getText();
        txtThree.setText("");
        four = txtFour.getText();
        txtFour.setText("");
        five = txtFive.getText();
        txtFive.setText("");
        six = txtSix.getText();
        txtSix.setText("");
        seven = txtSix.getText();
        txtSix.setText("");
        eight = txtEight.getText();
        txtEight.setText("");
        nine = txtNine.getText();
        txtNine.setText("");
        ten = txtTen.getText();
        txtTen.setText("");
        if (one.equals("broken")) {
            contador3 = contador3 + 10;
            temp++;
        }
        if (two.equals("killing")) {
            contador3 = contador3 + 10;
            temp++;
        }
        if (three.equals("wanna")) {
            contador3 = contador3 + 10;
            temp++;
        }
        if (four.equals("something")) {
            contador3 = contador3 + 10;
            temp++;
        }
        if (five.equals("alright")) {
            contador3 = contador3 + 10;
            temp++;
        }
        if (ten.equals("california")) {
            contador3 = contador3 + 10;
            temp++;
        }
        if (six.equals("insecure")) {
            contador3 = contador3 + 10;
            temp++;
        }
        if (seven.equals("taste")) {
            contador3 = contador3 + 10;
            temp++;
        }
        if (eight.equals("sympathy")) {
            contador3 = contador3 + 10;
            temp++;
        }
        if (nine.equals("sweetness")) {
            contador3 = contador3 + 10;
            temp++;
        }
        AudioClip victory;
        victory = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Descargar_MP3.wav"));
        victory.play();
        GameMain.puntaje=GameMain.puntaje+ contador3;
        New.registro.modificarNivel(New.player.getUsuario(),Integer.toString(GameMain.puntaje));
        int des = JOptionPane.showConfirmDialog(null, "Your Score: " + contador3 + "\nResults " + temp + "/10\nWould you like to retry");
        if (des == 0) {
            Hangman obj = new Hangman();
            obj.setVisible(true);
            this.setVisible(false);
            victory.stop();
        } else {
            victory.stop();
            Icon toca = new ImageIcon(getClass().getResource("/game/0.png"));
            JOptionPane.showMessageDialog(null, "", "Next Level", JOptionPane.INFORMATION_MESSAGE, toca);
            Hangman hangman = new Hangman();
            hangman.setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sound2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sound2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sound2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sound2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Sound2().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnFinish;

    private javax.swing.JButton btnInfo;

    private javax.swing.JButton btnPlay;

    private javax.swing.JButton btnReturn;

    private javax.swing.JButton btnStop;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel11;

    private javax.swing.JLabel jLabel12;

    private javax.swing.JLabel jLabel13;

    private javax.swing.JLabel jLabel14;

    private javax.swing.JLabel jLabel15;

    private javax.swing.JLabel jLabel16;

    private javax.swing.JLabel jLabel17;

    private javax.swing.JLabel jLabel18;

    private javax.swing.JLabel jLabel19;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel20;

    private javax.swing.JLabel jLabel21;

    private javax.swing.JLabel jLabel22;

    private javax.swing.JLabel jLabel23;

    private javax.swing.JLabel jLabel24;

    private javax.swing.JLabel jLabel25;

    private javax.swing.JLabel jLabel26;

    private javax.swing.JLabel jLabel27;

    private javax.swing.JLabel jLabel28;

    private javax.swing.JLabel jLabel29;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel30;

    private javax.swing.JLabel jLabel31;

    private javax.swing.JLabel jLabel32;

    private javax.swing.JLabel jLabel34;

    private javax.swing.JLabel jLabel35;

    private javax.swing.JLabel jLabel36;

    private javax.swing.JLabel jLabel37;

    private javax.swing.JLabel jLabel38;

    private javax.swing.JLabel jLabel39;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel40;

    private javax.swing.JLabel jLabel41;

    private javax.swing.JLabel jLabel42;

    private javax.swing.JLabel jLabel43;

    private javax.swing.JLabel jLabel44;

    private javax.swing.JLabel jLabel45;

    private javax.swing.JLabel jLabel46;

    private javax.swing.JLabel jLabel47;

    private javax.swing.JLabel jLabel48;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;

    private javax.swing.JLabel jLabel9;

    private javax.swing.JTextField txtEight;

    private javax.swing.JTextField txtFive;

    private javax.swing.JTextField txtFour;

    private javax.swing.JTextField txtNine;

    private javax.swing.JTextField txtOne;

    private javax.swing.JTextField txtSeven;

    private javax.swing.JTextField txtSix;

    private javax.swing.JTextField txtTen;

    private javax.swing.JTextField txtThree;

    private javax.swing.JTextField txtTwo;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton6;

    private javax.swing.JButton jButton7;

    private javax.swing.JButton jButton8;

   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
    }
}
