package Parcial1.service;

import Parcial1.dao.IDao;
import Parcial1.model.Odontologo;

import java.sql.SQLException;
import java.util.List;

public class OdontologoService {
    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardar(Odontologo o) throws Exception {
        return odontologoIDao.guardar(o);
    }

    public List<Odontologo> buscarTodos() throws SQLException {
        return odontologoIDao.buscarTodos();
    }
}
