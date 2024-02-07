/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package repaso.figuras;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;
    
    public Dimension(){
        alto=0;
        ancho=0;
        profundidad=0;
    }
    
    public Dimension(double alto, double ancho, double profundidad){
        this.alto=alto;
        this.ancho=ancho;
        this.profundidad=profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    public double getVolumen(){
        return (alto*ancho*profundidad);
    }
    
    public String toString(){
        return ("Alto: "+alto
                +"\nAncho: "+ancho
                +"\nProfundidad: "+profundidad
                +"\nVolumen: "+getVolumen());
    }
}
