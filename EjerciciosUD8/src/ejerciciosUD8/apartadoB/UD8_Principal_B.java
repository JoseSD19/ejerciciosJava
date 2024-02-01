/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD8.apartadoB;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class UD8_Principal_B {

    public static void ejecutar1() {

        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);

        System.out.println("Las coordenadas del punto 1 son [" + p1.x + "," + p1.y + "]");
        System.out.println("Las coordenadas del punto 2 son [" + p2.x + "," + p2.y + "]");
        System.out.println("Las coordenadas del punto 3 son [" + p3.x + "," + p3.y + "]");

        p1.x *= 2;
        p1.y += 2;

        p2.x -= 2;
        p2.y /= 2;

        p3.x += 3;
        p3.y -= 2;

        System.out.println("-------------------------------------------------");

        System.out.println("Las coordenadas del punto 1 modificado son [" + p1.x + "," + p1.y + "]");
        System.out.println("Las coordenadas del punto 2 modificado son [" + p2.x + "," + p2.y + "]");
        System.out.println("Las coordenadas del punto 3 modificado son [" + p3.x + "," + p3.y + "]");

    }

    public static void ejecutar2() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, dni;
        int edad;

        //Para la primera persona usamos el constructor de 4 parametros
        System.out.println("Indiquie el nombre de la 1a persona: ");
        nombre = sc.nextLine();
        System.out.println("Indiquie los apellidos de la 1a persona: ");
        apellidos = sc.nextLine();
        System.out.println("Inidque el DNI de la 1a persona: ");
        dni = sc.nextLine();
        System.out.println("Indique la edad de la 1a persona: ");
        edad = sc.nextInt();
        sc.nextLine();
        Persona per1 = new Persona(dni, nombre, apellidos, edad);

        //Para la segunda persona usamos el constructor de 3 parametros
        System.out.println("Indiquie el nombre de la 2a persona: ");
        nombre = sc.nextLine();
        System.out.println("Indiquie los apellidos de 2a 1a persona: ");
        apellidos = sc.nextLine();
        System.out.println("Indique la edad de la 2a persona: ");
        edad = sc.nextInt();
        sc.nextLine();

        Persona per2 = new Persona(nombre, apellidos, edad);

        if (per1.edad >= 18) {
            System.out.println(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni + " es mayor de edad");
        } else {
            System.out.println(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni + " no es mayor de edad");
        }

        if (per2.edad >= 18) {
            System.out.println(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni + " es mayor de edad");
        } else {
            System.out.println(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni + " no es mayor de edad");
        }
    }

    public static void ejecutar3() {
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(2, 3, 7, 9);

        int area, perimetro;

        perimetro = (Math.abs(r1.x2) - Math.abs(r1.x1)) * 4;
        area = (Math.abs(r1.x2) - Math.abs(r1.x1)) * (Math.abs(r1.y2) - Math.abs(r1.y1));
        System.out.println("Las coordenadas del rectangulo 1 son : (" + r1.x1 + "," + r1.y1 + ") y (" + r1.x2 + "," + r1.y2 + ")"
                + "\nEl perimetro del rectangulo 1 es: " + perimetro
                + "\nEl area del rectangulo 1 es: " + area);

        perimetro = ((Math.abs(r1.x2) - Math.abs(r1.x1)) + (Math.abs(r1.y2) - Math.abs(r1.y1))) * 2;
        area = (Math.abs(r1.x2) - Math.abs(r1.x1)) * (Math.abs(r1.y2) - Math.abs(r1.y1));

        System.out.println("Las coordenadas del rectangulo 2 son : (" + r2.x1 + "," + r2.y1 + ") y (" + r2.x2 + "," + r2.y2 + ")"
                + "\nEl perimetro del rectangulo 1 es: " + perimetro
                + "\nEl area del rectangulo 1 es: " + area);
    }

    public static void ejecutar4() {
        String nombre;
        double pvp, precio, iva;
        int quedan;
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el nombre del producto: ");
        nombre = sc.nextLine();
        System.out.println("Indique el precio del producto: ");
        precio = sc.nextDouble();
        System.out.println("Indique el IVA del producot: ");
        iva = sc.nextDouble() / 100;
        System.out.println("Cuantos quedan en el almacen");
        quedan = sc.nextInt();
        sc.nextLine();
        Articulo art1 = new Articulo(nombre, precio, iva, quedan);

        pvp = art1.precio + (art1.precio * art1.iva);
        System.out.println(art1.nombre + " - Precio:" + art1.precio + "$ - IVA: " + art1.iva * 100 + "% - PVP: " + pvp + "$ - Quedan: "+art1.cuantosQuedan);
    }
}
