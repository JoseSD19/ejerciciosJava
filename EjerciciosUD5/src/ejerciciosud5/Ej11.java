/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud5;

/**
 *
 * @author alumnot
 */
public class Ej11 {
    public static void main(String[] args) {
        int par=0, impar=0;
        
        for(int i=100;i<=200;i++){
            if(i%2==0){
                par = par + i;
            }else{
                impar = impar + i;
            }
        }
        System.out.println("La suma de los pares es: "+par+
                "\nLa suma de los impares es: "+impar);
    }
}
