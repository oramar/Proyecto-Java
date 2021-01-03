
package formularios;

import java.awt.Color;



public class UsoMarcoCentrado {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        //Laminas lamina = new Laminas();
          
     
        marco.anchoAlto(60, 80);
        marco.crearFormulario("formulario centrado");
       
        //marco.add(lamina);
        Lamina2D lamina2 = new Lamina2D(); 
       marco.add(lamina2);
         lamina2.fondo(Color.yellow);
      
        
       
        
    }
}
