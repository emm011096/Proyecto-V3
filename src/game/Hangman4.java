package game;

import java.applet.AudioClip;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

public class Hangman4 extends JFrame implements ActionListener, WindowListener {

    AudioClip sonido;

    private static final long serialVersionUID = 1L;

    String[] palabras = { "STAR", "SUN", "MOON", "MARS", "EARTH", "NEPTUNE", "PLUTO", "URANUS", "JUPITER", "SATURN", "SHOOTING", "BLACKHOLE", "UNIVERSE", "SPACESHIP", "BIGBANG", "UFO", "ASTRONAUT", "ORION", "ASTEROID", "COMET", "METEOR", "SKY", "ATMOSPHERE" };

    JLabel[] label = new JLabel[6];

    public static int score5 = 100;

    char[] palabra_secreta = null;

    char[] cad_palabra = null;

    JComboBox combo = null;

    JButton aceptar = null;

    JButton info = null;

    JButton MM = null;

    int fallos = 0;

    boolean coinciden = false;

    String cad_intentos = "";

    public Hangman4() {
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
        String[] list = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
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
                switch(fallos) {
                    case 1:
                        Icon m = new ImageIcon(getClass().getResource("/game/1.png"));
                        Icon Synchro = new ImageIcon(getClass().getResource("/game/loser1.jpg"));
                        label[4].setIcon(m);
                        label[5].setIcon(Synchro);
                        score5 = score5 - 10;
                        break;
                    case 2:
                        Icon o = new ImageIcon(getClass().getResource("/game/2.png"));
                        Icon Starve = new ImageIcon(getClass().getResource("/game/loser2.jpg"));
                        label[4].setIcon(o);
                        label[5].setIcon(Starve);
                        score5 = score5 - 10;
                        break;
                    case 3:
                        Icon p = new ImageIcon(getClass().getResource("/game/3.png"));
                        Icon Venom = new ImageIcon(getClass().getResource("/game/loser3.jpg"));
                        label[4].setIcon(p);
                        label[5].setIcon(Venom);
                        score5 = score5 - 20;
                        break;
                    case 4:
                        Icon q = new ImageIcon(getClass().getResource("/game/4.png"));
                        Icon Yugo = new ImageIcon(getClass().getResource("/game/loser4.jpg"));
                        label[4].setIcon(q);
                        label[5].setIcon(Yugo);
                        score5 = score5 - 20;
                        break;
                    case 5:
                        Icon r = new ImageIcon(getClass().getResource("/game/5.png"));
                        Icon Dragon = new ImageIcon(getClass().getResource("/game/loser5.jpg"));
                        label[4].setIcon(r);
                        label[5].setIcon(Dragon);
                        score5 = score5 - 20;
                        break;
                }
            }
            if (String.valueOf(palabra_secreta).equals(String.valueOf(cad_palabra))) {
                Icon winner = new ImageIcon(getClass().getResource("/game/tocadiscos.gif"));
                GameMain.puntaje=GameMain.puntaje+score5;
                New.registro.modificarNivel(New.player.getUsuario(),Integer.toString(GameMain.puntaje));
                int des = JOptionPane.showConfirmDialog(null, "The game is finally over" + "Your score5 is " + score5 + " \ndo you wanna " + "retry the last level?");
                coinciden = true;
                label[03].setText("¡¡¡Correct!!!");
                aceptar.setEnabled(false);
                if (des == 0) {
                    Hangman4 crew = new Hangman4();
                    crew.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "", "Next", JOptionPane.INFORMATION_MESSAGE, winner);
                    sonido.stop();
                    Sounds game = new Sounds();
                    game.setVisible(true);
                    this.setVisible(false);
                }
            } else if (fallos == 6) {
                Icon n = new ImageIcon(getClass().getResource("/game/6.gif"));
                Icon Fusion = new ImageIcon(getClass().getResource("/game/loser6.jpg"));
                label[4].setIcon(n);
                label[03].setText("You Lose...");
                label[5].setIcon(Fusion);
                score5 = score5 - 20;
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
                JOptionPane.showMessageDialog(null, "This is the Hangman Level you must choice one letter" + "from the opcions until you found the entire secret word\n" + "otherwise you will lose, you cant see this twice, luck,\nCategory: Space");
                if (String.valueOf(palabra_secreta).equals("STAR")) {
                    JOptionPane.showMessageDialog(null, "A celestial object millions of light years away");
                } else if (String.valueOf(palabra_secreta).equals("SUN")) {
                    JOptionPane.showMessageDialog(null, "A celestial object, brings light");
                } else if (String.valueOf(palabra_secreta).equals("MOON")) {
                    JOptionPane.showMessageDialog(null, "Natural satellite");
                } else if (String.valueOf(palabra_secreta).equals("MARS")) {
                    JOptionPane.showMessageDialog(null, "Red Planet");
                } else if (String.valueOf(palabra_secreta).equals("EARTH")) {
                    JOptionPane.showMessageDialog(null, "Where we are living");
                } else if (String.valueOf(palabra_secreta).equals("NEPTUNE")) {
                    JOptionPane.showMessageDialog(null, "Blue planet far away from ours, 8th Planet");
                } else if (String.valueOf(palabra_secreta).equals("PLUTO")) {
                    JOptionPane.showMessageDialog(null, "The Last planet of Solar System");
                } else if (String.valueOf(palabra_secreta).equals("URANUS")) {
                    JOptionPane.showMessageDialog(null, "Blue planet far away from ours, 7th Planet");
                } else if (String.valueOf(palabra_secreta).equals("JUPITER")) {
                    JOptionPane.showMessageDialog(null, "Bigger than other planets on Solar System");
                } else if (String.valueOf(palabra_secreta).equals("SATURN")) {
                    JOptionPane.showMessageDialog(null, "Has a pair of rings in orbit");
                } else if (String.valueOf(palabra_secreta).equals("SHOOTING")) {
                    JOptionPane.showMessageDialog(null, "When a star is falling");
                } else if (String.valueOf(palabra_secreta).equals("BLACKHOLE")) {
                    JOptionPane.showMessageDialog(null, "Holds the solar system");
                } else if (String.valueOf(palabra_secreta).equals("UNIVERSE")) {
                    JOptionPane.showMessageDialog(null, "Where are all stars");
                } else if (String.valueOf(palabra_secreta).equals("SPACESHIP")) {
                    JOptionPane.showMessageDialog(null, "Humans use this object to go out of the planet");
                } else if (String.valueOf(palabra_secreta).equals("BIGBANG")) {
                    JOptionPane.showMessageDialog(null, "Exploit that created the universe");
                } else if (String.valueOf(palabra_secreta).equals("UFO")) {
                    JOptionPane.showMessageDialog(null, "Flying object unknown");
                } else if (String.valueOf(palabra_secreta).equals("ASTRONAUT")) {
                    JOptionPane.showMessageDialog(null, "People how leave the planet in special outfits");
                } else if (String.valueOf(palabra_secreta).equals("ORION")) {
                    JOptionPane.showMessageDialog(null, "An asteroid belt indicating the end of the milky way");
                } else if (String.valueOf(palabra_secreta).equals("ASTEROID")) {
                    JOptionPane.showMessageDialog(null, "A Big rock flying throught the space");
                } else if (String.valueOf(palabra_secreta).equals("COMET")) {
                    JOptionPane.showMessageDialog(null, "A Big rock flying throught the space at extreme speed");
                } else if (String.valueOf(palabra_secreta).equals("METEOR")) {
                    JOptionPane.showMessageDialog(null, "Big rock, those hit planets");
                } else if (String.valueOf(palabra_secreta).equals("SKY")) {
                    JOptionPane.showMessageDialog(null, "The view we have of space");
                } else if (String.valueOf(palabra_secreta).equals("ATMOSPHERE")) {
                    JOptionPane.showMessageDialog(null, "Protect us from solar radiation");
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
