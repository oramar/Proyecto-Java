
package eventosFocus;

import formularios.MarcoCentrado;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FocusVentana {
    public static void main(String[] args) {
        
        
        
        oyenteFocusVentana oyenteVentana = new oyenteFocusVentana();
        
        
        
    }
 
}

class oyenteFocusVentana implements WindowFocusListener{
    MarcoCentrado marco2,marco1;
    public oyenteFocusVentana(){
         laminaFocus lamina =  new laminaFocus();
        marco1 = new MarcoCentrado();
        marco1.anchoAlto(60, 60);
        marco1.crearFormulario("Eventos focus ventana");
         marco1.add(lamina);
        marco2 = new MarcoCentrado();
        marco2.anchoAlto(50, 50);
        marco2.crearFormulario("Eventos focus ventana");
        marco1.addWindowFocusListener(this);
         marco2.addWindowFocusListener(this);
        
    }
    @Override
    public void windowGainedFocus(WindowEvent we) {
        if(we.getSource()==marco1){
            marco1.setTitle("La Ventana tiene el focus");
        }else{
            marco2.setTitle("La Ventana tiene el focus");
        }
        
        
    }

    @Override
    public void windowLostFocus(WindowEvent we) {
        if(we.getSource()==marco1){
            marco1.setTitle("La Ventana perdio el focus");
        }else{
            marco2.setTitle("La Ventana perdio el focus");
        }
    }
    
}

class laminaFocus extends JPanel{
    private JTextField texto1;
    private JTextField texto2;
    public laminaFocus(){
        focusComponentes focoComponente = new focusComponentes();
        texto1 = new JTextField(50);
        texto2=new JTextField(50);
        texto1.addFocusListener(focoComponente);
        texto2.addFocusListener(focoComponente);
        add(texto1);
        add(texto2);
    }
    
    private class focusComponentes implements FocusListener{

    @Override
    public void focusGained(FocusEvent fe) {
       if(fe.getSource()==texto1){
           System.out.println("El texteo 1 gano el focu");
       }else{
           System.out.println("El texto 2 gano el focus");
       }
    }

    @Override
    public void focusLost(FocusEvent fe) {
        
    }
    
}
}

