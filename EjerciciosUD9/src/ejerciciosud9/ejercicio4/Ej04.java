/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ej04 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int opcion, opcionTransfer;
        boolean seguir = true, otraOperacion;
        double cantidad;
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        Iterator<CuentaBancaria> it;
        do {
            switch (elegirCuenta()) {
                case 1:

                    do {
                        System.out.println("Que tipo de cuenta quieres crear:"
                                + "\n1)Cuenta corriente"
                                + "\n2)Cuenta de ahorro");
                        opcion = sc.nextInt();
                    } while (opcion > 2 || opcion < 1);
                    System.out.println("El iban de tu cuenta sera elegido al azar: ");
                    String iban = "ES" + (int) (Math.random() * 100);
                    System.out.println("El iban sera :" + iban);
                    System.out.println("Con cuanto dinero vas a empezar la cuenta: ");
                    int saldo = sc.nextInt();
                    sc.nextLine();

                    if (opcion == 2) {
                        System.out.println("Indique el saldo minimo que desesa mantener");
                        double saldoMinimo = sc.nextDouble();
                        CuentaAhorro ca = new CuentaAhorro(iban, saldo, saldoMinimo);
                        cuentas.add(ca);
                    } else {
                        CuentaCorriente cc = new CuentaCorriente(iban, saldo);
                        cuentas.add(cc);
                    }
                    break;
                case 2:
                    int cont = 1;
                    System.out.println("Tienes " + cuentas.size() + " cuentas: ");

                    it = cuentas.iterator();
                    while (it.hasNext()) {
                        CuentaBancaria cb = it.next();
                        System.out.println(cont + ") " + cb.iban);
                        cont++;
                    }

                    System.out.println("cual quieres consultar");
                    opcion = sc.nextInt();
                    sc.nextLine();

                    do {
                        otraOperacion = true;
                        switch (operacion()) {
                            case 1:
                                cuentas.get(opcion-1).consultar();
                                break;
                            case 2:
                                System.out.print("Cuanto quieres ingresar: ");
                                cantidad = sc.nextDouble();
                                sc.nextLine();
                                cuentas.get(opcion - 1).ingresar(cantidad);
                                break;
                            case 3:
                                System.out.print("Cuanto quieres retirar: ");
                                cantidad = sc.nextDouble();
                                sc.nextLine();

                                cuentas.get(opcion - 1).retirar(cantidad);
                                break;
                            case 4:
                                System.out.print("Cuanto quieres transferir: ");
                                cantidad = sc.nextDouble();
                                sc.nextLine();

                                cont = 1;
                                System.out.println("Teniendo: ");

                                it = cuentas.iterator();
                                while (it.hasNext()) {
                                    CuentaBancaria cb = it.next();
                                    System.out.println(cont + ") " + cb.iban);
                                    cont++;
                                }
                                System.out.println("A que cuenta quieres transferirlo:");
                                opcionTransfer = sc.nextInt();
                                cuentas.get(opcion - 1).transferencia(cantidad, cuentas.get(opcionTransfer - 1));
                                break;
                            case 5:
                                otraOperacion = false;
                                break;
                            default:
                                System.err.println("Opcion no valida");
                        }
                    } while (otraOperacion);
                    break;
                case 3:
                    seguir = false;
                    break;
                default:
                    System.err.println("Opcion no disponible");
            }
        } while (seguir);

    }

    public static int elegirCuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Bienvenido al banco que quieres hacer:
                           1)Crear cuenta
                           2)Consultar cuenta
                           3)Salir""");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    public static int operacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Que quieres hacer en esta cuenta
                           1)Consultar saldo
                           2)Ingresar dinero
                           3)Retirar dinero
                           4)Transferir dinero
                           5)Salir""");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
}
