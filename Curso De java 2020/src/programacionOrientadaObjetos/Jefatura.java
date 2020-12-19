
package programacionOrientadaObjetos;

public class Jefatura extends Empleado implements Jefes{
    private double incentivo;
    public Jefatura(String nombre, double sueldo, int dia, int mes, int ano) {
        super(nombre, sueldo, dia, mes, ano);
    }
    
    public void setEstableceIncentivo(double incentivo){
        this.incentivo = incentivo;
    }
    
    @Override
      public double getSueldo() {
         double sueldoJefe = super.getSueldo();
         return sueldoJefe+incentivo;         
      }
      
      public String datos(){
         return "Sueldo del jefe es "+getSueldo();
      }

    @Override
    public String getTomarDecisiones(String decision) {
        return "toma la decision de: "+decision;
    }

    @Override
    public double getEstablecerBonous(double gratificacion) {
        double prima = 2000;
        return Trabajadores.BONUSBASE + gratificacion +prima;
    }
      
      
     
    
    
}
