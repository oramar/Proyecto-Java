
package programacionOrientadaObjetos;

//La clase debe ser abstracta porque tiene metodos abstrato
public abstract class Persona {
    private final  String nombre;

    /**
     * 
     * @param nombre nombre de la persosna
     * @return establece el nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodo abstrato

    /**
     * @author Orlando amado ardila
     * @return Descripcion 
     * @version 0.1
     * @since 10-04-2020
     * 
     */
    public abstract String getDameDrescripcion();
    
     public String getDameNombre() {
        return nombre;
    }
    
}
