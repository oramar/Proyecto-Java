package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaEmergente {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        Lamina_Cuadros_Dialogos lamina = new Lamina_Cuadros_Dialogos();
        marco.add(lamina);
        marco.anchoAlto(35, 35);
        marco.crearFormulario("Ventana Emergentes");
        //Video 122
    }

}

class Lamina_Cuadros_Dialogos extends JPanel {

    public Lamina_Cuadros_Dialogos() {

        boton1 = new JButton("showMessageDialog");

        boton2 = new JButton("showInputDialog");

        boton3 = new JButton("showConfirmDialog");

        boton4 = new JButton("showOptionDialog");

        boton1.addActionListener(new Accion_botones());
        boton2.addActionListener(new Accion_botones());
        boton3.addActionListener(new Accion_botones());
        boton4.addActionListener(new Accion_botones());

        add(boton1);

        add(boton2);

        add(boton3);

        add(boton4);

    }

    private class Accion_botones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            //Aqui es donde vamos a implemntar las ventanas emergentes
            
            String[] mensaje = {"Lunes","Martes","Miercoles","jueves","Viernes","Sabado","Domingo"}; 
            
            if (e.getSource() == boton1) {

                System.out.println("Has pulsado el botón 1");
                JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "show Message Dialog");
                //Componente padre y objeto
                JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "show Message Dialog", "Adventencia", 3);
                JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "show Message Dialog Avanzado", "show Message Dialog", 1, new ImageIcon("src/swing/img/IconoMensaje.png"));

            } else if (e.getSource() == boton2) {

                System.out.println("Has pulsado el botón 2");
                JOptionPane.showInputDialog("Introduce el nombre");
                JOptionPane.showInputDialog("Ingresa tu nombre", "nombre");
                JOptionPane.showInputDialog(Lamina_Cuadros_Dialogos.this, "Introduce Dia semana","Introduccion de datos",2,new ImageIcon("src/swing/img/IconoMensaje.png"),mensaje,"Nombre");
                
                

            } else if (e.getSource() == boton3) {

                System.out.println("Has pulsado el botón 3");
                JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this,"Por favor me confirmas");
                JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this, "Confirmacion tu eleccion","Confirmacion", 2);

            } else {

                System.out.println("Has pulsado el botón 4");
                JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogos.this, "Probando ShowOptionDialog", "ShowOptionDialog", 1, 3, new ImageIcon("src/swing/img/IconoMensaje.png"), mensaje, "Martes");

            }

        }

    }
    private final JButton boton1;
    private final JButton boton2;
    private final JButton boton3;
    private final JButton boton4;
}
