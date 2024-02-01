/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Programa {

    public static void ejecutar() {
        boolean seguir = true;
        int empleado, empresa;
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Empresa> empresas = new ArrayList<>();
        
        do {
            switch (menu()) {
                case 1:
                    empresas.add(crearEmpresa());
                    break;
                case 2:
                    empleados.add(crearEmpleado());
                    break;
                case 3:
                    mostrarEmpresas(empresas);
                    System.out.println("Que empresas quieres gestionar: ");
                    empresa=sc.nextInt();
                    sc.nextLine();
                    boolean otraGestion = true;
                    do {
                        switch (menuGestion()) {
                            
                            case 1:
                                mostrarEmpleados(empleados);
                                System.out.println("Teniendo estos empleados, cual quieres añadir: ");
                                empleado = sc.nextInt();
                                empresas.get(empresa-1).añadirEmpelado(empleados.get(empleado-1));
                                break;
                            case 2:
                                empresas.get(empresa-1).mostarInfo();
                                System.out.println("Teniendo estos empleados, cual quieres eliminar: ");
                                empleado = sc.nextInt();
                                empresas.get(empresa-1).eliminarEmpleado(empleados.get(empleado-1));
                                break;
                            case 3:
                                empresas.get(empresa-1).mostrarEmpleados();
                                break;
                            case 4:
                                empresas.get(empresa-1).mostarInfo();
                                break;
                            case 5:
                                otraGestion=false;
                                break;
                            default:
                                System.err.println("Opcion incorrecta");
                        }
                    } while (otraGestion);
                    break;
                case 4:
                    seguir = false;
                    break;
                default:
                    System.err.println("Opcion incorrecta");
            }
        } while (seguir);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Que quieres hacer:
                           1)Crear una empresa
                           2)Crear un empleado
                           3)Gestionar empleados
                           4)Salir""");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static int menuGestion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           1)Añadir un empleado
                           2)Eliminar un empelado
                           3)Listar todos los empleados
                           4)Mostrar todos los sueldos
                           5)Salir""");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static Empresa crearEmpresa() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique el nombre de la empresa: ");
        String nombre = sc.nextLine();

        System.out.print("Se generara un cif aleatorio: ");
        String cif = "X" + (int)(Math.random() * 8999 + 1000);
        System.out.println(cif);

        System.out.print("Indique el telefono: ");
        int tlf = sc.nextInt();
        sc.nextLine();

        System.out.print("Indica la direccion: ");
        String direccion = sc.nextLine();

        return new Empresa(nombre, cif, direccion, tlf);
    }

    public static Empleado crearEmpleado() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Indica el DNI: ");
        String dni = sc.nextLine();

        System.out.print("Indica el sueldo bruto: ");
        double sueldo = sc.nextDouble();

        return new Empleado(nombre, dni, sueldo);
    }

    public static void mostrarEmpresas(ArrayList<Empresa> e) {
        for(int i=0;i<e.size();i++) {
            System.out.println((i+1) + ") "+e.get(i).getNombre());
        }
    }
    
    public static void mostrarEmpleados(ArrayList<Empleado> e) {
        for(int i=0;i<e.size();i++) {
            System.out.print((i+1) + ") ");
            e.get(i).imprimir();
        }
    }
}
