/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Metodos {

    public static int comprobarMatricula(String matricula) {
        int clase;
        /*switch (matricula.length()) {
            case 7:
                clase = 1;//tierra
                break;
            case 13:
                clase = 2;//mar
                break;
            case 10:
                clase = 3;//aire
                break;
            default:
                clase = 4;//fallo
                break;
        }*/
        if (matricula.matches("[0-9]{4}[a-z,A-Z]{3}")) {
            clase = 1;//tierra
        }else if(matricula.matches("[0-9]{3}[a-z,A-Z]{10}")){
            clase = 2;//mar
        }else if(matricula.matches("[0-9]{6}[a-z,A-Z]{4}")){
            clase = 3;//aire
        }else{
            clase = 4;//fallo
        }
        
        return clase;
    }

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

    public static boolean comprobarClaseMatricula(String matricula, String clase) {
        if (comprobarMatricula(matricula) == 4) {
            return false;
        } else if (comprobarMatricula(matricula) == comprobarClase(clase)) {
            return true;
        } else {
            return false;
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                           Que quieres hacer:
                           1)Crear Vehiculo
                           2)Ver Vehiculos
                           3)Eliminar Vehiculo
                           4)Salir
                           """);

        return sc.nextInt();
    }

    public static int menuCreacion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                           Que tipo de vehiculo quieres crear:
                           1)Terrestre
                           2)Acuatico
                           3)Aereo
                           4)Ninguno
                           """);
        return sc.nextInt();
    }

    public static int menuTierra() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                           Que quieres crear
                           1)Coche
                           2)Moto
                           """);
        return sc.nextInt();
    }

    public static int menuAire() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                           Que quieres crear
                           1)Avion
                           2)Helicoptero
                           """);
        return sc.nextInt();
    }

    public static int menuAgua() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                           Que quieres crear
                           1)Barco
                           2)Submarino
                           """);
        return sc.nextInt();
    }

    public static Coche crearCoche() {
        Scanner sc = new Scanner(System.in);
        String clase = "tierra";
        String matricula;

        do {
            System.out.print("Indica la matricula: ");
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

    public static Moto crearMoto() {
        Scanner sc = new Scanner(System.in);
        String clase = "tierra";
        String matricula;

        do {
            System.out.print("Indica la matricula: ");
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

    public static Avion crearAvion() {
        Scanner sc = new Scanner(System.in);
        String clase = "aire";
        String matricula;

        do {
            System.out.print("Indica la matricula: ");
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

    public static Helicoptero crearHelicoptero() {
        Scanner sc = new Scanner(System.in);
        String clase = "aire";
        String matricula;

        do {
            System.out.print("Indica la matricula: ");
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

    public static Barco crearBarco() {
        Scanner sc = new Scanner(System.in);
        String clase = "mar";
        String matricula;

        do {
            System.out.print("Indica la matricula: ");
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

    public static Submarino crearSubmarino() {
        Scanner sc = new Scanner(System.in);
        String clase = "mar";
        String matricula;

        do {
            System.out.print("Indica la matricula: ");
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

    public static void mostrar(ArrayList<Vehiculo>  v){
        System.out.println("Tienes estos vehiculos: ");
        for (int i = 0; i < v.size(); i++) {
            System.out.println("Vehiculo "+(i+1)+":");
            v.get(i).imprimir();
        }
    }
}
