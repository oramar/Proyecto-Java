/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDelCurso.Practica1;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author oramar
 */
public class LaminaBotones extends JPanel {
        
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
    
      public String dameSeleccion(){
        ButtonModel miBoton = grupo.getSelection();
        String  nombreBoton = miBoton.getActionCommand();
        
        return nombreBoton;
        //return grupo.getSelection().getActinCommand();
        }
    
    private final ButtonGroup grupo;  
}
