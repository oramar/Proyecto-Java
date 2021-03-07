
package laberinto;

import formularios.MarcoCentrado;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFormulario {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();        
        LaminaImagen lamina = new LaminaImagen();
        marco.add(lamina);
        marco.anchoAlto(50,50);
        marco.crearFormulario("imagen en el formulario");
        marco. setResizable(true);
    }
}

class LaminaImagen extends JPanel{
    @Override
    public void paint(Graphics grafico) {
        super.paint(grafico);
        ImageIcon personaje = new ImageIcon(getClass().getResource("/swing/img/carro.jpg"));    
        grafico.drawImage(personaje.getImage(),20, 20, 200, 250,this);
        }
    
}
