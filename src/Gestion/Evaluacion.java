package Gestion;

public class Evaluacion {
    private double nota;
    public Evaluacion(){};

    public Evaluacion(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 10. Se asigna 0 por defecto.");
            this.nota = 0;
        }
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getResultado() {
        if (nota >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public double getNota() {
        return nota;
    }
}
