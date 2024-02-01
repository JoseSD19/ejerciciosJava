/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosUD8.apartadoB;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Articulo {
    String nombre;
    double precio;
    double iva;
    int cuantosQuedan;
    
    public Articulo(String nombre, double precio, double iva, int quedan){
        this.nombre=nombre;
        
        if(precio>=0){
            this.precio=precio;
        }else{
            System.err.println("No pueden haber precios negativos, se pondra a 0");
            this.precio = 0;
        }
        
        if(quedan>0){
            cuantosQuedan = quedan;
        }else{
            System.err.println("No pueden quedar numeros negativos, se pondra en 0");
            this.cuantosQuedan = 0;
        }
        
        if (iva==0.21||iva==0.10||iva==0.04) {
            this.iva=iva;
        }else{
            System.err.println("ERROR tipo de iva incorrecto, se aplicara el 21%");
            this.iva=0.21;
        }
    }
}
