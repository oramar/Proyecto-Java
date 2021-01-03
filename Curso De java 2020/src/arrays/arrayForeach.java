
package arrays;

import javax.swing.JOptionPane;


public class arrayForeach {
    public static void main(String[] args) {
        //BucleForEach bucle = new BucleForEach();
        NumeroAleatorios aleatorio = new NumeroAleatorios();
    }
}

class BucleForEach{
    public BucleForEach(){
        String[] paises = new String[8];
        for(int i=0;i<paises.length;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce el pais "+(i+1));
        }
        for(String elemento:paises){
            System.out.println("Pais: "+elemento);
        }
    }
}

class NumeroAleatorios{
    public NumeroAleatorios(){
        int[]numeroAleatorios = new int[150];
        for(int i = 0;i<numeroAleatorios.length;i++){
            numeroAleatorios[i] = (int)Math.round(Math.random()*100);
           
            System.out.print(numeroAleatorios[i]+" ");
        }
    }
}