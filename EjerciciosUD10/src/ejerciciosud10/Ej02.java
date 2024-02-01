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
public class Ej02 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Indica dos numeros enteros: ");
        
        try{
            a=sc.nextInt();
            b=sc.nextInt();
            int div = a/b;
        }
        catch(InputMismatchException e){
            System.out.println("Valor introducido incorrecto");
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
    }
}
