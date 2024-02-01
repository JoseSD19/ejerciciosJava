/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD8.apartadoC;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class UD8_Principal_C {

    public static void ejecutar1() {

        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(-3,7);
        
        int x,y;

        System.out.println("Las coordenadas del punto 1 son [" + p1.getX() + "," + p1.getY() + "]");
        System.out.println("Las coordenadas del punto 2 son [" + p2.getX() + "," + p2.getY() + "]");
        System.out.println("Las coordenadas del punto 3 son [" + p3.getX() + "," + p3.getY() + "]");

        System.out.println("-------------------------------------------------");

        x=p1.getX()*2;
        y=p1.getY()*2;
        System.out.println("Las coordenadas modificadas del Punto 1 son ["+ x + "," + y + "]");
        
        x=p2.getX()/4;
        y=p2.getY()/4;
        System.out.println("Las coordenadas modificadas del Punto 1 son ["+ x + "," + y + "]");
        
        x=p3.getX()-5;
        y=p3.getY()-5;
        System.out.println("Las coordenadas modificadas del Punto 31 son ["+ x + "," + y + "]");

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
        
        Persona per2 = new Persona( nombre, apellidos, edad);

        if (per1.getEdad() >= 18) {
            System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni() + " es mayor de edad");
        } else {
            System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni() + " no es mayor de edad");
        }

        if (per2.getEdad() >= 18) {
            System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con DNI " + per2.getDni() + " es mayor de edad");
        } else {
            System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con DNI " + per2.getDni() + " no es mayor de edad");
        }
    }

    public static void ejecutar3() {
        Rectangulo r1 = new Rectangulo(0, 5, 0, 5);
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
                            r1.setX1(sc.nextInt());
                            System.out.println("Indica la coordenada Y1: ");
                            r1.setY1(sc.nextInt());
                            System.out.println("Indica la coordenada X2: ");
                            r1.setX2(sc.nextInt());
                            System.out.println("Indica la coordenada Y2: ");
                            r1.setY2(sc.nextInt());

                            break;
                        case 2:

                            System.out.println("Indica la coordenada X1: ");
                            r2.setX1(sc.nextInt());
                            System.out.println("Indica la coordenada Y1: ");
                            r2.setY1(sc.nextInt());
                            System.out.println("Indica la coordenada X2: ");
                            r2.setX2(sc.nextInt());
                            System.out.println("Indica la coordenada Y2: ");
                            r2.setY2(sc.nextInt());
                            

                            break;
                    }
                    break;
                case 4:
                    System.out.println("Coordenadas del 1er rectangulo: ["+r1.getX1()+","+r1.getY1()+"] ["+r1.getX2()+","+r1.getY2()+"]");
                    System.out.println("Coordenadas del 1er rectangulo: ["+r2.getX1()+","+r2.getY1()+"] ["+r2.getX2()+","+r2.getY2()+"]");
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
        double pvp, precio, iva;
        int quedan;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique el nombre del producto: ");
        nombre=sc.nextLine();
        System.out.println("Indique el precio del producto: ");
        precio=sc.nextDouble();
        System.out.println("Indique el IVA del producot: ");
        iva =sc.nextDouble()/100;
        System.out.println("Cuantos quedan en el almacen");
        quedan = sc.nextInt();
        sc.nextLine();
        Articulo art1 = new Articulo(nombre, precio,iva,quedan);
        
        pvp = art1.getPrecio()+(art1.getPrecio()*art1.getIva());
        System.out.println(art1.getNombre()+" - Precio:"+art1.getPrecio()+"$ - IVA: "+art1.getIva()*100+"% - PVP: "+pvp+"$ - Quedan: "+art1.getCuantosQuedan());
        
    }
}
