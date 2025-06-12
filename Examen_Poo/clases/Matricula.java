package Examen_Poo.clases;

public class Matricula extends Estudiante{

    String Codigo;
    Estudiante estudiante;


    @Override
    public String toString() {
        return "Matricula{" +
                "Codigo='" + Codigo + '\'' +
                ", curso=" + curso +
                ", estudiante=" + estudiante +
                '}';
    }


    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public Matricula(String nombre, String apellido, int edad, String correo, String telefono, String cedula, String codigo) {
        super(nombre, apellido, edad, correo, telefono, cedula);
        Codigo = codigo;



    }
}
