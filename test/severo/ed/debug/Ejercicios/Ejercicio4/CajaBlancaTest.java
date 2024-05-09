package severo.ed.debug.Ejercicios.Ejercicio4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

    class CajaBlancaTest {
        @Test
        public void test1() {
            double[] numeros ={1,2,3,4,5,6,7,8,20} ;
            CajaBlanca inv = new CajaBlanca();

            double actual = inv.obtenerMedia(numeros);
            System.out.println(actual);



            /*int esperado = 654;
            Assertions.assertEquals(actual, esperado);
            actual = inv.obtenerMedia(100);
            esperado = 1;
            Assertions.assertEquals(actual, esperado);
            actual = inv.obtenerMedia(999);
            esperado = 999;
            Assertions.assertEquals(actual, esperado);
            actual = inv.obtenerMedia(1234);
            esperado = -1;
            Assertions.assertEquals(actual, esperado);
            actual = inv.obtenerMedia(54);
            esperado = -1;
            Assertions.assertEquals(actual, esperado);
            actual = inv.obtenerMedia(-10);
            esperado = -1;
            Assertions.assertEquals(actual, esperado);*/
        }

}