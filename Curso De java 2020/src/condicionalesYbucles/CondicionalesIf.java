
package condicionalesYbucles;

import java.util.Scanner;


public class CondicionalesIf {
    public static void main(String[] args) {
        //Evalular edad
        
       Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu edad por favor: ");
        int edad = entrada.nextInt();
        
        if(edad>= 18 && edad <=40){
            System.out.println("Eres mayor edad");
        }else if(edad <18){
            System.out.println("Eres adolecente");
        }else if(edad>40){
            System.out.println("Eres un adulto");
        }
    }
}
