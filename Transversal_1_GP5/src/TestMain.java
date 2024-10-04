
import AccesoADatos.AlumnoData;
import java.sql.*;
import AccesoADatos.Conectar;
import Entidades.Alumno;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author GABY
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //pueden ir en orden descomentando para paso a paso llenar sus BD
        
       
    /*   //pruebo funcionamienro clase Conectar 
       Connection con= Conectar.getConexion();
       */
    
    //query was not set with statement.return_generated_keys
       //creo alumno manualmente
    //luego vendr{a de una vista
    //si quieren ejecutar tener en verde xampp
    /*
        Alumno pepe= new Alumno(40555666, "Garcia", "Pepe", LocalDate.of(2000, 8, 15), true);
        
        AlumnoData alu= new AlumnoData();
        alu.guardarAlumno(pepe);
    */
    
    /*
    Alumno laura= new Alumno(22222222, "Lopez", "Laura", LocalDate.of(2002, 2, 22), true);
        
        AlumnoData alu= new AlumnoData();
        alu.guardarAlumno(laura);
    */
    /*
       Alumno tere= new Alumno(33333333, "Tercera", "Teresa", LocalDate.of(2003, 3, 3), true);
        
        AlumnoData alu= new AlumnoData();
        alu.guardarAlumno(tere);
    */ 
    /*
     Alumno cuatro= new Alumno(44444444, "Callao", "Cesar", LocalDate.of(2001, 4, 3), true);
        
        AlumnoData alu= new AlumnoData();
        alu.guardarAlumno(cuatro);
        
     */   
      /*  
       Alumno quinta= new Alumno(55555555, "Quintana", "Queen", LocalDate.of(1953, 1, 20), true);
        
        AlumnoData alu= new AlumnoData();
        alu.guardarAlumno(quinta);
       */ 
       /* 
       Alumno seis= new Alumno(66666, "Seichelles", "Sergio", LocalDate.of(2024, 9, 20), true);
        
        AlumnoData alu= new AlumnoData();
        alu.guardarAlumno(seis);
        
       */
       
       //modificar alumno, inventen modif alguno segun id autogenerado en vuestra BD
       //ya q el id no estoy aun recibiéndolo
       /*
        Alumno seis= new Alumno(7,66666, "SR Seichelles", "DON Sergio", LocalDate.of(2024, 9, 20), true);
        
        AlumnoData alu= new AlumnoData();
        alu.modificarAlumno(seis);
*/
       //Acá me di cuenta que nosotros tenemos idAlumno pero la BD se llamaba id_alumno...
       //modifiqué en la BD el nombre de esa columna...
       //podré con séptimo intento recibir id de alumno insertado???? misterio....
     /*
        Alumno sechi= new Alumno(77777777, "Sette", "Seven", LocalDate.of(207, 7, 14), true);
        
        AlumnoData alu= new AlumnoData();
        alu.guardarAlumno(sechi);
       */
     
     //no, no funcionó (insisto BD está bien mi problema es el resultSet que no lo estoy obteniendo
     //ABANDONO xq es tarde. sigan desde minuto 30 del video de profe "AlumnoDataParte1"
}
}
