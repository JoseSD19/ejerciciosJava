/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio1;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Producto {
    
    String nombre;
    int cantidad;
    
    public Producto (String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public String getNombre(){
        return nombre;
    }
}
