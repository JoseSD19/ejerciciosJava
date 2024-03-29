/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud10;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Gato {

    private int edad;
    private String nombre;

    public Gato(String nombre, int edad) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("Error en el nombre");
        } else {
            this.nombre = nombre;
        }
        if (edad < 0) {
            throw new Exception("Error en la edad");
        } else {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception();
        } else {
            this.edad = edad;
        }
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception();
        } else {
            this.nombre = nombre;
        }
    }

    public void imprimir() {
        System.out.printf("Nombre " + getNombre()
                + "\nEdad: " + getEdad() + "\n");
    }
}
