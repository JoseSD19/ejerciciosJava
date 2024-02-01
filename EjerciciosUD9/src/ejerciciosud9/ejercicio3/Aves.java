/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio3;

/**
 *
 * @author Jose Sanchez Diaz
 */
public abstract class Aves extends Mascotas {

    String pico;
    boolean vuela;
    public Aves(String nombre, String estado, String fechaNacimiento, int edad, String pico, boolean vuela) {
        super(nombre, estado, fechaNacimiento, edad);
        this.pico=pico;
        this.vuela=vuela;
    }
    
    public abstract void volar();

}
