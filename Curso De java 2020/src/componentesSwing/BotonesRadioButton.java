package componentesSwing;

import formularios.MarcoCentrado;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BotonesRadioButton {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaRadioButton lamina = new LaminaRadioButton();
        marco.add(lamina);
        marco.anchoAlto(30, 31);
        marco.crearFormulario("Aprendiendo Radio Button");
    }
}

class LaminaRadioButton extends JPanel {

    JRadioButton jrbAzul, jrbAmarillo, jrvRojo;
    ButtonGroup bgContenedor;

    public LaminaRadioButton() {
       // jrbAmarillo = new JRadioButton("Lunes", new ImageIcon("src/swing/img/amarillo.jpg"));
       jrbAmarillo = new JRadioButton("Lunes",true);
        jrbAzul = new JRadioButton("Lunes",false);
        jrvRojo = new JRadioButton("Lunes", false);
        bgContenedor = new ButtonGroup();
        bgContenedor.add(jrbAmarillo);
        bgContenedor.add(jrbAzul);
        bgContenedor.add(jrvRojo);
        add(jrbAmarillo);
        add(jrbAzul);
        add(jrvRojo);
    }
}
