/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package practica9;

/**
 *
 * @author Jose Sanchez Diaz
 */
public abstract class Acuatico extends Vehiculo{
    final double eslora;

    public Acuatico(String matricula, String modelo, double eslora) {
        super(matricula, modelo);
        this.eslora=eslora;
    }
}
