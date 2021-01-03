
package Enumerados;

import Enumerados.Talla.meses;
import Enumerados.Talla.talla;
import java.util.Scanner;

public class UsoTalla {
    public static void main(String[] args) {
       /* talla s = talla.Mini;
        talla m =talla.Mediano;
        talla l =talla.Grande;
        talla xl = talla.Muy_Grande;*/
       
       Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingresa una talla: Mini, mediano, grande, muy_grande");
        String entradaDatos = entrada.next().toUpperCase();
        talla laTalla = Enum.valueOf(talla.class, entradaDatos);
        System.out.println("La talla es igual "+laTalla+" y su abreviatura es "+laTalla.getDameAbreviatura());
        System.out.println("");
        //llamada del enum meses
        
        for(meses mes:meses.values()){
            System.out.println("El mes de: "+mes+" tiene el numero: "+mes.getRetornaNumero());
        }
        System.out.println("");
        //utilizando el otro for quedaria
        meses[] mesess = meses.values();
        for (int i = 0; i < mesess.length; i++) {
            System.out.println("el mes: "+mesess[i] + " tiene el numero: "+mesess[i].getRetornaNumero());
        }
        
    }
}
