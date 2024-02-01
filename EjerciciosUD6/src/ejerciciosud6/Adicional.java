/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Adicional {

    void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int cantidad, numProd;
        double precio;
        char respuesta;
        DecimalFormat df = new DecimalFormat("#.##");

        //validacion de max50 min1
        do {

            System.out.println("¿Cuantos productos desea introducir?(entre 1 y 50)");
            
            do {                
                if (!sc.hasNextInt()) {
                    System.out.println("Error, Introduzca un numero entre 1 y 50");
                }
                sc.nextLine();
            } while (!sc.hasNextInt());
            
            cantidad = sc.nextInt();

            if (cantidad < 1 || cantidad > 50) {
                System.out.println("Numero incorrecto, intentelo de nuevo");
            }

        } while (cantidad < 1 || cantidad > 50);

        double prod[] = new double[cantidad];

        //Desde aqui repite si dice que quiere ingresar otro percio
        do {

            //valida si el producto existe en el array
            do {
                System.out.println("¿Para que producto quiere agregar un precio?");
                
                do {                
                if (!sc.hasNextInt()) {
                    System.out.println("Error, Introduzca un numero valido");
                }
                sc.nextLine();
            } while (!sc.hasNextInt());
                
                numProd = sc.nextInt();

                if (numProd < 1 || numProd > prod.length) {
                    System.out.println("El producto " + numProd + " no se encuentra en los datos, solo hay " + cantidad);
                }
            } while (numProd < 1 || numProd > prod.length);

            //valida si el precio es mayor de 0
            do {
                System.out.println("¿Que precio quiere ingresar para el producto " + numProd + "?");
                precio = sc.nextDouble();

                if (precio < 0) {
                    System.out.println("Introduzcalo un precio mayor que 0");
                }
            } while (precio < 0);

            //asigna el precio al producto
            prod[(numProd - 1)] = precio;

            //limpiamos el Scanner para evitar fallos
            sc.nextLine();

            //mete el precio en el producto
            System.out.println("¿Quieres continuar registrando precios?");
            respuesta = sc.nextLine().toLowerCase().charAt(0);

            
        } while (respuesta == 's');

        //formatea el texto
        System.out.println("""
                           N\u00ba Producto \t Precio
                           ----------- \t ------""");
        
        //comprueba si hay precio en el pructo, de no haberlo mostrará un punto
        for (int i = 0; i < prod.length; i++) {
            if (prod[i] == 0) {
                System.out.println((i + 1) + " \t\t .");
            } else {
                System.out.println((i + 1) + " \t\t " + df.format(prod[i]) + "$");
            }
        }
    }
}
