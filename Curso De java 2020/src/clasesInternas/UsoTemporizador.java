
package clasesInternas;

import javax.swing.JOptionPane;


public class UsoTemporizador {
    public static void main(String[] args) {
        TemporizadorClaseInterna reloj = new TemporizadorClaseInterna(2000,true);
        reloj.MarchaReloj();
        JOptionPane.showMessageDialog(null, "Aceptar para terminar");
        System.exit(0);
    }
}
