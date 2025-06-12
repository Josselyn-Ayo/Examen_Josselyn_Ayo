package Modelo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private  String cedula;
    private int edad;
    private String telefono;

    public Estudiante(String nombre, String apellido, String cedula, int edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
    }
    public void  mostrarDatos(){
        System.out.println("Estudiante: "+ nombre+ apellido);
        System.out.println("Cedula: " + cedula + "\nEdad:"+ edad + "\n Telefono: "+ telefono);
    }
    public boolean validarEdad(){
        return edad>=13 && edad<= 60;
    }
}
