/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio5;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Empleado {

    private final String nombre;
    private final String dni;
    private String direccion;
    private int edad;
    private int telefono;
    private double sueldoBruto;
    
    public Empleado(String nombre, String dni, double sueldoBruto){
        this.nombre=nombre;
        this.dni=dni;
        this.sueldoBruto=sueldoBruto;
    }
    
    public void imprimir(){
        System.out.println("Empleado con DNI: "+getDni()
                +"\nNombre: "+getNombre()
                +"\nDireccion: "+getDireccion()
                +"\nEdad: "+getEdad()
                +"\nTelefono: "+getTelefono());
    }
    
    public double sueldoNeto(){
        double sueldoAnual=getSueldoBruto()*12;
        double irpf, sueldoNeto;
        
        if (sueldoAnual<12000) {
            irpf=0.2;
        }else if(sueldoAnual>=12000 && sueldoAnual<25000){
            irpf=0.3;
        }else{
            irpf=0.4;
        }
        sueldoNeto=(getSueldoBruto() -(getSueldoBruto()*irpf));
        return sueldoNeto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
}
