/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosUD8.apartadoD;

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
    
    public void imprime(){
        System.out.print("DNI: "+getDni()
                +"\nNombre: "+getNombre()
                +"\nApellidos: "+getApellidos()
                +"\nEdad: "+getEdad());
    }
    
    public boolean esMayorEdad(){
        return (this.edad >= 18);
    }
    
    public boolean esJubilado(){
        return (this.edad >= 65);
    }
   
    public int diferenciaEdad(Persona p){
        int diferencia;
        
        if(this.edad>=p.edad){
            diferencia = this.edad-p.edad;
        }else{
            diferencia = p.edad-this.edad;
        }
        
        return diferencia;
    }
    
}
