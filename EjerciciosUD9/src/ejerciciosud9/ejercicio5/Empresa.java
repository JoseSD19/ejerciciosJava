/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Empresa {

    private final String nombre;
    private final String cif;
    private int telefono;
    private String direccion;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public Empresa(String nombre, String cif, String direccion, int tlf) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;
        telefono = tlf;
    }

    public void añadirEmpelado(Empleado e) {
        getEmpleados().add(e);
    }

    public void eliminarEmpleado(Empleado e) {
        getEmpleados().remove(e);
    }

    public void mostrarEmpleados() {
        Iterator<Empleado> it = getEmpleados().iterator();
        while (it.hasNext()) {
            Empleado tmp = it.next();
            System.out.println(tmp.getNombre());
        }
    }

    public void mostarInfo() {
        Iterator<Empleado> it = getEmpleados().iterator();
        int cont = 1;
        while (it.hasNext()) {
            Empleado tmp = it.next();
            System.out.println(cont+")"
                    + "5"
                    + "\nDNI: " + tmp.getDni()
                    + "\nSueldo Bruto: " + tmp.getSueldoBruto()
                    + "\nSueldo Neto: " + tmp.sueldoNeto());
        }
    }

    public void totalSueldosBrutos() {
        double total = 0;
        Iterator<Empleado> it = getEmpleados().iterator();
        while (it.hasNext()) {
            Empleado tmp = it.next();
            total += tmp.getSueldoBruto();
        }
    }

    public void totalSueldosNetos() {
        double total = 0;
        Iterator<Empleado> it = getEmpleados().iterator();
        while (it.hasNext()) {
            Empleado tmp = it.next();
            total += tmp.sueldoNeto();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
