package Examen_Poo.clases;

public class Docente {

    String nombre;
    String apellido;
    String Carrera;
    String correo;
    int numero_cursos_asignador;


    public Docente(String nombre, String apellido, String carrera, String correo, int numero_cursos_asignador) {
        this.nombre = nombre;
        this.apellido = apellido;
        Carrera = carrera;
        this.correo = correo;
        this.numero_cursos_asignador = numero_cursos_asignador;
    }


    public Docente(int numero_cursos_asignador) {
        this.nombre = "Damian";
        this.apellido = "Cabrera";
        Carrera = "Ing Software";
        this.numero_cursos_asignador = numero_cursos_asignador;
    }

    public Docente(String Carrera) {
        this.nombre = "David";
        this.apellido = "Carlos";
        this.Carrera= Carrera;
        this.numero_cursos_asignador = 10;
    }




    public Docente(){

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNumero_cursos_asignador(int numero_cursos_asignador) {
        this.numero_cursos_asignador = numero_cursos_asignador;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return Carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public int getNumero_cursos_asignador() {
        return numero_cursos_asignador;
    }


    public String mostrarPerfil() {
        return "Docente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", Carrera='" + Carrera + '\'' +
                ", correo='" + correo + '\'' +
                ", numero_cursos_asignador=" + numero_cursos_asignador +
                '}';
    }


    @Override
    public String toString() {
        return "Docente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", Carrera='" + Carrera + '\'' +
                ", correo='" + correo + '\'' +
                ", numero_cursos_asignador=" + numero_cursos_asignador +
                '}';
    }
}



