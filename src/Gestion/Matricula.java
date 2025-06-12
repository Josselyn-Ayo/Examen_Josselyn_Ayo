package Gestion;

import Modelo.Curso;
import Modelo.Estudiante;

public class Matricula {
    private Estudiante estudiante;
    private Curso curso;
    private Evaluacion evaluacion;
    private boolean tieneEvaluacion = false;

    public Matricula(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }
    public  void registrarEvalacion(Evaluacion e){
        this.evaluacion = e;
        this.tieneEvaluacion = true;

    }
    public void mostrarDetalles(){
        System.out.println("-----------Detalles de Matricula----------- ");
        estudiante.mostrarDatos();
        curso.mostrarResumen();
        if (tieneEvaluacion){
            System.out.println("Nota:"+ evaluacion.getNota());
            System.out.println("Resulatados: "+ evaluacion.getResultado());

        }else{
            System.out.println("No hay evaluacion registrada todavia");
        }

    }
}
