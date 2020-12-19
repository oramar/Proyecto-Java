
package programacionOrientadaObjetos;


public class Alumno extends Persona {
    private final String carrera;
    public Alumno(String nombre, String carrera){
        super(nombre);
        this.carrera = carrera;
    }
    @Override
    public String getDameDrescripcion() {
        return "Es un alumno que es un buen estudiante "+" y esta estudiando la carrera de "+carrera;
    }
    
}
