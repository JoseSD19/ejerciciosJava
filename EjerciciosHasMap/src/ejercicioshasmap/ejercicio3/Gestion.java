/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioshasmap.ejercicio3;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Gestion {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Jugador> jugadores = new HashMap<>();
        char tipo;

        System.out.println("Cuantos jugadores tienes: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {

            do {

                System.out.println("Jugador de futbol o tenis");
                tipo = sc.nextLine().toLowerCase().charAt(0);

                if (tipo != 'f' && tipo != 't') {
                    System.out.println("Indique un tipo existente");
                }

            } while (tipo != 'f' && tipo != 't');

            int id = (i + 1);

            System.out.println("Indica el nombre del jugador: ");
            String nombre = sc.nextLine();

            System.out.println("Indica la edad del jugador:");
            int edad = sc.nextInt();
            sc.nextLine();

            switch (tipo) {
                case 'f':
                    System.out.println("En que posicion juega: ");
                    String posicion = sc.nextLine();

                    System.out.println("Cuantos goles ha marcado: ");
                    int golesMarcados = sc.nextInt();
                    sc.nextLine();

                    jugadores.put(id, new JugadorFutbol(id, nombre, edad, posicion, golesMarcados));
                    break;
                case 't':
                    System.out.println("Indica el ranking: ");
                    int ranking = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Cuantos torneos ha ganado: ");
                    int torneosGanados = sc.nextInt();
                    ;
                    sc.nextLine();

                    jugadores.put(id, new JugadorTenis(id, nombre, edad, ranking, torneosGanados));
                    break;
                default:
                    throw new AssertionError();
            }

        }

        System.out.println("""
                           Que quieres hacer:
                           1)Aumentar un gol
                           2)Aumentar Torneos Ganados
                           3)Mostrar Jugadores
                           4)Salir""");
        int opcion = sc.nextInt();
        sc.nextLine();

        boolean seguir = true;
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Indique el ID del jugador:");
                    int id = sc.nextInt();

                    if (jugadores.get(id) instanceof JugadorFutbol) {

                        JugadorFutbol tmp = (JugadorFutbol) jugadores.get(id);
                        tmp.registrarGol();
                    } else {
                        System.out.println("Indique un jugador de futbol por favor");
                    }

                    break;
                case 2:
                    System.out.println("Indique el ID del jugador:");
                    id = sc.nextInt();

                    if (jugadores.get(id) instanceof JugadorTenis) {

                        JugadorTenis tmp = (JugadorTenis) jugadores.get(id);
                        tmp.ganarTorneo();
                    } else {
                        System.out.println("Indique un jugador de futbol por favor");
                    }

                    break;
                case 3:
                    
                    for (Integer key : jugadores.keySet()) {
                        jugadores.get(key).mostrrDatos();
                    }
                    
                    break;
                case 4:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (seguir);
    }
}
