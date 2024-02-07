/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package repaso.figuras;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;
    
    public Superheroe(String nombre){
        this.nombre=nombre;
        descripcion="";
        capa=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }
    
    public String toString(){
        return ("Nombre: "+nombre+"\nDescripcion: "+descripcion+"\nCapa: "+capa);
    }
    
}
