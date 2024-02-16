/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioshasmap.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Instituto {

    static HashMap<String, Double> notas = new HashMap<>();
    static int indice = 1;
    static String nombre = "Alumno";

    public static void ejecutar() throws ExcepcionNota {

        double notaAleatoria;

        for (int i = 0; i < 5; i++) {
            notaAleatoria = (Math.random() * 10);
            añadirAlumno(notaAleatoria);
        }

        imprimirDiccionarioAlumnos();

        notasDistintas();

        String alumnoBuscado = "Alumno"+((int)(Math.random()*5)+1);
        
        mostrarAlumnosPorNota(alumnoBuscado);

        eliminarAlumnos();

        if (notas.isEmpty()) {
            System.out.println("Se han eliminado las notas");
        }
        imprimirDiccionarioAlumnos();
    }

    static void añadirAlumno(Double notaMedia) throws ExcepcionNota {
        if (notaMedia == null) {
            throw new ExcepcionNota("Nota vacia");
        } else {
            notas.put((nombre + indice), notaMedia);
            indice++;
        }
    }

    static void imprimirDiccionarioAlumnos() {
        for (String nombre : notas.keySet()) {
            System.out.println(nombre + " " + notas.get(nombre) + "\n");
        }
    }

    static void mostrarAlumnosPorNota(String nombre) {
        System.out.println("\n"+nombre + " con una nota media de: " + notas.get(nombre) + "\n");
    }

    static void notasDistintas() {
        ArrayList notasDistintas = new ArrayList();
        
        for(String nombre:notas.keySet()){
            double nota = notas.get(nombre);
            if(!notasDistintas.contains(nota)){
                notasDistintas.add(nota);
            }
        }
        
        System.out.println("Hay "+notasDistintas.size()+" notas diferentes las cuales son: ");
        
        for(int i = 0; i < notasDistintas.size(); i++){
            System.out.println(notasDistintas.get(i));
        }
    }

    static void eliminarAlumnos() {
        notas.clear();
    }
}
