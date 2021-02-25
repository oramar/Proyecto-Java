package laberinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Personaje {

    private int x = 20;
    private int y = 20;
    private final int ancho = 20;
    private final int alto = 20;
    private final int movimiento = 20;
    Laberinto lab = new Laberinto();

    public void paint(Graphics grafico) {

        grafico.setColor(Color.RED);
        grafico.fillOval(x, y, ancho, alto);
        //grafico.drawImage(new ImageIcon("src/swing/img/negrita.png"), x, y, ancho, alto, null);
        grafico.setColor(Color.white);
        grafico.drawOval(x, y, ancho, alto);
    }

    public void teclaPresionada(KeyEvent evento) {
        int[][] laberinto = lab.obtenerLaberinto();
        if (evento.getKeyCode() == 37) {//Tecla izquierda
            if (laberinto[y / 20][x / 20 - 1] != 1) {
                x = x - movimiento;
            }
        }
        if (evento.getKeyCode() == 39) {//Tecla derecha
            if (laberinto[y / 20][x / 20 + 1] != 1) {
                x = x + movimiento;
            }
        }
        if (evento.getKeyCode() == 40) {//Tecla abajo
            if (laberinto[y / 20 + 1][x / 20] != 1) {
                y = y + movimiento;
            }
        }
        if (evento.getKeyCode() == 38) {//Tecla arriba
            if (laberinto[y / 20 - 1][x / 20] != 1) {
                y = y - movimiento;
            }
        }

    }
}
