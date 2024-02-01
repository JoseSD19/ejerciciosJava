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
            String nombre = "Garfield";
            int edad = 0;
            
            System.out.println("Indica el nombre del gato "+(i+1)+": ");
            nombre = sc.nextLine();

            try {
                System.out.println("Indica la edad del gato: ");
                edad = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Indica una edad, por favor");
                i--;
            } catch (Exception e) {
                System.out.println("Error desconocido, intentelo de nuevo");
                i--;
            }
            sc.nextLine();
            
            try{
            gatos.add(new Gato(nombre, edad));
            
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < gatos.size(); i++) {
            gatos.get(i).imprimir();
        }
    }
}
