package lab7;

// Version ANTES de refactorizar: nombres poco claros y logica repetida
public class AreaFigurasAntes {

    public static double calc(String t, double a, double b) {
        double r = 0;
        if (t.equals("circulo")) {
            r = 3.14159 * a * a;
        } else if (t.equals("rectangulo")) {
            r = a * b;
        } else if (t.equals("triangulo")) {
            r = a * b / 2;
        }
        return r;
    }
}
