
package programacionOrientadaObjetos;


public class Furgoneta extends Coche{
    private final int capacidadExtra;
    private final int plazaExtra;
    public Furgoneta(int capacidadExtra, int plazaExtra){
        super();//llama al contructo de la clase coche
        this.capacidadExtra = capacidadExtra;
        this.plazaExtra = plazaExtra;
    }
    
    public String getDimedatosFurgoneta(){
        return "La capacidad de carga es: "+ capacidadExtra+"Y las pesos extra es de: "+plazaExtra;
    }
}
