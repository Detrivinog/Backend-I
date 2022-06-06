package Parcial1;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {

    private static final Logger logger = Logger.getLogger(BD.class);

    private static final String SQL_CREATE_TABLE = " DROP TABLE IF EXISTS odontologos; CREATE TABLE odontologos "+
            "(ID INT AUTO_INCREMENT PRIMARY KEY, " +
            "MATRICULA varchar(100), " +
            "NOMBRE varchar(100), " +
            "APELLIDO varchar(100));";

    public static void crearBD() throws Exception {
        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            logger.info("Se creo la tabla odontologos");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }
    public static Connection getConnection() throws Exception{
        logger.info("Se da inicio a la conexión a la BD en H2");
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }
}
