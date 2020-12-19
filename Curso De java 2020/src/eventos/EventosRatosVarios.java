
package eventos;

import formularios.MarcoCentrado;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class EventosRatosVarios {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        marco.anchoAlto(50, 50);
        marco.crearFormulario("Eventos del el Raton Mause");
        //EventoMause eventoMause = new EventoMause();
        cotrolarMovimientoRaton movimientoRaton = new cotrolarMovimientoRaton();
       // marco.addMouseListener(eventoMause);
        marco.addMouseMotionListener(movimientoRaton);
    }
}

class EventoMause implements MouseListener{//tambien podemos heredar de la clase adaptadora MouseAdapter

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Sucede cuando presionamos y soltamos el boton del mause");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        int botonPulsado = me.getModifiersEx();
        int clickHecho = me.getClickCount();
         System.out.println("Boton Presionado hacia abajo");
         if(botonPulsado == InputEvent.BUTTON1_DOWN_MASK){
             System.out.println("El numero del boton es "+botonPulsado+ " Que corresponde al boton izquierdo del mause");
         }else if(botonPulsado==InputEvent.BUTTON2_DOWN_MASK){
             System.out.println("El numero del boton es "+botonPulsado+ " Que corresponde a la rueda del mause");
         }else{
             System.out.println("El numero del boton es "+botonPulsado+ " Que corresponde al boton derecho del mause");
         }
         
         System.out.println("Haz hecho "+clickHecho+ " clics en esta area");
         
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Se suelta el boton del raton");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Cuando el ratos pasa por ensima del formulario, boton etc");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Cuando el raton se sale de un componente");
    }
    
}

//Controla el movimiento del raton
class cotrolarMovimientoRaton implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent me) {
        //Controla cuando se esta arrastrando el raton
        System.out.println("Controla cuando se esta arrastrando el raton");
    }

    @Override
    public void mouseMoved(MouseEvent me) {
      //Controla cuando se esta moviendo el raton
        System.out.println("Controla cuando se esta moviendo el raton");
    }
    
}
