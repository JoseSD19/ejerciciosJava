/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioshasmap.ejercicio3;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class JugadorTenis extends Jugador {

    int ranking;
    int torneosGanados;

    public JugadorTenis(int id, String nombre, int edad, int ranking, int torneosGanados) {
        super(id, nombre, edad);
        this.ranking = ranking;
        this.torneosGanados = torneosGanados;
    }

    public void ganarTorneo() {
        torneosGanados ++;
    }

    public void mostrarDatos() {
        System.out.println("Jugador " + id + ":"
                + "\nNombre: " + nombre
                + "\nEdad: " + edad
                + "\nRanking: " + ranking
                + "\nTorneos Ganados: " + torneosGanados);
    }
}
