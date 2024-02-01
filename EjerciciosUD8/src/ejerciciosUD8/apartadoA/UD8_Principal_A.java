/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD8.apartadoA;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class UD8_Principal_A {

    public static void ejecutar1() {

        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();

        p1.x = 5;
        p1.y = 0;

        p2.x = 10;
        p2.y = 10;

        p3.x = (-3);
        p3.y = 7;

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
        Persona per1 = new Persona();
        Persona per2 = new Persona();

        System.out.println("Indiquie el nombre de la 1a persona: ");
        per1.nombre = sc.nextLine();
        System.out.println("Indiquie los apellidos de la 1a persona: ");
        per1.apellidos = sc.nextLine();
        System.out.println("Inidque el DNI de la 1a persona: ");
        per1.dni = sc.nextLine();
        System.out.println("Indique la edad de la 1a persona: ");
        per1.edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Indiquie el nombre de la 2a persona: ");
        per2.nombre = sc.nextLine();
        System.out.println("Indiquie los apellidos de 2a 1a persona: ");
        per2.apellidos = sc.nextLine();
        System.out.println("Inidque el DNI de la 2a persona: ");
        per2.dni = sc.nextLine();
        System.out.println("Indique la edad de la 2a persona: ");
        per2.edad = sc.nextInt();
        sc.nextLine();

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
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        int area, perimetro;

        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;

        r2.x1 = 2;
        r2.y1 = 3;
        r2.x2 = 7;
        r2.y2 = 9;

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
        Articulo art1 = new Articulo();
        double pvp;
        
        art1.nombre="Teclado";
        art1.precio=100;
        pvp = art1.precio+(art1.precio*art1.iva);
        System.out.println(art1.nombre+" - Precio:"+art1.precio+"$ - IVA: 21% - PVP: "+pvp+"$");
    }
}
