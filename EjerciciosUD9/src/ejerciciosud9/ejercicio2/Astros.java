/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio2;

/**
 *
 * @author Jose Sanchez Diaz
 */
public abstract class Astros {
    private double diametroMedio;
    private double periodoRotacion;
    private double periodoTraslacion;
    private double temperaturaMedia;
    private double gravedad;
    private String masa;
    private String nombre;
    
    public Astros(String nombre, String masa, double gravedad,double diametroMedio, double temperaturaMedia,double periodoRotacion,double periodoTraslacion){
        this.masa=masa;
        this.nombre=nombre;
        this.gravedad=gravedad;
        this.diametroMedio=diametroMedio;
        this.temperaturaMedia=temperaturaMedia;
        this.periodoRotacion=periodoRotacion;
        this.periodoTraslacion=periodoTraslacion;
    }
    public void muestra(){
        
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public String getMasa() {
        return masa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
