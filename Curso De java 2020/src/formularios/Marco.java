
package formularios;

import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Marco extends JFrame{
    public Marco(String titulo,int ancho,int alto){
        //Especificamos el tamaño
        //setSize(alto, ancho);
        
        //Establece la posicion en la pantalla
        //setLocation(alto, ancho);
        
        //Especifica tamaño y posicion del marco
        setBounds(500, 200, alto, ancho);
        
        //lo hacemos visible
        setVisible(true);
        
        //Establecemos el titulo
        setTitle(titulo);
        
        //no permitir que cambie el tamaño del formulario
        setResizable(false);
        
        //Especifica si el formulario abre maximizado, minimixado o restaurado
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        
        
        
        //Le indicamos que hacer cuando se cierra
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
