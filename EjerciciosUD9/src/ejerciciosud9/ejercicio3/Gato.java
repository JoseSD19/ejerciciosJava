/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio3;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Gato extends Mascotas {

    private String color;
    private boolean peloLargo;

    public Gato(String nombre, String estado, String fechaNacimiento, int edad, String color, boolean peloLargo) {
        super(nombre, estado, fechaNacimiento, edad);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public void muestra() {
        System.out.println("Los datos del gato son: "
                + "\nNombre: " + nombre
                + "\nEstado: " + estado
                + "\nFecha de nacimiento: " + fechaNacimiento
                + "\nEdad: " + edad
                + "\nColor: " + getColor());
        if (isPeloLargo()) {
            System.out.println("Tiene el pelo largo");
        } else {
            System.out.println("No tiene el pelo largo");
        }
    }

    public void habla() {
        System.out.println("Miau Miau");
    }

    public void cumpleaños() {
        System.out.println("Su cumpleaños es " + fechaNacimiento.substring(0, 5));
    }

    public void morir() {
        System.out.println(nombre+" ha muerto");
        this.estado="Muerto";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
    
    
}
