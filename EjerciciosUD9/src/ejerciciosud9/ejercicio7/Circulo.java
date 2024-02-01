/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio7;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Circulo implements iFigura2D{

    private double radio;
    
    public Circulo (double radio){
        this.radio=radio;
    }
    
    public double perimetro() {
        return 2*Math.PI*getRadio();
    }

    public double area() {
        return Math.PI*(Math.pow(getRadio(), 2));
    }

    public void escalar(double escala) {
        if (escala<0) {
            System.err.println("No se admiten escalas negativas, se contara como positiva");
            setRadio(getRadio() * Math.abs(escala));
        }else{
            setRadio(getRadio() * escala);
        }
        
    }

    public void imprimir() {
        System.out.printf("""
                          El circulo tiene un radio de %.2f cm 
                          Un area de %.2f cm\u00b2 
                          Un perimetro de %.2f cm
                          """,getRadio(),area(),perimetro());
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
