/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ej07 {

    public static void ejecutar() {
        ArrayList<iFigura2D> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(3.5));
        figuras.add(new Rectangulo(3.5, 7));
        figuras.add(new Triangulo(2, 6));
        figuras.add(new Circulo(5));

        mostrar(figuras);

        escalarTodo(figuras, 2);

        mostrar(figuras);

        escalarTodo(figuras, 0.1);

        mostrar(figuras);
    }

    public static void mostrar(ArrayList<iFigura2D> f) {
        for (int i = 0; i < f.size(); i++) {
            System.out.println("---------"
                    + "\nFigura " + (i + 1)
                    + "\n---------");
            f.get(i).imprimir();
        }
    }

    public static void escalarTodo(ArrayList<iFigura2D> f, double escala) {
        for (int i = 0; i < f.size(); i++) {
            System.out.println("--------------------------"
                    + "\nEscalando figura " + (i + 1) + " en 0,1: "
                    + "\n--------------------------");
            f.get(i).escalar(escala);
        }
    }
}
