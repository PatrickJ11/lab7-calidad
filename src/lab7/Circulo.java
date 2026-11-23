package lab7;

public class Circulo implements Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public String getNombre() {
        return "Circulo";
    }
}
