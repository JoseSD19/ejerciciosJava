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
public class Ej03 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        double vector[] = new double[5];

        for (int i = 0; i < vector.length; i++) {
            do {
                System.out.println("Indica un numero: ");

                if (sc.hasNextDouble()) {
                    vector[i] = sc.nextDouble();
                } else {
                    try {
                        vector[i] = sc.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("numero incorrecto");
                        sc.nextLine();
                    }
                }
            } while (vector[i]==0);
        }
    }
}