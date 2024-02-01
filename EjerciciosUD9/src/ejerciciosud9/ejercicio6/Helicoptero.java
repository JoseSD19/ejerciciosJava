/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio6;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Helicoptero extends Aereo{
    int numHelices;

    public Helicoptero(String matricula, String modelo, int numAsientos, int NumHelices) {
        super(matricula, modelo, numAsientos);
        this.numHelices=numHelices;
    }
    
    public void imprimir() {
        System.out.println("Matricula: " + matricula
                        +"\nModelo: "+modelo
                        +"\nNumero de asientos: "+numAsientos
                        +"\nNumero de helices: "+numHelices);
    }
}
