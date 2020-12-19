
package formularios;

import java.awt.Graphics;
import javax.swing.JPanel;


public class Laminas extends JPanel{
    
    //utilizamos el metodo siguiente para agregar un texto
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawString("Esto es un dibujo en el panel", 100, 100);
        g.drawRect(100, 105, 200, 200);
        g.drawLine(100, 105, 300, 305);
        g.drawLine(100, 305, 300, 105);
        g.drawLine(200, 105, 200, 305);
    }
}
