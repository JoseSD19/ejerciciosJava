/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud10.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Metodos {

    public static int menuBienvenida() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                               Bienvenido a DawBank:
                               1) Informacion
                               2) Crear cuenta
                               3) Ya soy cliente
                               4) Salir""");
            try{
            opcion = sc.nextInt();
            }
            catch(Exception e){
                System.out.println("Introduzca un numero");
                opcion=-1;
            }
            if (opcion > 4||opcion<1) {
                System.out.println("Opcion incorrecta");
            }
            sc.nextLine();
        } while (opcion > 4||opcion<1);

        return opcion;
    }

    public static int clienteAntiguo() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                               Bienvenido de vuelta a DawBank: 
                               1) Datos de la cuenta
                               2) IBAN
                               3) Titular
                               4) Saldo
                               5) Ingreso
                               6) Retirada
                               7) Movimientos
                               8) Salir""");
            try{
            opcion = sc.nextInt();

            }catch(Exception e){
                System.out.println("Introduzca un numero");
                opcion = -1;
            }
            if (opcion > 8||opcion<1) {
                System.out.println("Opcion incorrecta");
            }
            sc.nextLine();
        } while (opcion > 8||opcion<1);

        return opcion;
    }

    public static CuentaBancaria crearcuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el nombre del titular de la cuenta: ");
        String nombre = sc.nextLine();
        CuentaBancaria cb = new CuentaBancaria(nombre);
        System.out.println("Tu IBAN sera: " + cb.getIban());

        return cb;
    }

    public static void mostrarCuentas(ArrayList<CuentaBancaria> c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println((i + 1) + ") " + c.get(i).getIban().substring(0, 7) + "** ****");
        }
    }
}
