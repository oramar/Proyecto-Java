
package entradaSalidaDatos;

import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor dime tu edad: ");
        int edad = entrada.nextInt();
        System.out.println("Tu edad es: "+ edad);
    }
}
