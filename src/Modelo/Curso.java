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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionSemanas() {
        return duracionSemanas;
    }

    public void setDuracionSemanas(int duracionSemanas) {
        this.duracionSemanas = duracionSemanas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void asignarDocente(Docente docente){
        this.docente = docente;
    }
    public void mostrarResumen(){
        System.out.println("Curso: "+ nombre + "-Duracion"+ duracionSemanas + "semanas - Precio"+ precio);
        docente.mostrarPerfil();
    }
}
