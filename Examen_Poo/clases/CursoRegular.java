package Examen_Poo.clases;

public class CursoRegular extends Curso {


    public CursoRegular(String nombre, int duracion, double precio, Docente docente) {
        super(nombre, duracion, precio, docente);
    }

    public CursoRegular(){

    }

    @Override
    public String toString() {
        return "CursoRegular{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", precio=" + precio +
                ", docente=" + docente +
                '}';
    }


    @Override
    public String mostrarResumen() {
        return "Curso Certificado{" +
                "docente=" + docente +
                ", precio=" + precio +
                ", duracion=" + duracion +
                ", nombre='" + nombre + '\'' +
                '}';
    }









}


