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
public class Ej08 {

    void Ejecutar() {
        int mayores = 0;
        double num;
        double aleatorio[] = new double[100];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = Math.random();
        }
        
        do {
            System.out.println("Indique el numero a comprobar (entre 0.0 y 1.0): ");
            num = sc.nextDouble();
            if (num > 1) {
                System.out.println("Numero incorrecto, introduzca un valor entre 0.0 y 1.0");
            }
        } while (num > 1);

        for (int j = 0; j < aleatorio.length; j++) {
            if (num <= aleatorio[j]) {
                mayores++;
            }
        }
        System.out.println("La cantidad de numeros mayores al dado son: " + mayores);
    }
}
