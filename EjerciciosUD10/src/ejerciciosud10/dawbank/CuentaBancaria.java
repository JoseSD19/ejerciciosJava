/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud10.dawbank;

import java.util.ArrayList;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class CuentaBancaria {

    private final String iban;
    private final String titular;
    private double saldo;
    private ArrayList<Movimientos> movimientos = new ArrayList<>();

    public CuentaBancaria(String titular) {
        this.iban = "ES" + ((int) (Math.random() * 90) + 10) + " " + ((int) (Math.random() * 9000) + 1000)+ " " + ((int) (Math.random() * 9000) + 1000);
        this.titular = titular;
        saldo = 0;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 3000) {
            System.out.println("AVISO: Notificar a hacienda");
        }
        this.setSaldo(this.getSaldo() + cantidad);
        getMovimientos().add(new Movimientos("Ingreso", cantidad));
        System.out.println("Ingreso hecho con exito, saldo actual: "+getSaldo());

        if (getSaldo() < 0) {
            System.out.println("AVISO: Saldo negativo");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 3000) {
            System.out.println("AVISO: Notificar a hacienda");
        }

        if (getSaldo() - cantidad < (-50)) {
            System.out.println("OPERACION CANCELADA: No se puede tener menos de 50 creditos en negativo");
        } else {
            this.setSaldo(this.getSaldo() - cantidad);
            getMovimientos().add(new Movimientos("Retirada", cantidad));
            System.out.println("Retirada hecha con exito, saldo actual: "+getSaldo());
        }

        if (getSaldo() < 0) {
            System.out.println("AVISO: Saldo negativo");
        }
    }

    public void movimientos() {
        for (int i = 0; i < getMovimientos().size() && i < 100; i++) {
            getMovimientos().get(i).imprimir();
        }
    }

    public void mostrarDatos() {
        System.out.println("IBAN: " + getIban()
                + "\nTitular: " + getTitular()
                + "\nSaldo: " + getSaldo());
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Movimientos> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimientos> movimientos) {
        this.movimientos = movimientos;
    }

}
