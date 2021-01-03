package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CasillaVerificacion {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaCheckBox lamina = new LaminaCheckBox();
        marco.add(lamina);
        marco.anchoAlto(35, 35);
        marco.crearFormulario("Casilla de verificacion");
    }
}

class LaminaCheckBox extends JPanel {

    private final JCheckBox negrita, cursiva;
    private final JLabel texto;

    public LaminaCheckBox() {
        setLayout(new BorderLayout());
        Font tipoLetra = new Font("Serif", Font.PLAIN, 24);
        texto = new JLabel("En un lugar de la mancha de cuyo nombre no ....");
        texto.setFont(tipoLetra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);

        JPanel laminaCheckbox = new JPanel();
        negrita = new JCheckBox("Nigrita");
        negrita.addActionListener(new ManejoCheck());
        cursiva = new JCheckBox("Cursiva");
        cursiva.addActionListener(new ManejoCheck());
        laminaCheckbox.add(negrita);
        laminaCheckbox.add(cursiva);
        add(laminaCheckbox, BorderLayout.SOUTH);
    }

    private class ManejoCheck implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int tipo = 0;
            if (negrita.isSelected()) {
                tipo += Font.BOLD;
            }
            if (cursiva.isSelected()) {
                tipo += Font.ITALIC;
            }
            texto.setFont(new Font("Serif", tipo, 24));
        }

    }
}
