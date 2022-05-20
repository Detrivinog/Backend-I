package Clase4;

public class Rechazado extends CompruebaCalidad{
    public Rechazado(boolean prueba, CompruebaCalidad siguiente, Articulo articulo) {
        super(prueba, siguiente, articulo);
    }

    @Override
    public String probarCalidad(Articulo articulo) {
        return "";
    }
}
