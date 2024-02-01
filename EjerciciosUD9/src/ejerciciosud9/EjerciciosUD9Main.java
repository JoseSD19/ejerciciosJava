/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosud9;

import ejerciciosud9.ejercicio1.Ej01;
import ejerciciosud9.ejercicio2.Ej02;
import ejerciciosud9.ejercicio3.Inventario;
import ejerciciosud9.ejercicio4.Ej04;
import ejerciciosud9.ejercicio5.Programa;
import ejerciciosud9.ejercicio6.Ej06;
import ejerciciosud9.ejercicio7.Ej07;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class EjerciciosUD9Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        boolean seguir = true;

        do {
            System.out.println("Que ejercicio quieres ejecutar");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    Ej01.Ejecutar();
                    break;
                case 2:
                    Ej02.Ejecutar();
                    break;
                case 3:
                    Inventario.ejecutar();
                    break;
                case 4:
                    Ej04.ejecutar();
                    break;
                case 5:
                    Programa.ejecutar();
                    break;
                case 6:
                    Ej06.ejecutar();
                    break;
                case 7:
                    Ej07.ejecutar();
                    break;
                default:
                    System.err.println("No hay tantos ejercicios");
            }
            
            System.out.println("Quieres hacer otro ejercicio");
            
            seguir = sc.nextLine().toLowerCase().charAt(0)=='s';
            
        }while(seguir);
    }

}
