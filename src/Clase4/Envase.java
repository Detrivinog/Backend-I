package Clase4;

public class Envase extends CompruebaCalidad{

    public Envase(boolean prueba, CompruebaCalidad siguiente, Articulo articulo) {
        super(prueba, siguiente, articulo);
    }

    @Override
    public String probarCalidad(Articulo articulo) {
        return "";
    }
}
