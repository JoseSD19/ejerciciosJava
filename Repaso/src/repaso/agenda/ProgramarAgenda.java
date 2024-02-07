/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.agenda;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ProgramarAgenda {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean seguir = true;

        do {
            switch (menu()) {
                case 1:
                    if (agenda.addContacto(crearContacto())) {
                        System.out.println("Se ha agregado correctamente");
                    } else {
                        System.out.println("No se ha podido agregar");
                    }
                    break;
                case 2:
                    System.out.println("A quien quiere eliminar: ");
                    String nombre = sc.nextLine();
                    if (agenda.eliminarContacto(nombre)) {
                        System.out.println("Se ha eliminado correctamente");
                    } else {
                        System.out.println("No se ha podido eliminar");
                    }
                    break;
                case 3:
                    System.out.println("Que contacto quieres comprobar: ");
                    nombre = sc.nextLine();
                    if (agenda.existeContacto(nombre)) {
                        System.out.println("Ese contacto existe en la agenda");
                    } else {
                        System.out.println("Ese contacto no existe");
                    }

                    break;
                case 4:
                    agenda.listarContactos();
                    break;
                case 5:
                    System.out.println("Que contacto quieres buscar: ");
                    nombre = sc.nextLine();

                    if (agenda.buscarContacto(nombre) == -1) {
                        System.out.println("El contacto no se ha encontrado");
                    } else {
                        System.out.println("Esta en la posicion " + (agenda.buscarContacto(nombre) + 1));
                    }
                    break;
                case 6:
                    seguir = false;
                    break;
                default:
                    System.err.println("OPCION INCORRECTA");
            }
        } while (seguir);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Que quieres hacer:
                           1)AÃ±adir un contacto
                           2)Eliminar un contacto
                           3)Comprobar contacto
                           4)Listar agenda
                           5)Buscar nombre
                           6)Salir
                           """);
        return sc.nextInt();
    }

    public static Contacto crearContacto() {
        Scanner sc = new Scanner(System.in);
        char tipo;

        do {
            System.out.println("¿Persona o Empresa?");
            tipo = sc.nextLine().toLowerCase().charAt(0);
            if (tipo != 'p' && tipo != 'e') {
                System.out.println("Tipo incorrecto");
            }

        } while (tipo != 'p' && tipo != 'e');

        System.out.println("Indica el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Indica el telefono: ");
        int tlfno = sc.nextInt();
        sc.nextLine();
        if (tipo == 'p') {
            System.out.println("Indica el cumpleaños: ");
            System.out.println("dia:");
            int dia = sc.nextInt();
            System.out.println("mes:");
            int mes = (sc.nextInt()-1);
            System.out.println("año:");
            int año = sc.nextInt();

            return new ContactoPersona(nombre, tlfno, año, mes, dia);
        } else {
            System.out.println("Indica la web: ");
            String web = sc.nextLine();
            return new ContactoEmpresa(nombre, web, tlfno);
        }

    }
}
