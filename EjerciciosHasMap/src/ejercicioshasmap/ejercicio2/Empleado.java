/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioshasmap.ejercicio2;

import java.util.HashMap;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Empleado {

    HashMap<String, String> diaSemana;
    HashMap<Integer, HashMap<String, String>> horariosEmpleados;

    public Empleado() {
        diaSemana = new HashMap<>();
        horariosEmpleados = new HashMap<>();
    }

    public void añadirEmpleado(int indice) {
        diaSemana.put("Lunes", "9:00-16:00");
        diaSemana.put("Martes", "10:00-17:00");
        diaSemana.put("Miercoles", "8:00-15:00");
        diaSemana.put("Jueves", "8:00-12:00/16:00-19:00");
        diaSemana.put("Viernes", "8:00-13:00");
        horariosEmpleados.put(indice, diaSemana);

    }

    public void mostrarHorario(int indice) {
        System.out.println("El horario del empleado " + indice + " esta semana es:"
                + "\n" + horariosEmpleados.get(indice).get("Lunes")
                + "\n" + horariosEmpleados.get(indice).get("Martes")
                + "\n" + horariosEmpleados.get(indice).get("Miercoles")
                + "\n" + horariosEmpleados.get(indice).get("Jueves")
                + "\n" + horariosEmpleados.get(indice).get("Viernes"));
    }

    public void mostrarHorarioEspecifico(int indice, String dia) {
        System.out.println(horariosEmpleados.get(indice).get(dia));
    }

    public void mostrarTodosEspecifico(String dia) {
        for (Integer i : horariosEmpleados.keySet()) {
            HashMap horario = horariosEmpleados.get(i);
            System.out.println("El empleado " + i + " el " + dia + " tiene el horario: " + horario.get(dia));
        }
    }
}
