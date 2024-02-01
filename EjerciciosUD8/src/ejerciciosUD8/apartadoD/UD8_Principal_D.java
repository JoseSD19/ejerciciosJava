/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD8.apartadoD;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class UD8_Principal_D {

    public static void ejecutar1() {
        Scanner sc = new Scanner(System.in);
        int cantidad, punto, x, y;
        boolean seguir = true;

        System.out.println("Cuantos puntos quieres crear, todos se crearan a [0,0]");
        cantidad = sc.nextInt();
        Punto[] vectorPuntos = new Punto[cantidad];

        for (int i = 0; i < vectorPuntos.length; i++) {
            vectorPuntos[i] = new Punto(0, 0);
        }

        do {

            switch (Punto.menuPunto()) {
                case 1:
                    System.out.println("Que punto quieres modificar");
                    punto = (sc.nextInt() - 1);

                    System.out.println("Indique posicion X: ");
                    x = sc.nextInt();

                    System.out.println("Indique posicion Y: ");
                    y = sc.nextInt();

                    vectorPuntos[punto].setXY(x, y);

                    break;
                case 2:
                    System.out.println("Que punto quieres desplazar");
                    punto = (sc.nextInt() - 1);

                    System.out.println("Desplazamiento en la x: ");
                    x = sc.nextInt();
                    System.out.println("Desplazamiento en la y: ");
                    y = sc.nextInt();

                    vectorPuntos[punto].desplaza(x, y);
                    break;
                case 3:
                    System.out.println("Que punto quieres que sea el orgien (entre 1 y " + vectorPuntos.length + ")");
                    int puntoOrigen = sc.nextInt() - 1;

                    System.out.println("Hacia que punto quieres medir la distancia (entre 1 y " + vectorPuntos.length + ")");
                    int puntoFinal = sc.nextInt() - 1;

                    double distancia = vectorPuntos[puntoOrigen].distancia(vectorPuntos[puntoFinal]);
                    System.out.println("La distancia entre esos puntos es: " + distancia);
                    break;
                case 4:
                    System.out.println("De que punto quieres ver las coordenadas");
                    punto = sc.nextInt() - 1;

                    vectorPuntos[punto].imprime();
                    break;

                case 5:
                    for (int i = 0; i < vectorPuntos.length; i++) {
                        vectorPuntos[i].imprime();
                    }
                    break;
                case 6:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta introduzca otra");

            }
        } while (seguir);
    }

    public static void ejecutar2() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, dni;
        int edad;

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

        System.out.println("Indiquie el nombre de la 1a persona: ");
        nombre = sc.nextLine();
        System.out.println("Indiquie los apellidos de la 1a persona: ");
        apellidos = sc.nextLine();
        System.out.println("Inidque el DNI de la 1a persona: ");
        dni = sc.nextLine();
        System.out.println("Indique la edad de la 1a persona: ");
        edad = sc.nextInt();
        sc.nextLine();
        Persona per2 = new Persona(dni, nombre, apellidos, edad);

        if (per1.esMayorEdad()) {
            per1.imprime();
            System.out.println("\nEs mayor de edad");
        }

        if (per2.esMayorEdad()) {
            per2.imprime();
            System.out.println("\nEs mayor de edad");
        }

        if (per1.esJubilado()) {
            per1.imprime();
            System.out.println("\nEs jubilado");
        }

        if (per2.esJubilado()) {
            per2.imprime();
            System.out.println("\nEs jubilado");
        }

        System.out.println("La diferencia entre las dos edades es de: " + per1.diferenciaEdad(per2));
    }

    public static void ejecutar3() {
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(7, 9, 2, 3);
        Scanner sc = new Scanner(System.in);

        int opcion, rec;

        boolean seguir = true;

        do {
            System.out.println("Que quieres hacer: "
                    + "\n1)Calcular el area de un rectangulo"
                    + "\n2)Calcular el perimetro de un rectangulo"
                    + "\n3)Cambiar los valores de un rectangulo"
                    + "\n4)Mostrar coordenadas de los rectangulos"
                    + "\n5)Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("De que rectangulo quieres calcular el area");
                        rec = sc.nextInt();
                        if (rec > 2) {
                            System.out.println("No existe el rectangulo, solo hay 2");
                        }
                    } while (rec > 2);
                    switch (rec) {
                        case 1:
                            System.out.println("El area del rectangulo 1 es: " + r1.getArea());
                            break;
                        case 2:
                            System.out.println("El area del rectangulo 2 es: " + r2.getArea());
                            break;
                    }
                    break;
                case 2:
                    do {
                        System.out.println("De que rectangulo quieres calcular el perimetro");
                        rec = sc.nextInt();
                        if (rec > 2) {
                            System.out.println("No existe el rectangulo, vuelva a intentarlo");
                        }
                    } while (rec > 2);

                    switch (rec) {
                        case 1:
                            System.out.println("El perimetro del rectangulo 1 es: " + r1.getPerimetro());
                            break;
                        case 2:
                            System.out.println("El perimetro del rectangulo 2 es: " + r2.getPerimetro());
                            break;
                    }
                    break;
                case 3:
                    int x1,y1,x2,y2;
                     
                    do {
                        System.out.println("De que rectangulo quieres cambiar los valores");
                        rec = sc.nextInt();
                        if (rec > 2) {
                            System.out.println("No existe el rectangulo, vuelva a intentarlo");
                        }
                    } while (rec > 2);
                    switch (rec) {
                        case 1:

                            System.out.println("Indica la coordenada X1: ");
                            x1 = sc.nextInt();
                            System.out.println("Indica la coordenada Y1: ");
                            y1 = sc.nextInt();
                            System.out.println("Indica la coordenada X2: ");
                            x2 = sc.nextInt();
                            System.out.println("Indica la coordenada Y2: ");
                            y2 = sc.nextInt();
                            r1.setAll(x1, y1, x2, y2);

                            break;
                        case 2:

                            System.out.println("Indica la coordenada X1: ");
                            x1 = sc.nextInt();
                            System.out.println("Indica la coordenada Y1: ");
                            y1 = sc.nextInt();
                            System.out.println("Indica la coordenada X2: ");
                            x2 = sc.nextInt();
                            System.out.println("Indica la coordenada Y2: ");
                            y2 = sc.nextInt();
                            r2.setAll(x1, y1, x2, y2);

                            break;
                    }
                    break;
                case 4:
                    r1.imprimir();
                    r2.imprimir();
                    break;
                case 5:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (seguir);

    }

    public static void ejecutar4() {
        String nombre;
        double precio, iva;
        int quedan, desc, opcion, cantidad;
        char respuesta;
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

        art1.imprimir();

        System.out.println("¿Tiene algun descuento?");
        respuesta = sc.nextLine().toLowerCase().charAt(0);

        if (respuesta == 's') {
            System.out.println("Indica el descuento: ");
            desc = sc.nextInt();
            System.out.println("Aplicando un descuento de " + desc + "% queda en: " + art1.PVPDescuento(desc));
        } else {
            System.out.println("El precio de venta del product es: " + art1.getPVP());
        }

        boolean seguir = true;
        do {
            System.out.println("Que quieres hacer: "
                    + "\n1) Vender"
                    + "\n2) Almacenar"
                    + "\n3) Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuantos quieres vender: ");
                    cantidad = sc.nextInt();
                    if (art1.vender(cantidad)) {
                        System.out.println("Quedan " + art1.getCuantosQuedan() + " " + art1.getNombre() + " en el almacen");
                    } else {
                        System.out.println("No se pudo realizar la venta, solo hay " + art1.getCuantosQuedan() + " " + art1.getNombre() + " en el almacen");
                    }
                    break;
                case 2:
                    System.out.println("Cuantos quieres almacenar: ");
                    cantidad = sc.nextInt();
                    art1.almacenar(cantidad);

                    System.out.println("Ahora hay " + art1.getCuantosQuedan() +" " + art1.getNombre() + " en el almacen");
                    break;
                case 3:
                    seguir = false;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (seguir);
    }
}
