package Clase1;

public class FiguraGeometrica {
    private int lado;
    private String tipo;

    public FiguraGeometrica(int lado, String tipo) {
        this.lado = lado;
        this.tipo = tipo;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String calcularArea(){
        if (this.lado <= 0) {
            return "El valor del radio o lado debe ser mayor que cero";
        }
        if (this.tipo.equals("cuadrado")){
            return "El área del "+ this.tipo +" es "+ this.lado*this.lado +" unidades";
        }else if (this.tipo.equals("circulo")){
            return "El área del "+ this.tipo +" es "+ Math.round(Math.PI*this.lado*this.lado) +" unidades";
        }
        return "";
    }
}
