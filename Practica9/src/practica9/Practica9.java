/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        boolean seguir = true;
        
        do {
            //Lanzamos el menu dentro de un bucle do{...}while para que se repita hasta que se pida salir
            switch (Metodos.menu()) {
                case 1:
                    //lanzamos el menu de creacion de los vehiculos
                    switch (Metodos.menuCreacion()) {
                        case 1:
                            //lanzamos un menu por cada tipo de vehiculo y añadimos el vehiculo creado mediante un metodo
                            //tierra
                            switch (Metodos.menuTierra()) {
                                case 1:
                                    //coche
                                    vehiculos.add(Metodos.crearCoche());
                                    break;
                                case 2:
                                    //moto
                                    vehiculos.add(Metodos.crearMoto());
                                    break;
                                default:
                                    System.err.println("Opcion incorrecta");
                            }
                            break;
                        case 2:
                            //agua
                            switch (Metodos.menuAgua()) {
                                case 1:
                                    //barco
                                    vehiculos.add(Metodos.crearBarco());
                                    break;
                                case 2:
                                    //submarino
                                    vehiculos.add(Metodos.crearSubmarino());
                                    break;
                                default:
                                    System.err.println("Opcion incorrecta");
                            }
                            break;
                        case 3:
                            //aire
                            switch (Metodos.menuAire()) {
                                case 1:
                                    //avion
                                    vehiculos.add(Metodos.crearAvion());
                                    break;
                                case 2:
                                    //helicoptero
                                    vehiculos.add(Metodos.crearHelicoptero());
                                    break;
                                default:
                                    System.err.println("Opcion incorrecta");
                            }
                            break;
                        case 4:
                            //en caso de no querer crear ninguno para salir del menu sin hacer nada
                            break;
                        default:
                            System.err.println("Opcion incorrecta");
                    }
                    break;
                case 2:
                    //comprobamos si existen vehiculos registrados, sino informamos de que esta vacio
                    if (vehiculos.isEmpty()) {
                        System.out.println("\nAun no tienes vehiculos");
                    } else {
                        //si no esta vacio mostramos los vehiculos
                        Metodos.mostrar(vehiculos);
                    }
                    break;
                case 3:
                    //mostramos todos los vehiculos y preguntamos cual quiere eliminar
                    Metodos.mostrar(vehiculos);
                    System.out.println("\nQue vehiculo quieres eliminar: ");
                    int vehiculo = (sc.nextInt() - 1);
                    sc.nextLine();
                    Metodos.eliminarVehiculo(vehiculos, vehiculo);
                    break;
                case 4:
                    //indica que quiere salir del menu
                    seguir = false;
                    break;
                default:
                    System.err.println("Opcion incorrecta");
            }
        } while (seguir);
    }
    
}
