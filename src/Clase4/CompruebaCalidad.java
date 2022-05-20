package Clase4;

public abstract class CompruebaCalidad {
    protected boolean prueba;
    protected CompruebaCalidad siguiente;
    protected Articulo articulo;

    public CompruebaCalidad(boolean prueba, CompruebaCalidad siguiente, Articulo articulo) {
        this.prueba = prueba;
        this.siguiente = siguiente;
        this.articulo = articulo;
    }

    public abstract String probarCalidad(Articulo articulo);

    public CompruebaCalidad getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(CompruebaCalidad siguiente) {
        this.siguiente = siguiente;
    }
}
