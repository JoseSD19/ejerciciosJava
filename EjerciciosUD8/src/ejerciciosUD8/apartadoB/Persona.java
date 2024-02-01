/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosUD8.apartadoB;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Persona {
    String dni, nombre, apellidos;
    int edad;
    
    public Persona (String dni,String nombre,String apellidos,int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    
    public Persona(String nom, String ap, int e){
        nombre = nom;
        apellidos = ap;
        edad = e;
    }
}
