
package multiplesFuentes;

import formularios.MarcoCentrado;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MultiplesFuentes {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        marco.anchoAlto(50, 50);
        marco.crearFormulario("Multiples Fuentes");
        panelAccion lamina = new panelAccion();
        marco.add(lamina);
    }
}


class panelAccion extends JPanel{
    private JButton botonAmarillo,botonRojo,botonVerde;
    
    public panelAccion(){
        botonAmarillo = new JButton("Amarillo");
        botonRojo = new JButton("Rojo");
        botonVerde = new JButton("Verde");
        add(botonAmarillo);
         add(botonRojo);
          add(botonVerde);
    }
    
    private class AccionColor extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
}

