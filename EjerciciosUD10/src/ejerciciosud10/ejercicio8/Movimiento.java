/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud10.ejercicio8;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Movimiento {
    private String tipo;
    private double dinero;
    
    public Movimiento(String tipo, double dinero){
        this.tipo=tipo;
        this.dinero=dinero;
    }
    
    public void imprimir(){
        System.out.println(getTipo()+"-------"+getDinero());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}
