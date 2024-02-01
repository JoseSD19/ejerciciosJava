/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosUD7;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class UD7Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean otro = false;
        String respuesta;
        char letra;

        do {
            System.out.println("Que ejercicio desea ejecutar: ");
            int ejercicio = sc.nextInt();
            System.out.println("Ejecutando ejercicio " + ejercicio);
            switch (ejercicio) {
                case 1:
                    ej01.Ejecutar();
                    break;
                case 2:
                    ej02.Ejecutar();
                    break;
                case 3:
                    ej03.Ejecutar();
                    break;
                case 4:
                    ej04.Ejecutar();
                    break;
                case 5:
                    ej05.Ejecutar();
                    break;
                case 6:
                    ej06.Ejecutar();
                    break;
                case 7:
                    ej07.Ejecutar();
                    break;
                case 8:
                    ej08.Ejecutar();
                    break;
                case 9:
                    ej09.Ejecutar();
                    break;
                case 10:
                    ej10.Ejecutar();
                    break;
                case 11:
                    ej11.Ejecutar();
                    break;
                case 12:
                    ej12.Ejecutar();
                    break;
                case 13:
                    ej13.Ejecutar();
                    break;
                case 14:
                    ej14.Ejecutar();
                    break;
                case 15:
                    ej15.ejecutar();
                    break;
                case 16:
                    ej16.Ejecutar();
                    break;
                case 17:
                    ej17.Ejecutar();
                    break;
                case 18:
                    ej18.Ejecutar();
                    break;
                case 19:
                    ej19.Ejecutar();
                    break;
                case 20:
                    ej20.Ejecutar();
                    break;
                case 21:
                    ej21.Ejecutar();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            sc.nextLine();
            System.out.println("¿Quieres hacer otro ejercicio?");
            respuesta = sc.nextLine().toLowerCase();
            letra = respuesta.charAt(0);
            otro = letra == 's';
        } while (otro);

    }

}
