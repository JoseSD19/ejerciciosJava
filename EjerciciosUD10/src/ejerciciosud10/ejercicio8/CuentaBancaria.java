/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud10.ejercicio8;

import java.util.ArrayList;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class CuentaBancaria {

    private final String iban;
    private final String titular;
    private double saldo;
    private ArrayList<Movimiento> movimientos = new ArrayList<>();

    public CuentaBancaria(String titular) {
        this.iban = "ES" + ((int) (Math.random() * 90) + 10) + " " + ((int) (Math.random() * 9000) + 1000)+ " " + ((int) (Math.random() * 9000) + 1000);
        this.titular = titular;
        saldo = 0;
    }

    public void ingresar(double cantidad) throws AvisarHaciendaException, CuentasExcepcion {
        
        this.setSaldo(this.getSaldo() + cantidad);
        getMovimientos().add(new Movimiento("Ingreso", cantidad));
        System.out.println("Ingreso hecho con exito, saldo actual: "+getSaldo());

        if (cantidad>=3000) {
            throw new AvisarHaciendaException("AVISO A HACIENDA");
        }
        
        if (getSaldo() < 0) {
            throw new CuentasExcepcion("SALDO NEGATIVO");
        }
    }

    public void retirar(double cantidad) throws AvisarHaciendaException, CuentasExcepcion {
        

        if (getSaldo() - cantidad < (-50)) {
            throw new CuentasExcepcion("OPERACION CANCELADA Saldo resultante inferior a -50");
        } else {
            this.setSaldo(this.getSaldo() - cantidad);
            getMovimientos().add(new Movimiento("Retirada", cantidad));
            System.out.println("Retirada hecha con exito, saldo actual: "+getSaldo());
        }
        
        if (cantidad>=3000) {
            throw new AvisarHaciendaException("AVISO A HACIENDA");
        }
        
        if (getSaldo() < 0) {
            throw new CuentasExcepcion("SALDO NEGATIVO");
        }
        
    }

    public void movimientos() {
        if (getMovimientos().isEmpty()) {
            System.out.println("Aun no se han hecho movimientos");
        }else{
            System.out.println("--------------------");
            for (int i = 0; i < getMovimientos().size() && i < 100; i++) {
                getMovimientos().get(i).imprimir();
                System.out.println("--------------------");
            }
            System.out.println("\n------------------------"
                    + "\nSaldo actual-------"+getSaldo()
                    + "\n------------------------");
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

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

}
