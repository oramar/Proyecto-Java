package ejerciciosDelCurso;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class ProcesadorTexto {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaProcesador lamina = new LaminaProcesador();
        marco.add(lamina);
        marco.anchoAlto(20, 20);
        marco.crearFormulario("Creando un procesador de texto");

    }
}

final class LaminaProcesador extends JPanel {

    private final JPanel laminaMenu;
    private final JMenuBar miBarra;
    private final JMenu fuente;
    private final JMenu estilo;
    private final JMenu tamano;
    private final JTextPane texto;

    public LaminaProcesador() {
        setLayout(new BorderLayout());
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamano = new JMenu("Tamano");
        laminaMenu = new JPanel();
        miBarra = new JMenuBar();
        texto = new JTextPane();

        configuraMenu("Arial", "fuente", "", 1, 1);
        configuraMenu("Courier", "fuente", "", 1, 1);
        configuraMenu("Verdana", "fuente", "", 1, 1);

        configuraMenu("Negrita", "estilo", "", 1, 1);
        configuraMenu("Cursiva", "estilo", "", 1, 1);

        configuraMenu("12", "tamano", "", 1, 1);
        configuraMenu("16", "tamano", "", 1, 1);
        configuraMenu("20", "tamano", "", 1, 1);
        configuraMenu("24", "tamano", "", 1, 1);
        
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamano);
        
        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);
        add(texto, BorderLayout.CENTER);

    }

    public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilo, int tamano) {
        JMenuItem elementoMenu = new JMenuItem(rotulo);

        if (menu.equals("fuente")) {
            fuente.add(elementoMenu);
        } else if (menu.equals("estilo")) {
            this.estilo.add(elementoMenu);
        } else if (menu.equals("tamano")) {
            this.tamano.add(elementoMenu);
        }
    }

}
