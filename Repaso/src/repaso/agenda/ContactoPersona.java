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

    private Date cumplea�os;
    
    public Date getCumplea�os() {
        return cumplea�os;
    }

    public void setCumplea�os(Date cumplea�os) {
        this.cumplea�os = cumplea�os;
    }

    public ContactoPersona(String n, int t, int a, int m, int d){
        super(n,t);
        cumplea�os = new Date(a,m,d);
    }
    
    public String cumplea�os(){
        DateFormat formateador= new SimpleDateFormat("dd/MM/yy");
        
        return (formateador.format(this.getCumplea�os()));
    }
    
}
