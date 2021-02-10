package dispocisionesAvanzadas;

import formularios.MarcoCentrado;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisposicionesLibres {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaDisposicionLibre lamina = new LaminaDisposicionLibre();
        marco.add(lamina);
        marco.anchoAlto(25, 25);
        marco.crearFormulario("Disposiciones Avanzadas Libre");
    }
}

class LaminaDisposicionLibre extends JPanel {

    public LaminaDisposicionLibre() {
        setLayout(null);
        JTextField nombre = new JTextField(35);
        JTextField apellido = new JTextField(35);
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JLabel label1 = new JLabel("Nombre ");
        JLabel label2 = new JLabel("Apellido ");

        label1.setBounds(30, 30, 100, 25);
        nombre.setBounds(120, 30, 200, 25);
        label2.setBounds(30, 60, 100, 25);
        apellido.setBounds(120, 60, 200, 25);
        boton1.setBounds(60, 110, 100, 25);
        boton2.setBounds(200, 110, 100, 25);
        
        add(label1);
        add(nombre);
        add(label2);
        add(apellido);
        add(boton1);
        add(boton2);
    }
}
