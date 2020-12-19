
package eventos;

import formularios.MarcoCentrado;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class EventoTeclado {
    public static void main(String[] args) {
         MarcoCentrado marco = new MarcoCentrado();
        marco.anchoAlto(50, 50);
        marco.crearFormulario("Eventos del teclado");
        Teclado eventoTeclado = new Teclado();
        marco.addKeyListener(eventoTeclado);
    }
}

class Teclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
        System.out.println("Tecla presionada hacia abajo y arriba");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        char teclaPulsada = ke.getKeyChar();
        int codigoTecla = ke.getKeyCode();
        System.out.println("Presionado tecla hacia bajo");
        System.out.println("La tecla pulsada es "+teclaPulsada+" Y su codigo es "+codigoTecla);
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        System.out.println("Presionado tecla hacia arriba");
    }
    
}
