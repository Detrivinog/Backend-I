package Clase2;

public abstract class Menu {
    private float precioBase;

    public Menu(float precioBase) {
        this.precioBase = precioBase;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public double calcularPrecio(){
        return precioBase;
    }
}
