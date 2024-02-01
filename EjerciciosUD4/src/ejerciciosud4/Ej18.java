/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej18 {
    public static void main(String[] args) {
        double Tarifa, Sueldo_Bruto,Sueldo_Neto,Tasas;
        String Nombre;
        int Horas;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca el Nombre: ");
        Nombre = entrada.next();
        System.out.println("Introduzca las hora que ha trabajado: ");
        Horas = entrada.nextInt();
        System.out.println("Introduzca la Tarifa: ");
        Tarifa = entrada.nextDouble();
        
        if(Horas>35){
            Sueldo_Bruto = (35*Tarifa)+((Horas-35)*(1.5*Tarifa));
        }
        else{
            Sueldo_Bruto = Horas*Tarifa;
        }
        //Tenemos el Sueldo Bruto
        if(Sueldo_Bruto>500){
            if(Sueldo_Bruto>900){
                Tasas = (400*0.25)+((Sueldo_Bruto-900)*0.45);
            }
            else{
                Tasas = (Sueldo_Bruto-500)*0.25;
            }
        }
        else{
            Tasas = 0;
        }
        //Tenemos las Tasas
        Sueldo_Neto= Sueldo_Bruto - Tasas;
        
        System.out.println("La nomina de " + Nombre + " quedaria asi: "+
                "\nSueldo Bruto: " + (String.format("%.2f", Sueldo_Bruto)) +
                "\nTasas:        -" + (String.format("%.2f", Tasas)) +
                "\nSueldo Neto:  " + (String.format("%.2f", Sueldo_Neto)));
    }
}
