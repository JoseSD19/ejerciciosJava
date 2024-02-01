/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio6;

/**
 *
 * @author Jose Sanchez Diaz
 */
public abstract class Terrestre extends Vehiculo{
    final int ruedas;

    public Terrestre(String matricula, String modelo,int ruedas) {
        super(matricula, modelo);
        this.ruedas=ruedas;
    }
}
