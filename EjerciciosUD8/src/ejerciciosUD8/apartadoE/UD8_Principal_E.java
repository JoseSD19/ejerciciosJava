/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud8.apartadoE;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class UD8_Principal_E {

    public static void ejecutar1() {
        Scanner sc = new Scanner(System.in);
        int cantidad, punto, x, y;
        boolean seguir = true;

        System.out.println("Cuantos puntos quieres crear, todos se crearan con valores aleatorios");
        cantidad = sc.nextInt();
        Punto[] vectorPuntos = new Punto[cantidad];

        for (int i = 0; i < vectorPuntos.length; i++) {
            vectorPuntos[i] = Punto.creaPuntoAleatorio();
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

        System.out.println("Indiquie el nombre de la 2a persona: ");
        nombre = sc.nextLine();
        System.out.println("Indiquie los apellidos de 2a 1a persona: ");
        apellidos = sc.nextLine();
        System.out.println("Inidque el DNI de la 2a persona: ");
        dni = sc.nextLine();
        System.out.println("Indique la edad de la 2a persona: ");
        edad = sc.nextInt();
        sc.nextLine();
        Persona per2 = new Persona(dni, nombre, apellidos, edad);

        per1.imprime();
        per1.estado();
        
        per2.imprime();
        per2.estado();

        System.out.println("La diferencia entre las dos edades es de: " + per1.diferenciaEdad(per2));
    }

    public static void ejecutar3() {

        Scanner sc = new Scanner(System.in);

        int opcion, rec, cantidad;

        boolean seguir = true;

        System.out.println("Cuantos rectangulos quieres crear: ");
        cantidad = sc.nextInt();

        Rectangulo[] arrayRectangulos = new Rectangulo[cantidad];

        for (int i = 0; i < cantidad; i++) {
            arrayRectangulos[i] = Rectangulo.generarRectangulo();
        }

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
                        rec = (sc.nextInt() - 1);
                        if (rec > cantidad) {
                            System.out.println("No existe el rectangulo, hay " + cantidad);
                        }
                    } while (rec > cantidad);

                    System.out.println("El area del rectangulo " + (rec + 1) + " es: " + arrayRectangulos[rec].getArea());

                    break;
                case 2:
                    do {
                        System.out.println("De que rectangulo quieres calcular el perimetro");
                        rec = (sc.nextInt() - 1);
                        if (rec > cantidad) {
                            System.out.println("No existe el rectangulo, hay " + cantidad);
                        }
                    } while (rec > cantidad);

                    System.out.println("El perimetro del rectangulo " + (rec + 1) + " es: " + arrayRectangulos[rec].getPerimetro());

                    break;
                case 3:
                    int x1,y1,x2,y2;
                    
                    do {
                        System.out.println("De que rectangulo quieres cambiar los valores");
                        rec = (sc.nextInt() - 1);
                        if (rec > cantidad) {
                            System.out.println("No existe el rectangulo, hay " + cantidad);
                        }
                    } while (rec > cantidad);

                    System.out.println("Indica la coordenada X1: ");
                    x1 = sc.nextInt();
                    System.out.println("Indica la coordenada Y1: ");
                    y1 = sc.nextInt();
                    System.out.println("Indica la coordenada X2: ");
                    x2 = sc.nextInt();
                    System.out.println("Indica la coordenada Y2: ");
                    y2 = sc.nextInt();
                    arrayRectangulos[rec].setAll(x1, y1, x2, y2);

                    break;
                case 4:

                    for (int i = 0; i < arrayRectangulos.length; i++) {
                        arrayRectangulos[i].imprimir();
                    }
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

        int inventario, desc, art, cantidad, menuArticulos;
        char respuesta;
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        Articulo[] arrayArticulos;

        System.out.println("Cuantos articulos tienes en el inventario");
        inventario = sc.nextInt();

        arrayArticulos = new Articulo[inventario];

        for (int i = 0; i < arrayArticulos.length; i++) {
            arrayArticulos[i] = Articulo.nuevoArticulo();
        }

        do {
            System.out.println("Tienes " + inventario + " articulos, que quieres hacer:"
                    + "\n1)Ver PVP de los articulos"
                    + "\n2)Vender un articulo"
                    + "\n3)Almacenar un articulo"
                    + "\n4)Informacion de los articulos"
                    + "\n5)Salir");

            menuArticulos = sc.nextInt();
            sc.nextLine();

            switch (menuArticulos) {
                case 1:

                    for (int i = 0; i < arrayArticulos.length; i++) {
                        System.out.println("El articulo " + arrayArticulos[i].getNombre() + " ¿Tiene algun descuento?");
                        respuesta = sc.nextLine().toLowerCase().charAt(0);

                        if (respuesta == 's') {
                            System.out.println("Indica el descuento: ");
                            desc = sc.nextInt();
                            System.out.println("Aplicando un descuento de " + desc + "% queda en: " + arrayArticulos[i].PVPDescuento(desc)
                                    + "\n----------------------------------");
                        } else {
                            System.out.println("El precio de venta del product es: " + arrayArticulos[i].getPVP()
                                    + "\n----------------------------------");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Indica el articulo: ");
                    art = sc.nextInt();

                    System.out.println("Cuantos " + arrayArticulos[art].getNombre() + " quieres vender: ");
                    cantidad = sc.nextInt();
                    if (arrayArticulos[art].vender(cantidad)) {
                        System.out.println("Quedan " + arrayArticulos[art].getCuantosQuedan() + " " + arrayArticulos[art].getNombre() + " en el almacen");
                    } else {
                        System.out.println("No se pudo realizar la venta, solo hay " + arrayArticulos[art].getCuantosQuedan() + " " + arrayArticulos[art].getNombre() + " en el almacen");
                    }
                    break;
                case 3:
                    System.out.println("Indica el articulo: ");
                    art = sc.nextInt();

                    System.out.println("Cuantos " + arrayArticulos[art].getNombre() + " quieres almacenar: ");
                    cantidad = sc.nextInt();
                    arrayArticulos[art].almacenar(cantidad);

                    System.out.println("Ahora hay " + arrayArticulos[art].getCuantosQuedan() + " " + arrayArticulos[art].getNombre() + " en el almacen");
                    break;
                case 4:

                    for (int i = 0; i < arrayArticulos.length; i++) {
                        arrayArticulos[i].imprimir();
                    }
                    break;
                case 5:
                    seguir = false;
                    break;
                default:
                    System.err.println("No existe la opcion");
            }
        } while (seguir);
    }
}
