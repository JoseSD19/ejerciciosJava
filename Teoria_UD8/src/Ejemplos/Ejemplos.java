/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Articulo misArticulos[] = new Articulo[10];

        for (int i = 0; i < 10; i++) {
            float precio = (float) Math.random() * 10 * (float)Articulo.IVA;
            misArticulos[i] = new Articulo("00" + (i + 1), "Titulo" + (i + 1), "DVD", precio, "A00" + (i + 1));

        }

        for (int i = 0; i < misArticulos.length; i++) {
            System.out.println("Alquier Art. " + misArticulos[i].getIdentificador()
                    + "\n 1 dia: " + misArticulos[i].precio1()
                    + "\n 2 dia: " + misArticulos[i].precio2()
                    + "\n 1 semana: " + misArticulos[i].precio_semana());
        }

        /*System.out.println("El nuemro de articulos actual es "+Articulo.numero);
        System.out.println("El IVA actual es "+Articulo.IVA*100+"%");
        
        Articulo articulo1 = new Articulo("001", "Titulo1", "DVD", 2.5f, "1");
        Articulo articulo2 = new Articulo("002", "Titulo2", "DVD", 3f, "2");

        System.out.println("Alquier Art. " + articulo1.getIdentificador() + ", 1 dia: " + articulo1.precio1());
        System.out.println("Alquier Art. " + articulo1.getIdentificador() + ", 2 dia: " + articulo1.precio2());
        System.out.println("Alquier Art. " + articulo1.getIdentificador() + ", 1 semana: " + articulo1.precio_semana());

        System.out.println("Alquier Art. " + articulo2.identificador + ", 1 dia: " + articulo2.precio1());
        System.out.println("Alquier Art. " + articulo2.identificador + ", 2 dia: " + articulo2.precio2());
        System.out.println("Alquier Art. " + articulo2.identificador + ", 1 semana: " + articulo2.precio_semana());*/
    }

}
