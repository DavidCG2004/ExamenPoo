package Examen_Poo.clases;

public class Curso {

    String nombre;
    int duracion;
    double precio;
    Docente docente;


    public Curso(String nombre, int duracion, double precio, Docente docente) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.docente = docente;
    }



    public Curso(double precio, Docente docente) {
        this.nombre = "Bases de Datos";
        this.duracion = 98;
        this.precio= precio;
        this.docente = docente;
    }

    public Curso(double precio) {
        this.nombre = "Paginas web";
        this.duracion = 98;
        this.precio= precio;

    }



    public Curso(){

    }

    public String asignarDocente(Docente docente){
        if (docente.equals(null)){
            this.docente= docente;
        }
        return "Se ha asignado un docente correctamente";
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", precio=" + precio +
                ", docente=" + docente +
                '}';
    }


    public String mostrarResumen() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", precio=" + precio +
                ", docente=" + docente +
                '}';
    }


    public double calcularPrecioFinal(){
        double a = precio * 1.25;
        return a;
    }



    public int getDuracion() {
        return duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public Docente getDocente() {
        return docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }




}
