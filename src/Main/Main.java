
package Main;

import Gestion.Matricula;
import Gestion.Evaluacion;
import Modelo.Docente;
import Modelo.Estudiante;
import Cursos.CursoCertificado;
import Cursos.CursoRegular;
import Modelo.Curso;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Crear 5 objetos vacíos y asignar con Scanner");

  Estudiante est1 = new Estudiante();
  System.out.print("Ingrese nombre del estudiante 1: ");
  est1.setNombre(sc.nextLine());
  System.out.println("Ingrese el apellido del estudiante:");
  est1.setApellido(sc.nextLine());
  System.out.println("Ingrese la cédula del estudiante:");
  est1.setCedula(sc.nextLine());
  System.out.println("Ingrese la edad del estudiante:");
  est1.setEdad(sc.nextInt()); sc.nextLine();
  System.out.println("Ingrese el teléfono del estudiante: ");
  est1.setTelefono(sc.nextLine());

  Docente doc1 = new Docente();
  System.out.print("Ingrese nombre del docente 1: ");
  doc1.setNombre(sc.nextLine());
  System.out.println("Ingrese el apellido del docente:");
  doc1.setApellido(sc.nextLine());
  System.out.println("Ingrese la cédula del docente:");
  doc1.setCedula(sc.nextLine());
  System.out.println("Ingrese la especialidad del docente:");
  doc1.setEspecialidad(sc.nextLine());
  System.out.println("Ingrese el curso del docente:");
  doc1.setCurso(sc.nextLine());

  CursoRegular curso1 = new CursoRegular();
  System.out.println("Ingrese el nombre del curso regular:");
  curso1.setNombre(sc.nextLine());
  System.out.println("Ingrese la duración en semanas:");
  curso1.setDuracionSemanas(sc.nextInt()); sc.nextLine();
  System.out.println("Ingrese el precio:");
  curso1.setPrecio(sc.nextDouble()); sc.nextLine();
  curso1.asignarDocente(doc1);

  CursoCertificado curso2 = new CursoCertificado();
  System.out.println("Ingrese el nombre del curso certificado:");
  curso2.setNombre(sc.nextLine());
  System.out.println("Ingrese la duración en semanas:");
  curso2.setDuracionSemanas(sc.nextInt()); sc.nextLine();
  System.out.println("Ingrese el precio:");
  curso2.setPrecio(sc.nextDouble()); sc.nextLine();
  curso2.asignarDocente(doc1);


  Estudiante est2 = new Estudiante("Lucía", "Pérez", "12345678", 22, "0991234567");
  Docente doc2 = new Docente("Pedro", "Martínez", "11223344", "Matemáticas", "Álgebra");
  CursoRegular curso3 = new CursoRegular("Java Básico", 6, 120.0);
  curso3.asignarDocente(doc2);
  CursoCertificado curso4 = new CursoCertificado("Java Intermedio", 8, 200.0);
  curso4.asignarDocente(doc2);
  CursoCertificado curso5 = new CursoCertificado("Java Avanzado", 10, 300.0);
  curso5.asignarDocente(doc2);

  curso1.mostrarResumen();
  curso2.mostrarResumen();
  curso3.mostrarResumen();
  curso4.mostrarResumen();
  curso5.mostrarResumen();


  System.out.println("Seleccione un curso para inscribirse:");
  System.out.println("1. Curso Regular creado por Scanner");
  System.out.println("2. Curso Certificado creado por Scanner");
  System.out.println("3. Java Básico");
  System.out.println("4. Java Intermedio");
  System.out.println("5. Java Avanzado");
  int opcion = sc.nextInt(); sc.nextLine();

  Curso cursoSeleccionado;
  switch(opcion) {
   case 1: cursoSeleccionado = curso1; break;
   case 2: cursoSeleccionado = curso2; break;
   case 3: cursoSeleccionado = curso3; break;
   case 4: cursoSeleccionado = curso4; break;
   case 5: cursoSeleccionado = curso5; break;
   default:
    System.out.println("Opción inválida. Se asignará curso por defecto.");
    cursoSeleccionado = curso1;
  }

  Matricula matricula = new Matricula(est1, cursoSeleccionado);
  matricula.mostrarDetalles();


  System.out.println("\nIngrese la nota final del estudiante:");
  double nota = sc.nextDouble();
  Evaluacion evaluacion = new Evaluacion(nota);
  matricula.registrarEvalacion(evaluacion);

  matricula.mostrarDetalles();

 }
}