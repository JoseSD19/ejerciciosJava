/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo;

/**
 *
 * @author alumnot
 */
public class UD6 {
    
    public static void main(String[] args) {
        
        //Creas las variables que pertenezcan a la clase
        triangulo t1 = new triangulo();
        triangulo t2 = new triangulo();
        
        //Creas el array de la clase --triangulo--
        triangulo trian[] = new triangulo[2];
        trian[0]=t1;
        trian[1]=t2;
        
        //declaras los argumentos de cada variable --t1--
        trian[0].altura=10;
        trian[0].base=5;
        //--t2--
        trian[1].altura=5;
        trian[1].base=2;
        
        //haces un bucle durante la longitud del array --array.lenght-- para recorrer toda la lista
        for(int i=0;i<trian.length;i++){
            System.out.println("El area del triangulo " +(i+1)+" es "+trian[i].calcularArea());
        }
    }
    
}