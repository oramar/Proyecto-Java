
package programacionOrientadaObjetos;

import javax.swing.JOptionPane;


public class UsoCoche {
    public static void main(String[] args) {
        Coche auto1 = new Coche();
        auto1.SetEstablecerValores(JOptionPane.showInputDialog("Dime el color del coche"));       
        System.out.println(auto1.GetMostrarDatos());
         auto1.setTamano(1500);
        System.out.println(auto1.getTamano());
        System.out.println(auto1.toString());
        
        auto1.setConfiguraAsiento(JOptionPane.showInputDialog("Dime si tiene asiento de cuero"));
        System.out.println(auto1.getDimeAsiento());
        
        auto1.setConfiguraClimatizador(JOptionPane.showInputDialog("Dime si tiene Aire acondicionado"));
        System.out.println(auto1.getDimesientoClimatizador());
        
        System.out.println(auto1.dimePesoCoche());
        System.out.println("El precion total del coche es: "+auto1.getPrecioCoche());
        
    }
}
