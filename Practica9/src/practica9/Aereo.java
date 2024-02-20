/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package practica9;

/**
 *
 * @author Jose Sanchez Diaz
 */
public abstract class Aereo extends Vehiculo{
    final int numAsientos;

    public Aereo(String matricula, String modelo, int numAsientos) {
        super(matricula, modelo);
        this.numAsientos=numAsientos;
    }
}
