/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicioshasmap;

import ejercicioshasmap.ejercicio1.ExcepcionNota;
import ejercicioshasmap.ejercicio1.Instituto;
import ejercicioshasmap.ejercicio2.Horarios;
import ejercicioshasmap.ejercicio3.Gestion;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class EjerciciosHasMapMain {

    
    public static void main(String[] args) throws ExcepcionNota {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Que ejercicio quieres hacer");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                Instituto.ejecutar();
                break;
            case 2:
                Horarios.ejecutar();
                break;
            case 3:
                Gestion.ejecutar();
                break;
            default:
                throw new AssertionError();
        }
    }

}
