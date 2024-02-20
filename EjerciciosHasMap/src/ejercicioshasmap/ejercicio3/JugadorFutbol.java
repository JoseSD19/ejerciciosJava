/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioshasmap.ejercicio3;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class JugadorFutbol extends Jugador {

    String posicion;
    int golesMarcados;

    public JugadorFutbol(int id, String nombre, int edad, String posicion, int golesMarcados) {
        super(id, nombre, edad);
        this.posicion = posicion;
        this.golesMarcados = golesMarcados;
    }

    public void registrarGol() {
        golesMarcados += 1;
    }

    @Override
    public void mostrrDatos() {
        System.out.println("Jugador " + id + ":"
                + "\nNombre: " + nombre
                + "\nEdad: " + edad
                + "\nPosicion: " + posicion
                + "\nGoles marcados: " + golesMarcados);
    }

}
