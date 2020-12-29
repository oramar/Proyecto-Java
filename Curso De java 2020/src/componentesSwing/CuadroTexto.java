package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CuadroTexto {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaPrincipal lamina = new LaminaPrincipal();
        marco.add(lamina);
        marco.anchoAlto(30, 30);
        marco.crearFormulario("Marco de texto");
    }

}

//Creamos la segunda lamina
class LaminaPrincipal extends JPanel {

    JLabel textoEstado;

    public LaminaPrincipal() {
        setLayout(new BorderLayout());
        //Le especificamos la alineacion de Jlabel en su constructor
        textoEstado = new JLabel("", JLabel.CENTER);
        //Agregamos jlabel en la zona centro de la lamina
        add(textoEstado, BorderLayout.CENTER);
        //Agregamos la otra lamina a esta lamina en la zona norte  y le pasamos como parametro nuestra Jlabel
        LaminaTexto laminaTexto = new LaminaTexto(textoEstado);
        add(laminaTexto, BorderLayout.NORTH);

    }
}

class LaminaTexto extends JPanel {

    JTextField txtNombre;
    JButton boton;
    JLabel textoNombre;
     //Creamos una variable de tipo JLabel y le pasamos el valor que nos dan cuando llamen el constructor 

    JLabel textoEstado;
    public LaminaTexto(JLabel textoEstado) {
        setLayout(new FlowLayout());
         this.textoEstado = textoEstado;
        txtNombre = new JTextField(15);
        boton = new JButton("Aceptar");
        textoNombre = new JLabel("Email");
        add(textoNombre);
        add(txtNombre);
        DameTexto texto = new DameTexto();
        boton.addActionListener(texto);
        add(boton);
    }

    private class DameTexto implements ActionListener {

       
        @Override
        public void actionPerformed(ActionEvent ae) {
            int correcto = 0;
            String dato = txtNombre.getText();

            for (int i = 0; i < dato.length(); i++) {
                if (dato.charAt(i) == '@') {
                    correcto++;
                }
            }

            if (correcto != 1) {
                textoEstado.setText("Incorrecto");
            } else {
                textoEstado.setText("Correcto");
            }

        }
        //video 87
    }

}
