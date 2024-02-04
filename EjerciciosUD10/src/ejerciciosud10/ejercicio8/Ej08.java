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
public class Ej08 {

    public static void ejecutar() throws AvisarHaciendaException, CuentasExcepcion {
        Scanner sc = new Scanner(System.in);
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        boolean seguir, otraOperacion;
        int cuenta;

        do {
            seguir = true;
            switch (Metodos.menuBienvenida()) {
                case 1:
                    System.out.println("""
                                           Este es el banco DawBank, para crear una cuenta se necesitara:
                                           -Un titular
                                           Las cuentas podran tener saldo negativo, pero nunca superior a 50 creditos negativos
                                           Las operaciones de mas de 3000 creditos seran notificadas a Hacienda
                                           Podras consultar en todo momento tus datos y tus ultimos 100 movimientos
                                           Bienvenido al DawBank""");
                    break;
                case 2:
                    cuentas.add(Metodos.crearcuenta());
                    break;
                case 3:
                    if (cuentas.isEmpty()) {
                        System.out.println("Aun no hay cuentas registradas");
                    } else {
                        do {
                            System.out.println("Teniendo estas cuentas: ");
                            Metodos.mostrarCuentas(cuentas);
                            System.out.println("¿Sobre cual vas a operar?");
                            cuenta = (sc.nextInt() - 1);

                            if (cuenta >= cuentas.size()|| cuenta < 0) {
                                System.out.println("No existe esa cuenta");
                            }

                        } while (cuenta >= cuentas.size() || cuenta < 0);
                        sc.nextLine();
                        do {
                            otraOperacion = true;
                            switch (Metodos.clienteAntiguo()) {
                                case 1:
                                    cuentas.get(cuenta).mostrarDatos();
                                    break;
                                case 2:
                                    System.out.println("El IBAN es: " + cuentas.get(cuenta).getIban());
                                    break;
                                case 3:
                                    System.out.println("El titular es: " + cuentas.get(cuenta).getTitular());
                                    break;
                                case 4:
                                    System.out.println("El saldo es: " + cuentas.get(cuenta).getSaldo());
                                    break;
                                case 5:
                                try {
                                    System.out.println("¿Cuanta cantidad quieres ingresar? ");
                                    double cantidad = sc.nextDouble();
                                    cuentas.get(cuenta).ingresar(cantidad);
                                } catch (AvisarHaciendaException | CuentasExcepcion e) {
                                    System.out.println("\u001B[41m" + e.getMessage() + "\u001B[0m");
                                }
                                break;

                                case 6:
                                try {
                                    System.out.println("¿Cuanta cantidad quieres retirar? ");
                                    double cantidad = sc.nextDouble();
                                    cuentas.get(cuenta).retirar(cantidad);
                                } catch (AvisarHaciendaException | CuentasExcepcion e) {
                                    System.out.println("\u001B[41m" + e.getMessage() + "\u001B[0m");
                                }
                                break;
                                case 7:
                                    cuentas.get(cuenta).movimientos();
                                    break;
                                case 8:
                                    otraOperacion = false;
                                    break;
                            }
                        } while (otraOperacion);
                    }

                    break;
                case 4:
                    seguir = false;
                    break;
            }
        } while (seguir);
    }

}
