
package dispocisionesAvanzadas;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DisposicionCaja {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        componente1 primeraCaja = new componente1();
        marco.add(primeraCaja,BorderLayout.CENTER);
        marco.anchoAlto(25, 25);        
        marco.crearFormulario("Disposiciones en caja");
        
        //Video 115
    }
}

class componente1 extends JPanel{
    public componente1(){
        JLabel rotulo = new JLabel("nombre");
        JTextField texto1 = new JTextField(20);
        texto1.setMaximumSize(texto1.getPreferredSize());
        
         //Creamos la primera caja horizontal
        Box caja1 =Box.createHorizontalBox();
         //añadimos los componentes
        caja1.add(rotulo);        
        //Añadimos el espacio entre componente
        caja1.add(Box.createHorizontalStrut(10));
        caja1.add(texto1);
        
               
        JLabel rotulo2 = new JLabel("Contraseña");
        JTextField texto2 = new JTextField(20);
        texto2.setMaximumSize(texto1.getPreferredSize());
        
             
       Box caja2 = Box.createHorizontalBox();
        caja2.add(rotulo2);
        caja2.add(Box.createHorizontalStrut(10));
        caja2.add(texto2);
        
          JButton boton1 = new JButton("Ok");
        JButton boton2 = new JButton("Cancelar");
        
        Box caja3 = Box.createHorizontalBox();
        caja3.add(boton1);
        caja3.add(Box.createGlue());
        caja3.add(boton2);
        
        Box cajaVertical = Box.createVerticalBox(); 
        cajaVertical.add(caja1);
        cajaVertical.add(caja2);
        cajaVertical.add(caja3);
        add(cajaVertical,BorderLayout.CENTER);
    }
}
