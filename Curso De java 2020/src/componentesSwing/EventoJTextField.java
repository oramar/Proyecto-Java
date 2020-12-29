
package componentesSwing;

import formularios.MarcoCentrado;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class EventoJTextField {
    public static void main(String[] args) {
         MarcoCentrado marco = new MarcoCentrado();
        //primero agrego la lamina antes de crear el marco
        LaminaPrincipalJtextField lamina = new LaminaPrincipalJtextField();
        //LaminaBorderLayout lamina2 = new LaminaBorderLayout();        
        marco.add(lamina);
        //marco.add(lamina2,BorderLayout.CENTER);
        marco.anchoAlto(25, 30);
        marco.crearFormulario("Evento de JTextField");
    }
      
}
class LaminaPrincipalJtextField extends JPanel{
    JTextField txtCampo;
    public LaminaPrincipalJtextField(){
        txtCampo = new JTextField(20);
        //Instanciamos la lamina Receptora
        LaminaReceptora receptora = new LaminaReceptora();
        //Creamos una variable de tipo Documentos que es que va estar en la escucha y le pasamos el metodo getDocument
        Document miDocumento = txtCampo.getDocument();
        //Colocamos el documento en escucha
        miDocumento.addDocumentListener(receptora);
        
        
        add(txtCampo);
    }
}


class LaminaReceptora implements DocumentListener{

    @Override
    public void insertUpdate(DocumentEvent de) {
        System.out.println("Haz insertado texto");
    }

    @Override
    public void removeUpdate(DocumentEvent de) {
        System.out.println("Haz eliminado texto");
    }

    @Override
    public void changedUpdate(DocumentEvent de) {
        System.out.println("Estas cambiando alguna de sus propiedades");
    }
    
}


