package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ComponenteJSpinner {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaJPinner lamina = new LaminaJPinner();
        marco.add(lamina);
        marco.anchoAlto(25, 30);
        marco.crearFormulario("Aprendiendo a Utilizar JSpinner");
    }
}

class LaminaJPinner extends JPanel {

    JSpinner controlSpinner, tipoLetras;
    JLabel texto;
    JPanel laminaTexto;
    JPanel laminaTiposLetras;

    public LaminaJPinner() {
        setLayout(new BorderLayout());
        controlSpinner = new JSpinner(new SpinnerNumberModel(50, 0, 100, 1));
        Dimension tamanoSpinner = new Dimension(200, 20);
        controlSpinner.setPreferredSize(tamanoSpinner);
        texto = new JLabel("Aqui te voy a decir algo..");
        laminaTexto = new JPanel();
        laminaTexto.add(texto);
        controlSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                texto.setText("El valor del JPiner es: " + controlSpinner.getValue());
                texto.setFont(new Font((String)tipoLetras.getValue(), Font.BOLD, (int) controlSpinner.getValue()));
            }
        });
        //Vamos agregar una lista al JSpinner

        String[] lista = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        tipoLetras = new JSpinner(new SpinnerListModel(lista));
        tipoLetras.setPreferredSize(new Dimension(250, 20));
        tipoLetras.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                texto.setFont(new Font((String)tipoLetras.getValue(),Font.BOLD,(int)controlSpinner.getValue()));
            }
        });

        laminaTiposLetras = new JPanel();
        laminaTiposLetras.add(tipoLetras);
        add(laminaTiposLetras, BorderLayout.NORTH);
        add(controlSpinner, BorderLayout.EAST);
        add(laminaTexto, BorderLayout.SOUTH);
    }
}
