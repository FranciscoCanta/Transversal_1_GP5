
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

// DE ESTA MANERA SE HACE CONECCION DESDE EL MAIN
// HAREMOS UNA CLASE CONECCION QUE SEA LLAMADA DESDE EL MAIN
// VER https://www.youtube.com/watch?v=0OgoeJWU-lQ MINUTO 9

public class Conexion {
    public static void main(String[] args){

        Connection conec =null;
      try {
            //cargar driver de conexion
            Class.forName("org.mariadb.jdbc.Driver");
            
            //coneccion al db
            
          conec =  DriverManager.getConnection("jdbc:mariadb://localhost:3306/gp5_universidad","root", "");
         
          
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog( null, "Debe agregar los drivers al proyecto; "+ex);
                    
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog( null, "No se establecio la conexion a la DB: "+ex);
        }
      
      if(conec != null){
          try{
              conec.close();
          }
          catch(SQLException e){
              System.err.println("No se puede cerrar la conección");
          }
          System.out.println("DB conec cerrada");
      }
}
}
