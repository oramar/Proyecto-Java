
package arrays;

public class ArrayBidemensionales {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];
        
        System.out.println("Utilizando bucle for Normal");
        for(int i = 0; i<4;i++){
            for(int j= 0;j<5;j++){
                matrix[i][j]=(int)Math.round(Math.random()*100);
               // System.out.println("La Matriz ["+i+"]["+j+"] = "+matrix[i][j]+"\n");
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Utilizando bucle for Mejorado");
        //utilizando bucle for mejorado
        for(int[]fila:matrix){
            for(int z: fila){
                System.out.print(z +" ");
            }
            System.out.println("");
        }
        
    }
}
