
package ejerciciosDelCurso.Practica1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LaminaPrincipal extends JPanel {
     JPanel laminaBoton;
     JButton boton;
     LaminaDialagos laminaDialago;

    public LaminaPrincipal() {
      
        setLayout(new BorderLayout());
        laminaDialago = new LaminaDialagos();        
        laminaBoton = new JPanel();
        boton = new JButton("Mostrar");     
        boton.addActionListener(new AccionMostrar());  
        laminaBoton.add(boton);
              
        add(laminaDialago, BorderLayout.CENTER);
        add(laminaBoton, BorderLayout.SOUTH);
    }
    
    //...............Proporcionar el mensaje..........
    
    public Object dameMensaje(){
        String mensajes =  laminaDialago.getLaminaMensaje().dameSeleccion();
        if(mensajes.equals("cadena")){
            return cadenaMensaje;
        }else  if(mensajes.equals("icono")){
            return iconoMensaje;
        }else  if(mensajes.equals("componente")){
            return componenteMensaje;
        }else  if(mensajes.equals("otros")){
            return objetoMensaje;
        }else  if(mensajes.equals("objeto[]")){
            return new Object[]{
                cadenaMensaje,
                iconoMensaje,
                componenteMensaje,
                objetoMensaje
            };
        }else{
        return null;
            }
    }
    
    //.............proporcionaTipoIcono.......
    
    public int dameIconoTipo(LaminaBotones lamina){
         String tipoMensaje =  lamina.dameSeleccion();
         if(tipoMensaje.equals("ERROR_MESSAGE")|| tipoMensaje.equals("YES_NO_OPTION")){
             return 0;
         }
         else if(tipoMensaje.equals("INFORMATION_MESSAGE")|| tipoMensaje.equals("YES_NO_CANCEL_OPTION")){
             return 1;
             
         } else if(tipoMensaje.equals("WARNING_MESSAGE")|| tipoMensaje.equals("OK_CANCEL_OPTION")){
             return 2;
             
         }else if(tipoMensaje.equals("QUESTION_MESSAGE")){
             return 3;
             
         }else if(tipoMensaje.equals("PLAIN_MESSAGE") || tipoMensaje.equals("DEFAULT_OPTION")){
             return -1;
             
         }else{
             return 0;
         }
         
    }
    
    //................Da opciones a la lamina opciones..........
    
    public Object[] dameOpciones(LaminaBotones lamina){
        String seleccion = lamina.dameSeleccion();
        if(seleccion.equals("String[]")){
            return new String[]{"Amarillo","Azul","Rojo"};
        }else if(seleccion.equals("icono[]")){
            return new Object[]{new ImageIcon("src/swing/img/amarillo.jpg"),new ImageIcon("src/swing/img/azul.jpg"),new ImageIcon("src/swing/img/rojo.jpg")};   
        }else if(seleccion.equals("Objetct[]")){
            return new Object[]{
                cadenaMensaje,
                iconoMensaje,
                componenteMensaje,
                objetoMensaje
            };
        }else{
            return null;
        }
    }
    
    private class AccionMostrar implements ActionListener {
      
        @Override
        public void actionPerformed(ActionEvent ae) {            
       if(laminaDialago.getLaminaTipo().dameSeleccion().equals("Mensaje")){
           JOptionPane.showMessageDialog(laminaDialago, dameMensaje(),"Titulo",dameIconoTipo(laminaDialago.getLaminaTipoMensaje()));
           
       }else if(laminaDialago.getLaminaTipo().dameSeleccion().equals("Confirmar")){
           JOptionPane.showConfirmDialog(laminaDialago, dameMensaje(),"Titulo",dameIconoTipo(laminaDialago.getLaminaConfirmar()),dameIconoTipo(laminaDialago.getLaminaTipoMensaje()));
           
       }else if(laminaDialago.getLaminaTipo().dameSeleccion().equals("Entrada")){
           if(laminaDialago.getLaminaEntrada().dameSeleccion().equals("Campo de Texto")){
           JOptionPane.showInputDialog(laminaDialago, dameMensaje(),"Titulo",dameIconoTipo(laminaDialago.getLaminaTipoMensaje()));
           }else{
           JOptionPane.showInputDialog(laminaDialago, dameMensaje(),"Titulo",dameIconoTipo(laminaDialago.getLaminaTipoMensaje()),null,new String[]{"Amarillo","Azul","Rojo"},"Azul");
          
           }
       }else if(laminaDialago.getLaminaTipo().dameSeleccion().equals("Opcion")){
           JOptionPane.showOptionDialog(laminaDialago, dameMensaje(),"Titulo",1,dameIconoTipo(laminaDialago.getLaminaTipoMensaje()),null,dameOpciones(laminaDialago.getLaminaOpcion()),null);
       }
            System.out.println(laminaDialago.getLaminaTipo().dameSeleccion());
            
        }        
      
    }
    private String cadenaMensaje="Mensaje";
    private Icon iconoMensaje = new ImageIcon("src/swing/img/Araña.png");
    private Object objetoMensaje = new Date();
    private Component componenteMensaje = new laminaAmarilla();
}

class laminaAmarilla extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(),getHeight());
        g2.setPaint(Color.BLUE);
        g2.fill(rectangulo);
    }
}


