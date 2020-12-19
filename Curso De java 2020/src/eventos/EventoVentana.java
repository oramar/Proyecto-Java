
package eventos;

import com.sun.java.accessibility.util.AWTEventMonitor;
import formularios.MarcoCentrado;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class EventoVentana {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        marco.anchoAlto(50, 50);
        marco.crearFormulario("Formulario con eventos de ventana");
        MarcoVentana ventana = new MarcoVentana();
        marco.addWindowListener(ventana);
        
    }
    
    
}

class MarcoVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Ventana Abierta");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Ventana Restaurada");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Ventana Activada");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Ventana desactivada");
    }
    
}
