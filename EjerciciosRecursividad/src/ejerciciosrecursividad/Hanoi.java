/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrecursividad;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Hanoi {

    public static int contador = 0;
    
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("cuantos discos vas a mover");
        int discos=sc.nextInt();
        
        torresHanoi(discos,'o','d','a',0);
        System.out.println(contador);
    }

    public static void torresHanoi(int discos, char origen, char destino, char auxiliar, int contador) {
        if (discos == 1) {
            moverDisco(discos, origen, destino);
        } else {
            torresHanoi(discos - 1, origen, auxiliar, destino, contador);
            moverDisco(discos - 1, origen, destino);
            torresHanoi(discos - 1, auxiliar, destino, origen,contador);
        }
    }

    public static void moverDisco(int disco, char origen, char destino) {
        contador++;
        System.out.println("Se ha movido el disco" + disco
                + " asi: " + origen
                + "-->" + destino);
    }
}
