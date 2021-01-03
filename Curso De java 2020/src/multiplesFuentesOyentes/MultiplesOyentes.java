package multiplesFuentesOyentes;

import formularios.MarcoCentrado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiplesOyentes {
    
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        //primero agrego la lamina antes de crear el marco
        panelAccionOyente lamina = new panelAccionOyente();
        marco.add(lamina);
        marco.anchoAlto(50, 50);
        marco.crearFormulario("Multiples Oyentes");
    }
}

class panelAccionOyente extends JPanel {
    
    private final JButton CerrarToto;
    private final JButton CrearVentana;
    
    public panelAccionOyente() {
        CerrarToto = new JButton("Cerrar Todo");
        CrearVentana = new JButton("Crear Ventana");        
        add(CrearVentana);
        add(CerrarToto);
        OyenteNuevo oyenteNuevo = new OyenteNuevo();
        CrearVentana.addActionListener(oyenteNuevo);
        
    }
    
    private class OyenteNuevo implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            MarcoNuevo marco = new MarcoNuevo(CerrarToto);
            marco.setVisible(true);
            
        }
        
    }
    
}

class MarcoNuevo extends JFrame {

    private static int contador = 0;

    public MarcoNuevo(JButton CerrarToto) {
        contador++;
        setTitle("Venta " + contador);
        setBounds(40 * contador, 40 * contador, 300, 150);
        CierraTodo cierraTodo = new CierraTodo();
        CerrarToto.addActionListener(cierraTodo);
    }
    
    private class CierraTodo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            dispose();
        }
        
    }
}
