package Clase2;

public class MenuVegetariano extends Menu{
    int especias;
    int salsasVegetarianas;

    public MenuVegetariano(int especias, int salsasVegetarianas) {
        this.especias = especias;
        this.salsasVegetarianas = salsasVegetarianas;
    }

    public int getEspecias() {
        return especias;
    }

    public void setEspecias(int especias) {
        this.especias = especias;
    }

    public int getSalsasVegetarianas() {
        return salsasVegetarianas;
    }

    public void setSalsasVegetarianas(int salsasVegetarianas) {
        this.salsasVegetarianas = salsasVegetarianas;
    }

    @Override
    public double calcularPrecio() {
        double precioSinEspecias = super.calcularPrecio() + 2*this.salsasVegetarianas;
        return precioSinEspecias + precioSinEspecias*0.01*especias;
    }

    @Override
    public String toString() {
        return "Menu Vegetariano con " + this.especias + " especias y "+ this.salsasVegetarianas + " salas vegetarianas.";
    }
}
