/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut4_p1_Jose_Sanchez;

import java.util.Scanner;

/**
 * @author Jose Sanchez Diaz
 */
public class UT4_P1_Jose_Sanchez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1, num2, sum, res, mul, div, pot;
        String nombre;
        int operacion;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca su nombre: ");
        nombre = entrada.next();
        
        System.out.println("Bienvenido al sistema " + nombre 
        + "\nPor favor, indique la operacion matematica que desea realizar:"
        + "\n1)Suma"
        + "\n2)Resta"
        + "\n3)Multiplicacion"
        + "\n4)Division"
        + "\n5)Potencia");
        
        operacion = entrada.nextInt();
        
        //Se crea un switch para ejecutar la operacion introducida
        
        switch (operacion) {
            //Se crea un caso para cada operacion:
            
            case 1:
                System.out.println("Introduzca uno de los sumandos: ");
                num1 = entrada.nextDouble();
                System.out.println("Introduzca el otro sumando: ");
                num2 = entrada.nextDouble();
                
                if (num1 >= 0 && num2 >= 0) {
                    sum = num1 + num2;
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es igual a " + (Math.round(sum * 100) / 100d));
                    //_Math.round(x*100)/100d_--redondea un numero a 2 decimales--
                } else {
                    System.out.println("Operacion incorrecta."
                        + "\nPor favor introduzca numeros positivos.");
                }
            break;
                
            case 2:
                System.out.println("Introduzca el minuendo: ");
                num1 = entrada.nextDouble();
                System.out.println("Introduzca el sustraendo: ");
                num2 = entrada.nextDouble();
                
                if (num1 >= 0 && num2 >= 0) {
                    res = num1 - num2;
                    System.out.println("La resta entre " + num1 + " y " + num2 + " es igual a " + (Math.round(res * 100) / 100d));
                } else {
                    System.out.println("Operacion incorrecta."
                        + "\nPor favor introduzca numeros positivos.");
                }
            break;
                
            case 3:
                System.out.println("Introduzca uno de los productos: ");
                num1 = entrada.nextDouble();
                System.out.println("Introduzca el otro producto: ");
                num2 = entrada.nextDouble();
                
                if (num1 >= 0 && num2 >= 0) {
                    mul = num1 * num2;
                    System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es igual a " + (Math.round(mul * 100) / 100d));
                } else {
                    System.out.println("Operacion incorrecta."
                        + "\nPor favor introduzca numeros positivos.");
                }
            break;
                
            case 4:
                System.out.println("Introduzca el dividendo: ");
                num1 = entrada.nextDouble();
                System.out.println("Introduzca el divisor: ");
                num2 = entrada.nextDouble();
                
                if (num1 >= 0 && num2 >= 0) {
                    if (num2 > 0) {
                        div = num1 / num2;
                        System.out.println("La division de " + num1 + " entre " + num2 + " es igual a " + (Math.round(div * 100) / 100d));
                    } else {
                        System.out.println("No se puede dividir entre 0");
                    }
                } else {
                    System.out.println("Operacion incorrecta."
                        + "\nPor favor introduzca numeros positivos.");
                }
            break;
                
            case 5:
                System.out.println("Introduzca la base: ");
                num1 = entrada.nextDouble();
                System.out.println("Introduzca la potencia: ");
                num2 = entrada.nextDouble();
                
                if (num1 >= 0 && num2 >= 0) {
                    pot = Math.pow(num1, num2);
                    System.out.println("La potencia de " + num1 + " elevado a " + num2 + " es igual a " + (Math.round(pot * 100) / 100d));
                } else {
                    System.out.println("Operacion incorrecta."
                        + "\nPor favor introduzca numeros positivos.");
                }
            break;
                
            default:
                System.out.println("Por favor indique una opcion valida");
        }
    }
    
}