package game;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsultasBD {

    MySQLBD baseDatos = new MySQLBD().conectar("localhost", "jugadores", "root", "");

    public ArrayList<user> datos() {
        ArrayList<user> result = new ArrayList();
        ResultSet rs = baseDatos.consultar("SELECT * FROM datos");
        if (rs != null) {
            try {
                while (rs.next()) {
                    result.add(new user(rs.getString("Name"),
                    rs.getString("Score")));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

//    public ArrayList<IPersona> consultarUsuario() {
//        ArrayList<IPersona> result = new ArrayList();
//        ResultSet rs = baseDatos.consultar("SELECT * FROM usuarios");
//        if (rs != null) {
//            try {
//                while (rs.next()) {
//                    result.add(new Usuario(rs.getString("nombre"),
//                            rs.getString("apellido"),
//                            rs.getInt("edad"),
//                            rs.getString("nomUsuario"),
//                            rs.getString("password"),
//                            rs.getString("correo"),
//                            rs.getInt("nivel"),
//                            rs.getString("foto")));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return result;
//    }

  public user buscarUser(String bus) {
        user us = null;
        ResultSet rs = baseDatos.consultar("SELECT * FROM datos "
                + "where Name='" + bus + "'");
        if (rs != null) {
            try {
                while (rs.next()) {
                    us = new user(rs.getString("Name"),
                            rs.getString("Score")
                            );
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return us;
    }

    public void insertarUsuario(String name, String score) {
        if (baseDatos.ejecutar("INSERT INTO datos VALUES ('" + name + "','"
                + score + "')")) {
            System.out.println("Ejecucion Correcta");
        } else {
            System.out.println("Ocurrio un problema al insertar");
        }
    }

    public void modificarUsuario(String name, String score) {
        String sql = "UPDATE datos SET Name= '" + name + "', Score= '" + score
                + "'";
        if (baseDatos.ejecutar(sql)) {
            System.out.println("Ejecucion Correcta");
        } else {
            System.out.println("Ocurrio un problema al modificar");
        }
    }
    
    public void modificarNivel(String name, String score) {
        String sql = "UPDATE datos SET Score=' " + score
                + "' WHERE Name='" + name + "'";
        if (baseDatos.ejecutar(sql)) {
            System.out.println("Ejecucion Correcta");
        } else {
            System.out.println("Ocurrio un problema al modificar");
        }
    }
    

    
}
