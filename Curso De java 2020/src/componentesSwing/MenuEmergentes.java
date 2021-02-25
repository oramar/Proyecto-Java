
package componentesSwing;

import formularios.MarcoCentrado;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


public class MenuEmergentes {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaMenuEmergente lamina = new LaminaMenuEmergente();
        marco.add(lamina);
        marco.anchoAlto(30, 30);
        marco.crearFormulario("Menus emergentes");
        //Video 109
    }
}
 class LaminaMenuEmergente extends JPanel{
     public LaminaMenuEmergente(){
         JPopupMenu emergente = new JPopupMenu();
         JMenuItem opcion1 = new JMenuItem("Opcion 1");
         JMenuItem opcion2 = new JMenuItem("Opcion 2");
         JMenuItem opcion3 = new JMenuItem("Opcion 3");
         JMenuItem opcion4 = new JMenuItem("Opcion 4");
         JMenuItem opcion5 = new JMenuItem("Opcion 5");
         emergente.add(opcion1);
         emergente.add(opcion2);
         emergente.add(opcion3);
         emergente.add(opcion4);
         emergente.add(opcion5);
         setComponentPopupMenu(emergente);
     }
 }