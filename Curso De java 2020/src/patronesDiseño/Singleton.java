
package patronesDiseño;


public class Singleton {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Coche.getInstancia();
        }
        
       //Hacediendo a la clase logger por medio de su metodo statico getInstance
       Logger logger1 = Logger.getInstance();
       Logger logger2 = Logger.getInstance();
       
       logger1.setValue("Mensaje 1 del logger 1 visto desde el logger 2");
        System.out.println(logger2.getValue());
       
        
    }
}

class Coche{
    private static Coche instancia=null;
    //1. Convertimos el constructor privado para que no se pueda instancia la clase
    private Coche(){
    }
    //2. para poder acceder a la clase lo hacmos por este metodo estativo y publico
    public static synchronized Coche getInstancia(){
        if(instancia==null){
            instancia= new Coche();
            System.out.println("Coche creado");
        }else{
            System.out.println("El coche ya fue creado");
        }
        return instancia;
    }
}

class Logger{
    //1. Para no permitir crear instacia de esta clase
    private Logger(){}
    
    //2. Creamos una variable estatica y le asignamos la instacia de la clase
    private static Logger log = new Logger();
    
    //3. retornamos la instancia por medio de este metodo
    public static  Logger getInstance(){
        return log;
    }
    
       //probando el metodo singleton
    private String value;
    public void setValue(String msg){
        value=msg;
    }
    
    public String getValue(){
        return value;
    }
}



