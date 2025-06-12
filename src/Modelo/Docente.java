package Modelo;

public class Docente {
    private String nombre;
    private String apellido;
    private String especialidad;
    private String cedula;
    private String curso;

    public Docente(String nombre, String apellido, String cedula, String especialidad, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.curso = curso;

        }
        public void mostrarPerfil(){
            System.out.println("Docente: " + nombre + apellido);
            System.out.println("Cedula: " + cedula + "\nEspeciadidad:"+ especialidad);
            System.out.println("Curso: " + curso);
        }
    }
