
package condicionalesYbucles;

import javax.swing.JOptionPane;

public class BucleWhile {
    public static void main(String[] args) {
        String clave = "Orlando";
        String pass ="";
        while(clave.equals(pass)==false){
            pass = JOptionPane.showInputDialog("Ingresa la contraseña");
            if(clave.equals(pass)==false){
                System.out.println("Contraseña Incorrecta");
            }
        }
        System.out.println("Bienvenido");
    }
}
