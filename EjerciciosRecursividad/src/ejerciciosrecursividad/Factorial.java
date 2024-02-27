/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrecursividad;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Factorial {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("De que numero quieres calcular el factorial: ");
        int num = sc.nextInt();

        System.out.println(factorial(num));
    }

    public static int factorial(int n) {

        if (n == 0) {
            System.out.print("=");
            return 1;
        } else {
            if (n==1) {
                System.out.print(n);
            }else{
                System.out.print(n+"*");
            }
            return (n * factorial(n - 1));
        }
    }
}
