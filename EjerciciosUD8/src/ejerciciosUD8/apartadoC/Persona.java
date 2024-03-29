/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosUD8.apartadoC;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
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

    
    public String getDni() {
        return dni;
    }

    
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellidos() {
        return apellidos;
    }

    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
