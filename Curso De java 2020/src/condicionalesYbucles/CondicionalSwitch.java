
package condicionalesYbucles;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class CondicionalSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
        int respuesta = entrada.nextInt();
        
        switch(respuesta){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El Area del cuadrado es "+ Math.pow(lado, 2));
                break;
            case 2:
                int base =Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura =Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del rectangulo es "+(base*altura));
                break;
               
            case 3:
                base =Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base"));
                altura =Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
                System.out.println("El area del triangulo es "+(base*altura)/2);
                break;
                
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio"));
                System.out.printf("%1.2f",Math.PI *(Math.pow(radio, 2)));   
                break;
            default:
                System.out.println("Opcion seleccionada incorrecta");
                
        }
            
        }
}
