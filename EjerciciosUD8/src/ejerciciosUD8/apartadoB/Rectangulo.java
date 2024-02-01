/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD8.apartadoB;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Rectangulo {

    int x1, x2, y1, y2;

    public Rectangulo(int x1, int x2, int y1, int y2) {

        if (x2 > x1 && y2 > y1) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }else{
            System.err.println("ERROR al instanciar Rectangulo..."
                    +"\nSe corregiran los puntos metidos");
            this.x1=x2;
            this.x2=x1;
            this.y1=y2;
            this.y2=y1;
        }
    }
}
