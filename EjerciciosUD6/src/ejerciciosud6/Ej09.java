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
public class Ej09 {
    void Ejecutar() {
        int mayores = 0;
        int num;
        int aleatorio[] = new int[100];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] =(int) (1+Math.random()*10);
        }
        
        do {
            System.out.println("Indique el numero a comprobar (entre 1 y 10): ");
            num = sc.nextInt();
            if (num > 10) {
                System.out.println("Numero incorrecto, introduzca un valor entre 1 y 10");
            }
        } while (num > 10);

        for (int j = 0; j < aleatorio.length; j++) {
            if (num <= aleatorio[j]) {
                mayores++;
            }
        }
        System.out.println("La cantidad de numeros mayores o iguales al dado son: " + mayores);
    }
}
