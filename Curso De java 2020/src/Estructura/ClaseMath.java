
package Estructura;


public class ClaseMath {
    public static void main(String[] args) {
        //Raiz cuadrada de un numero
      int numero = 25;
      Double resultado= Math.sqrt(numero);
        System.out.println("La raiz cuadra de "+numero +" es "+resultado);
      
      //Redonder un numero
      int redondear = (int)Math.round(resultado);
        System.out.println("El Resultado redondeado es "+redondear);
      
    }
 
}
