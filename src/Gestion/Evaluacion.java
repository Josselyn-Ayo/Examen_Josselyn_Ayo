package Gestion;

public class Evaluacion {
    private double nota;
    public Evaluacion(double nota){
        if(nota < 0 || nota > 10){
            this.nota = nota;
        } else{
            System.out.println("Nota invalida. Debe estar dentro del rango del 0 al 10. Se asigna 0 por defecto.");
            this.nota= 0;
        }
    }
        public String getResulatos(){
            if(nota >= 7){
                return "Aprobado";
            }else{
                return "Reprobado";
            }
        }
        public double getNota(){
        return nota;
        }


}
