package severo.ed.debug.Ejercicios.Ejercicio5;

import org.junit.jupiter.api.Test;
import severo.ed.debug.Ejercicios.Ejercicio4.CajaBlanca;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    public void test1() {

        Producto inv = new Producto();

        int actual = inv.producto(2, 3);
        System.out.println(actual);

    }
}