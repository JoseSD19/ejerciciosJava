/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio3;

/**
 *
 * @author Jose Sanchez Diaz
 */
public abstract class Mascotas {

    String nombre, estado, fechaNacimiento;
    int edad;
    
    public Mascotas (String nombre, String estado, String fechaNacimiento, int edad){
        this.nombre=nombre;
        this.estado=estado;
        this.fechaNacimiento=fechaNacimiento;
        this.edad=edad;
    }
    
    public abstract void muestra();
    
    public abstract void cumpleaños();
    
    public abstract void morir();
    
    public abstract void habla();
}
