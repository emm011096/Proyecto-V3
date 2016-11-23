package game;

import static game.GameMain.sonido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class New extends javax.swing.JFrame {
    public static ConsultasBD registro=new ConsultasBD();
    public static user player;
    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();

    public New() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnPlay = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.SystemColor.controlShadow);
        setUndecorated(true);
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("NEW PLAYER");
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel2.setText(" Enter your name to start the game");
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel3.setText("NAME:");
        btnPlay.setBackground(new java.awt.Color(51, 255, 51));
        btnPlay.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        btnPlay.setText("PLAY");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(125, 125, 125).addComponent(jLabel1)).addGroup(layout.createSequentialGroup().addGap(49, 49, 49).addComponent(jLabel3).addGap(26, 26, 26).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGroup(layout.createSequentialGroup().addGap(26, 26, 26).addComponent(jLabel2))).addContainerGap(46, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(25, 25, 25).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2).addGap(29, 29, 29).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(25, Short.MAX_VALUE)));
        pack();
    }

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {
//        try {
//            PreparedStatement pps = cn.prepareStatement("INSERT INTO datos(Name,Score)VALUES (?,?)");
//            pps.setString(1, txtnombre.getText());
//            pps.setString(2, "0");
//            pps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Registered Name");
//            GameMain.user=txtnombre.getText();                
//        } catch (SQLException ex) {
//            Logger.getLogger(New.class.getName()).log(Level.SEVERE, null, ex);
//        }
        String nombre=txtnombre.getText();
        if(nombre.compareTo("")!=0){
            user var1=registro.buscarUser(nombre);
            if(var1!=null){
                user var2 = registro.buscarUser(nombre);
                player=var2;
                 Icons xyz = new Icons();
                xyz.setVisible(true);
                this.setVisible(false);
                sonido.stop();
                GameMain.puntaje=GameMain.puntaje+Integer.parseInt(player.getPuntaje());
            }
            else{
                System.out.println("No encontrado");
                registro.insertarUsuario(txtnombre.getText(),"0");
                user var2 = registro.buscarUser(nombre);
                player=var2;
                JOptionPane.showMessageDialog(null, "Registered Name");
                //New.registro.modificarNivel(New.player.getUsuario(),"29");
                
                Icons xyz = new Icons();
                xyz.setVisible(true);
                this.setVisible(false);
                sonido.stop();
                GameMain.puntaje=GameMain.puntaje+Integer.parseInt(player.getPuntaje());
            }
             
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
            java.util.logging.Logger.getLogger(New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new New().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnPlay;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JTextField txtnombre;

   
}
