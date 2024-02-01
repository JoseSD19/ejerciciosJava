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
public class Ej01 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Indica un numero entero");

        try {
            a = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        }

        System.out.println("Fin del programa");
    }
}
