package lab7;

import java.util.ArrayList;
import java.util.List;

public class PruebaTema7 {

    public static void main(String[] args) {
        System.out.println("=== 2. Refactorizacion (antes y despues) ===");
        System.out.println("ANTES   circulo r=3       : "
            + AreaFigurasAntes.calc("circulo", 3, 0));
        System.out.println("DESPUES circulo r=3       : "
            + AreaFigurasDespues.areaCirculo(3));
        System.out.println("ANTES   rectangulo 4x5    : "
            + AreaFigurasAntes.calc("rectangulo", 4, 5));
        System.out.println("DESPUES rectangulo 4x5    : "
            + AreaFigurasDespues.areaRectangulo(4, 5));
        System.out.println("ANTES   triangulo 6x2     : "
            + AreaFigurasAntes.calc("triangulo", 6, 2));
        System.out.println("DESPUES triangulo 6x2     : "
            + AreaFigurasDespues.areaTriangulo(6, 2));

        System.out.println("\n=== 3. TDD: numeros primos ===");
        List<Integer> primos = new ArrayList<>();
        for (int n = 1; n <= 20; n++) {
            if (NumeroPrimo.esPrimo(n)) {
                primos.add(n);
            }
        }
        System.out.println("Primos del 1 al 20: " + primos);
        System.out.println("esPrimo(7919) = " + NumeroPrimo.esPrimo(7919));
        System.out.println("esPrimo(-5)   = " + NumeroPrimo.esPrimo(-5));

        System.out.println("\n=== 4. SOLID: figuras ===");
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(3));
        figuras.add(new Rectangulo(4, 5));
        figuras.add(new Triangulo(6, 2)); // figura nueva, sin cambiar ReporteAreas
        new ReporteAreas().imprimir(figuras);
    }
}
