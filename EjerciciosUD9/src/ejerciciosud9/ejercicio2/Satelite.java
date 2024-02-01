/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio2;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Satelite extends Astros {
    private double distanciaPlaneta;
    private Planeta planeta;

    public Satelite(String nombre, String masa, double gravedad,double diametroMedio, double temperaturaMedia, double periodoRotacion, double periodoTraslacion, Planeta planeta, double distanciaPlaneta) {
        super(nombre, masa, gravedad,diametroMedio, temperaturaMedia, periodoRotacion, periodoTraslacion);
        this.planeta=planeta;
        this.distanciaPlaneta=distanciaPlaneta;
    }
    
    public void muestra(){
         System.out.println("\tNombre: "+getNombre()
                +"\n\tMasa: "+getMasa()+"kg"
                +"\n\tGravedad: "+getGravedad()+"m/s"
                +"\n\tDiametro medio: "+getDiametroMedio()+"km"
                +"\n\tTemperatura Media: "+getTemperaturaMedia()+"ºC"
                +"\n\tPeriodo Rotacion: "+getPeriodoRotacion()+" horas"
                +"\n\tPeriodo Traslacion: "+getPeriodoTraslacion()+" dias"
                +"\n\tPlaneta al que pertenece : "+getPlaneta().getNombre()
                +"\n\tDistancia al planeta: "+ getDistanciaPlaneta()+"km\n");
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }
}
