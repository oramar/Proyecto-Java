package componentesSwing;

import formularios.MarcoCentrado;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ConstruyendoMenus {

    public static void main(String[] args) {
        //Video 100
        MarcoCentrado marco = new MarcoCentrado();
        LaminaMenu lamina = new LaminaMenu();
        marco.add(lamina);
        marco.anchoAlto(30, 50);
        marco.crearFormulario("Trabagit jando con Menus");
    }

}

class LaminaMenu extends JPanel {

    JMenuBar barraMenu;
    JMenu edicion, archivo, herramientas,Opciones;
    JMenuItem copiar, pegar, eliminar,opcion1,opcion2;

    public LaminaMenu() {
        barraMenu = new JMenuBar();
        edicion = new JMenu("Edicion");
        archivo = new JMenu("Archivo");
        herramientas = new JMenu("Herramientas");
        Opciones = new JMenu("Opciones");
        
        copiar = new JMenuItem("Copiar");
        pegar = new JMenuItem("Pegar");
        eliminar = new JMenuItem("Eliminar");
        opcion1 = new JMenuItem("Opcion1");
        opcion2 = new JMenuItem("Opcion2");
        
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator();
        edicion.add(eliminar);
        edicion.add(Opciones);
        
        Opciones.add(opcion1);
         Opciones.add(opcion2);
         
        barraMenu.add(archivo);
        barraMenu.add(edicion);
        barraMenu.add(herramientas);
        add(barraMenu);
    }

}
