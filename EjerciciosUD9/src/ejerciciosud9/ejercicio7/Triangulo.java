/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio7;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Triangulo implements iFigura2D{

    private double ancho;
    private double alto;
    
    public Triangulo (double ancho, double alto){
        this.ancho=ancho;
        this.alto=alto;
    }
    
    public double perimetro() {
        return getAncho()*3;
    }

    public double area() {
        return getAncho()*getAlto()/2;
    }

    public void escalar(double escala) {
        setAncho(getAncho() * Math.abs(escala));
        setAlto(getAlto() * Math.abs(escala));
    }

    public void imprimir() {
        System.out.printf("""
                          El triangulo tiene un alto de %.2f cm 
                          Un ancho de %.2f cm
                          Un area de %.2f cm\u00b2 
                          Un perimetro de %.2f cm
                          """,getAlto(),getAncho(),area(),perimetro());
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    
}
