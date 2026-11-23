package lab7;

// Figura NUEVA: se agrega sin modificar ninguna clase existente (OCP)
public class Triangulo implements Figura {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura / 2;
    }

    public String getNombre() {
        return "Triangulo";
    }
}
