package Cursos;

public class CursoCertificado extends CursoRegular{
    private boolean certificado = true;

    public CursoCertificado(String nombre, int duracionSemanas, double precio) {
        super(nombre, duracionSemanas, precio);
    }
    public double calcularPrecioFinal(){
        return precio * 1.25;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Curso Certificado:" + nombre );
        System.out.println("Duracion: " +duracionSemanas);
        System.out.println("Precio base: $ "+ precio);
        System.out.println("Precio final con certificado: " + calcularPrecioFinal());
        if (certificado){
            System.out.println("Este curso incluye certificado oficial :)");
        }else {
            System.out.println("Este curso no incluye certificado.");
        }
        docente.mostrarPerfil();
    }
}
