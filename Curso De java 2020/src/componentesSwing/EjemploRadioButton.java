package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjemploRadioButton {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaRadioButtonEjemplo lamina = new LaminaRadioButtonEjemplo();
        marco.add(lamina);
        marco.anchoAlto(35, 40);
        marco.crearFormulario("Ejemplo Radio Button");
        //Video 94
    }
}

class LaminaRadioButtonEjemplo extends JPanel {

    private JLabel lblTexto;    
    private ButtonGroup bgAgrupador;
    private JPanel laminaBotones;

    public LaminaRadioButtonEjemplo() {
        setLayout(new BorderLayout());
        laminaBotones = new JPanel();
        bgAgrupador = new ButtonGroup();
        lblTexto = new JLabel("Amo la vida, el amor y todo lo que soy....", JLabel.CENTER);
        lblTexto.setFont(new Font("Arial", Font.PLAIN, 14));
        setColocarBotones("Pequeño", false,12);
        setColocarBotones("Mediano", true,14);
        setColocarBotones("Grande", false,16);
        setColocarBotones("Muy Grande", false,18);        
        add(lblTexto, BorderLayout.CENTER);
        add(laminaBotones, BorderLayout.SOUTH);

    }

    public void setColocarBotones(String nombre, boolean seleccion, final int tamano) {
        JRadioButton boton = new JRadioButton(nombre, seleccion);
        bgAgrupador.add(boton);
        laminaBotones.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                lblTexto.setFont(new Font("Arial", Font.PLAIN, tamano));
            }
        });
    }

}
