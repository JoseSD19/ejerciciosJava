/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poker;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class JugadaPoker {

    private void pause(){
        try{
            TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
