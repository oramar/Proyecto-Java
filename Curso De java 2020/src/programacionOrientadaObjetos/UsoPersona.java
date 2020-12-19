
package programacionOrientadaObjetos;


public class UsoPersona {
    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[3];
        Persona alumno1 = new Alumno("Orlando amado ardila","Ingenieria en sistema");
        Persona empleado1 = new Empleado("Sergio alejandro",50000,30,11,2020);
        Persona empleado2 = new Empleado("Mahia Liceth",56000,30,11,2020);
        lasPersonas[0]= alumno1;
        lasPersonas[1]= empleado1;
        lasPersonas[2]= empleado2;
        
        for(Persona e:lasPersonas){
            System.out.println(e.getDameNombre()+" "+e.getDameDrescripcion());
        }
    }
    
}
