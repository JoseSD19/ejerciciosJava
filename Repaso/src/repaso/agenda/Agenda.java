/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.agenda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Agenda {

    private ArrayList<Contacto> listaContactos = new ArrayList<>();

     public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }
    
    public boolean addContacto(Contacto c) {

        boolean add = false;
        
        if (getListaContactos().size() == 0) {
            getListaContactos().add(c);
            add = true;
        } else {
            for (int i = 0; i < getListaContactos().size(); i++) {
                Contacto con = getListaContactos().get(i);
                if (!c.nombre.equals(con.nombre)) {
                    getListaContactos().add(c);
                    add = true;
                }
            }
        }
        return add;
    }

    public boolean eliminarContacto(String nombre) {
        for (int i = 0; i < getListaContactos().size(); i++) {
            Contacto con = getListaContactos().get(i);
            if (con.nombre.equals(nombre)) {
                getListaContactos().remove(con);
                return true;
            }
        }
        return false;
    }

    public boolean existeContacto(String nombre) {
        for (int i = 0; i < getListaContactos().size(); i++) {
            Contacto con = getListaContactos().get(i);
            if (con.nombre.equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {
        
        for (int i = 0; i < getListaContactos().size(); i++) {
            Contacto con = getListaContactos().get(i);
            if(con instanceof ContactoPersona){
            System.out.println((i+1)+")\tNombre: " + con.nombre
                    + "\n\tTelefono: " + con.tlfno
                    + "\n\tCumpleaños: "+((ContactoPersona)con).cumpleaños()
                    + "\n-------------------------");
            }else{
                System.out.println((i+1)+")\tNombre: " + con.nombre
                    + "\n\tTelefono: " + con.tlfno
                    + "\n\tPagina Web : "+((ContactoEmpresa) con).getWeb()
                    + "\n-------------------------");
            }
        }
    }

    public int buscarContacto(String nombre) {
        for (int i = 0; i < getListaContactos().size(); i++) {
            Contacto con = getListaContactos().get(i);
            if (con.nombre.equals(nombre)) {
                return getListaContactos().indexOf(con);
            }
        }
        return -1;
    }

   
}
