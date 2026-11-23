package lab7;

import java.util.List;
import java.util.Locale;

// Unica responsabilidad: mostrar el reporte (SRP). No conoce figuras concretas.
public class ReporteAreas {

    public void imprimir(List<Figura> figuras) {
        double total = 0;
        for (Figura f : figuras) {
            double area = f.calcularArea();
            System.out.println(String.format(Locale.US, "%-11s area = %.2f",
                f.getNombre(), area));
            total += area;
        }
        System.out.println(String.format(Locale.US, "Area total = %.2f", total));
    }
}
