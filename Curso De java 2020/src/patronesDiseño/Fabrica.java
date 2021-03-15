
package patronesDiseño;


public class Fabrica {
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();
        
        IConexion conexion1 = fabrica.getConexion("Oracle");
        conexion1.conectar();
        conexion1.desconectar();
        
        IConexion conexion2 = fabrica.getConexion("Mysql");
        conexion2.conectar();
        conexion2.desconectar();
        
        IConexion conexion3 = fabrica.getConexion("Sql");
        conexion3.conectar();
        conexion3.desconectar();
    }
}

class ConexionOracle implements IConexion{

    @Override
    public void conectar() {
        System.out.println("Conectado a la base de datos Oracle");    
    }

    @Override
    public void desconectar() {
    System.out.println("DesConectado a la base de datos Oracle");    
    }

    
}

class ConexionMysql implements IConexion{
      @Override
    public void conectar() {
        System.out.println("Conectado a la base de datos Mysql");    
    }

    @Override
    public void desconectar() {
    System.out.println("DesConectado a la base de datos Mysql");    
    }
}

class ConexionSql implements IConexion{
      @Override
    public void conectar() {
        System.out.println("Conectado a la base de datos Sql");    
    }

    @Override
    public void desconectar() {
    System.out.println("DesConectado a la base de datos Sql");    
    }
}
class ConexionVacia implements IConexion{
          @Override
    public void conectar() {
        System.out.println("No se especifico el proveedor");    
    }

    @Override
    public void desconectar() {
    System.out.println("No se especifico el proveedor");    
    }
}

class ConexionPostgreSql implements IConexion{
      @Override
    public void conectar() {
        System.out.println("Conectado a la base de datos PostgreSql");    
    }

    @Override
    public void desconectar() {
    System.out.println("DesConectado a la base de datos PostgreSql");    
    }
}
class ConexionFabrica{
    public IConexion getConexion(String motor){
        if (motor==null){
            return new ConexionVacia();
        }if(motor.equalsIgnoreCase("Mysql")){
            return new ConexionMysql();
        }else if(motor.equalsIgnoreCase("Oracle")){
            return new ConexionOracle();
        }else if(motor.equalsIgnoreCase("PostgreSql")){
            return new ConexionPostgreSql();
        }else if(motor.equalsIgnoreCase("ConexionSql")){
            return new ConexionSql();
        }
        return new ConexionVacia();
    }
}