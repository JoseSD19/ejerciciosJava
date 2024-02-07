/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package repaso.agenda;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ContactoEmpresa extends Contacto{
    
    private String web;

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
    
    public ContactoEmpresa(String nombre,String web,int tlfno){
        super(nombre,tlfno);
        this.web=web;
    }
}
