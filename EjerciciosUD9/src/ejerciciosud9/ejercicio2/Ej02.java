/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud9.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ej02 {

    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        String planeta, satelite;
        char respuesta;
        boolean seguir = true;

        //Mercurio
        ArrayList<Satelite> satelitesMercurio = new ArrayList<>();
        Planeta mercurio = new Planeta("Mercurio", "3.302x10^23", 58000000, 3.7, 4880, 167, 4222, 88, satelitesMercurio);

        //Venus
        ArrayList<Satelite> satelitesVenus = new ArrayList<>();
        Planeta venus = new Planeta("Venus", "4.869x10^24", 108000000, 8.87, 12103.6, 463.85, 243.0187, 225, satelitesVenus);

        //Tierra
        ArrayList<Satelite> satelitesTierra = new ArrayList<>();
        Planeta tierra = new Planeta("Tierra", "5.9736x10^24", 149600000, 9.8, 12756, 15, 24, 365.25, satelitesTierra);
        Satelite luna = new Satelite("Luna", "7.349x10^22", 1.62, 3473.8, 107, 27.312, 27.312, tierra, 378000);
        satelitesTierra.add(luna);

        //Marte
        ArrayList<Satelite> satelitesMarte = new ArrayList<>();
        Planeta marte = new Planeta("Marte", "6.4185x10^23", 228000000, 3.72, 6792, -65, 24.7, 687, satelitesMarte);
        Satelite fobos = new Satelite("Fobos", "1.08x10^26", 0.0084, 22.2, -40, 0.319, 0.319, marte, 9377);
        Satelite deimos = new Satelite("Deimos", "2x10^25", 0.0039, 12.6, -40, 1.262, 30.35, marte, 23460);
        satelitesMarte.add(fobos);
        satelitesMarte.add(deimos);

        ArrayList<Planeta> planetas = new ArrayList<>();
        planetas.add(mercurio);
        planetas.add(venus);
        planetas.add(tierra);
        planetas.add(marte);

        ArrayList<Satelite> satelites = new ArrayList<>();
        satelites.add(luna);
        satelites.add(fobos);
        satelites.add(deimos);

        Iterator<Planeta> itPlanetas = planetas.iterator();
        Iterator<Satelite> itSatelites = satelites.iterator();

        do{
        System.out.println("Que quieres hacer: "
                        +"\na)Informacion de un planeta"
                        +"\nb)Informacion de un satelite"
                        +"\nc)Salir");
        respuesta = sc.nextLine().toLowerCase().charAt(0);

        switch (respuesta) {
            case 'a':
                System.out.println("Teniendo los siguientes planetas: ");
                while (itPlanetas.hasNext()) {
                    Planeta p = itPlanetas.next();
                    System.out.println(p.getNombre());
                }

                System.out.println("De que planeta quieres conocer los datos: ");
                planeta = sc.nextLine().toLowerCase();

                switch (planeta) {
                    case "mercurio":
                        mercurio.muestra();
                        break;
                    case "venus":
                        venus.muestra();
                        break;
                    case "tierra":
                        tierra.muestra();
                        break;
                    case "marte":
                        marte.muestra();
                        break;
                    default:
                        System.err.println("No existe ese planeta");
                }
                break;
            case 'b':
                System.out.println("Teniendo los siguientes satelites: ");
                while (itSatelites.hasNext()) {
                    Satelite s = itSatelites.next();
                    System.out.println(s.getNombre());
                }
                System.out.println("De que satelite quieres conocer la informacion");
                satelite = sc.nextLine().toLowerCase();
                
                switch (satelite) {
                    case "luna":
                        luna.muestra();
                        break;
                    case "fobos":
                        fobos.muestra();
                        break;
                    case "deimos":
                        deimos.muestra();
                        break;
                    default:
                        System.err.println("No existe ese satelite");
                }
                break;
            case 'c':
                seguir = false;
                break;
            default:
                System.err.println("Indique una de las dos opciones");
        }
        }while(seguir);
    }
}
