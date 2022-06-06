package Parcial1.dao;

import Parcial1.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private static final Logger logger = Logger.getLogger(OdontologoDaoH2.class);

    @Override
    public List<Odontologo> buscarTodos() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Odontologo> odontologos = new ArrayList<>();

        try{
            connection = getConection();
            preparedStatement = connection.prepareStatement("SELECT * FROM odontologos");
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                Long idOdontologo = result.getLong("id");
                String matricula = result.getString("matricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                Odontologo odontologo = new Odontologo(idOdontologo, matricula, nombre, apellido);
                odontologos.add(odontologo);
            }
            preparedStatement.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            assert connection != null;
            connection.close();
            logger.info("Se cierra la conexión a la BD en H2");
        }
        logger.info("Se genera la lista de Odontologos");
        return odontologos;
    }

    public static Connection getConection() throws Exception{
        logger.info("Se da inicio a la conexión a la BD en H2");
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

    @Override
    public Odontologo guardar(Odontologo odontologo) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = getConection();
            preparedStatement = connection.prepareStatement("INSERT INTO odontologos (matricula, nombre, apellido) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, odontologo.getMatricula());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());
            preparedStatement.executeUpdate();
            ResultSet result = preparedStatement.getGeneratedKeys();
            if (result.next()){
                odontologo.setId(result.getLong(1));
            }
            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert connection != null;
            connection.close();
            logger.info("Se cierra la conexión a la BD en H2");
        }
        logger.info("Se guardo el registro "+ odontologo.toString()+ " en la tabla odontologos");
        return odontologo;
    }

}
