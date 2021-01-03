
package clasesInternas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

public class TemporizadorClaseInterna {
    private final int intervalo;
    private final boolean sonido;
    
    public TemporizadorClaseInterna(int intervalo, boolean sonido){
        this.intervalo  =intervalo;
        this.sonido = sonido;
        
    }
    
    public void MarchaReloj(){
        ActionListener oyente = new DameHora();
        Timer temporizador = new Timer(intervalo,oyente);
        temporizador.start();
        
    }
    //declaracion de una clase interna
    private class DameHora implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Date ahora = new Date();
            System.out.println("La hora es "+ahora);
            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
        
    }
}

