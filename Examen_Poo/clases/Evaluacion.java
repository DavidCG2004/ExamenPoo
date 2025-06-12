package Examen_Poo.clases;

public class Evaluacion extends Estudiante {
    
    Double puntaje;
    Curso curso;
    Estudiante estudiante;



    public Evaluacion(Double puntaje) {
        this.puntaje = puntaje;
        this.curso = curso;
    }

    public Evaluacion(Double puntaje, Estudiante estudiante) {
        this.puntaje = puntaje;
        this.curso = curso;
    }


    public Evaluacion(){

    }

    public boolean validarNota(){
        if (puntaje>0 && puntaje<10)
            return true;
        else {
            return false;
        }
    }

    public String getResultado(){
        if (validarNota()){
            return "Evaluacion{" +
                    "puntaje=" + puntaje +
                    ", curso=" + curso +
                    '}';
        } else {
            return "Nota fuera de rango";
        }
    }

}
