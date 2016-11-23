package game;

import java.applet.AudioClip;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

public class Hangman extends JFrame implements ActionListener, WindowListener {

    Connection cn;

    AudioClip sonido;

    private static final long serialVersionUID = 1L;

    String[] palabras = {"BEE", "CROCODILE", "KOALA", "BEAR", "CAT", "SPIDER", "EAGLE", "FALCON", "FISH", "SHARK", "DOLPHIN", "DOG", "KRAB", "SQUID", "SQUIRREL", "PANTER", "TUCAN", "HYPO", "SCORPION", "TIGER", "PANDA", "HORSE", "DONKEY", "SEAL"};

    JLabel[] label = new JLabel[6];

    int score2 = 100;

    char[] palabra_secreta = null;

    char[] cad_palabra = null;

    JComboBox combo = null;

    JButton aceptar = null;

    JButton info = null;

    JButton MM = null;

    int fallos = 0;

    boolean coinciden = false;

    String cad_intentos = "";

    public Hangman() {
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Veigar_Margeirsson_-_Road_to_Victory.wav"));
        sonido.play();
        this.setLayout(null);
        this.setSize(500, 400);
        this.setTitle("Hangman");
        label[0] = new JLabel();
        label[0].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        label[0].setHorizontalAlignment(JLabel.CENTER);
        TitledBorder tb = new TitledBorder("Words:");
        label[0].setBorder(tb);
        label[0].setBounds(10, 10, 210, 60);
        this.add(label[0]);
        label[1] = new JLabel();
        label[1].setHorizontalAlignment(JLabel.CENTER);
        tb = new TitledBorder("Attemphts:");
        label[1].setBorder(tb);
        label[1].setBounds(10, 10 + 60, 210, 60);
        this.add(label[1]);
        label[2] = new JLabel();
        label[2].setHorizontalAlignment(JLabel.CENTER);
        tb = new TitledBorder("Letters:");
        label[2].setBorder(tb);
        label[2].setBounds(10, 10 + 60 * 2, 210, 60);
        this.add(label[2]);
        label[3] = new JLabel();
        label[3].setHorizontalAlignment(JLabel.LEFT);
        label[3].setText("Press Accept");
        tb = new TitledBorder("Messages:");
        label[3].setBorder(tb);
        label[3].setBounds(10, 10 + 60 * 3, 210, 60);
        this.add(label[3]);
        label[5] = new JLabel();
        label[5].setHorizontalAlignment(JLabel.LEFT);
        Icon lose = new ImageIcon(getClass().getResource("/game/loser.jpg"));
        label[5].setIcon(lose);
        tb = new TitledBorder("Failures:");
        label[5].setBorder(tb);
        label[5].setBounds(10, 20 + 60 * 4, 270, 65);
        this.add(label[5]);
        label[4] = new JLabel();
        label[4].setHorizontalAlignment(JLabel.RIGHT);
        Icon icon = new ImageIcon(getClass().getResource("/game/0.png"));
        label[4].setIcon(icon);
        label[4].setBounds(225, 5, 250, 260);
        this.add(label[4]);
        String[] list = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        combo = new JComboBox(list);
        combo.setBounds(30, 155, 40, 20);
        this.add(combo);
        aceptar = new JButton("Accept");
        aceptar.addActionListener(this);
        aceptar.setBounds(100, 155, 80, 21);
        this.add(aceptar);
        seleccionarPalabra();
        info = new JButton("info");
        info.addActionListener(this);
        info.setBounds(415, 295, 60, 21);
        this.add(info);
        MM = new JButton("Return to Main Menu");
        MM.addActionListener(this);
        MM.setBounds(325, 30 + 60 * 4, 150, 21);
        this.add(MM);
    }

    private void seleccionarPalabra() {
        int pos = (int) (Math.random() * palabras.length);
        palabra_secreta = palabras[pos].toCharArray();
        cad_palabra = new char[palabra_secreta.length];
        for (int i = 0; i < palabra_secreta.length; i++) {
            cad_palabra[i] = '-';
        }
        label[0].setText(String.valueOf(cad_palabra));
    }

    private void procesarLetra() {
        String letra_seleccionada = null;
        letra_seleccionada = (String) combo.getSelectedItem();
        label[3].setText(letra_seleccionada);
        if (letraRepetida(letra_seleccionada.charAt(0)) == true) {
            label[3].setText("Repeat Please...");
        } else {
            cad_intentos = cad_intentos + letra_seleccionada;
            label[1].setText(cad_intentos);
            boolean intento_fallido = true;
            for (int i = 0; i < palabra_secreta.length; i++) {
                if (letra_seleccionada.charAt(0) == palabra_secreta[i]) {
                    intento_fallido = false;
                    cad_palabra[i] = palabra_secreta[i];
                    label[0].setText(String.valueOf(cad_palabra));
                }
            }
            if (intento_fallido == true) {
                fallos++;
                switch (fallos) {
                    case 1:
                        Icon m = new ImageIcon(getClass().getResource("/game/1.png"));
                        Icon Synchro = new ImageIcon(getClass().getResource("/game/loser1.jpg"));
                        label[4].setIcon(m);
                        label[5].setIcon(Synchro);
                        score2 = score2 - 10;
                        break;
                    case 2:
                        Icon o = new ImageIcon(getClass().getResource("/game/2.png"));
                        Icon Starve = new ImageIcon(getClass().getResource("/game/loser2.jpg"));
                        label[4].setIcon(o);
                        label[5].setIcon(Starve);
                        score2 = score2 - 10;
                        break;
                    case 3:
                        Icon p = new ImageIcon(getClass().getResource("/game/3.png"));
                        Icon Venom = new ImageIcon(getClass().getResource("/game/loser3.jpg"));
                        label[4].setIcon(p);
                        label[5].setIcon(Venom);
                        score2 = score2 - 20;
                        break;
                    case 4:
                        Icon q = new ImageIcon(getClass().getResource("/game/4.png"));
                        Icon Yugo = new ImageIcon(getClass().getResource("/game/loser4.jpg"));
                        label[4].setIcon(q);
                        label[5].setIcon(Yugo);
                        score2 = score2 - 20;
                        break;
                    case 5:
                        Icon r = new ImageIcon(getClass().getResource("/game/5.png"));
                        Icon Dragon = new ImageIcon(getClass().getResource("/game/loser5.jpg"));
                        label[4].setIcon(r);
                        label[5].setIcon(Dragon);
                        score2 = score2 - 20;
                        break;
                }
            }
            if (String.valueOf(palabra_secreta).equals(String.valueOf(cad_palabra))) {
                Icon winner = new ImageIcon(getClass().getResource("/game/trophy.gif"));
                GameMain.puntaje = GameMain.puntaje + score2;
                JOptionPane.showMessageDialog(null, "", "You Win"+GameMain.puntaje, JOptionPane.INFORMATION_MESSAGE, winner);
                New.registro.modificarNivel(New.player.getUsuario(),Integer.toString(GameMain.puntaje));
                int des = JOptionPane.showConfirmDialog(null, "The game is finally over" + "Your score is " + score2 + " \ndo you wanna " + "retry the last level?");
                coinciden = true;
                label[03].setText("¡¡¡Correct!!!");
                aceptar.setEnabled(false);
                if (des == 0) {
                     GameMain.puntaje = GameMain.puntaje -score2;
                     New.registro.modificarNivel(New.player.getUsuario(),Integer.toString(GameMain.puntaje));
                    Hangman crew = new Hangman();
                    crew.setVisible(true);
                    this.setVisible(false);
                    
                } else {
                    //int a = Icons.contador + Hangman4.score5 + Icons2.contador2 + Hangman3.score4 + Sounds.contador4 + Hangman2.score3 + Sound2.contador3 + score2;
                    
                   // String cal = Integer.toString(a);
                    sonido.stop();
                    Score res = new Score();
                    res.setVisible(true);
                    this.setVisible(false);
                    
//                    try {
//                        PreparedStatement pps = cn.prepareStatement("UPDATE datos SET Score='" + cal +
//                                 "' WHERE name='" + GameMain.user + "'");
//                        pps.setString(1, "");
//                        pps.setString(2, cal);
//                        pps.executeUpdate();
//                    } catch (SQLException ex) {
//                        Logger.getLogger(New.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                    
                }
            } else if (fallos == 6) {
                Icon n = new ImageIcon(getClass().getResource("/game/6.gif"));
                Icon Fusion = new ImageIcon(getClass().getResource("/game/loser6.jpg"));
                label[4].setIcon(n);
                label[03].setText("You Lose...");
                label[5].setIcon(Fusion);
                score2 = score2 - 20;
                aceptar.setEnabled(false);
                sonido.stop();
            }
        }
    }

    private boolean letraRepetida(char l) {
        for (int i = 0; i < cad_intentos.length(); i++) {
            if (l == cad_intentos.toCharArray()[i]) {
                return true;
            }
        }
        return false;
    }

    private void reiniciarJuego() {
        if (aceptar.isEnabled() == false) {
            aceptar.setEnabled(true);
        }
        fallos = 0;
        coinciden = false;
        cad_intentos = "";
        palabra_secreta = null;
        cad_palabra = null;
        label[0].setText(null);
        label[1].setText(null);
        label[3].setText("Press Accept");
        seleccionarPalabra();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object control = e.getSource();
        if (control instanceof JButton) {
            String etiqueta_control = e.getActionCommand();
            if (etiqueta_control.equals("Accept")) {
                if ((coinciden == false) && (fallos < 6)) {
                    procesarLetra();
                }
            }
        }
        if (control instanceof JButton) {
            String etiqueta_control = e.getActionCommand();
            if (etiqueta_control.equals("info")) {
                JOptionPane.showMessageDialog(null, "This is the last Level you must choice one letter" + "from the opcions until you found the entire secret word\n" + "otherwise you will lose, you cant se this twice, luck");
                if (String.valueOf(palabra_secreta).equals("BEE")) {
                    JOptionPane.showMessageDialog(null, "Tiny, Yellow and Black");
                } else if (String.valueOf(palabra_secreta).equals("CROCODILE")) {
                    JOptionPane.showMessageDialog(null, "Large, Green and have a big mouth");
                } else if (String.valueOf(palabra_secreta).equals("KOALA")) {
                    JOptionPane.showMessageDialog(null, "Small, Gray and Lives in the trees");
                } else if (String.valueOf(palabra_secreta).equals("BEAR")) {
                    JOptionPane.showMessageDialog(null, "Big, Brown or Black, Lives in the forest or mountains");
                } else if (String.valueOf(palabra_secreta).equals("CAT")) {
                    JOptionPane.showMessageDialog(null, "Small and Domestic");
                } else if (String.valueOf(palabra_secreta).equals("EAGLE")) {
                    JOptionPane.showMessageDialog(null, "Medium, Fly and its a Symbol for many nations");
                } else if (String.valueOf(palabra_secreta).equals("SPIDER")) {
                    JOptionPane.showMessageDialog(null, "Tiny, 8 feets and eats fly's");
                } else if (String.valueOf(palabra_secreta).equals("FALCON")) {
                    JOptionPane.showMessageDialog(null, "Small, Faster than other animals, eats tiny-small animals");
                } else if (String.valueOf(palabra_secreta).equals("FISH")) {
                    JOptionPane.showMessageDialog(null, "Small, Lives in the water, ussualy its considerated as food");
                } else if (String.valueOf(palabra_secreta).equals("SHARK")) {
                    JOptionPane.showMessageDialog(null, "Large, Scariest Monster in the ocean");
                } else if (String.valueOf(palabra_secreta).equals("DOLPHIN")) {
                    JOptionPane.showMessageDialog(null, "Large, Smartest animal on the water");
                } else if (String.valueOf(palabra_secreta).equals("DOG")) {
                    JOptionPane.showMessageDialog(null, "Small or big, domestic");
                } else if (String.valueOf(palabra_secreta).equals("KRAB")) {
                    JOptionPane.showMessageDialog(null, "Small, Red or Orange, has Pincers");
                } else if (String.valueOf(palabra_secreta).equals("SQUID")) {
                    JOptionPane.showMessageDialog(null, "Large, Has tentacles");
                } else if (String.valueOf(palabra_secreta).equals("SQUIRREL")) {
                    JOptionPane.showMessageDialog(null, "Small, Brown, ussualy eats Nuts");
                } else if (String.valueOf(palabra_secreta).equals("PANTER")) {
                    JOptionPane.showMessageDialog(null, "Medium, Black its carnivore");
                } else if (String.valueOf(palabra_secreta).equals("TUCAN")) {
                    JOptionPane.showMessageDialog(null, "Small, Black, his peak has many colours, can fly");
                } else if (String.valueOf(palabra_secreta).equals("HYPO")) {
                    JOptionPane.showMessageDialog(null, "Big, One of the most heaviest animals in earth and water");
                } else if (String.valueOf(palabra_secreta).equals("SCORPION")) {
                    JOptionPane.showMessageDialog(null, "Small, Black, very dangerous has a sting");
                } else if (String.valueOf(palabra_secreta).equals("TIGER")) {
                    JOptionPane.showMessageDialog(null, "Big, Orange, White and Black, one of the more beautiful animals in the world");
                } else if (String.valueOf(palabra_secreta).equals("PANDA")) {
                    JOptionPane.showMessageDialog(null, "Big, White and Black, Lives on China Forests");
                } else if (String.valueOf(palabra_secreta).equals("HORSE")) {
                    JOptionPane.showMessageDialog(null, "Big, Domestical, Can transport people");
                } else if (String.valueOf(palabra_secreta).equals("DONKEY")) {
                    JOptionPane.showMessageDialog(null, "Big, Domestical, Can transport people");
                } else if (String.valueOf(palabra_secreta).equals("SEAL")) {
                    JOptionPane.showMessageDialog(null, "Medium, Gray, lives on the atlantic ocean");
                }
                info.setEnabled(false);
            }
        }
        if (control instanceof JButton) {
            String etiqueta_control = e.getActionCommand();
            if (etiqueta_control.equals("Return to Main Menu")) {
                int des = JOptionPane.showConfirmDialog(null, "Are you sure!");
                if (des == 0) {
                    GameMain game = new GameMain();
                    game.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
    }

    @Override
    public void windowActivated(WindowEvent arg0) {
    }

    @Override
    public void windowClosed(WindowEvent arg0) {
    }

    @Override
    public void windowClosing(WindowEvent arg0) {
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
    }

    @Override
    public void windowIconified(WindowEvent arg0) {
    }

    @Override
    public void windowOpened(WindowEvent arg0) {
    }
}
