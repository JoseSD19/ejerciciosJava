/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio4;

/**
 *
 * @author Jose Sanchez Diaz
 */
public abstract class CuentaBancaria {

    String iban;
    double saldo;
    final double interesAnualBanco = 0.01;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public abstract void consultar();

    public abstract void ingresar(double cantidad);

    public abstract void retirar(double cantidad);

    public abstract void transferencia(double cantidad, CuentaBancaria cuenta);

    public abstract double calcularIntereses();
}
