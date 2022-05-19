package Clase2;

import java.util.List;

public class Empleado {
    List<Menu> productos;

    public double calcularCosto(){
        double valorTotal = 0;
        for (Menu x:productos) {
            valorTotal += x.calcularPrecio();
        }
        return valorTotal;
    }

    public void armarPaquete(Menu menu){
        productos.add(menu);
    }

    public void mostrarPedido(){
        for (Menu x:productos) {
            System.out.println("El pedido es: ");
            System.out.println(" - "+x);
        }
    }

    public void mostrarCosto() {
        System.out.println("El costo total es "+calcularCosto()+ " pesos.");
    }
}
