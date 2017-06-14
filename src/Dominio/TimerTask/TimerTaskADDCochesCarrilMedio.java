/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio.TimerTask;

import Dominio.Escenario;
import Dominio.Interficie.IEscenario;
import java.util.TimerTask;

/**
 *
 * @author Daniri
 */
public class TimerTaskADDCochesCarrilMedio extends TimerTask {
    private Escenario escenario;
    
    public TimerTaskADDCochesCarrilMedio(Escenario escenario){
        this.escenario = escenario;
    }
    
    @Override
    public void run() {
       escenario.addCoche(IEscenario.CARRILMED);
    }

}
