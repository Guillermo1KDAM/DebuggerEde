package severo.ed.debug.Ejercicios.Ejercicio6;

import org.junit.jupiter.api.Test;
class MCDTest {
    @Test
    public void test1() {

        MCD inv = new MCD();

        int actual = inv.mcd(2, 3);
        System.out.println(actual);
        int actual2 = inv.mcd(-1, -2);
        System.out.println(actual2);
        int actual3 = inv.mcd(1, 1);
        System.out.println(actual3);

    }

}