/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica10;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Gato {

    private int edad;
    private String nombre;

    //Constructor del gato
    public Gato(String nombre, int edad) throws Exception {
        //comprueba si el nombre tiene los 3 caracteres minimos, si no los tiene salta la excepcion
        if (nombre.length() < 3) {
            throw new Exception("Error en el nombre");
        } else {
            this.nombre = nombre;
        }
        //Comprueba que la edad es mayor que 0, si es negativa o 0 dara error
        if (edad <= 0) {
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

    //para setear la edad comprueba tambien que no sea negativa o 0
    public void setEdad(int edad) throws Exception {
        if (edad <= 0) {
            throw new Exception();
        } else {
            this.edad = edad;
        }
    }

    //para setear el nombre tambien comprueba que no sean menos de 3 caracteres
    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception();
        } else {
            this.nombre = nombre;
        }
    }

    //imprime el nombre y la edad del gato
    public void imprimir() {
        System.out.printf("Nombre " + getNombre()
                + "\nEdad: " + getEdad() + "\n");
    }
}
