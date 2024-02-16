/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poker;

import java.util.ArrayList;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Mazo {

    private ArrayList<Carta> mazo = new ArrayList<>();
    private ArrayList<Carta> barajado = new ArrayList<>(mazo);

    public Mazo(ArrayList<Carta> cartas) {
        mazo = cartas;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public void iniciarMazo() {
        for (int i = 0; i <= 3; i++) {
            String palo="";
            
            if (i == 0) {
                palo = "Picas";
            }
            if (i == 1) {
                palo = "Corazones";
            }
            if (i == 2) {
                palo = "Treboles";
            }
            if (i == 3) {
                palo = "Diamantes";
            }

            mazo.add(new Carta(palo, "A"));
            for (int j = 2; j <= 10; j++) {
                String valor = ("" + j);
                mazo.add(new Carta(palo, valor));
            }
            mazo.add(new Carta(palo, "J"));
            mazo.add(new Carta(palo, "Q"));
            mazo.add(new Carta(palo, "K"));
        }
    }
    
    public void barajar(){
        for (int i = 0; i < mazo.size(); i++) {
            barajado.set((int)(Math.random()*(mazo.size()-i)), mazo.get(i));
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("Mazo sin barajar: ");
        for (int i = 0; i < mazo.size(); i++) {
            System.out.println(mazo.get(i).imprimir());
        }
        System.out.println("Mazo barajado: ");
        for (int i = 0; i < barajado.size(); i++) {
            System.out.println(barajado.get(i).imprimir());
        }
    }
}
