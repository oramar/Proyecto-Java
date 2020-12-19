
package programacionOrientadaObjetos;


public class Coche {
    //Especificamos las caracteristicas comunes
    private final int ruedas;
    private final int ancho;
    private final int motor;
    private final int peso;
    private final int largo;
    private int pesoPlataforma=2500;
    private String color;
    private int PesoTotal;   
    boolean asientoClimatizador, asientoCuero;
    private int tamano;
    
    //Creamos metodo constructor
    public Coche(){
        ruedas = 4;
        ancho = 250;
        motor = 1;
        peso =500;
        largo = 2000;
    }
    
  
    //Setters Establece el valor
    public void SetEstablecerValores(String color){
        this.color = color;
    }
    
    public void setTamano(int tamano){
        this.tamano=tamano;
    }
    
    //Getters captura el valor
    public String getTamano(){
        return "El tamano del coche es "+tamano;
    }
    
    public String GetMostrarDatos(){
       return "El largo del coche es "+largo+ " Y su color es "+color;
    }
    
    public void setConfiguraAsiento(String asientoCuero){
        if(asientoCuero.equalsIgnoreCase("si")){
            this.asientoCuero=true;
        }else{
            this.asientoCuero =false;
        }
    }
    
    public String getDimeAsiento(){
        if(asientoCuero){
            return "El carro tiene asiento de cuero";
        }else{
            return "No tiene asiento de cuero";
        }
    }
    
    public void setConfiguraClimatizador(String asientoClimatizador){
        if(asientoClimatizador.equalsIgnoreCase("si")){
            this.asientoClimatizador =true;
        }else{
            this.asientoClimatizador=false;
        }
    }
    
    public String getDimesientoClimatizador(){
        if(asientoClimatizador){
            return "El carro tiene asiento climatizador";
        }else{
            return "El carro no tiene asiento climatizador";
        }
    }
    
    
   
     public String dimePesoCoche(){//getters
        final int pesoCarroceria = 2500;
        PesoTotal=pesoPlataforma+pesoCarroceria;
        if(asientoCuero){
            PesoTotal +=1500;
        }
        if(asientoClimatizador){
            PesoTotal +=3500;
        }
        return "El peso total del carro es "+ PesoTotal;
        
    }
     
     public int getPrecioCoche(){//Getters
         int precioFinal= 10000;
         if(asientoCuero){
             precioFinal+=2000;
         }
         if(asientoClimatizador){
             precioFinal+=1500;
         }
         return precioFinal;
     }
    
    @Override
    public String toString(){
       return "El coche tiene "+ruedas+" Ruedas, con un peso de "+peso+" kilos y mide "+largo+" De largo ademas tiene "+motor+" Motor"; 
    }
    
}



