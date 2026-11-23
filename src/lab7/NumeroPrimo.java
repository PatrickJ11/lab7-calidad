package lab7;

// Version final (despues de la fase Refactor del ciclo TDD)
public class NumeroPrimo {

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int divisor = 2; (long) divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
