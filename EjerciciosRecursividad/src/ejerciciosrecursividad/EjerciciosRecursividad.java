/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrecursividad;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class EjerciciosRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("""
                           Que ejercicio quieres hacer: 
                           1) Factorial
                           2) Fibonaci
                           3) Torres de Hanoi
                           4) Busqueda binaria
                           5) Crear rectangulo
                           6) Orden alfabetico
                           7) Pasar a binario""");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Factorial.ejecutar();
                break;
            case 2:
                Fibonacci.ejecutar();
                break;
            case 3:
                Hanoi.ejecutar();
                break;
            case 4:
                Busqueda.ejecutar();
                break;
            case 5:
                Rectangulo.ejecutar();
                break;
            case 6:
                Ordenada.ejecutar();
                break;
            case 7:
                Binario.ejecutar();
                break;
            default:
                throw new AssertionError();
        }

    }

}
