/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Inventario {
    
    public static void ejecutar() {
        
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        
        Perro p1 = new Perro("Rex", "Vivo", "13/01/2019", "Border Collie", 5, false);
        Perro p2 = new Perro("Firulais", "Vivo", "30/10/2020", "Border Collie", 3, true);
        
        Gato g1 = new Gato("Michi", "Vivo", "25/05/2015", 8, "Negro", true);
        Gato g2 = new Gato("Razor", "Vivo", "02/01/2018", 6, "Naranja", false);
        
        Loro l1 = new Loro("Loro1", "Vivo", "29/02/2016", 7, "Curvo", true, "Panama", true);
        Loro l2 = new Loro("Loro2", "Vivo", "07/11/2019", 3, "Curvo", false, "Colombia", false);
        
        Canario c1 = new Canario("Piolin", "Vivo", "06/04/2014", 9, "Corto", true, "Amarillo", true);
        Canario c2 = new Canario("Pollito", "Vivo", "06/09/2016", 7, "Corto", false, "Amarillo", false);
        
        ArrayList<Mascotas> animales = new ArrayList<>();
        
        animales.add(p1);
        animales.add(p2);
        
        animales.add(g1);
        animales.add(g2);
        
        animales.add(l1);
        animales.add(l2);
        
        animales.add(c1);
        animales.add(c2);

        Iterator<Mascotas> it = animales.iterator();
        
        do {
            switch (menu()) {
                case 1:
                    it = animales.iterator();
                    while (it.hasNext()) {
                        Mascotas m = it.next();
                        System.out.println(m.nombre + " es un " + tipoAnimal(m));
                    }
                    break;
                case 2:
                    String animal;
                    int indice = -1;
                    it=animales.iterator();
                    System.out.println("Teniendo los siguientes animales: ");
                    while (it.hasNext()) {
                        Mascotas m = it.next();
                        System.out.println(m.nombre + " ");
                    }
                    System.out.println("De quien quieres conocer la informacion: ");
                    animal = sc.nextLine().toLowerCase();
                    
                    it = animales.iterator();
                    
                    while (it.hasNext()) {
                        Mascotas m = it.next();
                        if (m.nombre.toLowerCase().equals(animal)) {
                            indice = animales.indexOf(m);
                        }
                    }
                    if (indice != -1) {
                        animales.get(indice).muestra();
                        System.out.println("");
                    } else {
                        System.out.println("El animal no existe");
                    }
                    
                    break;
                case 3:
                    it = animales.iterator();
                    while (it.hasNext()) {
                        it.next().muestra();
                        System.out.println("");
                    }
                    break;
                case 4:
                    char tipo;
                    boolean repetir = false;
                    
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    String fechaNacimiento = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    
                    do {
                        System.out.print("Que tipo de animal es: ");
                        tipo = sc.nextLine().toLowerCase().charAt(0);
                        
                        switch (tipo) {
                            case 'p':
                                System.out.print("Raza: ");
                                String raza = sc.nextLine();
                                System.out.println("Tiene pulgas");
                                boolean pulgas = sc.nextLine().toLowerCase().charAt(0) == 's';
                                
                                Perro p = new Perro(nombre, "Vivo", fechaNacimiento, raza, edad, pulgas);
                                animales.add(p);
                                break;
                            case 'g':
                                System.out.print("Color: ");
                                String color = sc.nextLine();
                                System.out.println("Tiene pelo largo");
                                boolean peloLargo = sc.nextLine().toLowerCase().charAt(0) == 's';
                                
                                Gato g = new Gato(nombre, "Vivo", fechaNacimiento, edad, color, peloLargo);
                                animales.add(g);
                                break;
                            case 'l':
                                System.out.print("Origen: ");
                                String origen = sc.nextLine();
                                System.out.print("Pico: ");
                                String picoL = sc.nextLine();
                                System.out.println("Sabe hablar");
                                boolean hablar = sc.nextLine().toLowerCase().charAt(0) == 's';
                                
                                Loro l = new Loro(nombre, "Vivo", fechaNacimiento, edad, picoL, hablar, origen, hablar);
                                animales.add(l);
                                break;
                            case 'c':
                                System.out.print("Color: ");
                                String colorC = sc.nextLine();
                                System.out.print("Pico: ");
                                String picoC = sc.nextLine();
                                System.out.println("Sabe cantar");
                                boolean cantar = sc.nextLine().toLowerCase().charAt(0) == 's';
                                System.out.println("Sabe volar");
                                boolean vuela = sc.nextLine().toLowerCase().charAt(0) == 's';
                                
                                Canario c = new Canario(nombre, "Vivo", fechaNacimiento, edad, picoC, vuela, colorC, cantar);
                                animales.add(c);
                                break;
                            default:
                                repetir = true;
                        }
                    } while (repetir);
                    System.out.println(animales.size());
                    break;
                case 5:
                    int ind=-1;
                    
                    System.out.println("Que animal ha muerto");
                    String muerto = sc.nextLine().toLowerCase();
                    
                    it = animales.iterator();
                    
                    while (it.hasNext()) {
                        Mascotas m = it.next();
                        if (m.nombre.toLowerCase().equals(muerto)) {
                            m.morir();
                            ind=animales.indexOf(m);
                        }
                    }
                    animales.remove(ind);
                    break;
                case 6:
                    animales.clear();
                    break;
                case 7:
                    seguir = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (seguir);
    }
    
    public static String tipoAnimal(Mascotas m) {
        String tipo = "";
        
        if (m instanceof Perro) {
            tipo = "perro";
        } else if (m instanceof Gato) {
            tipo = "gato";
        } else if (m instanceof Loro) {
            tipo = "loro";
        } else if (m instanceof Canario) {
            tipo = "canario";
        }
        return tipo;
    }
    
    public static int menu() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que quieres hacer:"
                + "\n1)Mostrar lista de animales"
                + "\n2)Mostrar todos los datos de un animal concreto"
                + "\n3)Mostrar todos los datos de todos los animales"
                + "\n4)Insertar un animal"
                + "\n5)Eliminar un animal"
                + "\n6)Vaciar el inventario"
                + "\n7)Salir");
        opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
    
}
