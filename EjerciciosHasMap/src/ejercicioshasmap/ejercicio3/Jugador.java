/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioshasmap.ejercicio3;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Jugador {

    int id;
    String nombre;
    int edad;

    public Jugador(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrrDatos() {
        System.out.println("Jugador " + id + ":"
                + "\nNombre: " + nombre
                + "\nEdad: " + edad);
    }
}
