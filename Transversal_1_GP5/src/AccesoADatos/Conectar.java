/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GABY
 */
public class Conectar {
    
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String BD="gp5_universidad";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection con;
    
    //Implemento patron SINGLENTON
    //clase con constructor privado, no puedo instanciar desde fuera 
    //https://youtu.be/cEJIDo6XHAc?si=62oXLpfeZBY3-Vw4 minuto 10
    //para que se pueda usar desde afuera será con metodos estaticos

    private Conectar() {
    }
    
    public static Connection getConexion(){
        //if es la 1er conexion
        if(con==null){
            try {
                //cargar driver de conexion
                Class.forName("org.mariadb.jdbc.Driver");
                 con= DriverManager.getConnection(URL+BD, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "Conectado");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar drivers");
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog( null, "Error en conecion a la BD");
        }
        }
        return con;
    }
   
    
    
}
