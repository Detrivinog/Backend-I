package Clase2;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    List<Menu> productos;

    public Empleado() {
        this.productos = new ArrayList<>();
    }

    public double calcularCosto(){
        double valorTotal = 0;
        for (Menu x:productos) {
            valorTotal += x.calcularPrecio();
        }
        return valorTotal;
    }

    public void armarPaquete(List<Menu> productos){
        this.productos = productos;
    }

    public void mostrarPedido(){
        System.out.println("El pedido es: ");
        for (Menu x:productos) {
            System.out.println(" - "+x.toString());
        }

        System.out.println("El costo total es "+calcularCosto()+ " pesos.");
    }

}
