
package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MarcoGridLayout {
    public static void main(String[] args) {
         MarcoCentrado marco = new MarcoCentrado();
        //primero agrego la lamina antes de crear el marco
        LaminaGridLayout lamina = new LaminaGridLayout();
        //LaminaBorderLayout lamina2 = new LaminaBorderLayout();        
        marco.add(lamina);
        //marco.add(lamina2,BorderLayout.CENTER);
        marco.anchoAlto(25, 30);
        marco.crearFormulario("Dispocisiones GridLayout");
    }
}

class LaminaGridLayout extends JPanel{
     private JPanel LaminaTeclado;
      JButton pantalla;
    public LaminaGridLayout(){
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla,BorderLayout.NORTH);
        InsertaNumero accion = new InsertaNumero();
        
       LaminaTeclado = new JPanel();
        LaminaTeclado.setLayout(new GridLayout(4,4));
        
        InsertaNumero insertar =new InsertaNumero();
        IncluirBoton("7",insertar);
        IncluirBoton("8",insertar);
        IncluirBoton("9",insertar);
       //IncluirBoton("/");
        IncluirBoton("4",insertar);
        IncluirBoton("5",insertar);
        IncluirBoton("6",insertar);
        //IncluirBoton("*");
        IncluirBoton("1",insertar);
        IncluirBoton("2",insertar);
        IncluirBoton("3",insertar);
        //IncluirBoton("-");
        IncluirBoton("0",insertar);
        //IncluirBoton(".");
        //IncluirBoton("=");
        //IncluirBoton("+");
   
        add(LaminaTeclado,BorderLayout.CENTER);
    }
    
    private void IncluirBoton(String rotulo, ActionListener oyente){
        JButton botonNew = new JButton(rotulo);        
        botonNew.addActionListener(oyente);
        LaminaTeclado.add(botonNew);
    }
    
    private class InsertaNumero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String nombreBoton = ae.getActionCommand();
            pantalla.setText(nombreBoton);
        }
        
    }
}




