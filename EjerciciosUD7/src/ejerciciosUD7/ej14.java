/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD7;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ej14 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int lineas, opcion;
        char letra;
        
        System.out.println("Que caracter quieres imprimir: ");
        letra=sc.nextLine().toLowerCase().charAt(0);
        
        System.out.println("Cuantas lineas quieres que se impriman: ");
        lineas = sc.nextInt();
        
        System.out.println("Quieres imprimir la piramide normal o invertida: "
                + "\n1) Normal"
                + "\n2) Invertida"
                + "\n3) Ambas");
        opcion=sc.nextInt();
        
        switch (opcion) {
            case 1:
                Piramide(letra, lineas);
                break;
            case 2:
                piramideInvertida(letra, lineas);
                break;
            case 3:
                Piramide(letra, lineas);
                piramideInvertida(letra, lineas);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
    
    
    public static void Piramide(char a, int lineas){
        for (int i = 1; i <= lineas; i++) {
            //Para mostrar espacios a la izquierda y tenga forma de piramide
            for (int j = 0; j < lineas - i; j++) {
                System.out.print(" ");
            }
            //(2*i-1) porque en cada linea muestra 2 caracteres mas pero siempre es numero impar
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(a);
            }
            System.out.println("");
        }
    }
    
    //muestra la piramide al reves
    public static void piramideInvertida(char a, int lineas){
        for (int i = lineas; i >= 1; i--) {
            for (int j =lineas - i ; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = (2*i-1); j >=1 ; j--) {
                System.out.print(a);
            }
            System.out.println("");
        }
    }
}
