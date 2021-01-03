
package ejerciciosCurso;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class ProcesadorTexto {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaProcesadorTexto lamina = new LaminaProcesadorTexto();
        marco.add(lamina);
        marco.anchoAlto(40, 40);
        marco.crearFormulario("Creando un procesador de texto");
    }
}

class LaminaProcesadorTexto extends JPanel{
    JPanel laminaMenu;
    JMenuBar barraTexto;
    JMenu fuente,estilo, tamano;
    public LaminaProcesadorTexto(){
        setLayout(new BorderLayout());
        laminaMenu = new JPanel();
        barraTexto = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamano = new JMenu("Tamaño");
        barraTexto.add(fuente);
        barraTexto.add(estilo);
        barraTexto.add(tamano);
        laminaMenu.add(barraTexto);
        add(laminaMenu,BorderLayout.NORTH);
        System.out.println("Esto no me funciona en linux");
        
        
        
        
    }
}