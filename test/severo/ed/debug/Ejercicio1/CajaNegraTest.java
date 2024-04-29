package severo.ed.debug.Ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import severo.ed.debug.Ejercicios.Ejercicio1.CajaNegra;

class CajaNegraTest {

    @Test
    public void test1() {
        CajaNegra inv = new CajaNegra();
        int actual = inv.getInvertido(456);
        int esperado = 654;
        Assertions.assertEquals(actual, esperado);
        actual = inv.getInvertido(100);
        esperado = 1;
        Assertions.assertEquals(actual, esperado);
        actual = inv.getInvertido(999);
        esperado = 999;
        Assertions.assertEquals(actual, esperado);
        actual = inv.getInvertido(1234);
        esperado = -1;
        Assertions.assertEquals(actual, esperado);
        actual = inv.getInvertido(54);
        esperado = -1;
        Assertions.assertEquals(actual, esperado);
        actual = inv.getInvertido(-10);
        esperado = -1;
        Assertions.assertEquals(actual, esperado);
    }
}