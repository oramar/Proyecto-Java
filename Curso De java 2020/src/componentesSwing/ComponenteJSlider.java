
package componentesSwing;

import formularios.MarcoCentrado;
import javax.swing.JPanel;
import javax.swing.JSlider;

//Aprendiendo a Utilizar Control Deslizante
public class ComponenteJSlider {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaJSlider lamina = new LaminaJSlider();
        marco.add(lamina);
        marco.anchoAlto(40, 40);
        marco.crearFormulario("Aprendiendo JSlider");
    }
         
}

class LaminaJSlider extends JPanel{
    JSlider controlDeslizante;
    public LaminaJSlider(){
        controlDeslizante = new JSlider(JSlider.HORIZONTAL,0,100,5);
        controlDeslizante.setMajorTickSpacing(20);
        controlDeslizante.setMinorTickSpacing(10);
        controlDeslizante.setPaintLabels(true);
        controlDeslizante.setPaintTicks(true);
        controlDeslizante.setSnapToTicks(true);
        add(controlDeslizante);
    }
}
