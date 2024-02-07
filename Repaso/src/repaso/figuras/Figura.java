/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package repaso.figuras;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Figura {
    private String codigo;
    private double precio;
    private Superheroe heroe;
    private Dimension medida;
    
    public Figura(String codigo, double precio, Dimension medida, Superheroe heroe){
        this.codigo=codigo;
        this.precio=precio;
        this.medida=medida;
        this.heroe=heroe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Superheroe heroe) {
        this.heroe = heroe;
    }

    public Dimension getMedida() {
        return medida;
    }

    public void setMedida(Dimension medida) {
        this.medida = medida;
    }
    
    public String toString(){
        return ("Codigo: "+codigo
                +"\n"
                +heroe.toString()
                +"\n"
                +medida.toString()
                +"\nPrecio: "+precio);
    }
    
    public double subirPrecio(double aumento){
        return (this.precio+aumento);
    }
}
