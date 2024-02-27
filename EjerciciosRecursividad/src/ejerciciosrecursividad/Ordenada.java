/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrecursividad;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ordenada {

    public static void ejecutar() {

        if (orden("affffbfffffffffz")) {
            System.out.println("ordenada");
        } else {
            System.out.println("desordenada");
        }

    }

    public static boolean orden(String cadena) {
        
        cadena = cadena.toLowerCase();

        if(cadena.length() == 1){
            return true;
        }
        
        if(cadena.length()==2){
            return cadena.charAt(0)<=cadena.charAt(1);
        }else{
            if (cadena.charAt(0)<=cadena.charAt(1)) {
                return orden(cadena.substring(1,cadena.length()));
            }else{
                return false;
            }
             
        }
    }
}
