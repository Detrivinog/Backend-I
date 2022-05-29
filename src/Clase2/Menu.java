package Clase2;

public abstract class Menu {
    private double precioBase;

    public Menu() {
        this.precioBase = 10;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double calcularPrecio(){
        return precioBase;
    }

    @Override
    public abstract String toString();
}
