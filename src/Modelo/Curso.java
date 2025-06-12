package Modelo;

public class Curso {
    protected String nombre;
    protected int duracionSemanas;
    protected double precio;
    protected Docente docente;

    public Curso(){};

    public Curso(String nombre, int duracionSemanas, double precio) {
        this.nombre = nombre;
        this.duracionSemanas = duracionSemanas;
        this.precio = precio;
    }
    public void asignarDocente(Docente docente){
        this.docente = docente;
    }
    public void mostrarResumen(){
        System.out.println("Curso: "+ nombre + "-Duracion"+ duracionSemanas + "semanas - Precio"+ precio);
    }
}
