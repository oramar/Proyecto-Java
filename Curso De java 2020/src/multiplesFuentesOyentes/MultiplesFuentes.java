package multiplesFuentesOyentes;

import formularios.MarcoCentrado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class MultiplesFuentes {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        //primero agrego la lamina antes de crear el marco
        panelAccion lamina = new panelAccion();
        marco.add(lamina);
        marco.anchoAlto(50, 50);
        marco.crearFormulario("Multiples Fuentes");
    }
}

class panelAccion extends JPanel {

    private JButton botonAmarillo, botonRojo, botonVerde;

    public panelAccion() {
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/swing/img/amarillo.jpg"), Color.yellow);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/swing/img/rojo.jpg"), Color.red);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/swing/img/azul.jpg"), Color.blue);

        botonAmarillo = new JButton(accionAmarillo);
        botonRojo = new JButton(accionRojo);
        botonVerde = new JButton(accionAzul);
        add(botonAmarillo);
        add(botonRojo);
        add(botonVerde);

        //1. Creamos mapa de entrada
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        //2. Creamos la combinacion de teclas
        KeyStroke teclaAmarilla = KeyStroke.getKeyStroke("ctrl A");
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaRoja = KeyStroke.getKeyStroke("ctrl R");

        //3. Asiganar combinacion de teclas al objeto
        mapaEntrada.put(teclaAmarilla, "ObjetoFondoAmarillo");
        mapaEntrada.put(teclaAzul, "ObjetoFondoAzul");
        mapaEntrada.put(teclaRoja, "ObjetoFondoRojo");
        
        //4. Asignar el objeto a la accion
        ActionMap mapaAccion=getActionMap();
        mapaAccion.put("ObjetoFondoAmarillo", accionAmarillo);
        mapaAccion.put("ObjetoFondoAzul", accionAzul);
        mapaAccion.put("ObjetoFondoRojo", accionRojo);

    }

    private class AccionColor extends AbstractAction {

        public AccionColor(String nombre, Icon icono, Color ColorLamina) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
            putValue("ColorFondo", ColorLamina);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //vamos a almacenar la informacion en el metodo
            Color color = (Color) getValue("ColorFondo");
            setBackground(color);

        }

    }

}
