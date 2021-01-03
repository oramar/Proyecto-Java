
package programacionOrientadaObjetos;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class UsoEmpleado {
    public static void main(String[] args) {
        /*
        Empleado Empleado1 = new Empleado("Orlando Amado",5000000,30,11,2021);
        Empleado Empleado2 = new Empleado("Carlos Amado",4000000,31,10,2021);
        Empleado Empleado3 = new Empleado("Mario Amado",3000000,31,12,2021);
        Empleado1.setSubirSueldo(50);
        System.out.println(Empleado1.toString());
        System.out.println(Empleado2.toString());
        System.out.println(Empleado3.toString());
        
        
        Date fecha = new Date();
        //Caso 2: obtener la fecha y salida por pantalla con formato:
        DateFormat FormatoFecha = new SimpleDateFormat("dd 'de' MMMM yyyy");
        System.out.println("Fecha: "+FormatoFecha.format(fecha));
        
        //video de youtube 37
        */
        Empleado [] miEmpleados = new Empleado[5];
        
        Jefatura jefe1 = new Jefatura("Orlando Amado Ardila",20000000, 31, 12, 2020);
        jefe1.setEstableceIncentivo(500000); 
        
        miEmpleados[0]= new Empleado("Orlando Amado",5000000,30,11,2021);
        miEmpleados[1]= new Empleado("Carlos Amado",4000000,31,10,2021);
        miEmpleados[2]= new Empleado("Mario Amado",3000000,31,12,2021);
        Empleado jefe3 = new Jefatura("Mahia Liceth",4500000,30,9,2020);   
        miEmpleados[3] = jefe1;
        miEmpleados[4] = new Jefatura("Sergio Alejandro amado",3000000,30,11,2020); 
        Jefatura jefe2 = (Jefatura) miEmpleados[4];
        jefe2.setEstableceIncentivo(500000);
       
        //Vamos a utilizar la instruccion instanceof del interfaz comparable
        
        Empleado directorComercial = new Jefatura("Rodolfo claro",6000000,31,10,2020);
        Comparable ejemplo = new Empleado("Elisabeth toro",6100000,31,8,2020);
        
        
       
        //verificamos si director comercial es una instancia de empleado
        if(directorComercial instanceof Empleado){
            System.out.println("Es una instancia de empleado de tipo jefatura");
        }
        
        if(ejemplo instanceof Comparable){
            System.out.println("ejemplo Implementa la interfaz comparable");
        }
     
        System.out.println("El jefe "+jefe2.getDameNombre()+" "+jefe2.getTomarDecisiones("Dar regalos de navidad"));
        
         //establecemos los bonus
        
        System.out.println("El jefe "+jefe2.getDameNombre()+" tiene un bonus de "+jefe2.formatearNumero(jefe2.getEstablecerBonous(1500))+" pesos");
        for(Empleado e: miEmpleados){            
            e.setSubirSueldo(5);
            
         }
        //ordena el array, de acuerdo al parametro establecido en el metodo de la interfaz comparable
     Arrays.sort(miEmpleados);
          
     for(Empleado e: miEmpleados){            
            
            System.out.println("El empleado "+ e.getDameNombre()+" con el id: "+ e.id+" devenga un sueldo "+e.formatearNumero(e.getSueldo()) +" pesos, en la fecha: "+e.FormatearFecha(e.getFechaAltaContrato()));
            
         }
        System.out.println(Empleado.dameIdSiguiente());
        
        
        
        
    }    
}
