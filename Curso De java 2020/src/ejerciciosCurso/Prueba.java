
package ejerciciosCurso;


import formularios.MarcoCentrado;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Prueba {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaPrueba lamina = new LaminaPrueba();
        marco.add(lamina);
        marco.anchoAlto(35, 40);
        marco.crearFormulario("Probando la visualizacion formulario");
    }
}

class LaminaPrueba extends JPanel{
    JLabel texto;
    public LaminaPrueba(){
        texto = new JLabel("Este es un label",JLabel.CENTER);
        add(texto);
    }
}
