package Examen_Poo.clases;

public class CursoCertificado extends Curso {


    public CursoCertificado(String nombre, int duracion, double precio, Docente docente) {
        super(nombre, duracion, precio, docente);
    }



    public CursoCertificado(){

    }


    @Override
    public String toString() {
        return "CursoCertificado{" +
                "docente=" + docente +
                ", precio=" + precio +
                ", duracion=" + duracion +
                ", nombre='" + nombre + '\'' +
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


    public double calcularPrecioFinal(){
        double a = super.precio * 1.25;
        return a;
    }





}
