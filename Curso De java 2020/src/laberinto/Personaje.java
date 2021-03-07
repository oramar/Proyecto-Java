package laberinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Personaje {

    private int x = 30;
    private int y = 30;
    private final int ancho = 29;
    private final int alto = 29;
    private final int movimiento = 29;
    private final int tamano = 29;
    Laberinto lab = new Laberinto();
    JPanel panel;
    
    public Personaje(){
        this.panel = panel;
    }

    public void paint(Graphics grafico) {
        //ImageIcon personaje = new ImageIcon(getClass().getResource("/swing/img/LABERINTO.png"));    
        //grafico.drawImage(personaje.getImage(),x, y, ancho, alto,panel);
        
        //araña
        ImageIcon personaje = new ImageIcon(getClass().getResource("/swing/img/Araña.png"));    
        grafico.drawImage(personaje.getImage(),x, y, ancho, alto,panel);
        
        /*grafico.setColor(Color.RED);
        grafico.fillOval(x, y, ancho, alto);
        //grafico.drawImage(new ImageIcon("src/swing/img/negrita.png"), x, y, ancho, alto, null);
        grafico.setColor(Color.white);
        grafico.drawOval(x, y, ancho, alto);*/
    }

    public void teclaPresionada(KeyEvent evento) {
        int[][] laberinto = lab.obtenerLaberinto();
        if (evento.getKeyCode() == 37) {//Tecla izquierda
            if (laberinto[y / tamano][x / tamano - 1] != 1) {
                x = x - movimiento;
            }
        }
        if (evento.getKeyCode() == 39) {//Tecla derecha
            if (laberinto[y / tamano][x / tamano + 1] != 1) {
                x = x + movimiento;
            }
        }
        if (evento.getKeyCode() == 40) {//Tecla abajo
            if (laberinto[y / tamano + 1][x / tamano] != 1) {
                y = y + movimiento;
            }
        }
        if (evento.getKeyCode() == 38) {//Tecla arriba
            if (laberinto[y / tamano - 1][x / tamano] != 1) {
                y = y - movimiento;
            }
        }

    }
}
