/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud5;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej21 {

    public static void main(String[] args) {
        int num1, num2, pares = 0, i;
        Scanner sc = new Scanner(System.in);
        String mensaje = "";

        System.out.println("Introduzca un numero: ");
        num1 = sc.nextInt();

        do {
            System.out.println("Introduzca un numero mayor: ");
            num2 = sc.nextInt();
        } while (num2 <= num1);

        for (i = num1; i <= num2; i++) {
            mensaje = mensaje + i + " ";
            if (i % 2 == 0) {
                pares++;
            }
        }
        System.out.println(mensaje + "\nLa cantidad de pares entre "+num1+" y "+num2+" es: " + pares);
    }
}
