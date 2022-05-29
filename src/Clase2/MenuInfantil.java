package Clase2;

public class MenuInfantil extends Menu {
    int juguetes;

    public MenuInfantil(int juguetes) {
        this.juguetes = juguetes;
    }

    public int getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(int juguetes) {
        this.juguetes = juguetes;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() + 3*this.juguetes;
    }

    @Override
    public String toString() {
        return "Menu infantil con "+ this.juguetes+ " juguetes.";
    }
}
