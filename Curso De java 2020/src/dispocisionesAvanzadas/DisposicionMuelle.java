package dispocisionesAvanzadas;

import formularios.MarcoCentrado;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class DisposicionMuelle {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();

        PanelMuelle panel = new PanelMuelle();
        marco.add(panel);
        marco.anchoAlto(30, 30);
        marco.crearFormulario("Disposicion en Muelle");
        marco.setResizable(true);

    }
}

class PanelMuelle extends JPanel {

    JButton boton1;
    JButton boton2;
    JButton boton3;

    public PanelMuelle() {
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        //indicamos la disposicion SprinLayout
        SpringLayout miDisposicion = new SpringLayout();
        setLayout(miDisposicion);
        //Construimos el muelle que debe tener los botones        
        Spring muelle = Spring.constant(20, 10, 100);
        add(boton1);
        add(boton2);
        add(boton3);

        //aplicamos el muelle creado
        miDisposicion.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);
        miDisposicion.putConstraint(SpringLayout.WEST, boton2, muelle, SpringLayout.EAST, boton1);
        miDisposicion.putConstraint(SpringLayout.WEST, boton3, muelle, SpringLayout.EAST, boton2);
        miDisposicion.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);
    }
}
