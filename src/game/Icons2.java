package game;

import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Icons2 extends javax.swing.JFrame {

    public static int contador2 = 0;

    public static int temp = 0;

    public Icons2() {
        initComponents();
        this.getContentPane().setBackground(Color.black);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        lblTwo = new javax.swing.JLabel();
        What = new javax.swing.JLabel();
        FIREWORKS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TNT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BUTERFLY = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CROCODILE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LICUADORA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SPHYNX = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SPACESHIP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        HELICOPTER = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TTELESCOPE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TARACHNIDO = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SCROCODILE = new javax.swing.JButton();
        STNT = new javax.swing.JButton();
        SBUTERFLY = new javax.swing.JButton();
        SBATI = new javax.swing.JButton();
        SSPHYNX = new javax.swing.JButton();
        SSPACESHIP = new javax.swing.JButton();
        SHELICOPTER = new javax.swing.JButton();
        TELESCOPE = new javax.swing.JButton();
        SARACNIDO = new javax.swing.JButton();
        SFIREWORK = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        lblTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/tumblr_nhhaeev5H21rrtbujo1_500.gif")));
        What.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/those.gif")));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/tnt.gif")));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/animated-telescope-image-0013.gif")));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/helikopter_0024.gif")));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/rocket_3.gif")));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/E-Gold-1.gif")));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/butterfly-animated.gif")));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/batidora02.gif")));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/Aracnidos-06.gif")));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/150_snappingnilecrocodile.gif")));
        TARACHNIDO.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TARACHNIDOActionPerformed(evt);
            }
        });
        jButton1.setText("Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setText("Return to Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.setText("Finish Level");
        jButton3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        SCROCODILE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        SCROCODILE.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCROCODILEActionPerformed(evt);
            }
        });
        STNT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        STNT.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STNTActionPerformed(evt);
            }
        });
        SBUTERFLY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        SBUTERFLY.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBUTERFLYActionPerformed(evt);
            }
        });
        SBATI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        SBATI.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBATIActionPerformed(evt);
            }
        });
        SSPHYNX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        SSPHYNX.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSPHYNXActionPerformed(evt);
            }
        });
        SSPACESHIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        SSPACESHIP.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSPACESHIPActionPerformed(evt);
            }
        });
        SHELICOPTER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        SHELICOPTER.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHELICOPTERActionPerformed(evt);
            }
        });
        TELESCOPE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        TELESCOPE.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TELESCOPEActionPerformed(evt);
            }
        });
        SARACNIDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        SARACNIDO.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SARACNIDOActionPerformed(evt);
            }
        });
        SFIREWORK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png")));
        SFIREWORK.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SFIREWORKActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lblTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addGap(167, 167, 167).addComponent(SFIREWORK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(FIREWORKS, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(STNT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(TNT)).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(8, 8, 8)).addGroup(layout.createSequentialGroup().addComponent(SSPACESHIP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(SPACESHIP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(SBATI, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(LICUADORA, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addComponent(SBUTERFLY, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(BUTERFLY, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel6).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton1).addGroup(layout.createSequentialGroup().addComponent(SSPHYNX, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(SPHYNX, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(10, 10, 10))).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3).addGroup(layout.createSequentialGroup().addComponent(SHELICOPTER, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(HELICOPTER, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))).addGroup(layout.createSequentialGroup().addComponent(What, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jButton2).addGap(12, 12, 12))).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel8).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(SCROCODILE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(CROCODILE, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jLabel9)))).addGroup(layout.createSequentialGroup().addGap(31, 31, 31).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(SARACNIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(TARACHNIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addComponent(TELESCOPE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton3).addComponent(TTELESCOPE, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))).addGroup(layout.createSequentialGroup().addGap(888, 888, 888).addComponent(jLabel2)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(lblTwo).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(SFIREWORK, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(FIREWORKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(What, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(SCROCODILE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(STNT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(TNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(SBUTERFLY, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(BUTERFLY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(CROCODILE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(40, 40, 40).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4).addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(SSPACESHIP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(SPACESHIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(SBATI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(LICUADORA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(layout.createSequentialGroup().addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(SARACNIDO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(TARACHNIDO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(56, 56, 56).addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGap(73, 73, 73).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(SSPHYNX, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(HELICOPTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(TTELESCOPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(TELESCOPE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(64, 64, 64).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton3).addComponent(jButton2).addComponent(jButton1))).addComponent(SHELICOPTER, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(SPHYNX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(361, Short.MAX_VALUE)));
        pack();
    }

    private void TARACHNIDOActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "What Are Thooose\nA mini game where you have to name the game shown\nplease write in minus");
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int contador2 = 0;
        int temp = 0;
        String one, two, three, four, five, six, seven, eight, nine, ten;
        one = TNT.getText();
        TNT.setText("");
        two = BUTERFLY.getText();
        BUTERFLY.setText("");
        three = CROCODILE.getText();
        CROCODILE.setText("");
        four = LICUADORA.getText();
        LICUADORA.setText("");
        five = SPHYNX.getText();
        SPHYNX.setText("");
        six = SPACESHIP.getText();
        SPACESHIP.setText("");
        seven = HELICOPTER.getText();
        HELICOPTER.setText("");
        eight = TTELESCOPE.getText();
        TTELESCOPE.setText("");
        nine = TARACHNIDO.getText();
        TARACHNIDO.setText("");
        ten = FIREWORKS.getText();
        FIREWORKS.setText("");
        if (one.equals("dinamite")) {
            contador2 = contador2 + 10;
            temp++;
        }
        if (two.equals("butterfly")) {
            contador2 = contador2 + 10;
            temp++;
        }
        if (three.equals("crocodile")) {
            contador2 = contador2 + 10;
            temp++;
        }
        if (four.equals("blender")) {
            contador2 = contador2 + 10;
            temp++;
        }
        if (five.equals("sphinx")) {
            contador2 = contador2 + 10;
            temp++;
        }
        if (six.equals("spaceship")) {
            contador2 = contador2 + 10;
            temp++;
        }
        if (seven.equals("helicopter")) {
            contador2 = contador2 + 10;
            temp++;
        }
        if (eight.equals("telescope")) {
            contador2 = contador2 + 10;
            temp++;
        }
        if (nine.equals("arachnid")) {
            contador2 = contador2 + 10;
            temp++;
        }
        if (ten.equals("fireworks")) {
            contador2 = contador2 + 10;
            temp++;
        }
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Descargar_MP3.wav"));
        sonido.play();
        GameMain.puntaje=GameMain.puntaje+contador2;
        New.registro.modificarNivel(New.player.getUsuario(),Integer.toString(GameMain.puntaje));
        int des = JOptionPane.showConfirmDialog(null, "Your Score: " + contador2 + "\nResults " + temp + "/10\nWould you like to retry");
        if (des == 0) {
            Icons2 obj = new Icons2();
            obj.setVisible(true);
            this.setVisible(false);
            sonido.stop();
        } else {
            Icon toca = new ImageIcon(getClass().getResource("/game/0.png"));
            JOptionPane.showMessageDialog(null, "", "Next Level", JOptionPane.INFORMATION_MESSAGE, toca);
            Hangman2 XYZ = new Hangman2();
            XYZ.setVisible(true);
            this.setVisible(false);
            sonido.stop();
        }
    }

    private void SCROCODILEActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/crocodile.wav"));
        sonido.play();
    }

    private void STNTActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/dynamite.wav"));
        sonido.play();
    }

    private void SBUTERFLYActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/butterfly.wav"));
        sonido.play();
    }

    private void SBATIActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/blender.wav"));
        sonido.play();
    }

    private void SSPHYNXActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/sphinx.wav"));
        sonido.play();
    }

    private void SSPACESHIPActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/spaceship.wav"));
        sonido.play();
    }

    private void SHELICOPTERActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/helicopter.wav"));
        sonido.play();
    }

    private void TELESCOPEActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/telescope.wav"));
        sonido.play();
    }

    private void SARACNIDOActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/arachnid.wav"));
        sonido.play();
    }

    private void SFIREWORKActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/fireworks.wav"));
        sonido.play();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int opc = JOptionPane.showConfirmDialog(null, "Are you Sure!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        if (opc == 0) {
            GameMain game = new GameMain();
            game.setVisible(true);
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
            java.util.logging.Logger.getLogger(Icons2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Icons2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Icons2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Icons2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Icons2().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField BUTERFLY;

    private javax.swing.JTextField CROCODILE;

    private javax.swing.JTextField FIREWORKS;

    private javax.swing.JTextField HELICOPTER;

    private javax.swing.JTextField LICUADORA;

    private javax.swing.JButton SARACNIDO;

    private javax.swing.JButton SBATI;

    private javax.swing.JButton SBUTERFLY;

    private javax.swing.JButton SCROCODILE;

    private javax.swing.JButton SFIREWORK;

    private javax.swing.JButton SHELICOPTER;

    private javax.swing.JTextField SPACESHIP;

    private javax.swing.JTextField SPHYNX;

    private javax.swing.JButton SSPACESHIP;

    private javax.swing.JButton SSPHYNX;

    private javax.swing.JButton STNT;

    private javax.swing.JTextField TARACHNIDO;

    private javax.swing.JButton TELESCOPE;

    private javax.swing.JTextField TNT;

    private javax.swing.JTextField TTELESCOPE;

    private javax.swing.JLabel What;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton3;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;

    private javax.swing.JLabel jLabel9;

    private javax.swing.JLabel lblTwo;

    
}
