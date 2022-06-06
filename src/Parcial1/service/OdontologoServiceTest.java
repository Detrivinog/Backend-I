package Parcial1.service;

import Parcial1.BD;
import Parcial1.dao.OdontologoDaoH2;
import Parcial1.model.Odontologo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OdontologoServiceTest {

    private static OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @BeforeEach
    public void guardarDatosSet() throws Exception {
        BD.crearBD();
        Odontologo o1 = odontologoService.guardar(new Odontologo("AX24DFSD", "Andres", "Soto"));
        Odontologo o2 = odontologoService.guardar(new Odontologo("BZ90DFSD", "Camila", "Perez"));
        Odontologo o3 = odontologoService.guardar(new Odontologo("CY70DFSD", "Andrea", "Rios"));
    }

    @Test
    public void buscarTodosTest() throws Exception {
        List<Odontologo> odontologos = odontologoService.buscarTodos();
        assertFalse(odontologos.isEmpty());
        assertTrue(odontologos.size() > 2);
        for(Odontologo x:odontologos){
            System.out.println(x.toString());
        }
    }



}