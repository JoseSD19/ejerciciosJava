/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio6;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Moto extends Terrestre{
    String color;

    public Moto(String matricula, String modelo, int ruedas, String color) {
        super(matricula, modelo, ruedas);
        this.color=color;
    }
    
    public void imprimir() {
        System.out.println("Matricula: " + matricula
                        +"\nModelo: "+modelo
                        +"\nRuedas: "+ruedas
                        +"\nColor: "+color);
    }
}
