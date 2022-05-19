package Clase2;

public class MenuVegetariano extends Menu{
    int especias;
    int salsasVegetarianas;

    public MenuVegetariano(float precioBase, int especias, int salsasVegetarianas) {
        super(precioBase);
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
        return super.calcularPrecio() + 0.01*this.especias + 2*this.salsasVegetarianas;
    }
}
