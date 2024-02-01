/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud10;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ej06 {
    public static void ejecutar() throws Exception {
        Gato g1 = new Gato("Nico",4);
        Gato g2 = new Gato("Gato", 9);
        
        g1.imprimir();
        g2.imprimir();
        
        try{
        g1.setEdad(-200);
        g2.setEdad(20);
        }
        catch(Exception e){
            System.out.println("Una de las edades es erronea, poniendo valores por defecto [2]");
        }
        
        g1.imprimir();
        g2.imprimir();
        
        try{
            g2.setNombre("E");
            g1.setNombre("Re");
        }
        catch(Exception e){
            System.out.println("Uno de los nombres es erroneo, poniendo valores por defecto [Garfield]");
        }
        
        g1.imprimir();
        g2.imprimir();
        
    }
}
