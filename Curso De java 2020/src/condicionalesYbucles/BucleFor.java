
package condicionalesYbucles;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class BucleFor {
    public static void main(String[] args) {
        System.out.println("1. Bucle For Verificando Correo\n2. Factoria de un numero");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
              BucleForVerificandoCorreo correo = new BucleForVerificandoCorreo();
              break;
            case 2:
              FactoriarNumero factorial = new FactoriarNumero();
              break;
             default:
                 System.out.println("Opcion incorrecta");
                break;
        
        }
    }  
}

class BucleForVerificandoCorreo{
    public BucleForVerificandoCorreo(){
        byte arroba = 0;
       boolean punto = false;
       String email = JOptionPane.showInputDialog("Por favor ingresa el email");
       for(int i = 0; i < email.length(); i++){
           if(email.charAt(i)=='@'){
               arroba++;
           }
           
           if(email.charAt(i)=='.'){
               punto=true;
           }
       }
       
       if(arroba==1&& punto){
           System.out.println("Es correcto");
       }else{
           System.out.println("Es inconrrecto");
       }
    }
    
    
    }

class FactoriarNumero{
    public FactoriarNumero(){
        long resultado = 1L;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero a sacar factoria"));
        
        for(int i=numero; i>0;i--){
            resultado*=i;
        }
        System.out.println("El factorial de "+numero +" = "+ resultado);
    }
}


