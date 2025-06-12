package Examen_Poo.clases;

public class Estudiante extends Curso {

    String nombre;
    String apellido;
    int edad;
    String correo;
    String telefono;
    String cedula;
    Curso curso;



    public Estudiante(String nombre, String apellido, int edad, String correo, String telefono, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.cedula = cedula;
    }


    public Estudiante(String nombre, String apellido, int edad, String correo, String telefono, String cedula, Curso curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    public Estudiante(){

    }


    public Estudiante(String cedula) {
        this.nombre = "Carlos";
        this.apellido = "Ayala";
        this.edad = 50;
        this.telefono = "09877141";
        this.cedula= cedula;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }


    public String mostrarDatos() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }




    public String getCorreo() {
        return correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public void validarEdad(){
        if (edad>13 && edad<63){
            System.out.println("Su edad esta en el rango establecido");
        }else{
            System.out.println("Edad fuera de rango establecido");
        }
    }








}

