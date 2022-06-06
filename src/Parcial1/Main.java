package Parcial1;

import Parcial1.dao.OdontologoDaoH2;
import Parcial1.model.Odontologo;
import Parcial1.service.OdontologoService;

public class Main {
    public static void main(String[] args) throws Exception{
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
        BD.crearBD();
        Odontologo odontologo = new Odontologo("FG24DFSD", "David", "Gonzalez");
        odontologoService.guardar(odontologo);
    }
}
