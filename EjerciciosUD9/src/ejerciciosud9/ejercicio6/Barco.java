/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio6;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Barco extends Acuatico{
    boolean motor;

    public Barco(String matricula, String modelo, double eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.motor=motor;
    }
    public void imprimir() {
        System.out.println("Matricula: " + matricula
                        +"\nModelo: "+modelo
                        +"\nEslora: "+eslora);
        if (motor) {
            System.out.println("Tiene motor");
        }else{
            System.out.println("No tiene motor");
        }
    }
}
