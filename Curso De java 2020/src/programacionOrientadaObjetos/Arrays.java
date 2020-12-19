
package programacionOrientadaObjetos;

import javax.swing.JOptionPane;


public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[4];
        int contador=0;
        for(int b: a){
           contador +=1; 
                 
           int dato = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el dato numero "+contador));
      
            System.out.println("El dato ingresado en la posicion "+(contador -1)+ " es = "+dato);
        }
    }
}
