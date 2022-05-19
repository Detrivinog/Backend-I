package Clase1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraGeometricaTest {

    @Test
    public void calcularAreaCua1(){
        FiguraGeometrica cuad1 = new FiguraGeometrica(4, "cuadrado");
        assertEquals("El área del cuadrado es 16 unidades", cuad1.calcularArea());
    }

    @Test
    public void calcularAreaCua2(){
        FiguraGeometrica cuad2 = new FiguraGeometrica(-1, "cuadrado");
        assertEquals("El valor del radio o lado debe ser mayor que cero", cuad2.calcularArea());
    }

    @Test
    public void calcularAreaCir1(){
        FiguraGeometrica cir1 = new FiguraGeometrica(-1, "circulo");
        assertEquals("El valor del radio o lado debe ser mayor que cero", cir1.calcularArea());
    }

    @Test
    public void calcularAreaCir2(){
        FiguraGeometrica cir2 = new FiguraGeometrica(2, "circulo");
        assertEquals("El área del circulo es 13 unidades", cir2.calcularArea());
    }
}