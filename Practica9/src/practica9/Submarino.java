/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Submarino extends Acuatico {

    int profundidadMax;

    public Submarino(String matricula, String modelo, double eslora, int profundidad) {
        super(matricula, modelo, eslora);
        this.profundidadMax = profundidad;
    }

    public void imprimir() {
        System.out.println("Matricula: " + matricula
                        +"\nModelo: "+modelo
                        +"\nEslora: "+eslora
                        +"\nProfundidad: "+profundidadMax);
    }
}
