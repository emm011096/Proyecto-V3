package game;

import javax.swing.ImageIcon;
import java.io.*;
import sun.audio.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.applet.AudioClip;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Sounds extends javax.swing.JFrame {

    public static int contador4 = 0;

    public static int temp = 0;

    public Sounds() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        txtOne = new javax.swing.JTextField();
        txtTwo = new javax.swing.JTextField();
        txtThree = new javax.swing.JTextField();
        txtFour = new javax.swing.JTextField();
        txtFive = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnDiez = new javax.swing.JButton();
        txtNine = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtEight = new javax.swing.JTextField();
        txtSeven = new javax.swing.JTextField();
        txtSix = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/listen.gif")));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/listennow.png")));
        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette.png")));
        btnUno.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        btnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette2.png")));
        btnDos.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette3.png")));
        btnTres.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        btnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette4.png")));
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        btnCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette5.png")));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jButton6.setText("Info");
        jButton6.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton7.setText("Return to Main Menu");
        jButton7.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton8.setText("Finish Level");
        jButton8.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        btnSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette.png")));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette2.png")));
        jButton10.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        btnOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette3.png")));
        btnOcho.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        btnNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette4.png")));
        btnNueve.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        btnDiez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/cassette5.png")));
        btnDiez.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiezActionPerformed(evt);
            }
        });
        jLabel3.setText("Words: saxophone, flute, trumpet, guitar, drum, bass, violin, piano, bongos, harmonica ");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(51, 51, 51).addComponent(txtOne, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(91, 91, 91).addComponent(txtTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(88, 88, 88).addComponent(txtThree, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(51, 51, 51).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(57, 57, 57).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(67, 67, 67).addComponent(txtFour, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(47, 47, 47).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(txtFive, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))).addComponent(btnDiez, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jButton6).addGap(18, 18, 18).addComponent(jButton7).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton8)))).addGap(40, 40, 40)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(51, 51, 51).addComponent(txtSix, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(89, 89, 89).addComponent(txtSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(93, 93, 93).addComponent(txtEight, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(85, 85, 85).addComponent(txtNine, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE).addContainerGap()).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(59, 59, 59).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(btnUno).addComponent(btnDos)).addComponent(btnTres).addComponent(btnCuatro)).addComponent(btnCinco)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(37, 37, 37).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(btnNueve).addComponent(btnDiez).addComponent(btnOcho).addComponent(jButton10).addComponent(btnSeis)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton7).addComponent(jButton8).addComponent(jButton6).addComponent(jLabel3)).addGap(20, 20, 20)));
        pack();
    }

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Piano.wav"));
        sonido.play();
    }

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Violin.wav"));
        sonido.play();
    }

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Drum.wav"));
        sonido.play();
    }

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Bass.wav"));
        sonido.play();
    }

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Guitarra.wav"));
        sonido.play();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Listen Now\nA mini game where you have to name the instruments listened on every button\nplease write in minus");
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        int contador4 = 0;
        int temp = 0;
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
        if (one.equals("piano")) {
            contador4 = contador4 + 10;
            temp++;
        }
        if (two.equals("violin")) {
            contador4 = contador4 + 10;
            temp++;
        }
        if (three.equals("drum")) {
            contador4 = contador4 + 10;
            temp++;
        }
        if (four.equals("bass")) {
            contador4 = contador4 + 10;
            temp++;
        }
        if (five.equals("guitar")) {
            contador4 = contador4 + 10;
            temp++;
        }
        if (ten.equals("trumpet")) {
            contador4 = contador4 + 10;
            temp++;
        }
        if (six.equals("bongos")) {
            contador4 = contador4 + 10;
            temp++;
        }
        if (seven.equals("flute")) {
            contador4 = contador4 + 10;
            temp++;
        }
        if (eight.equals("harmonica")) {
            contador4 = contador4 + 10;
            temp++;
        }
        if (nine.equals("saxophone")) {
            contador4 = contador4 + 10;
            temp++;
        }
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Descargar_MP3.wav"));
        sonido.play();
        GameMain.puntaje=GameMain.puntaje+ contador4;
           New.registro.modificarNivel(New.player.getUsuario(),Integer.toString(GameMain.puntaje));
        int des = JOptionPane.showConfirmDialog(null, "Your Score: " + contador4 + "\nResults " + temp + "/10\nWould you like to retry");
        if (des == 0) {
            Sounds obj = new Sounds();
            obj.setVisible(true);
            this.setVisible(false);
            sonido.stop();
        } else {
            Icon toca = new ImageIcon(getClass().getResource("/game/0.png"));
            JOptionPane.showMessageDialog(null, "", "Next Level", JOptionPane.INFORMATION_MESSAGE, toca);
            sonido.stop();
            Hangman3 imagesi = new Hangman3();
            imagesi.setVisible(true);
            this.setVisible(false);
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        GameMain game = new GameMain();
        game.setVisible(true);
        this.setVisible(false);
    }

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/bongos.aif"));
        sonido.play();
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/flute.wav"));
        sonido.play();
    }

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/harmonica.wav"));
        sonido.play();
    }

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/saxo.wav"));
        sonido.play();
    }

    private void btnDiezActionPerformed(java.awt.event.ActionEvent evt) {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/trumpet.wav"));
        sonido.play();
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
            java.util.logging.Logger.getLogger(Sounds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sounds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sounds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sounds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Sounds().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCinco;

    private javax.swing.JButton btnCuatro;

    private javax.swing.JButton btnDiez;

    private javax.swing.JButton btnDos;

    private javax.swing.JButton btnNueve;

    private javax.swing.JButton btnOcho;

    public static javax.swing.JButton btnSeis;

    private javax.swing.JButton btnTres;

    public static javax.swing.JButton btnUno;

    private javax.swing.JButton jButton10;

    private javax.swing.JButton jButton6;

    private javax.swing.JButton jButton7;

    private javax.swing.JButton jButton8;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

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

    public static javax.swing.JButton jButton1;

    private javax.swing.JButton jButton11;

    private javax.swing.JButton jButton12;

    private javax.swing.JButton jButton13;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton3;

    private javax.swing.JButton jButton4;

    private javax.swing.JButton jButton5;

    public static javax.swing.JButton jButton9;

   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
    }
}
