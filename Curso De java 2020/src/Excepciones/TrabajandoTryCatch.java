
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrabajandoTryCatch {
    public static void main(String[] args) {
        PedirDatos datos = new PedirDatos();
    }
}

class PedirDatos{
    public PedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Que deseas hacer?");
        System.out.println("1. Introducir Datos");
        System.out.println("2. salir de la aplicacion");
       
        int decision = entrada.nextInt();
        
        if(decision==1){
            try{
            pedirDatos();
             entrada.close();
            }catch(Exception e){
                System.out.println("Imposible ");
            }
        }else{
            System.out.println("Adios");
            System.exit(0);
        }
        
    }
    
    private void pedirDatos() throws InputMismatchException{
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada2.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = entrada2.nextInt();
        System.out.println("");
        System.out.println("Hola "+nombre+" El proximo año tendras "+(edad+1)+" años");
        entrada2.close();
    }
    
    
}
