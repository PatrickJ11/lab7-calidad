package lab7;

// Version DESPUES de refactorizar: nombres claros, un metodo por figura
public class AreaFigurasDespues {

    private static final double PI = 3.14159;

    public static double areaCirculo(double radio) {
        return PI * radio * radio;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double areaTriangulo(double base, double altura) {
        return areaRectangulo(base, altura) / 2;
    }
}
