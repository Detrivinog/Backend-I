package Parcial1.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {
    public List<T> buscarTodos() throws SQLException;
    public T guardar(T t) throws SQLException, Exception;
//    public T buscar(Long id);
//    public void eliminar(Long id);
}
