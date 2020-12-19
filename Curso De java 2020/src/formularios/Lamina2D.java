
package formularios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;


public class Lamina2D extends JPanel{
    public void fondo(Color color){
        setBackground(color);
    }
   
    
    @Override
    public void paintComponent(Graphics e){
        super.paintComponents(e);
        Graphics2D g2 = (Graphics2D)e;
        Rectangle2D rectangulo = new Rectangle.Double(100,200,200,200);
        Ellipse2D elipse = new Ellipse2D.Double();
        g2.draw(rectangulo);
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        //Establecemos el color
        g2.setPaint(Color.red);
        //dibujamos el fondo con el color creado anteriormente
        g2.fill(rectangulo);
        g2.draw(new Line2D.Double(100,200,300,400));
        
        //Crearemos otro ellipse
        double CentroX = rectangulo.getCenterX();
        double CentroY = rectangulo.getCenterY();
        double radio = 140;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroX, CentroY, CentroX+radio, CentroY+radio);
        g2.draw(circulo);
        //Especificamos otro color
        g2.setPaint(Color.red);
        //draw Dibuja el contorno
        g2.draw(elipse);
        g2.setPaint(Color.green);
        //fill Dibuja el relleno
        g2.fill(elipse);
        
        
        
        
    }
}
