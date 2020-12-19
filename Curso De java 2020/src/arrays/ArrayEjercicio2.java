
package arrays;


public class ArrayEjercicio2 {
    public static void main(String[] args) {
        valorMaximoArray array = new valorMaximoArray();
    }
}

class valorMaximoArray{
    public valorMaximoArray(){
        int[] newArray = {1,9,3,25,6,8,7,8};
        int[][]array = {{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}};
        System.out.println("eL valor maximo del array es: "+ numeroMayor(newArray));
        System.out.println("La suma de los elementos del array es: " +sumaElementoArray(newArray));
        System.out.println("El tamaño en indice del array es "+TamanoArray(newArray));
        method(array);
    }
    
    private int numeroMayor (int[] array) {
        int var = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > var) {
                var = array[i];
            }
        }
        return var;
    }
    
    private int sumaElementoArray (int[] array) {
    int var = 0;
    for(int i = 0; i < array.length; i++){
        var+=array[i];
    }
    return var;
    }
    
    private int TamanoArray (int[] array) {
    int value = array[0];
    int var = 0;
    for(int i = 1; i < array.length; i++){
        if (array[i]>value){
            var++;
        }
    }
    return var;
    }
    
    private void method (int[][] array) {
    int[] var =new int[array[0].length];
    for (int i = 0; i < array.length; i++){   
        for (int j = 0; j < array[i].length; j++){                
            var[j] += array[i][j];
        }
    }  
    }
}

