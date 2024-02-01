/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD7;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ej21 {

    final static double pi = 3.14;
    

    public static void Ejecutar() {
        boolean seguir = true;

        do {
            switch (menu()) {
                case 1:
                    System.out.println("La circunferencia es: " + circunferencia(pideRadio()));
                    break;
                case 2:
                    System.out.println("El area es: " + area(pideRadio()));
                    break;
                case 3:
                    System.out.println("El volumen es: " + volumen(pideRadio()));
                    break;
                case 4:
                    double radio = pideRadio();
                    System.out.println("La circunferencia es: " + circunferencia(radio)
                            + "\nEl area es: " + area(radio)
                            + "\nEl volumen es: " + volumen(radio));
                    break;
                case 5:
                    seguir = false;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (seguir);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Elija una opcion:"
                + "\n1. Circunferencia"
                + "\n2. Area"
                + "\n3. Volumen"
                + "\n4. Todas"
                + "\n5. Salir");
        opcion = sc.nextInt();
        return opcion;
    }

    public static double pideRadio() {
        Scanner sc = new Scanner(System.in);
        double radio;

        System.out.println("Introduzca el radio: ");
        radio = sc.nextDouble();

        return radio;

    }

    public static double circunferencia(double r) {
        return 2 * pi * r;
    }

    public static double area(double r) {
        return pi * r * r;
    }

    public static double volumen(double r) {
        return (4.0 / 3.0) * pi * (r * r * r);
    }
}
