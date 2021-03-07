package ejerciciosDelCurso;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTextoMenuEmenrgente {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaProcesadorTextoEmergente lamina = new LaminaProcesadorTextoEmergente();
        marco.add(lamina);
        marco.anchoAlto(40, 40);
        marco.crearFormulario("Creando un procesador de texto");
        //video 106
    }
}

final class LaminaProcesadorTextoEmergente extends JPanel {

    JPanel laminaMenu;
    JMenuBar barraTexto;
    JMenu fuente, estilo, tamano;
    JTextPane miArea;
    Font letras;

    public LaminaProcesadorTextoEmergente() {
        setLayout(new BorderLayout());
        laminaMenu = new JPanel();
        barraTexto = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamano = new JMenu("Tamaño");
        miArea = new JTextPane();
        barraTexto.add(fuente);
        barraTexto.add(estilo);
        barraTexto.add(tamano);

        configuraManu("Arial", "fuente", "Arial", 9, 10);
        configuraManu("Courier", "fuente", "Courier", 9, 10);
        configuraManu("Verdana", "fuente", "Verdana", 9, 10);

        //configuraManu("Negrita", "estilo", "", Font.BOLD, 1);
        //configuraManu("Cursiva", "estilo", "", Font.ITALIC, 1);
        JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/swing/img/negrita.png"));
        JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/swing/img/cursiva.png"));
        cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
        negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem catorce = new JRadioButtonMenuItem("14");
        JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem dieciocho = new JRadioButtonMenuItem("18");
        JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem veintidos = new JRadioButtonMenuItem("22");
        JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
        
        //Agregar atajo de teclado
        veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        
        doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamano", 12));
        catorce.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamano", 14));
        dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamano", 16));
        dieciocho.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamano", 18));
        veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamano", 20));
        veintidos.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamano", 22));
        veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamano", 24));
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        estilo.add(negrita);
        estilo.add(cursiva);
        tamano.add(doce);
        tamano.add(catorce);
        tamano.add(dieciseis);
        tamano.add(dieciocho);
        tamano.add(veinte);
        tamano.add(veintidos);
        tamano.add(veinticuatro);

        /*configuraManu("12", "tamano", "", 1, 12);
        configuraManu("14", "tamano", "", 1, 14);
        configuraManu("16", "tamano", "", 1, 16);
        configuraManu("18", "tamano", "", 1, 18);
        configuraManu("20", "tamano", "", 1, 20);
        configuraManu("22", "tamano", "", 1, 22);
        configuraManu("24", "tamano", "", 1, 24);
         */
        laminaMenu.add(barraTexto);
        add(laminaMenu, BorderLayout.NORTH);
        add(miArea, BorderLayout.CENTER);
        
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem negritaE = new JMenuItem("Negrita");
        JMenuItem cursivaE = new JMenuItem("Cursiva");
        JMenuItem opcion3 = new JMenuItem("Opcion 3");
        JMenuItem opcion4 = new JMenuItem("Opcion 4");
        JMenuItem opcion5 = new JMenuItem("Opcion 5");
         negritaE.addActionListener(new StyledEditorKit.BoldAction());
        cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
        emergente.add(negritaE);
        emergente.add(cursivaE);
        emergente.add(opcion3);
        emergente.add(opcion4);
        emergente.add(opcion5);
        miArea.setComponentPopupMenu(emergente);

    }

    public void configuraManu(String rotulo, String menu, String tipoLetra, int estilos, int tamano) {
        JMenuItem elementoMenu = new JMenuItem(rotulo);

        switch (menu) {
            case "fuente":
                this.fuente.add(elementoMenu);
                if (tipoLetra == "Arial") {
                    elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", "Arial"));
                } else if (tipoLetra == "Courier") {
                    elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", "Courier"));
                } else if (tipoLetra == "Verdana") {
                    elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", "Verdana"));
                }
                break;
            case "estilo":
                this.estilo.add(elementoMenu);
                if (estilos == Font.BOLD) {
                    elementoMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
                    elementoMenu.addActionListener(new StyledEditorKit.BoldAction());
                } else if (estilos == Font.ITALIC) {
                     elementoMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
                    elementoMenu.addActionListener(new StyledEditorKit.ItalicAction());
                    
                }

                break;
            case "tamano":
                this.tamano.add(elementoMenu);
                //Con esta instruccion se le coloca el tamaño del texto seleccionado
                elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamano", tamano));
                break;
            default:
                break;
        }

        // elementoMenu.addActionListener(new GestionaEventos(rotulo,tipoLetra, estilos, tamano));
    }

    private class GestionaEventos implements ActionListener {

        String tipoTexto;
        String menu;
        int estilo;
        int tamano;

        public GestionaEventos(String elementoPulsado, String textoPulsado, int estiloPulsado, int tamanoPulsado) {
            this.tipoTexto = textoPulsado;
            this.estilo = estiloPulsado;
            this.tamano = tamanoPulsado;
            this.menu = elementoPulsado;

        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            letras = miArea.getFont();
            if (menu.equals("Arial") || menu.equals("Courier") || menu.equals("Verdana")) {
                estilo = letras.getStyle();
                tamano = letras.getSize();
            } else if (menu.equals("Cursiva") || menu.equals("Negrita")) {
                tipoTexto = letras.getFontName();
                tamano = letras.getSize();

            } else if (menu.equals("12") || menu.equals("14") || menu.equals("16") || menu.equals("18") || menu.equals("20") || menu.equals("22") || menu.equals("24")) {
                estilo = letras.getStyle();
                tipoTexto = letras.getFontName();
            }
            miArea.setFont(new Font(tipoTexto, estilo, tamano));
        }

    }
}
