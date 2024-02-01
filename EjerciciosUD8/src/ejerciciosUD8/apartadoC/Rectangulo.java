/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD8.apartadoC;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Rectangulo {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Rectangulo(int x1, int x2, int y1, int y2) {

        if (x2 > x1 && y2 > y1) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar Rectangulo...");
            System.out.println("Se corregiran los puntos metidos");
            this.x1 = x2;
            this.x2 = x1;
            this.y1 = y2;
            this.y2 = y1;
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1 > this.x2) {
            this.x1 = this.x2;
            this.x2 = x1;
        } else {
            this.x1 = x1;
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {

        if (x2 < this.x1) {
            this.x2 = this.x1;
            this.x1 = x2;
        } else {
            this.x2 = x2;
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (y1 > this.y2) {
            this.y1 = this.y2;
            this.y2 = y1;
        } else {
            this.y1 = y1;
        }
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if (y2 < this.y1) {
            this.y2 = this.y1;
            this.y1 = y2;
        } else {
            this.y2 = y2;
        }
    }
    
    public double getArea(){
        double area;
        area = (Math.abs(this.getX2()) - Math.abs(this.getX1())) * Math.abs((this.getY2()) - Math.abs(this.getY1()));
        return area;
    }
    
    public double getPerimetro(){
        double perimetro;
        perimetro = ((Math.abs(this.getX2()) - Math.abs(this.getX1())) + (Math.abs(this.getY2()) - Math.abs(this.getY1()))) * 2;
        return perimetro;
    }

}
