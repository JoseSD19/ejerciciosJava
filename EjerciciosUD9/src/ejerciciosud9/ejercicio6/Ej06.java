/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio6;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ej06 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        boolean seguir = true;
        String clase;

        do {
            switch (Metodos.menu()) {
                case 1:
                    switch (Metodos.menuCreacion()) {
                        case 1:
                            switch (Metodos.menuTierra()) {
                                case 1:
                                    vehiculos.add(Metodos.crearCoche());
                                    break;
                                case 2:
                                    vehiculos.add(Metodos.crearMoto());
                                    break;
                                default:
                                    System.err.println("Opcion incorrecta");
                            }
                            break;
                        case 2:
                            switch (Metodos.menuAgua()) {
                                case 1:
                                    vehiculos.add(Metodos.crearBarco());
                                    break;
                                case 2:
                                    vehiculos.add(Metodos.crearSubmarino());
                                    break;
                                default:
                                    System.err.println("Opcion incorrecta");
                            }
                            break;
                        case 3:
                            switch (Metodos.menuAire()) {
                                case 1:
                                    vehiculos.add(Metodos.crearAvion());
                                    break;
                                case 2:
                                    vehiculos.add(Metodos.crearHelicoptero());
                                    break;
                                default:
                                    System.err.println("Opcion incorrecta");
                            }
                            break;
                        case 4:
                            break;
                        default:
                            System.err.println("Opcion incorrecta");
                    }
                    break;
                case 2:
                    Metodos.mostrar(vehiculos);
                    break;
                case 3:
                    Metodos.mostrar(vehiculos);
                    System.out.println("Que vehiculo quieres eliminar: ");
                    int vehiculo =sc.nextInt();
                    sc.nextLine();
                    vehiculos.remove(vehiculo-1);
                    break;
                case 4:
                    seguir = false;
                    break;
                default:
                    System.err.println("Opcion incorrecta");
            }
        } while (seguir);
    }
}
