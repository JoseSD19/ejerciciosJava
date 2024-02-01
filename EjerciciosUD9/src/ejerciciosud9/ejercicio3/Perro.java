/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio3;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Perro extends Mascotas{
    private String raza;
    private boolean pulgas;
    
    public Perro(String nombre, String estado, String fechaNacimiento,String raza, int edad, boolean pulgas) {
        super(nombre, estado, fechaNacimiento, edad);
        this.raza=raza;
        this.pulgas=pulgas;
    }
    
    public void muestra(){
        System.out.println("Los datos del perro son: "
                +"\nNombre: "+nombre
                +"\nEstado: "+estado
                +"\nFecha de nacimiento: "+fechaNacimiento
                +"\nEdad: "+edad
                +"\nRaza: "+getRaza());
        if (isPulgas()) {
            System.out.println("Tiene pulgas");
        }else{
            System.out.println("No tiene pulgas");
        }
    }
    
    public void habla(){
        System.out.println("Guau Guau");
    }

    public void cumpleaños() {
        System.out.println("Su cumpleaños es "+fechaNacimiento.substring(0,5));
    }

    public void morir() {
        System.out.println(nombre+" ha muerto");
        this.estado="Muerto";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
    
    
    
}
