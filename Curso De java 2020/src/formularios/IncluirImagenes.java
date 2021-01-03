
package formularios;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class IncluirImagenes {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
         marco.anchoAlto(20,38);
        marco.crearFormulario("Formulario con imagen");
        LaminaImagen lamina = new LaminaImagen();
        marco.add(lamina);
       
    }
}

class LaminaImagen extends JPanel{
    
    private Image imagen;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File miImagen = new File("src/swing/img/carro.jpg");
        
        try{
            imagen=ImageIO.read(miImagen);
        }
        catch(IOException e){
            System.out.println("La imagen no se encuentra en la ruta");
        }
        //especoficar la anchura de la imagen
        
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        
        System.out.println("la imagen tiene una altura de "+alturaImagen +" y una anchura de "+anchuraImagen);
        g.drawImage(imagen, 25, 25, null);
    }
}
