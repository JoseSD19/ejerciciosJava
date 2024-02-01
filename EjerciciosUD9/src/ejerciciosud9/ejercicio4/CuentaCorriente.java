/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio4;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
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
        interes = saldo * interesAnualBanco;

        return interes;
    }

}
