/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio7;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Cuadrado implements iFigura2D{

    private double lado;
    
    public Cuadrado (double lado){
        this.lado=lado;
    }
    
    public double perimetro() {
        return getLado()*4;
    }

    public double area() {
        return getLado()*getLado();
    }

    public void escalar(double escala) {
        setLado(getLado() * Math.abs(escala));
    }

    public void imprimir() {              
        System.out.printf("""
                          El cuadrado tiene un lado de %.2f cm
                          Un area de %.2f cm\u00b2
                          Un perimetro de %.2f cm
                          """,getLado(),area(),perimetro());
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
}
