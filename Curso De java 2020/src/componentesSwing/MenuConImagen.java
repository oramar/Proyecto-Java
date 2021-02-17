package componentesSwing;

import formularios.MarcoCentrado;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuConImagen {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaMenuImagen lamina = new LaminaMenuImagen();
        marco.add(lamina);
        marco.anchoAlto(35, 35);
        marco.crearFormulario("Trabajando con Menus con Imagenes");
        //video 107
    }
}

class LaminaMenuImagen extends JPanel {

    JMenuBar barraMenu;
    JMenu edicion, archivo, herramientas, Opciones;
    JMenuItem copiar, pegar, cortar, opcion1, opcion2, guardar, guardarComo, generales;

    public LaminaMenuImagen() {
        barraMenu = new JMenuBar();
        edicion = new JMenu("Edicion");
        archivo = new JMenu("Archivo");
        herramientas = new JMenu("Herramientas");
        Opciones = new JMenu("Opciones");

        copiar = new JMenuItem("Copiar",new ImageIcon("src/swing/img/copiar.png"));
        pegar = new JMenuItem("Pegar",new ImageIcon("src/swing/img/pegar.png"));
        cortar = new JMenuItem("Eliminar",new ImageIcon("src/swing/img/cortar.png"));
        //Con la siguiente instruccion se modifica la posicion del texto del submenu
        copiar.setHorizontalTextPosition(SwingConstants.LEFT);
        opcion1 = new JMenuItem("Opcion1");
        opcion2 = new JMenuItem("Opcion2");
        guardar = new JMenuItem("Guardar");
        guardarComo = new JMenuItem("Guardar Como");
        generales = new JMenuItem("Generales");
        
        archivo.add(guardar);
        archivo.add(guardarComo);

        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator();
        edicion.add(cortar);
        edicion.add(Opciones);

        Opciones.add(opcion1);
        Opciones.add(opcion2);
        
        herramientas.add(generales);

        barraMenu.add(archivo);
        barraMenu.add(edicion);
        barraMenu.add(herramientas);
        add(barraMenu);
    }

}
