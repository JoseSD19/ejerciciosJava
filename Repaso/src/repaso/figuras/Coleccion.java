/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.figuras;

import java.util.ArrayList;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Coleccion {

    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    public void añadirFigura(Figura fig) {
        this.listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id) {
        for (int i = 0; i < listaFiguras.size(); i++) {
            Figura f = listaFiguras.get(i);

            if (f.getCodigo().equals(id)) {
                f.setPrecio((f.getPrecio() + cantidad));
            }
        }
    }

    public String toString() {
        String cadena = "La lista de figuras de " + nombreColeccion + " es: ";
        for (int i = 0; i < listaFiguras.size(); i++) {
            cadena += "\n-----------------";
            cadena += "\n" + listaFiguras.get(i).toString();
            cadena += "\n-----------------";
        }
        return cadena;
    }

    public String conCapa() {
        String cadena = "Las figuras con capa son: ";
        for (int i = 0; i < listaFiguras.size(); i++) {
            Figura f = listaFiguras.get(i);
            if (f.getHeroe().isCapa()) {
                cadena += "\n-----------------"
                        + "\n" + f.toString()
                        + "\n-----------------";
            }
        }
        return cadena;
    }

    public String masValioso() {
        double max = 0;
        Figura masValiosa = listaFiguras.get(0);
        for (int i = 0; i < listaFiguras.size(); i++) {
            Figura f = listaFiguras.get(i);
            if (f.getPrecio() > max) {
                max = f.getPrecio();
                masValiosa = f;
            }
        }
        return ("La figura mas valiosa es: "
                + masValiosa.toString());
    }

    public double getValorColeccion() {

        double precioTotal = 0;

        for (int i = 0; i < listaFiguras.size(); i++) {
            Figura f = listaFiguras.get(i);
            precioTotal += f.getPrecio();
        }

        return precioTotal;
    }
    
    public double getVolumenColeccion() {

        double volumenTotal = 200;

        for (int i = 0; i < listaFiguras.size(); i++) {
            Figura f = listaFiguras.get(i);
            volumenTotal += f.getMedida().getVolumen();
        }

        return volumenTotal;
    }

}
