
package eventos;

import formularios.MarcoCentrado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class EventoRatonClick {
    public static void main(String[] args) {
        //este marco fue creado en el paquete formularios
     MarcoCentrado marco = new MarcoCentrado();
     marco.anchoAlto(50, 50);
     marco.crearFormulario("Probando evento click");    
    LaminaBotones lamina = new LaminaBotones();
    marco.add(lamina);
    }
    
    
}
//objeto Oyentes en este caso es la lamina por lo tanto debe implementar el interfaz actinListenes y sus metodos
class LaminaBotones extends JPanel implements ActionListener{
   //creamos los objetos fuente
    private JButton botonAzul, botonVerde, botonRojo;
    
    
    
    public LaminaBotones(){
        botonAzul= new JButton("Azul");
        botonVerde = new JButton("Verde");
        botonRojo = new JButton("Rojo");
        add(botonAzul);  
        add(botonVerde);
        add(botonRojo);
        //le indicamos a los objeto evento ( addActionListener) cual es el objeto oyente (Lamina(this))
        botonAzul.addActionListener(this);
        botonVerde.addActionListener(this);
        botonRojo.addActionListener(this);
    }
      
    @Override
    public void actionPerformed(ActionEvent ae) {
        //obtenemos cual fue el objeto fuente
        Object botonPulsado = ae.getSource();
        //de acuerdo al objeto fuente le aplicamos el color
        if(botonPulsado.equals(botonAzul)){
            setBackground(Color.blue);
        }
        if(botonPulsado.equals(botonVerde)){
            setBackground(Color.GREEN);
        }
        if(botonPulsado.equals(botonRojo)){
            setBackground(Color.red);
        }
        
    }
}