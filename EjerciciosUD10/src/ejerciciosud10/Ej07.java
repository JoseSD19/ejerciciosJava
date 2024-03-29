/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ej07 {

    public static void ejecutar() throws Exception {
        ArrayList<Gato> gatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String nombre;
            int edad = 1;

            System.out.println("Indica el nombre del gato " + (i + 1) + " (MINIMO: 3 caracteres): ");
            nombre = sc.nextLine();

            try {
                System.out.println("Indica la edad del gato (No puede ser negativa): ");
                edad = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("[ERROR]La edad tiene que ser un numero, intentelo de nuevo");
                i--;
            }
            
            sc.nextLine();

            try {
                gatos.add(new Gato(nombre, edad));

            } catch (Exception e) {
                System.out.println("[ERROR]"+e.getMessage());
                System.out.println("Intentelo de nuevo");
                i--;
            }
        }

        for (int i = 0; i < gatos.size(); i++) {
            gatos.get(i).imprimir();
        }
    }
}
