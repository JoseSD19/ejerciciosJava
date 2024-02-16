/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poker;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Main {

    public static void main(String[] args) {
        int opcion;
        boolean seguir = true;
        ArrayList<Carta> cartas = new ArrayList<>();
        Mazo baraja = new Mazo(cartas);
        
        do {
            try {
                opcion = menu();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    baraja.iniciarMazo();
                    //baraja.barajar();
                    baraja.mostrarBaraja();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 0:
                    seguir = false;
                    break;
            }
        } while (seguir);

    }

    public static int menu() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                                Menu del Casino
                           ========================
                           
                           1. Repartir cartas a los jugadores
                           
                           2. Ver manos de los jugadores
                           
                           3. Repartir cartas comunes
                           
                           4. Mostrar cartas del tablero
                           
                           5. Determinar ganador de la ronda
                           
                           0. Salir
                           """);
        System.out.print("Seleccione una opcion: ");

        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            throw new Exception("Introduzca un numero");
        }
    }

}
