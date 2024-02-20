/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package practica9;

/**
 *
 * @author Jose Sanchez Diaz
 */
public abstract class Vehiculo {
    final String matricula, modelo;
    
    public Vehiculo(String matricula, String modelo){
        this.matricula=matricula;
        this.modelo=modelo;
    }
    
    public abstract void imprimir();
}
