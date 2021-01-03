
package componentesSwing;

import formularios.MarcoCentrado;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class EjercicioEventoJTextField {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LmainaPrincipalJtextField lamina = new LmainaPrincipalJtextField();
        marco.add(lamina);
        marco.anchoAlto(25, 30);
        marco.crearFormulario("Ejercicio con el evento de JTextField");
    }
}

class LmainaPrincipalJtextField extends JPanel{
    public LmainaPrincipalJtextField(){
        setLayout(new BorderLayout());
        LaminaSuperior superior = new LaminaSuperior();
        LaminaPassword inferior = new LaminaPassword();
        add(superior,BorderLayout.NORTH);
        add(inferior,BorderLayout.SOUTH);
        
        
    }
}

class LaminaPassword extends JPanel{
    JButton btnEnviar;
    public LaminaPassword(){
        btnEnviar = new JButton("Enviar");
        add(btnEnviar);
    }
}

class LaminaSuperior extends JPanel{
    JLabel lblUsuario, lblContraseña;
    JTextField txtUsuario;
    JPasswordField txtContraseña;
     JButton btnEnviar;
    public LaminaSuperior(){
        setLayout(new GridLayout(2,2));
        lblUsuario = new JLabel("Usuario");
        lblContraseña = new JLabel("Contraseña");
        txtUsuario = new JTextField(15);
        txtContraseña = new JPasswordField(15);
        txtContraseña.getDocument().addDocumentListener(new CompruebaUsuario() );
        add(lblUsuario);
        add(txtUsuario);
        add(lblContraseña);
        add(txtContraseña);
    }
    
    private class CompruebaUsuario implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent de) {
            verificaContraseña();
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
            verificaContraseña();
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
            
        }
        
        public void verificaContraseña(){
            char[] contraseña;
            contraseña = txtContraseña.getPassword();
            if(contraseña.length<8 || contraseña.length>12){
                txtContraseña.setBackground(Color.red);
            }else{
                txtContraseña.setBackground(Color.white);
            }
        }
        
    }
}
