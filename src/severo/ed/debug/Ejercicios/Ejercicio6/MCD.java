package severo.ed.debug.Ejercicios.Ejercicio6;

public class MCD {
    public int mcd(int a, int b) {
        if (a < 0 || b < 0) {
            System.err.println("Los números deben ser positivos");
            return -1;
        } else if (a == 1 || b == 1) {
            return 1;
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            return a;
        }
    }
}
