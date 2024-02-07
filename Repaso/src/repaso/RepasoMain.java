/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Scanner;
import repaso.agenda.ProgramarAgenda;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class RepasoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean otro = true;

        do {
            System.out.println("""
                           Ejercicios de Repaso:
                           1)Figuras
                           2)Agenda
                           """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("En proceso...");
                    break;
                case 2:
                    ProgramarAgenda.ejecutar();
                    break;
                default:
                    System.out.println("NO EXISTE EL EJERCICIO");
            }

            System.out.println("¿Quieres hacer otro ejercicio?");

            otro = (sc.nextLine().toLowerCase().charAt(0) == 's');

        } while (otro);
    }

}
