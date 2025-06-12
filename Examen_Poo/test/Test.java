package Examen_Poo.test;

import Examen_Poo.clases.*;

public class Test {
    public static void main(String[] args) {



        Estudiante estudiante= new Estudiante("PEPE", "Ala", 16,"alexander@gmail.com","878787154", "18787878");

        System.out.println( "\n"+"Estudiante"+ estudiante);
        estudiante.validarEdad();
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        Docente docente= new Docente("Juan", "Zambrano", "Fisica", "JuanZ10@gmail.com", 10);

        Curso curso= new CursoRegular("Matematica-Aplicada", 15, 45.20,docente );
        System.out.println("Curso: "+ curso);



        Estudiante estudiante1= new Estudiante();

        estudiante1.setNombre("Angel");
        estudiante1.setApellido("Perez");
        estudiante1.setCedula("17544880");
        estudiante1.setCorreo("Angel10G@outlook.com");
        estudiante1.setTelefono("098787878");

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("Estudiante 1:" + estudiante1);



        System.out.println("------------------------------------------------------------------------------------------------------------------");
        Docente docente2= new Docente();
        docente2.setNombre("Marianne");
        docente2.setApellido("Zapata");
        docente2.setCorreo("MarianeZ78@gmail.com");
        docente2.setCarrera("Biologia");
        docente2.setNumero_cursos_asignador(5);



        CursoRegular cursoRegular= new CursoRegular();
        cursoRegular.setNombre("Analisis-Datos");
        cursoRegular.setDuracion(50);
        cursoRegular.setDocente(docente2);
        cursoRegular.setPrecio(25.00);


        System.out.println("Curso 2: " + cursoRegular);


        CursoCertificado cursoCertificado = new CursoCertificado();

        cursoCertificado.setNombre("EDO");
        cursoCertificado.setDuracion(70);
        cursoCertificado.setPrecio(50.00);
        cursoCertificado.setDocente(docente2);

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("Curso 3: " + cursoCertificado);
        System.out.println("Precio con recargo: " + cursoCertificado.calcularPrecioFinal());


        System.out.println("------------------------------------------------------------------------------------------------------------------");

        Curso curso1= new CursoCertificado();
        curso1.setPrecio(10.00);
        curso1.setNombre("Fisica experimental");
        curso1.setDocente(docente);
        curso1.setDuracion(120);

        System.out.println("Curso 4: " + curso1);
        System.out.println(curso1.calcularPrecioFinal());

        System.out.println("------------------------------------------------------------------------------------------------------------------");


        System.out.println("\n");
        System.out.println("Parte 2 Test");



        System.out.println("------------------------------------------------------------------------------------------------------------------");
        Estudiante estudiante3= new Estudiante("17454545");
        System.out.println("Estudiante 4:" + estudiante3);


        System.out.println("------------------------------------------------------------------------------------------------------------------");

        Docente docente4= new Docente(1);
        System.out.println("Docente 4:" + docente4);


        System.out.println("------------------------------------------------------------------------------------------------------------------");

        Curso curso3= new Curso(10, docente4);
        System.out.println("Curso 4:" + curso3);
        System.out.println("------------------------------------------------------------------------------------------------------------------");


        Curso curso5= new Curso(25.00);
        System.out.println("Curso 5:" + curso5);
        System.out.println("------------------------------------------------------------------------------------------------------------------");


        Docente docente5= new Docente("Matematicas");
        System.out.println("Docente 5:" + docente5);
        System.out.println("------------------------------------------------------------------------------------------------------------------");











































    }
}
