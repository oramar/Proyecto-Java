
package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ComboBoxDespegable {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaComboBox lamina = new LaminaComboBox();
        marco.add(lamina);
        marco.anchoAlto(45, 45);
        marco.crearFormulario("Trabajando con ComboBox Despegable");
    }
}

class LaminaComboBox extends JPanel{
    JComboBox opciones;
    JLabel lblTexto;
    JPanel laminaCombo;
    String[] elemento = {"Serif","SansSerif","Monospaced","Dialog"};
    public LaminaComboBox(){
        setLayout(new BorderLayout());
        opciones = new JComboBox(elemento);
        opciones.addItem("Arial");
        laminaCombo = new JPanel();
        lblTexto = new JLabel("Dios es amor y nada me faltara...",JLabel.CENTER);
        lblTexto.setFont(new Font("Serif", Font.PLAIN, 18));
        opciones.addActionListener(new EventoComboBox());
        laminaCombo.add(opciones);
        add(lblTexto,BorderLayout.CENTER); 
        add(laminaCombo,BorderLayout.NORTH);
    }
    
    private class EventoComboBox implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            lblTexto.setFont(new Font((String)opciones.getSelectedItem(), Font.PLAIN,18));
        }
        
    }
}
