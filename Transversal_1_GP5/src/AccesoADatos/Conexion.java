
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Conexion {
    public static void main(String[] args){

      try {
            //cargar driver de conexion
            Class.forName("org.mariadb.jdbc.Driver");
            
            //coneccion al db
            
          Connection conec =  DriverManager.getConnection("jdbc:mariadb://localhost:3306/gp5_universidad","root", "");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog( null, "Debe agregar los drivers al proyecto");
                    
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog( null, "No se establecio la conecion a la DB");
        }
}
}
