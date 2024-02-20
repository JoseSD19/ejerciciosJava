/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package practica9;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Avion extends Aereo{
    int tiempoVuelo;

    public Avion(String matricula, String modelo, int numAsientos, int tiempoVuelo) {
        super(matricula, modelo, numAsientos);
        this.tiempoVuelo=tiempoVuelo;
    }
    
    public void imprimir() {
        System.out.println("Matricula: " + matricula
                        +"\nModelo: "+modelo
                        +"\nNumero de asientos: "+numAsientos
                        +"\nTiempo de vuelo: "+tiempoVuelo);
    }
}
