package Modelo;

public class Docente {
    private String nombre;
    private String apellido;
    private String especialidad;
    private String cedula;
    private String curso;

    public Docente() {}

    public Docente(String nombre, String apellido, String cedula, String especialidad, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.curso = curso;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarPerfil() {
        System.out.println("Docente: " + nombre + " " + apellido);
        System.out.println("Cédula: " + cedula);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Curso: " + curso);
    }
}

