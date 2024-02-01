/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio6;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Coche extends Terrestre{
    boolean aire;

    public Coche(String matricula, String modelo, int ruedas, boolean aire) {
        super(matricula, modelo, ruedas);
        this.aire=aire;
    }
    
    public void imprimir() {
        System.out.println("Matricula: " + matricula
                        +"\nModelo: "+modelo
                        +"\nRuedas: "+ruedas);
        if (aire) {
            System.out.println("Tiene aire acondicioando");
        }else{
            System.out.println("No tiene aire acondicionado");
        }
    }
}
