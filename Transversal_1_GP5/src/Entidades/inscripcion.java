package Entidades;


public class inscripcion {

    //Atributos
    private int idInscripcion;
    private double nota; 
    private Alumno alumno; 
    private Materia materia; 
    
    //Constructores
    public inscripcion() {
    }
    
    public inscripcion(int idInscripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }
    
    public inscripcion(double nota, Alumno alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }
    
    public inscripcion(double nota) {
        this.nota = nota;
    }

    //Getters y setters
    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
