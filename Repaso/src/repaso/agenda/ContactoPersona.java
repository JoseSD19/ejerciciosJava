/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package repaso.agenda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ContactoPersona extends Contacto{

    private Date cumpleaños;
    
    public Date getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Date cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public ContactoPersona(String n, int t, int a, int m, int d){
        super(n,t);
        cumpleaños = new Date(a,m,d);
    }
    
    public String cumpleaños(){
        DateFormat formateador= new SimpleDateFormat("dd/MM/yy");
        
        return (formateador.format(this.getCumpleaños()));
    }
    
}
