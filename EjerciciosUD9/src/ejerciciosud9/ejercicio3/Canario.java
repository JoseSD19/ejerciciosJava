/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio3;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Canario extends Aves{

    private String color;
    private boolean canta;
    
    public Canario(String nombre, String estado, String fechaNacimiento, int edad, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, estado, fechaNacimiento, edad, pico, vuela);
        this.color=color;
        this.canta=canta;
    }
    
    public void muestra(){
        System.out.println("Los datos del canario son: "
                +"\nNombre: "+nombre
                +"\nEstado: "+estado
                +"\nFecha de nacimiento: "+fechaNacimiento
                +"\nEdad: "+edad
                +"\nPico: "+pico
                +"\nColor: "+getColor());
        if (isCanta()) {
            System.out.println("Puede cantar");
        }else{
            System.out.println("No puede cantar");
        }
        if (vuela) {
            System.out.println("Puede volar");
        }else{
            System.out.println("No puede volar");
        }
    }

    public void cumpleaños() {
        System.out.println("Su cumpleaños es "+fechaNacimiento.substring(0,5));
    }

    public void morir() {
        System.out.println(nombre+" ha muerto");
        this.estado="Muerto";
    }

    public void habla() {
        System.out.println("Pio Pio");
    }

    public void volar() {
        System.out.println("Ahora estoy volando");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    
}
