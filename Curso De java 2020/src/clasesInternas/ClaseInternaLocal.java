
package clasesInternas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ClaseInternaLocal {
    public static void main(String[] args) {
        temporizador reloj = new temporizador();
        reloj.MarchaReloj(1000,true);
        JOptionPane.showMessageDialog(null, "Aceptar para terminar");
        System.exit(0);
    }
    
}

        class temporizador{
        

            

            public void MarchaReloj(int intervalo,final boolean sonido){
                    //declaracion de una clase interna
                    class DameHoras implements ActionListener{

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            Date ahora = new Date();
                            System.out.println("La hora es "+ahora);
                            if(sonido){
                                Toolkit.getDefaultToolkit().beep();
                            }
                        }
                        
                    }
                    
                ActionListener oyente = new DameHoras();
                Timer temporizador = new Timer(intervalo,oyente);
                temporizador.start();
            }
            
        }