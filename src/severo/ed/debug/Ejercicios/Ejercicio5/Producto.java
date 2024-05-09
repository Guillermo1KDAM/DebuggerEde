package severo.ed.debug.Ejercicios.Ejercicio5;

public class Producto {
    int producto(int x, int y) {
        int z = 0;
        while (x != 0) {
            if (x % 2 != 0) {
                z += y;
            }
            x /= 2;
            y *= 2;
        }
        return z;
    }
}
