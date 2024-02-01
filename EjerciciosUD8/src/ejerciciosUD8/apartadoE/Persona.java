/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud8.apartadoE;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Persona {

    final private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    static final int mayoriaEdad = 18;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        if (!validarDNI(dni)) {
            dni = errorDNI();
        }
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprime() {
        System.out.print("DNI: " + getDni()
                + "\nNombre: " + getNombre()
                + "\nApellidos: " + getApellidos()
                + "\nEdad: " + getEdad()+"\n");
    }

    public boolean esMayorEdad() {
        return (this.edad >= mayoriaEdad);
    }

    public boolean esJubilado() {
        return (this.edad >= 65);
    }

    public int diferenciaEdad(Persona p) {
        int diferencia;

        if (this.edad >= p.edad) {
            diferencia = this.edad - p.edad;
        } else {
            diferencia = p.edad - this.edad;
        }

        return diferencia;
    }

    static boolean validarDNI(String dni) {
        char[] dniValidar = dni.toCharArray();
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        boolean estaBien = false;

        if (dni.length() == 9) {
            for (int i = 0; i < 8; i++) {
                char numero = dniValidar[i];
                for (int j = 0; j < numeros.length; j++) {
                    estaBien = numero == numeros[j];
                }
            }
            for (int i = 0; i < letras.length; i++) {
                if (dniValidar[8] == letras[i]) {
                    estaBien = true;
                    break;
                }else{
                    estaBien = false;
                }
            }

        } else {
            estaBien = false;

        }

        return estaBien;
    }

    public static String errorDNI() {
        Scanner sc = new Scanner(System.in);
        String nuevoDNI;

        do {
            System.err.println("DNI incorrecto, introduzcalo de nuevo");
            nuevoDNI = sc.nextLine();
        } while (!validarDNI(nuevoDNI));

        return nuevoDNI;
    }
    
    public void estado(){
        if (esMayorEdad()&&!esJubilado()) {
            System.out.println("Es mayor de edad");
        }else if(esJubilado()){
            System.out.println("Es jubilado");
        }else{
            System.out.println("Es menor de edad");
        }
    }

}
