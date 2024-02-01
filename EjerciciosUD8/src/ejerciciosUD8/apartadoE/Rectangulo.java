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
public class Rectangulo {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    final int max = 100;
    final int min = 0;

    public Rectangulo(int x1, int y1, int x2, int y2) {

        if (x2 <= max && y2 <= max && x1 >= min && y1 >= min && x1 <= max && y1 <= max && x2 >= min && y2 >= min){
            if (x2 > x1 && y2 > y1) {
                this.x1 = x1;
                this.x2 = x2;
                this.y1 = y1;
                this.y2 = y2;
            } else {
                if (x2 < x1) {
                    this.x1 = x2;
                    this.x2 = x1;
                } else {
                    this.x1 = x1;
                    this.x2 = x2;
                }
                if (y2 < y1) {
                    this.y1 = y2;
                    this.y2 = y1;
                } else {
                    this.y1 = y1;
                    this.y2 = y2;
                }
            }
        }else{
            System.err.println("Fuera de los limites, creando rectangulo (0,0)(100,100)");
            this.x1=min;
            this.x2=max;
            this.y1=min;
            this.y2=max;
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (dentroLimites(x1)) {
            this.x1 = x1;
        } else {
            this.x1 = errorPunto();
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if (dentroLimites(x2)) {
            this.x2 = x2;
        } else {
            this.x2 = errorPunto();
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (dentroLimites(y1)) {
            this.y1 = y1;
        } else {
            this.y1 = errorPunto();
        }
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if (dentroLimites(y2)) {
            this.y2 = y2;
        } else {
            this.y2 = errorPunto();
        }
    }

    public void imprimir() {
        System.out.println("Coordenadas del rectangulo: [" + getX1() + "," + getY1() + "] [" + getX2() + "," + getY2() + "]");
    }

    public void setX1Y1(int x, int y) {
        setX1(x);
        setY1(y);
    }

    public void setX2Y2(int x, int y) {
        setX2(x);
        setY2(y);
    }

    public void setAll(int x1, int y1, int x2, int y2) {
        if (x2 > x1 && y2 > y1) {
            setX1Y1(x1, y1);
            setX2Y2(x2, y2);
        } else {
            System.err.println("ERROR al instanciar Rectangulo..."
                    + "\n*Corrgiendo los parametros*");
            setX1Y1(x2, y2);
            setX2Y2(x1, y1);
        }
    }

    public double getArea() {
        double area;
        area = (Math.abs(this.getX2()) - Math.abs(this.getX1())) * Math.abs((this.getY2()) - Math.abs(this.getY1()));
        return area;
    }

    public double getPerimetro() {
        double perimetro;
        perimetro = ((Math.abs(this.getX2()) - Math.abs(this.getX1())) + (Math.abs(this.getY2()) - Math.abs(this.getY1()))) * 2;
        return perimetro;
    }

    public boolean dentroLimites(int punto) {
        if (punto < min || punto > max) {
            return false;
        } else {
            return true;
        }
    }

    public int errorPunto() {
        Scanner sc = new Scanner(System.in);
        int punto;
        do {
            System.err.println("Error, cree un punto dentro de los limites (entre 0 y 100): ");
            punto = sc.nextInt();
        } while (!dentroLimites(punto));

        return punto;
    }

    public static Rectangulo generarRectangulo() {
        return new Rectangulo((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
    }
}
