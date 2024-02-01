/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud9.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ej01 {
    
    public static void Ejecutar() {
        
        Producto p1 = new Producto("pan", 1);
        Producto p2 = new Producto("leche", 2);
        Producto p3 = new Producto("azucar",3);
        Producto p4 = new Producto("huevos", 4);
        Producto p5 = new Producto("carne",5);
        
        //Para limitar la lista a un solo tipo se pone entre <_>
        ArrayList<Producto> lista = new ArrayList<>();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        
        System.out.println("Imprimiendo lista con "+lista.size()+" elementos");
        imprimirLista(lista);
        
        lista.remove(0);
        lista.remove(1);
        
        lista.add(1,new Producto("Ajo",4));
        
        System.out.println("Imprimiendo lista con "+lista.size()+" elementos");
        imprimirLista(lista);
        
        lista.removeAll(lista);
        
        System.out.println("Imprimiendo lista con "+lista.size()+" elementos");
        imprimirLista(lista);
    }
    
    public static void imprimirLista(ArrayList<Producto> lista){
        //Para limitar el iterator al igual que la lista se pone entre <_> el tipo
        Iterator<Producto> it = lista.iterator();
        
        while(it.hasNext()){
            Producto p = it.next();
            System.out.println("\tNombre: "+p.getNombre()+"\n\tCantidad:"+p.getCantidad()+"\n\t-------------");
        }
    }
}
