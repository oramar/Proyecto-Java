
package programacionOrientadaObjetos;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona implements Comparable,Trabajadores{    
    private double sueldo;
    private final Date FechaAltaContrato;
    private final GregorianCalendar calendario;
    private  DateFormat FormatoFecha;
    private  String valorFormateado;
    public int id;
    private static int idSiguiente = 1;
    
    
    public Empleado(String nombre, double sueldo, int dia, int mes, int ano){
       super(nombre);
        this.sueldo= sueldo;
        calendario = new GregorianCalendar(ano, mes-1, dia);//construye una fecha      
        FechaAltaContrato = calendario.getTime();     
        id = idSiguiente;
        idSiguiente++;      
        
    }
//metodos geetters
   
    
     public double  getSueldo() {
        return sueldo;
    }
     
    public Date getFechaAltaContrato() {
       return FechaAltaContrato;
    }
    
    
    public static String dameIdSiguiente(){
        return "El id siguiente es " +idSiguiente;
    }

    
   //Metodos Seetters 
    
    
    public void setSubirSueldo(double porcentaje){
        double aumento = sueldo * porcentaje/100;
        sueldo +=aumento;
    }
    
    public  String formatearNumero(double numeroFormatear){
        DecimalFormat formato = new DecimalFormat("$#,###"); 
        valorFormateado = formato.format(numeroFormatear);
        return valorFormateado;        
    }
    
    public String FormatearFecha(Date fechaAltaContrato){        
        FormatoFecha = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy");   
        return FormatoFecha.format(fechaAltaContrato);
    }
    
    @Override
    public String toString(){
               
        return "El empleado "+ getDameNombre()+" debenga un sueldo "+formatearNumero(sueldo) +" pesos, en la fecha: "+FormatearFecha(FechaAltaContrato)+" Y el id siguiente es "+id;
    }

    @Override
    public String getDameDrescripcion() {
        return "Es un empleado con un gran trabajado Y tiene un id "+id+" con un sueldo de "+formatearNumero(sueldo)+" Pesos";
    }

    @Override
    public int compareTo(Object t) {
        //realizamos un casting o conversion y convertimos de tipo Object a tipo empleado
        Empleado empleado = (Empleado) t;
        
        //comparamos el sueldo del empleado
        /*
        if(this.sueldo<empleado.sueldo){
            return -1;
        }else if(this.sueldo==empleado.sueldo){
            return 0;
        }else{
            return 1;
        }
        */
        if(this.id<empleado.id){
            return -1;
        }else if(this.id==empleado.id){
            return 0;
        }else{
            return 1;
        }
        
    }

    @Override
    public double getEstablecerBonous(double gratificacion) {
     return Trabajadores.BONUSBASE +gratificacion;  
    }
}
