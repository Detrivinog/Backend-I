package Clase5;

public class ServicioDescargaProxy implements IServicioDescarga{
    @Override
    public String descarga(Usuario user) {
        IServicioDescarga.super.descarga(user);
        return "";
    }
}
