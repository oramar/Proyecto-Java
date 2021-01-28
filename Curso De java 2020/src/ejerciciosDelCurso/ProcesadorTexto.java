package ejerciciosDelCurso;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTexto {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaProcesadorTexto lamina = new LaminaProcesadorTexto();
        marco.add(lamina);
        marco.anchoAlto(40, 40);
        marco.crearFormulario("Creando un procesador de texto");
        //video 106
    }
}

final class LaminaProcesadorTexto extends JPanel {

    JPanel laminaMenu;
    JMenuBar barraTexto;
    JMenu fuente, estilo, tamano;
    JTextPane miArea;
    Font letras;

    public LaminaProcesadorTexto() {
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

        configuraManu("Negrita", "estilo", "", Font.BOLD, 1);
        configuraManu("Cursiva", "estilo", "", Font.ITALIC, 1);

        configuraManu("12", "tamano", "", 1, 12);
        configuraManu("14", "tamano", "", 1, 14);
        configuraManu("16", "tamano", "", 1, 16);
        configuraManu("18", "tamano", "", 1, 18);
        configuraManu("20", "tamano", "", 1, 20);
        configuraManu("22", "tamano", "", 1, 22);
        configuraManu("24", "tamano", "", 1, 24);

        laminaMenu.add(barraTexto);
        add(laminaMenu, BorderLayout.NORTH);
        add(miArea, BorderLayout.CENTER);

    }

    public void configuraManu(String rotulo, String menu, String tipoLetra, int estilos, int tamano) {
        JMenuItem elementoMenu = new JMenuItem(rotulo);

        switch (menu) {
            case "fuente":
                this.fuente.add(elementoMenu);
                if(tipoLetra=="Arial"){
                    elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", "Arial"));
                }else if(tipoLetra=="Courier"){
                    elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", "Courier"));
                }else if(tipoLetra=="Verdana"){
                    elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", "Verdana"));
                }
                break;
            case "estilo":
                this.estilo.add(elementoMenu);
                if(estilos==Font.BOLD){
                   elementoMenu.addActionListener(new StyledEditorKit.BoldAction()); 
                }else if(estilos==Font.ITALIC){
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
        public GestionaEventos(String elementoPulsado,String textoPulsado,int estiloPulsado,int tamanoPulsado){
            this.tipoTexto = textoPulsado;
            this.estilo = estiloPulsado;
            this.tamano = tamanoPulsado;
            this.menu= elementoPulsado;
                    
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            letras = miArea.getFont();
            if(menu.equals("Arial") || menu.equals("Courier") || menu.equals("Verdana")){
                estilo = letras.getStyle();
                tamano = letras.getSize();
            }else if(menu.equals("Cursiva") || menu.equals("Negrita")){
                tipoTexto = letras.getFontName();
                tamano=letras.getSize();
                
            }else if(menu.equals("12")||menu.equals("14")||menu.equals("16")||menu.equals("18")||menu.equals("20")||menu.equals("22")||menu.equals("24")){
                estilo = letras.getStyle();
                tipoTexto = letras.getFontName();
            }
            miArea.setFont(new Font(tipoTexto, estilo, tamano));
        }

    }
}
