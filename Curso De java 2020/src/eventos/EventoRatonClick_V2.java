
package eventos;

import formularios.MarcoCentrado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class EventoRatonClick_V2 {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaBaseBotones lamina2 = new LaminaBaseBotones();
        marco.anchoAlto(50, 50);
        marco.crearFormulario("Otra manejara de crear el ejemplo anterior");
        
        marco.add(lamina2);
    }
}

  class LaminaBaseBotones extends JPanel{
      //objeto fuente
        private JButton botonAzul, botonVerde, botonRojo;
        public LaminaBaseBotones(){
        botonAzul= new JButton("Azul");
        botonVerde = new JButton("Verde");
        botonRojo = new JButton("Rojo");
        add(botonAzul);  
        add(botonVerde);
        add(botonRojo);
        
        LaminaColorFondo azul = new LaminaColorFondo(Color.BLUE);
        LaminaColorFondo verde = new LaminaColorFondo(Color.green);
        LaminaColorFondo rojo = new LaminaColorFondo(Color.red);
        
        //le indicamos a los objeto evento ( addActionListener) cual es el objeto oyente (Lamina(this))
        botonAzul.addActionListener(azul);
        botonVerde.addActionListener(verde);
        botonRojo.addActionListener(rojo);
        }
        
        
        //clase oyente
        private class LaminaColorFondo implements ActionListener{
            private final Color color;
            public LaminaColorFondo(Color color){
            this.color = color;
            }
    
            @Override
            public void actionPerformed(ActionEvent ae) {
                setBackground(color);
            }
    
    }
        
}


