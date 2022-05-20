package Clase4;

public class Peso extends CompruebaCalidad{
    public Peso(boolean prueba, CompruebaCalidad siguiente, Articulo articulo) {
        super(prueba, siguiente, articulo);
    }

    @Override
    public String probarCalidad(Articulo articulo) {
        return null;
    }
}
