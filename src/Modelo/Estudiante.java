package Modelo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private String telefono;

    public Estudiante() {}

    public Estudiante(String nombre, String apellido, String cedula, int edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Cédula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
    }

    public boolean validarEdad() {
        return edad >= 13 && edad <= 60;
    }
}
