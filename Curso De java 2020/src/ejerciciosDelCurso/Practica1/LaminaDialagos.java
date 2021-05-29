/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDelCurso.Practica1;


import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author oramar
 */
public class LaminaDialagos extends JPanel {
    private final LaminaBotones laminaTipo;
    private final LaminaBotones LaminaTipoMensaje;
    private final LaminaBotones LaminaMensaje;
    private final LaminaBotones LaminaConfirmar;
    private final LaminaBotones LaminaOpcion;
    private final LaminaBotones LaminaEntrada;

    public LaminaBotones getLaminaTipo() {
        return laminaTipo;
    }

    public LaminaBotones getLaminaTipoMensaje() {
        return LaminaTipoMensaje;
    }

    public LaminaBotones getLaminaMensaje() {
        return LaminaMensaje;
    }

    public LaminaBotones getLaminaConfirmar() {
        return LaminaConfirmar;
    }

    public LaminaBotones getLaminaOpcion() {
        return LaminaOpcion;
    }

    public LaminaBotones getLaminaEntrada() {
        return LaminaEntrada;
    }

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
