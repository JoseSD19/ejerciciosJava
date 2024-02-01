/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio4;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class CuentaAhorro extends CuentaBancaria {

    private double saldoMinimo;

    public CuentaAhorro(String iban, double saldo, double saldoMinimo) {
        super(iban, saldo);
        this.saldoMinimo = saldoMinimo;
    }

    public void consultar() {
        System.out.println("El saldo de la cuenta " + iban
                + "\n\t" + saldo+"$");
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
        System.out.println(cantidad + "$ ingresados con exito");
    }

    public void retirar(double cantidad) {
        if (saldo < cantidad) {
            System.out.println("No es posible retirar " + cantidad + "$ solo quedan " + saldo + "$");
        } else {
            saldo -= cantidad;
            System.out.println("Aqui tienes " + cantidad + "$");
        }
    }

    public void transferencia(double cantidad, CuentaBancaria cuenta) {
        if (saldo < cantidad) {
            System.out.println("No es posible hacer la transferencia, saldo inferior a " + cantidad + "$");
        } else {
            cuenta.saldo += cantidad;
            this.saldo -= cantidad;
        }
    }

    public double calcularIntereses() {
        double interes;
        if (saldo < getSaldoMinimo()) {
            interes = saldo * (interesAnualBanco / 2);
        } else {
            interes = saldo * (interesAnualBanco * 2);
        }

        return interes;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

}
