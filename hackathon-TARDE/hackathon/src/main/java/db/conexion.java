/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author Ángeles
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;/*librerias*/

public class conexion {   /*ceclaracion de clase*/

    Connection conectar = null;    /*Variables de instancias*/
    String ip = "dbgenesis.cizv5pxdxt7p.us-east-1.rds.amazonaws.com";
    String user = "admin";
    String pass = "genesis2006";
    String bd = "recuperacion";
    String port = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + port + "/" + bd; /*cadena de conexion*/

    public Connection conectar() {  /*metodo para conectar*/
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, user, pass);
            JOptionPane.showMessageDialog(null, "Conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        return conectar;
    }
}
