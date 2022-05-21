package Clase5;

public class ServicioDescarga implements IServicioDescarga{
    @Override
    public String descarga(Usuario user) {
        IServicioDescarga.super.descarga(user);
        return "";
    }
}
