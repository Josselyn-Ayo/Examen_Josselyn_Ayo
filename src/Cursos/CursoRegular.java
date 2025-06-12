package Cursos;

import Modelo.Curso;
import Modelo.Docente;

public class CursoRegular extends Curso {
    public CursoRegular(){};

    public CursoRegular(String nombre, int duracionSemanas, double precio) {
        super(nombre, duracionSemanas, precio);
    }

    @Override
    public void asignarDocente(Docente docente) {
        super.asignarDocente(docente);
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
    }
}
