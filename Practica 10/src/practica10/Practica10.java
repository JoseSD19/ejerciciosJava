/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package practica10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //Se crean los 5 gatos, con edad por defecto a 1
        for (int i = 0; i < 5; i++) {
            String nombre;
            int edad = 1;

            //Se pide el nombre avisando de que tienen que ser minimo 3 caracteres, si no dara error
            System.out.println("Indica el nombre del gato " + (i + 1) + " (MINIMO: 3 caracteres): ");
            nombre = sc.nextLine();

            //Se pide la edad y si introduce algo que cause error saltara el error y pedira de nuevo todos los datos de ese gato
            try {
                System.out.println("Indica la edad del gato (No puede ser negativa): ");
                edad = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("[ERROR]La edad tiene que ser un numero, intentelo de nuevo");
                i--;
            } catch (Exception e){
                System.out.println("[ERROR]Error desconocido");
                i--;
            }
            
            //Se limpia el scanner
            sc.nextLine();

            //Se intenta crear el gato, si alguno de los dos argumentos esta mal dara error y pedira todo de nuevo
            try {
                gatos.add(new Gato(nombre, edad));

            } catch (Exception e) {
                System.out.println("[ERROR]"+e.getMessage());
                System.out.println("Intentelo de nuevo");
                i--;
            }
        }

        //Imprime la informacion de todos los gatos
        for (int i = 0; i < gatos.size(); i++) {
            gatos.get(i).imprimir();
        }
    }

}
