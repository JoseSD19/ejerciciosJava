/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class EjS05 {

    void Ejecutar() {
        String frase, palindromo;
        char orden[];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase para ver si es un palindromo: ");
        frase = sc.nextLine().toLowerCase();
        frase = frase.replace(" ", "");

        orden = frase.toCharArray();
        int pos = (orden.length - 1);
        char alReves[] = new char[orden.length];

        for (int i = 0; i < orden.length; i++) {
            alReves[pos] = orden[i];
            pos--;
        }

        palindromo = new String(alReves);
        
        if(palindromo.equals(frase)){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
    }
}
