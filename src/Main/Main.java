package Main;

import Cursos.CursoCertificado;
import Gestion.Evaluacion;
import Gestion.Matricula;
import Modelo.Docente;
import Modelo.Estudiante;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- OBJETOS CON VALORES NULOS Y SETTERS POR CONSOLA ------");

        Estudiante estudianteNull = new Estudiante();
       Docente docenteNull = new Docente();
        CursoCertificado cursoNull = new CursoCertificado();
        Evaluacion evaluacionNull = new Evaluacion();
        Matricula matriculaNull = new Matricula();

        System.out.print("Nombre del estudiante: ");
        estudianteNull.setNombre(sc.nextLine());
        System.out.print("Apellido: ");
        estudianteNull.setApellido(sc.nextLine());
        System.out.print("Cédula: ");
        estudianteNull.setCedula(sc.nextLine());
        System.out.print("Edad: ");
        estudianteNull.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("Teléfono: ");
        estudianteNull.setTelefono(sc.nextLine());

        System.out.print("Nombre del docente: ");
        docenteNull.setNombre(sc.nextLine());
        System.out.print("Apellido: ");
        docenteNull.setApellido(sc.nextLine());
        System.out.print("Especialidad: ");
        docenteNull.setEspecialidad(sc.nextLine());
        System.out.print("Cédula del docente: ");
        docenteNull.setCedula(sc.nextLine());

        System.out.print("Nombre del curso: ");
        cursoNull.setNombre(sc.nextLine());
        System.out.print("Duración del curso (meses): ");
        cursoNull.setDuracion(sc.nextInt());
        System.out.print("Costo: ");
        cursoNull.setCosto(sc.nextDouble());
        sc.nextLine();

        cursoNull.asignarDocente(docenteNull);
        matriculaNull.setEstudiante(estudianteNull);
        matriculaNull.

        System.out.println("\nEstudiante inscrito, aún sin nota:");
        estudianteNull.mostrarDatos();
        cursoNull.mostrarResumen();
        matriculaNull.mostrarDetalles();

        System.out.print("\nAsignación de nota del estudiante (0-10): ");
        evaluacionNull.setNota(sc.nextDouble());
        matriculaNull.registrarEvalacion(evaluacionNull);

        System.out.println("\nNota registrada:");
        matriculaNull.mostrarDetalles();

        if (evaluacionNull.getResultado().equals("Aprobado")) {
            System.out.println("\nEl estudiante aprobó.");
            System.out.println("Se emite certificado: Sí");
        } else {
            System.out.println("\nEl estudiante no aprobó.");
            System.out.println("Se emite certificado: No");
        }

        System.out.println("\n----- OBJETOS CON VALORES DESDE CONSTRUCTOR ------");
        Estudiante estudiante2 = new Estudiante("Luis", "Gómez", "0102030405", 22, "099998877");
        Docente docente2 = new Docente("María", "Cedeño","0911122334", "Bases ","Base de Datos" );
        CursoCertificado curso2 = new CursoCertificado("Bases de Datos", 6, 120.0);
        curso2.asignarDocente(docente2);
        Evaluacion evaluacion2 = new Evaluacion(8.0);
        Matricula matricula2 = new Matricula(estudiante2, curso2);
        matricula2.registrarEvalacion(evaluacion2);

        Estudiante estudiante3 = new Estudiante("Valeria", "López", "1122334455", 18, "0988997766");
        Docente docente3 = new Docente("Andrés", "Vega","1234567890", "POO","Programacion" );
        CursoCertificado curso3 = new CursoCertificado("POO", 8, 100);
        curso3.asignarDocente(docente3);
        Evaluacion evaluacion3 = new Evaluacion(9.5);
        Matricula matricula3 = new Matricula(estudiante3, curso3);
        matricula3.registrarEvalacion(evaluacion3);

        System.out.println("\n--- Datos creados con el constructor ---");
        estudiante2.mostrarDatos();
        docente2.mostrarPerfil();
        curso2.mostrarResumen();
        matricula2.mostrarDetalles();

        estudiante3.mostrarDatos();
        docente3.mostrarPerfil();
        curso3.mostrarResumen();
        matricula3.mostrarDetalles();
    }
}