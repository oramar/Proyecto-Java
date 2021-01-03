
package interfaces;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Temporizador {
    public static void main(String[] args) {
        DameHora oyente = new DameHora();
        //lo anterior tambien se puede instanciar asi
        //ActionListener oyente = new DameHora();
        Timer miTemporizador = new Timer(2000,oyente);//Primer parametro el tiempo que se ejecuta la accion y segundo parametro es una interfaz
        miTemporizador.start();
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener");
        System.exit(0);
    }
}
