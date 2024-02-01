/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud8.apartadoE;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Punto {

    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprime() {
        System.out.println("Las coordeandas son [" + getX() + "," + getY() + "]");
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplaza(int dx, int dy) {
        this.x = getX() + dx;
        this.y = getY() + dy;
    }

    public double distancia(Punto p) {
        double  distancia;

        distancia = Math.sqrt((Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2)));

        return distancia;
    }

    public static int menuPunto() {
        Scanner sc = new Scanner(System.in);
        int respuesta;

        System.out.println("Que quieres hacer con los puntos: "
                + "\n1) Modificar las coordenadas de un punto"
                + "\n2) Desplazar un punto"
                + "\n3) Medir la distancia entre dos puntos"
                + "\n4) Mostrar las coordenadas de un punto"
                + "\n5) Mostrar las coordenadas de todos los puntos"
                + "\n6) Salir");
        respuesta = sc.nextInt();
        
        return respuesta;
    }
    
    public static Punto creaPuntoAleatorio(){
        return new Punto((int) (Math.random() * 100), (int) (Math.random() * 100));
    }

}
