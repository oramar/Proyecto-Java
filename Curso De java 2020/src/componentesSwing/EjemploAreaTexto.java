package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EjemploAreaTexto {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaPrincipalAreaTexto lamina = new LaminaPrincipalAreaTexto();
        marco.add(lamina);
        marco.anchoAlto(30, 31);
        marco.crearFormulario("Ejemplo de area de texto");
        //Voy para el video 92 Checkbox
    }
}

class LaminaPrincipalAreaTexto extends JPanel {

    public LaminaPrincipalAreaTexto() {
        setLayout(new BorderLayout());
        LaminaAreaTextoE laminaCentro = new LaminaAreaTextoE();
        LaminaBotonesE laminaInferior = new LaminaBotonesE();
        add(laminaCentro, BorderLayout.CENTER);
        add(laminaInferior, BorderLayout.SOUTH);
    }
}

class LaminaAreaTextoE extends JPanel {

    public static JTextArea texto;
    JScrollPane panel;
    public LaminaAreaTextoE() {
        texto = new JTextArea(10, 35);
        panel = new JScrollPane(texto);
        add(panel);
    }
}

class LaminaBotonesE extends JPanel {

    JButton btnInsertar, btnSaltoLinea;
   

    public LaminaBotonesE() {       
        btnInsertar = new JButton("insertar");
        btnSaltoLinea = new JButton("Salto Linea");
        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               LaminaAreaTextoE.texto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme");
            }

        });

        btnSaltoLinea.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean saltar = !LaminaAreaTextoE.texto.getLineWrap();
                LaminaAreaTextoE.texto.setLineWrap(saltar);
                
                //operador ternario
                btnSaltoLinea.setText(saltar ? "Quitar Salto" : "Agregar Salto");
            }

        });
        add(btnInsertar);
        add(btnSaltoLinea);
    }
}
