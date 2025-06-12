package Cursos;

import Modelo.Docente;

public class CursoCertificado extends CursoRegular {
    private boolean certificado = true;

    public CursoCertificado() {}

    public CursoCertificado(String nombre, int duracionSemanas, double precio) {
        super(nombre, duracionSemanas, precio);
    }

    public double calcularPrecioFinal() {
        return precio * 1.25;
    }

    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen(); // Ya imprime nombre, duración, precio y docente
        System.out.println("Curso Certificado: " + nombre);
        System.out.println("Duración: " + duracionSemanas);
        System.out.println("Precio base: $" + precio);
        System.out.println("Precio final con certificado: $" + calcularPrecioFinal());

        if (certificado) {
            System.out.println("Este curso incluye certificado oficial :)");
        } else {
            System.out.println("Este curso no incluye certificado.");
        }

        if (docente != null) {
            docente.mostrarPerfil();
        } else {
            System.out.println("No se ha asignado un docente todavía.");
        }
    }
}

