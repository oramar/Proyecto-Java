package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EjemploJSlider {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        EjemploLaminaSLider lamina = new EjemploLaminaSLider();
        marco.add(lamina);
        marco.anchoAlto(41, 40);
        marco.crearFormulario("Ejemplo de componente JSlider");
    }
}

class EjemploLaminaSLider extends JPanel {

    private JSlider control;
    private JLabel rotulo;
    private JPanel laminaSlaider;
    private static int contador;
    public EjemploLaminaSLider() {
        control = new JSlider(0, 60, 5);
        setLayout(new BorderLayout());
        rotulo = new JLabel("En el 2021 Dios esta conmigo...", JLabel.CENTER);
        laminaSlaider = new JPanel();
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        control.setSnapToTicks(true);
        control.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                contador++;
                int valorElemento;
                System.out.println("Esta moviendo el deslizante " + contador);
                valorElemento = control.getValue();
                System.out.println("Estas en el valor de SLider : " + valorElemento);
                rotulo.setFont(new Font("Serif", Font.BOLD, valorElemento));
            }

        });
        laminaSlaider.add(control);
        add(rotulo, BorderLayout.CENTER);
        add(laminaSlaider, BorderLayout.NORTH);
    }
}
