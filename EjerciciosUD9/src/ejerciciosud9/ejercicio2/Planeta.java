/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Planeta extends Astros{
    private double distanciaSol;
    private ArrayList<Satelite> listaSatelites;
    
    public Planeta(String nombre, String masa, double distanciaSol, double gravedad,double diametroMedio, double temperaturaMedia, double periodoRotacion, double periodoTraslacion, ArrayList listaSatelites){
        super(nombre, masa, gravedad,diametroMedio, temperaturaMedia, periodoRotacion, periodoTraslacion);
        this.distanciaSol=distanciaSol;
        this.listaSatelites=listaSatelites;        
    }
    
    public void muestra(){
        System.out.println("Nombre: "+getNombre()
                +"\nMasa: "+getMasa()+"kg"
                +"\nDistacia al Sol: "+getDistanciaSol()+"km"
                +"\nGravedad: "+getGravedad()+"m/s"
                +"\nDiametro medio: "+getDiametroMedio()+"km"
                +"\nTemperatura Media: "+getTemperaturaMedia()+"ºC"
                +"\nPeriodo Rotacion: "+getPeriodoRotacion()+" horas"
                +"\nPeriodo Traslacion: "+getPeriodoTraslacion()+" dias"
                +"\nSatelites: ");
        satelites(getListaSatelites());
    }
    
    public void satelites(ArrayList<Satelite> lista){
        if (lista.size()>0) {
            Iterator<Satelite> it = lista.iterator();
            while(it.hasNext()){
                Satelite s = it.next();
                s.muestra();
            }
        }else{
            System.out.println("No tiene satelites");
        }
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public ArrayList<Satelite> getListaSatelites() {
        return listaSatelites;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public void setListaSatelites(ArrayList<Satelite> listaSatelites) {
        this.listaSatelites = listaSatelites;
    }
}
