/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD7;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ej10 {

    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        
        System.out.println("Introduzca el dia: ");
        dia = sc.nextInt();
        System.out.println("Introduzca el mes: ");
        mes = sc.nextInt();
        System.out.println("Introduzca el año: ");
        año=sc.nextInt();
        
        if (fechaCorrecta(dia, mes, año)) {
            System.out.println("La fecha "+dia+"/"+mes+"/"+año+" es correcta");
        }else{
            System.out.println("La fecha no es correcta");
        }
        
    }

    public static boolean fechaCorrecta(int d, int m, int a) {
        boolean correcto=true;
        if (d>30||d<1) {
            correcto = false;
        }else if (m>12||m<1) {
            correcto = false;
        }else if (a<1){
            correcto = false;
        }
        return correcto;
    }
}
