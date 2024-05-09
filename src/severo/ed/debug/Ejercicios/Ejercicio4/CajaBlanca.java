package severo.ed.debug.Ejercicios.Ejercicio4;

public class CajaBlanca {
    public double obtenerMedia(double[] numeros) {
    double suma = 0;
    //No hay un fallo en el ejercicio, simplemente el if va a entrar siempre independientemente del array
    for (double valor: numeros) {
        if (valor >= 20 || valor <=50) {
            suma += valor;
        }
    }
    return suma / numeros.length;
    }
}
