package laberinto;


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Juego {

    public static void main(String[] args) {
        MarcoCentrado marcoLaberinto = new MarcoCentrado();
        LaminaLaberinto lamina = new LaminaLaberinto();
        marcoLaberinto.add(lamina);
        marcoLaberinto.anchoAlto(100, 100);
        marcoLaberinto.crearFormulario("Mi primer laberinto");
          while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            marcoLaberinto.repaint();
            
        }
    }
}

class LaminaLaberinto extends JPanel {

    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje();

    public LaminaLaberinto() {
        addKeyListener(new KeyListener() {
           
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {
                personaje.teclaPresionada(ke);
            }

            @Override
            public void keyReleased(KeyEvent ke) {

            }
        });
        setFocusable(true);

    }

    @Override
    public void paint(Graphics grafico) {
        laberinto.paint(grafico);
        personaje.paint(grafico);
      
    }

}
