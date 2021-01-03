package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MarcoBorderLayou {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        //primero agrego la lamina antes de crear el marco
        LaminaFlowLayou lamina = new LaminaFlowLayou();
        LaminaBorderLayout lamina2 = new LaminaBorderLayout();
        //Agregamos disposicion de los botones dentro de la lamina
        //FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT,75,50);
        //lamina.setLayout(disposicion);
        marco.add(lamina, BorderLayout.NORTH);
        marco.add(lamina2, BorderLayout.CENTER);
        marco.anchoAlto(50, 50);
        marco.crearFormulario("Dispocisiones Layou");
    }
}

class LaminaFlowLayou extends JPanel {

    JButton zonaSur;
    JButton zonaNorte;

    public LaminaFlowLayou() {
        zonaSur = new JButton("Zona Sur", new ImageIcon("src/swing/img/amarillo.jpg"));
        zonaNorte = new JButton("Zona Norte", new ImageIcon("src/swing/img/rojo.jpg"));
        //Disposicion de la lamina FlowLayout      
        setLayout(new FlowLayout());
        add(zonaSur);
        add(zonaNorte);

    }
}

class LaminaBorderLayout extends JPanel {

    JButton zonaEste;
    JButton zonaOeste;
    JButton zonaCentro;

    public LaminaBorderLayout() {
        zonaEste = new JButton("Zona Este", new ImageIcon("src/swing/img/azul.jpg"));
        zonaOeste = new JButton("Zona Oeste", new ImageIcon("src/swing/img/azul.jpg"));
        zonaCentro = new JButton("Zona Centro", new ImageIcon("src/swing/img/azul.jpg"));

        setLayout(new BorderLayout());
        add(zonaEste, BorderLayout.EAST);
        add(zonaOeste, BorderLayout.WEST);
        add(zonaCentro, BorderLayout.CENTER);
    }
}
