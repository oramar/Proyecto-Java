
package Excepciones;

import formularios.MarcoCentrado;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class InicioExcepciones {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
       
         marco.anchoAlto(45, 55);
          LaminaExcepciones lamina = new LaminaExcepciones(marco.getAncho(),marco.getAlto());        
        marco.add(lamina);
        marco.crearFormulario("Trabajando con excepciones");
    }
}

class LaminaExcepciones extends JPanel{
      private int ancho;// =422;
      private int alto;// = 576;
    public LaminaExcepciones(int ancho,int alto) {
       this.ancho=ancho;
       this.alto = alto;
        try{
        image=ImageIO.read(new File("src/swing/img/azul.jpg"));
        }catch(IOException e){
            System.out.println("Imagen no esta en la ruta establecida");
        }
    }
    
      @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(image==null){
            g.drawString("No podemos cargar la imagen", 10, 20);
        }else{
        int anchoImagen = image.getWidth(this);
        int altoImagen = image.getHeight(this);
        
        g.drawImage(image, 0, 0, null);
      
        for(int i=0;i<ancho;i++){
            for(int j=0;j<alto;j++){
                if(i+j>0){
                    g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen*i, altoImagen*j);
                }
            }
        }
        }
    }
    
    private Image image;
}
