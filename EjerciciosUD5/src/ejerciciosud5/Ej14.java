/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud5;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, valor=500, billetes;
        
        System.out.println("Escribe la cantidad de dinero: ");
        cantidad = entrada.nextInt();
        
        do{            
            billetes = cantidad / valor;
            cantidad = cantidad % valor;
            System.out.println(billetes +" billetes de "+valor);
            switch (valor) {
                case 500:
                    valor=200;
                    break;
                case 200:
                    valor=100;
                    break;
                case 100:
                    valor=50;
                    break;
                case 50:
                    valor=20;
                    break;
                case 20:
                    valor=10;
                    break;
                case 10:
                    valor=5;
                    break;
                default:
                    System.out.println("y algunas monedas");
                    cantidad = 0;
            }
        }while(cantidad > 0);
    }
}
