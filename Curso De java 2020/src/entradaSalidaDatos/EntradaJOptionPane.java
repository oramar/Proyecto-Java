
package entradaSalidaDatos;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JOptionPane;


public class EntradaJOptionPane {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Por favor Ingresa tu nombre");
        System.out.println("Tu Nombre es: "+nombre);
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor dime tu idad"));
        System.out.println("Tu edad es: "+edad);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa un numero"));
        NumberFormat formatoNumero = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("El numero con formato es: "+formatoNumero.format(numero));
    }   
}
