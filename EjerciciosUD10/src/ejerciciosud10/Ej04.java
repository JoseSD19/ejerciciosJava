/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ej04 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[(int) (Math.random() * 100)];
        int indice=0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        do {
            System.out.println("Que posicion quieres mostrar entre 1 y " + vector.length);

            try {
                indice = sc.nextInt();
                System.out.println(vector[indice]);

            } catch (InputMismatchException e1) {
                System.out.println("Introduzca un numero");

            } catch (ArrayIndexOutOfBoundsException e) {
                if (indice < 0) {
                    System.out.println("Fin del programa");
                } else {
                    System.out.println("No existe el elemento");
                }
            }
            sc.nextLine();
        } while (indice >= 0);
    }
}
