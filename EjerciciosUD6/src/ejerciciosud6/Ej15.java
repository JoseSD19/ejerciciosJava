/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej15 {
    void Ejecutar(){
        
        int tama�o, num;
        Scanner sc = new Scanner(System.in);
        
        //Pedimos el tama�o del array
        System.out.println("�Cuantos numeros desea introducir?");
        tama�o = sc.nextInt();
        //creamos el array del tama�o indicado
        int numeros[] = new int[tama�o];
        
        System.out.println("Introduzca el valor que desee para todo el vector: ");
        num = sc.nextInt();
        
        //__Arrays.fill()__ rellena el array del valor indicado entre los parentesis
        Arrays.fill(numeros, num);
        
        
        //__Arrays.toString()__ muestra el array de la siguiente manera [x, x, x]
        System.out.print(Arrays.toString(numeros));
        
    }
}
