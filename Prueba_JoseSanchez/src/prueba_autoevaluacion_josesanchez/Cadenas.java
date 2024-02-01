/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_autoevaluacion_josesanchez;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        System.out.println("Introduzca una cadena de texto: ");
        cadena = sc.nextLine();
        
        System.out.println("La longitud de la cadena es "+cadena.length());
        System.out.println("El caracter en la posicion 7 es: "+cadena.charAt(7));
        System.out.println("La subcadena desde la posicion 9 hasta la posicion 26: "+cadena.substring(9, 26));
        if (cadena.toLowerCase().indexOf("v")>=0) {
            System.out.println("La v esta en la posciion: "+cadena.indexOf("v"));
        }else{
            System.out.println("No hay v en la cadena");
        }
        
        System.out.println("Mayusculas: "+cadena.toUpperCase());
        if (cadena.charAt(0)=='E') {
            System.out.println("La cadena empeiza por E");
        }else{
            System.out.println("La cadena no empieza por E");
        }
    }
    
}
