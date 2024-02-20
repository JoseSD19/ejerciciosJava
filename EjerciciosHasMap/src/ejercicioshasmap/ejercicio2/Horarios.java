/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicioshasmap.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Horarios {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        
        Empleado empleados = new Empleado();
        
        System.out.println("Cuantos empleados quiere crear: ");
        int cantidad = sc.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            empleados.añadirEmpleado(i);
        }
        
        int numeroEmpleados = empleados.horariosEmpleados.size();
        int EmpleadoAleatorio =(int) (Math.random()*numeroEmpleados+1);
        
        empleados.mostrarHorario(EmpleadoAleatorio);
        
        EmpleadoAleatorio =(int) (Math.random()*numeroEmpleados+1);
        
        empleados.mostrarHorarioEspecifico(EmpleadoAleatorio, "Martes");
        
        empleados.mostrarTodosEspecifico("Jueves");
    }
}
