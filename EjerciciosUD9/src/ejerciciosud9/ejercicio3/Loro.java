/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio3;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Loro extends Aves{

    private String origen;
    private boolean habla;
    
    public Loro(String nombre, String estado, String fechaNacimiento, int edad, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, estado, fechaNacimiento, edad, pico, vuela);
        this.pico=pico;
        this.habla=habla;
    }

    public void muestra(){
        System.out.println("Los datos del loro son: "
                +"\nNombre: "+nombre
                +"\nEstado: "+estado
                +"\nFecha de nacimiento: "+fechaNacimiento
                +"\nEdad: "+edad
                +"\nPico: "+pico
                +"\nOrigen: "+getOrigen());
        if (isHabla()) {
            System.out.println("Puede hablar");
        }else{
            System.out.println("No puede hablar");
        }
        if (vuela) {
            System.out.println("Puede volar");
        }else{
            System.out.println("No puede volar");
        }
    }
    
    public void saluda(){
        System.out.println("Hola, soy "+nombre);
    }
    
    @Override
    public void volar(){
        System.out.println("Ahora estoy volando");
    }

    public void cumpleaños() {
        System.out.println("Su cumpleaños es "+fechaNacimiento.substring(0,5));
    }

    public void morir() {
        System.out.println(nombre+" ha muerto");
        this.estado="Muerto";
    }

    public void habla() {
        System.out.println("Estoy hablando");
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    
    
}
