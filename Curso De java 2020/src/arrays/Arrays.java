
package arrays;


public class Arrays {
    public static void main(String[] args) {
        IniciandoArrays arra = new IniciandoArrays();
    }
    
}

class IniciandoArrays{
    public IniciandoArrays(){
           //declaracion del array
    int[] array1 = new int [5];
    int array2[] = new int [5];
    
    //Asignar valor al array
    array1[0]=1; 
    array1[1]=2;  
    array1[2]=3;  
    array1[3]=4;  
    array1[4]=5; 
    
       //leer un array
       
       for(int i=0;i<array1.length;i++){
           System.out.println("El array en la posicion "+i+" es igual a "+array1[i]);
       }
    }
}

