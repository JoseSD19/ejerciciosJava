/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej12 {

    void Ejecutar() {
        int numeros[] = new int[10];
        int num, pos;
        String eleccion;
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        do {
            System.out.println("Eliga una opcion:"
                    + "\na. Mostrar valores."
                    + "\nb. Introducir valor."
                    + "\nc. Salir.");
            eleccion = sc.next();
            char letra = eleccion.charAt(0);

            switch (letra) {
                case 'a':
                    System.out.println("Los valores son: ");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("El numero en la posicion "+(i+1)+" es: "+numeros[i]);
                    }
                    System.out.println("");
                    break;

                case 'b':
                    System.out.println("Indique el numero que desea introducir: ");
                    num = sc.nextInt();

                    do {
                        System.out.println("Indique en que posicion: ");
                        pos = sc.nextInt();

                        if (pos > numeros.length) {
                            System.out.println("Posicion incorrecta");
                        }

                    } while (pos > numeros.length);

                    numeros[(pos-1)] = num;
                    break;

                case 'c':
                    System.out.println("Gracias por usar el programa");
                    seguir = false;
                    break;
                default:
                    System.out.println("Eleccion incorrecta.");
            }
        } while (seguir);
    }
}
