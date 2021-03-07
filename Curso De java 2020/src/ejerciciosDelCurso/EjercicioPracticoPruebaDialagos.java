package ejerciciosDelCurso;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjercicioPracticoPruebaDialagos {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        marco.setLayout(new BorderLayout());
        LaminaDialagos lamina = new LaminaDialagos();  
        LaminaBoton laminaBoton = new LaminaBoton();
        marco.add(lamina,BorderLayout.CENTER);
        marco.add(laminaBoton,BorderLayout.SOUTH);
        marco.anchoAlto(45, 55);
        marco.crearFormulario("Ejercicio Pratico Dialagos");
        //Video 126

    }
}

class LaminaDialagos extends JPanel {

    LaminaBotones laminaTipo;
    LaminaBotones LaminaTipoMensaje;
    LaminaBotones LaminaMensaje;
    LaminaBotones LaminaConfirmar;
    LaminaBotones LaminaOpcion;
    LaminaBotones LaminaEntrada;

    public LaminaDialagos() {
        setLayout(new GridLayout(2, 3));
        String[] tipo = {"Mensaje", "Confirmar", "Opcion", "Entrada"};
        String[] tipoMensaje = {"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"};
        String[] mensaje = {"cadena", "icono", "componente", "otros", "objeto[]"};
        String[] confirmar = {"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"};
        String[] opcion = {"String[]", "icono[]", "Objetct[]"};
        String[] entrada = {"Campo de Texto", "Combo"};

        laminaTipo = new LaminaBotones(("Tipo"), tipo);
        LaminaTipoMensaje = new LaminaBotones(("Tipo de mensaje"), tipoMensaje);
        LaminaMensaje = new LaminaBotones(("Mensaje"), mensaje);
        LaminaConfirmar = new LaminaBotones(("confirmar"), confirmar);
        LaminaOpcion = new LaminaBotones(("Opcion"), opcion);
        LaminaEntrada = new LaminaBotones(("entrada"), entrada);
        add(laminaTipo);
        add(LaminaTipoMensaje);
        add(LaminaMensaje);
        add(LaminaConfirmar);
        add(LaminaOpcion);
        add(LaminaEntrada);

    }
}
class LaminaBoton extends JPanel{
    JButton boton;
    LaminaDialagos laminaDialago;
    public LaminaBoton(){
        
        boton = new JButton("Mostrar");
        boton.addActionListener(new AccionMostrar());
        add(boton);
                
    }
    
    private class AccionMostrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            laminaDialago = new LaminaDialagos();
            System.out.println(laminaDialago.laminaTipo.DameSeleccion());
        }
        
    }
}
class LaminaBotones extends JPanel {
ButtonGroup grupo ;
    public LaminaBotones(String titulo, String[] opciones) {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));//creamos bordes
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));//indicamos la dispocision
        grupo = new ButtonGroup();
        for (int i = 0; i < opciones.length; i++) {
            JRadioButton boton = new JRadioButton(opciones[i]);
            boton.setActionCommand(opciones[i]);
            add(boton);
            grupo.add(boton);
            boton.setSelected(i == 0);
        }
        
    }
    
    public String DameSeleccion(){
       /* ButtonModel miBoton = grupo.getSelection();//Guardamos el JradioBaton Seleccionado
        String etiqueta = miBoton.getActionCommand(); //Guardamos El nombre De JradioBotton
        return etiqueta;
        */
       return grupo.getSelection().getActionCommand();//Esto es lo mismo que arriba
        
    }
}
