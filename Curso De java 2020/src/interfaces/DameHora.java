
package interfaces;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class DameHora implements ActionListener {

    
    //Se debe implemntar el metodo actionPerformed de la interfaz
    @Override
    public void actionPerformed(ActionEvent ae) {
        Date ahora = new Date();
        System.out.println("Te pongo la hora cada 8 segundo "+ahora);
        Toolkit.getDefaultToolkit().beep();
    }
    
}
