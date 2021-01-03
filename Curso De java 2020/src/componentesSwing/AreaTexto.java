
package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class AreaTexto {
    public static void main(String[] args) {
        
        MarcoCentrado marco = new MarcoCentrado();
        LaminaAreaTexto laminaArea = new LaminaAreaTexto();
        marco.add(laminaArea);
        marco.anchoAlto(30, 30);
        marco.crearFormulario("Trabajando con Area de texto");
        //Video 90
    }
}

class LaminaAreaTexto extends JPanel{
    JTextArea areaTexto;
    JButton boton;
    JScrollPane lamiaBarra;
    public LaminaAreaTexto(){
        areaTexto = new JTextArea("Area de texto",10,13);     
        boton = new JButton("Aceptar");
        areaTexto.setLineWrap(true);      
        //Agregamos el area de texto a la barra JScrollPane
        lamiaBarra = new JScrollPane(areaTexto);
        //Esta es la que agregamos a la lamina
        add(lamiaBarra);
         boton.addActionListener(new AccionLamina());
         add(boton);
    }
    
    private class AccionLamina implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println(areaTexto.getText());
        }

       
}
}
