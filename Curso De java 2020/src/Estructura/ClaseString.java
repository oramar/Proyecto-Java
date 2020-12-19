
package Estructura;

public class ClaseString {
    public static void main(String[] args) {
        String nombre ="Orlando Amado ardila"; 
        String nombre2 ="orlando amado ardila";
        System.out.println("Mi nombre es "+ nombre);
        System.out.println("Mi nombre tiene "+ nombre.length()+" Caracteres");
        System.out.println("La primera letra de mi nombre es "+ nombre.charAt(0));
        System.out.println("La ultima letra de mi nombre es "+ nombre.charAt(nombre.length()-1));
        System.out.println("Hola " +nombre.substring(8, nombre.length()));
        
        //comparacion de nombres
        if(nombre.equals(nombre2)){
            System.out.println("Los nombres son iguales teniendo encuenta may y min");
        }else{
            System.out.println("Los nombres no son iguales teniendo encuenta may y min");
        }
        
        if(nombre.equalsIgnoreCase(nombre2)){
            System.out.println("Los nombres son iguales no teniendo encuenta may y min");
        }else{
            System.out.println("Los nombres no son iguales no teniendo encuenta may y min");
        }
        
    }
 
}
