
package condicionalesYbucles;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class BucleDoWhile {
    public static void main(String[] args) {
        System.out.println("1. Pesos Ideal\n2. Adivina numero");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
              PesoIdeal peso = new PesoIdeal();
              break;
            case 2:
              AdivinaNumero adivina = new AdivinaNumero();
              break;
             default:
                 System.out.println("Opcion incorrecta");
                break;
        
    }
        
        
    }
}

class PesoIdeal{
    
    public PesoIdeal(){
    
     String genero ="";
    do{
       genero = JOptionPane.showInputDialog("Ingresa tu genero (H/M)");
    
    }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
    int altura = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa tu altura en cm"));
    int pesoIdeal = 0;
    if(genero.equalsIgnoreCase("H")){
        pesoIdeal = altura -110;
    }else if(genero.equalsIgnoreCase("M")){
        pesoIdeal = altura -120;
    }
        System.out.println("Tu peso ideal es "+pesoIdeal+ " Kg");
    }
        
   
}

class AdivinaNumero{
    public AdivinaNumero(){
        int aleatorio = (int)(Math.random()*100);      
       int numero =0;
       int intentos = 0;
       do{
           numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor adivina el numero"));          
      
           if(numero <aleatorio){
               System.out.println("El numero debe ser mayor");
           }else{
               System.out.println("El numero debe ser menor");
           }
           intentos++;
       }while(numero!=aleatorio);
        System.out.println("Lo logrante en "+intentos+" Intentos");
       
    }
}

