package Clase4;

public class Lote extends CompruebaCalidad{

    public Lote(boolean prueba, CompruebaCalidad siguiente, Articulo articulo) {
        super(prueba, siguiente, articulo);
    }

    @Override
    public String probarCalidad(Articulo articulo) {

        return null;
    }
}
