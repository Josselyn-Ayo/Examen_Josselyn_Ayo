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

        System.out.println("----- OBJETOS CON VALORES NULOS SETTERS POR CONSOLA ------");

        // Estudiante 1
        System.out.print("Nombre del estudiante: ");
        String nombreE = sc.nextLine();
        System.out.print("Apellido: ");
        String apellidoE = sc.nextLine();
        System.out.print("Cédula: ");
        String cedulaE = sc.nextLine();
        System.out.print("Edad: ");
        int edadE = sc.nextInt();
        sc.nextLine();
        System.out.print("Teléfono: ");
        String telefonoE = sc.nextLine();
        Estudiante estudianteNull = new Estudiante(nombreE, apellidoE, cedulaE, edadE, telefonoE);

        //  Docente 1
        System.out.print("Nombre del docente: ");
        String nombreD = sc.nextLine();
        System.out.print("Apellido: ");
        String apellidoD = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();
        System.out.print("Cédula del docente: ");
        String cedulaD = sc.nextLine();
        System.out.print("Curso que dicta: ");
        String cursoDictado = sc.nextLine();
        Docente docenteNull = new Docente(nombreD, apellidoD, especialidad, cedulaD, cursoDictado);

        //  Curso Certificado 1
        CursoCertificado cursoNull = new CursoCertificado("Sin nombre", 0, 0);
        cursoNull.asignarDocente(docenteNull);

        // Evaluación 1
        System.out.print("Nota del estudiante (0-10): ");
        double notaEstudiante = sc.nextDouble();
        sc.nextLine();
        Evaluacion evaluacionNull = new Evaluacion(notaEstudiante);

        //  Matrícula 1
        Matricula matriculaNull = new Matricula(estudianteNull, cursoNull);
        matriculaNull.registrarEvalacion(evaluacionNull);

        System.out.println("\n--- DATOS INGRESADOS MANUALMENTE ---");
        estudianteNull.mostrarDatos();
        docenteNull.mostrarPerfil();
        cursoNull.mostrarResumen();
        matriculaNull.mostrarDetalles();

        System.out.println("\n----- OBJETOS CON CONSTRUCTOR DIRECTO ------");

        Estudiante estudiante2 = new Estudiante("Luis", "Gómez", "0102030405", 22, "099998877");
        Docente docente2 = new Docente("María", "Cedeño", "Bases de Datos", "0911122334", "BD");
        CursoCertificado curso2 = new CursoCertificado("Bases de Datos", 6, 120.0);
        curso2.asignarDocente(docente2);
        Evaluacion evaluacion2 = new Evaluacion(8.0);
        Matricula matricula2 = new Matricula(estudiante2, curso2);
        matricula2.registrarEvalacion(evaluacion2);

        Estudiante estudiante3 = new Estudiante("Valeria", "López", "1122334455", 18, "0988997766");
        Docente docente3 = new Docente("Andrés", "Vega", "POO", "1234567890", "POO");
        CursoCertificado curso3 = new CursoCertificado("POO", 8, 100);
        curso3.asignarDocente(docente3);
        Evaluacion evaluacion3 = new Evaluacion(9.5);
        Matricula matricula3 = new Matricula(estudiante3, curso3);
        matricula3.registrarEvalacion(evaluacion3);

        System.out.println("\n--- DATOS DESDE CONSTRUCTOR ---");
        estudiante2.mostrarDatos();
        docente2.mostrarPerfil();
        curso2.mostrarResumen();
        matricula2.mostrarDetalles();

        estudiante3.mostrarDatos();
        docente3.mostrarPerfil();
        curso3.mostrarResumen();
        matricula3.mostrarDetalles();

        System.out.println("\n----- PROCESO DE INSCRIPCIÓN, NOTA Y CERTIFICADO -----");

        Estudiante estudianteFinal = new Estudiante("Mateo", "Ortega", "1723344556", 19, "0987654321");
        Docente docenteFinal = new Docente("Lucía", "Moreira", "Matemáticas", "1122334455", "Cálculo");
        CursoCertificado cursoFinal = new CursoCertificado("Cálculo", 10, 150.0);
        cursoFinal.asignarDocente(docenteFinal);
        Matricula matriculaFinal = new Matricula(estudianteFinal, cursoFinal);

        System.out.println("\n Estudiante inscrito (aún sin nota):");
        estudianteFinal.mostrarDatos();
        cursoFinal.mostrarResumen();
        matriculaFinal.mostrarDetalles();

        Evaluacion evaluacionFinal = new Evaluacion(8.7);
        matriculaFinal.registrarEvalacion(evaluacionFinal);

        System.out.println("\n Nota registrada:");
        matriculaFinal.mostrarDetalles();


        if (evaluacionFinal.getResultado().equals("Aprobado")) {
            System.out.println("\n El estudiante aprobó.");
            System.out.println(" Se emite certificado: Sí");
        } else {
            System.out.println("\n El estudiante no aprobó.");
            System.out.println("Se emite certificado: No");
        }
    }
}




