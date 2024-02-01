/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosUD8.apartadoC;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Articulo {
    private String nombre;
    private double precio;
    private double iva;
    private int cuantosQuedan;
    
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

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public double getPrecio() {
        return precio;
    }

    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public double getIva() {
        return iva;
    }

    
    public void setIva(double iva) {
        this.iva = iva;
    }

   
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    
    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
    
    
}
