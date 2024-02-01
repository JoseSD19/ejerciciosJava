/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejemplos;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Articulo {
    
    public static final double IVA = 0.21;
    public static int numero = 0;
    private final String identificador;
    
    
    private String cod;
    private  String titulo;
    private String formato;
    private float precio_alquiler;
    
    public Articulo(String cod, String titulo, String formato, float precio_alquiler, String identificador){
        
        
        this.cod=cod;
        this.titulo=titulo;
        this.formato=formato;
        this.precio_alquiler=precio_alquiler;
        this.identificador=identificador;
        numero++;
    }
    
    public int numeroArticulo(){        
        return numero;
    }
    
    public float precio1(){
        return (precio_alquiler);
    }
    
    public float precio2(){
        float precio_total;
        
        precio_total = precio_alquiler*1.80f;
        
        return (precio_total);
    }
    
    public float precio_semana(){
        float precio_total;
        
        precio_total = precio_alquiler*5;
        
        return (precio_total);
    }
    
    public void modificaValores(String cod_p,String titulo_p, String formato_p, float precio_p){
        
        setCod(cod_p);
        setTitulo(titulo_p);
        setFormato(formato_p);
        setPrecio_alquiler(precio_p);
    }
    
    
    public String getCod(){
        return cod;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public float getPrecio_Alquiler() {
        return precio_alquiler;
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * @param precio_alquiler the precio_alquiler to set
     */
    public void setPrecio_alquiler(float precio_alquiler) {
        this.precio_alquiler = precio_alquiler;
    }
    
}
