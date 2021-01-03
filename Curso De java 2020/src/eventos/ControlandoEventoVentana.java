
package eventos;

import formularios.MarcoCentrado;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;


public class ControlandoEventoVentana {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        marco.anchoAlto(50, 50);
        marco.crearFormulario("Controlando el estado de la Ventana");
        CambiarEstado cambiarEstado = new CambiarEstado();
        marco.addWindowStateListener(cambiarEstado);
    }
}

class CambiarEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent we) {
       int estadoNuevo = we.getNewState();
       int estadoViejo = we.getOldState();
       if(estadoNuevo == Frame.NORMAL){
           System.out.println("El estado de la ventana es normal");
       }else if(estadoNuevo==Frame.MAXIMIZED_BOTH){
           System.out.println("El estado de la ventana es maximizada");
       }else if(estadoNuevo == Frame.ICONIFIED){
           System.out.println("El estado de la ventana es minimizada");
       }
       
    }
    
}
