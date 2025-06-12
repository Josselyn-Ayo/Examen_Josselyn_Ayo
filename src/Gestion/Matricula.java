package Gestion;

import Modelo.Curso;
import Modelo.Estudiante;

public class Matricula {
    private Estudiante estudiante;
    private Curso curso;
    private Evaluacion evaluacion;
    private boolean tieneEvaluacion = false;

    public Matricula() {}

    public Matricula(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public void registrarEvalacion(Evaluacion e) {
        this.evaluacion = e;
        this.tieneEvaluacion = true;
    }

    public void mostrarDetalles() {
        System.out.println("----------- Detalles de Matrícula -----------");

        if (estudiante != null) {
            estudiante.mostrarDatos();
        } else {
            System.out.println("Estudiante no asignado.");
        }

        if (curso != null) {
            curso.mostrarResumen();
        } else {
            System.out.println("Curso no asignado.");
        }

        if (tieneEvaluacion && evaluacion != null) {
            System.out.println("Nota: " + evaluacion.getNota());
            System.out.println("Resultado: " + evaluacion.getResultado());
        } else {
            System.out.println("No hay evaluación registrada todavía.");
        }
    }
}
