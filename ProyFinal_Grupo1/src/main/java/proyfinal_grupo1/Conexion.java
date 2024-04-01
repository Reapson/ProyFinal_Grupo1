//Primero hacer la dependencia en la base de datos para que se conecte a
//el conector de bases de datos con mysql, luego se hace esta clase en el proyecto
package proyfinal_grupo1;

//Paquete que contiene todos los metodos y atributos relacionados a la conexion con BD SQL
import java.sql.*;

public class Conexion {
    
    //Se crea el metodo que va a retornar una conexion a la base de datos
    public Connection conectarBD(){
        //Se crea la conexion en nulo, aun no conecta a ningu lado
        Connection conn = null;
        
        try{
            //Se le indica a la clase que conecte con el driver de conexion a la BD, nombre default
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Le indica a la conexion la direccion de la base de datos para que se pueda conectar, junto al nombre de usuario y 
            //contrasena de acceso a la bd
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/soportetecnico", "root", "rosse082003");
            //Indicador de conexion exitosa
            System.out.println("Conexion Exitosa");
        }catch(Exception e){
            System.out.println(e);
        }
        //Retorno de conexion
        return conn;
    }
}
