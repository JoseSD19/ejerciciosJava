/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosud10;

import ejerciciosud10.dawbank.DawBank;
import ejerciciosud10.ejercicio8.Ej08;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class MainUD10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ejercicio");
        
        int opcion=sc.nextInt();
        
        switch (opcion) {
            case 1:
                Ej01.ejecutar();
                break;
            case 2:
                Ej02.ejecutar();
                break;
            case 3:
                Ej03.ejecutar();
                break;
            case 4:
                Ej04.ejecutar();
                break;
            case 5:
                Ej05.ejecutar();
                break;
            case 6:
                Ej06.ejecutar();
                break;
            case 7:
                Ej07.ejecutar();
                break;
            case 8:
                DawBank.ejecutar();
                break;
            case 9:
                Ej08.ejecutar();
                break;
            default:
                throw new AssertionError();
        }
    }
}
