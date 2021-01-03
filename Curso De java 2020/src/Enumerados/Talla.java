
package Enumerados;
 
public class Talla {
      
        //Enumerado de tallas
       enum talla {
            
           MINI("S"), MEDIANO("M"), GRANDE("L"),MUY_GRANDE("XL");
           private talla(String abreviatura){
               this.abreviatura = abreviatura;
           }
           
           public String getDameAbreviatura(){
               return abreviatura;
           }
             private final String abreviatura;
             
            
        }
       
       //enumerado de meses del año
       
      public enum meses{
           ENERO(1),FEBRERO(2),MARZO(3),ABRIL(4), MAYO(5),JUNIO(6),JULIO(7),AGOSTO(8),SEPTIEMBRE(9),OCTUBRE(10),NOVIEMBRE(11),DICIEMBRE(12);
           private final int numero;
           private meses(int numero){
               this.numero = numero;
           }
           
           public int getRetornaNumero(){
               return numero;
           }
       }
    
    
}
