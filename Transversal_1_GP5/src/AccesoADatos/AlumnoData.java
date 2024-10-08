
package AccesoADatos;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnoData {
    
    private Connection con=null;

    public AlumnoData() {
        //constructor que inicializa la conexion
        con=Conectar.getConexion();
    }
    
    public void guardarAlumno (Alumno alumno){
        //insert un alumno a la tabla
        String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?,?,?,?,?)";
        try {
            //creo el objeto PS para enviar la sentencia SQL pido lista de la clave id del amuno generado
            PreparedStatement ps=con.prepareStatement(sql);
            //entramos a BD, reemplazamos los parametros ?,?,?,?,?...
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            //a la BD no puedo mandar un LocalDate el DATE que usamos el del paquete sql
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            //armando el PS lo ejecutamos con EXCECUTEUPDATE
            int exito= ps.executeUpdate();
             if(exito==1){
                JOptionPane.showMessageDialog( null, "Alumno INSERTADO");
            }
            
            //recibiremos columna ID 1 sola pida, la del alumno cargado, no recorremos x ser 1 solo
            ResultSet rs=ps.getGeneratedKeys();//ESTE RS NO SE ESTÁ LLENANDO BIEN
            //esta linea 41 me tira error que lo ataja el catch
            //muestra: query was not set with statement.return_generated_keys
            //lo agrega bien a la BD pero no obtengo el id de la BD
            
            if (rs.next()){     //si hay rs es xq se pudo agregar
                alumno.setIdAlumno(rs.getInt("idAlumno"));//pido columna 1 donde está el ID autogenerado en BD
                JOptionPane.showMessageDialog( null, "Alumno " + rs.getInt("idAlumno")+" Guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( null, "Error al acceder a la tabla Alumno"+ex.getMessage());
        }
    }
    
    public void modificarAlumno (Alumno alumno){    //recibo alumno existente
        
        String sql="UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNacimiento=?"
                + "WHERE idAlumno = ?";
                
        try { 
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito= ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog( null, "Alumno Modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( null, "Error al acceder a la tabla Alumno= "+ex.getMessage());
        }
        
        
        
                
        
        
    }
}
