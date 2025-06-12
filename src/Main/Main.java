package Main;

import Cursos.CursoCertificado;
import Gestion.Evaluacion;
import Gestion.Matricula;
import Modelo.Docente;
import Modelo.Estudiante;

public class Main {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Emilia","Tana","1720234569","Matematicas","Calculo");
        CursoCertificado curso1 = new CursoCertificado("Calculo",10,120.0);
        curso1.asignarDocente(docente1);
        Estudiante estudiante1 = new Estudiante("Mateo", "Arteaga","1720589636",19,"0985768423");
        Matricula matricula1 = new Matricula(estudiante1,curso1);
        System.out.println("El estudiante inscrito al curso.");
        System.out.println("--------Datos del estudiante--------");







    }
}