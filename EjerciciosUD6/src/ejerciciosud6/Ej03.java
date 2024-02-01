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
public class Ej03 {

    void Ejecutar() {
        double numeros[] = new double[10];
        double num, max = numeros[0], min = numeros[0], actual;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un numero: ");
            num = sc.nextInt();
            numeros[i] = num;
        }
        //Segundo bucle para ejecutar las acciones con el array
        for (int j = 1; j < numeros.length; j++) {
            actual = numeros[j];
            if (actual > max) {
                max = actual;
            }else if (actual < min) {
                min = actual;
            }
        }
        System.out.println("El mayor es: " + max + " y el menor es: " + min);
    }
}
