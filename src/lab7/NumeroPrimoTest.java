package lab7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumeroPrimoTest {

    @Test
    void primosPequenos() {
        assertTrue(NumeroPrimo.esPrimo(2));
        assertTrue(NumeroPrimo.esPrimo(3));
        assertTrue(NumeroPrimo.esPrimo(7));
        assertTrue(NumeroPrimo.esPrimo(13));
    }

    @Test
    void compuestosNoSonPrimos() {
        assertFalse(NumeroPrimo.esPrimo(4));
        assertFalse(NumeroPrimo.esPrimo(9));
        assertFalse(NumeroPrimo.esPrimo(100));
    }

    @Test
    void menoresQueDosNoSonPrimos() {
        assertFalse(NumeroPrimo.esPrimo(1));
        assertFalse(NumeroPrimo.esPrimo(0));
        assertFalse(NumeroPrimo.esPrimo(-5));
    }

    @Test
    void primoGrande() {
        assertTrue(NumeroPrimo.esPrimo(7919));
    }
}
