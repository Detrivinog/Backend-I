package Clase5;

public interface IServicioDescarga {

    default String descarga(Usuario user) {
        return null;
    }
}
