
package formularios;

import java.awt.GraphicsEnvironment;


public class TipoFuentePC {
    public static void main(String[] args) {
        String [] nombreFuente = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        int numero =1 ;
        for(String fuente:nombreFuente){            
            System.out.println(numero+". "+fuente);
            numero++;
        }
    }
}
