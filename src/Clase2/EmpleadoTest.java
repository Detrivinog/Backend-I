package Clase2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    private Empleado empleado;
    private MenuClasico menu1;
    private MenuVegetariano menu2;
    private MenuInfantil menu3;

    @BeforeEach
    void init() {
        menu1 = new MenuClasico();
        menu2 = new MenuVegetariano(2, 2);
        menu3 = new MenuInfantil(4);

        empleado = new Empleado();
    }

    @Test
    void calcularCosto() {
        empleado.armarPaquete(Arrays.asList(menu1, menu2, menu3));
        empleado.mostrarPedido();
        assertEquals(46.28, empleado.calcularCosto());
    }
}