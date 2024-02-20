/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Metodos {

    /**
     * Metodo para comprobar la matricula
     *
     * @param matricula String con la matricula
     * @return int con la clase del vehiculo
     */
    public static int comprobarMatricula(String matricula) {
        int clase;

        if (matricula.matches("[0-9]{4}[a-z,A-Z]{3}")) {
            clase = 1;//tierra
        } else if (matricula.matches("[0-9]{3}[a-z,A-Z]{10}")) {
            clase = 2;//mar
        } else if (matricula.matches("[0-9]{6}[a-z,A-Z]{4}")) {
            clase = 3;//aire
        } else {
            clase = 4;//fallo
        }

        return clase;
    }

    /**
     * Metodo para comprobar si el vehiculo es tierra, mar o aire
     *
     * @param clase int con la clase del vehiculo
     * @return int con el tipo de vehiculo
     */
    public static int comprobarClase(String clase) {
        int tipo;

        switch (clase.toLowerCase()) {
            case "tierra":
                tipo = 1;
                break;
            case "mar":
                tipo = 2;
                break;
            case "aire":
                tipo = 3;
                break;
            default:
                tipo = 4;
                break;
        }
        return tipo;
    }

    /**
     * Metodo para comprobar si el vehiculo y la matricula estan bien
     *
     * @param matricula
     * @param clase
     * @return
     */
    public static boolean comprobarClaseMatricula(String matricula, String clase) {
        if (comprobarMatricula(matricula) == 4) {
            return false;
        } else if (comprobarMatricula(matricula) == comprobarClase(clase)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que muestra un menu y recoge la opcion escogida
     *
     * @return int con la opcion escogida
     */
    public static int menu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                         
                           Que quieres hacer:
                           1)Crear Vehiculo
                           2)Ver Vehiculos
                           3)Eliminar Vehiculo
                           4)Salir
                           
                           Opcion: """);

        return sc.nextInt();
    }

    /**
     * Metodo que muestra un menu y recoge la opcion escogida
     *
     * @return int con la opcion escogida
     */
    public static int menuCreacion() {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                         
                           Que tipo de vehiculo quieres crear:
                           1)Terrestre
                           2)Acuatico
                           3)Aereo
                           4)Ninguno
                           
                           Opcion: """);
        return sc.nextInt();
    }

    /**
     * Metodo que muestra un menu y recoge la opcion escogida
     *
     * @return int con la opcion escogida
     */
    public static int menuTierra() {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                         
                           Que quieres crear
                           1)Coche
                           2)Moto
                         
                           Opcion: """);
        return sc.nextInt();
    }

    /**
     * Metodo que muestra un menu y recoge la opcion escogida
     *
     * @return int con la opcion escogida
     */
    public static int menuAire() {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                         
                           Que quieres crear
                           1)Avion
                           2)Helicoptero
                           
                           Opcion: """);
        return sc.nextInt();
    }

    /**
     * Metodo que muestra un menu y recoge la opcion escogida
     *
     * @return int con la opcion escogida
     */
    public static int menuAgua() {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                         
                           Que quieres crear
                           1)Barco
                           2)Submarino
                         
                           Opcion: """);
        return sc.nextInt();
    }

    /**
     * Metodo para crear un coche
     *
     * @return un objeto de la clase Coche
     */
    public static Coche crearCoche() {
        Scanner sc = new Scanner(System.in);
        String clase = "tierra";
        String matricula;

        do {
            System.out.print("Indica la matricula (4 numeros, 3 letras): ");
            matricula = sc.nextLine();
            if (!comprobarClaseMatricula(matricula, clase)) {
                System.out.println("Matricula incorrecta");
            }
        } while (!comprobarClaseMatricula(matricula, clase));

        System.out.print("Indica el modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Indica el numero de ruedas: ");
        int ruedas = sc.nextInt();
        sc.nextLine();

        System.out.print("Tiene aire acondicionado: ");
        boolean aire = sc.nextLine().toLowerCase().charAt(0) == 's';

        return new Coche(matricula, modelo, ruedas, aire);
    }

    /**
     * Metodo para crear una moto
     *
     * @return Un objeto de la clase Moto
     */
    public static Moto crearMoto() {
        Scanner sc = new Scanner(System.in);
        String clase = "tierra";
        String matricula;

        do {
            System.out.print("Indica la matricula (4 numeros, 3 letras): ");
            matricula = sc.nextLine();
            if (!comprobarClaseMatricula(matricula, clase)) {
                System.out.println("Matricula incorrecta");
            }
        } while (!comprobarClaseMatricula(matricula, clase));

        System.out.print("Indica el modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Indica el numero de ruedas: ");
        int ruedas = sc.nextInt();
        sc.nextLine();

        System.out.print("Indica el color: ");
        String color = sc.nextLine();

        return new Moto(matricula, modelo, ruedas, color);
    }

    /**
     * Metodo para crear un avion
     *
     * @return Un objeto de la clase Avion
     */
    public static Avion crearAvion() {
        Scanner sc = new Scanner(System.in);
        String clase = "aire";
        String matricula;

        do {
            System.out.print("Indica la matricula (6 numeros, 4 letras): ");
            matricula = sc.nextLine();
            if (!comprobarClaseMatricula(matricula, clase)) {
                System.out.println("Matricula incorrecta");
            }
        } while (!comprobarClaseMatricula(matricula, clase));

        System.out.print("Indica el modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Indica el numero de asientos: ");
        int asientos = sc.nextInt();
        sc.nextLine();

        System.out.print("Indica el tiempo de vuelo: ");
        int vuelo = sc.nextInt();
        sc.nextLine();

        return new Avion(matricula, modelo, asientos, vuelo);
    }

    /**
     * Metodo para crear un helicoptero
     *
     * @return Un objeto de la clase Helicoptero
     */
    public static Helicoptero crearHelicoptero() {
        Scanner sc = new Scanner(System.in);
        String clase = "aire";
        String matricula;

        do {
            System.out.print("Indica la matricula (6 numeros, 4 letras): ");
            matricula = sc.nextLine();
            if (!comprobarClaseMatricula(matricula, clase)) {
                System.out.println("Matricula incorrecta");
            }
        } while (!comprobarClaseMatricula(matricula, clase));

        System.out.print("Indica el modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Indica el numero de asientos: ");
        int asientos = sc.nextInt();
        sc.nextLine();

        System.out.print("Indica el numero de helices: ");
        int helices = sc.nextInt();
        sc.nextLine();

        return new Helicoptero(matricula, modelo, asientos, helices);
    }

    /**
     * Metodo para crear un barco
     *
     * @return Un objeto de la clase Barco
     */
    public static Barco crearBarco() {
        Scanner sc = new Scanner(System.in);
        String clase = "mar";
        String matricula;

        do {
            System.out.print("Indica la matricula (3 numeros, 10 letras): ");
            matricula = sc.nextLine();
            if (!comprobarClaseMatricula(matricula, clase)) {
                System.out.println("Matricula incorrecta");
            }
        } while (!comprobarClaseMatricula(matricula, clase));

        System.out.print("Indica el modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Indica la eslora: ");
        int eslora = sc.nextInt();
        sc.nextLine();

        System.out.print("Tiene motor: ");
        boolean aire = sc.nextLine().toLowerCase().charAt(0) == 's';

        return new Barco(matricula, modelo, eslora, aire);
    }

    /**
     * Metodo para crear un submarino
     *
     * @return Un objeto de la clase Submarino
     */
    public static Submarino crearSubmarino() {
        Scanner sc = new Scanner(System.in);
        String clase = "mar";
        String matricula;

        do {
            System.out.print("Indica la matricula (3 numeros, 10 letras): ");
            matricula = sc.nextLine();
            if (!comprobarClaseMatricula(matricula, clase)) {
                System.out.println("Matricula incorrecta");
            }
        } while (!comprobarClaseMatricula(matricula, clase));

        System.out.print("Indica el modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Indica la eslora: ");
        int eslora = sc.nextInt();
        sc.nextLine();

        System.out.print("Indica profundidad maxima: ");
        int prof = sc.nextInt();
        sc.nextLine();

        return new Submarino(matricula, modelo, eslora, prof);
    }

    /**
     * Metodo para mostrar los vehiculos en la coleccion
     *
     * @param vehiculos ArrayList de vehiculos
     */
    public static void mostrar(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Tienes estos vehiculos: ");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println("\nVehiculo " + (i + 1) + ":\n");
            vehiculos.get(i).imprimir();
            System.out.println();
        }
    }

    /**
     * Metodo para eliminar un vehiculo en concreto
     *
     * @param vehiculos ArrayList de vehiculos
     * @param indice int con la posicion del vehiculo a eliminar
     */
    public static void eliminarVehiculo(ArrayList<Vehiculo> vehiculos, int indice) {
        vehiculos.remove(indice);
        System.out.println("Se ha eliminado correctamente");
    }
}
