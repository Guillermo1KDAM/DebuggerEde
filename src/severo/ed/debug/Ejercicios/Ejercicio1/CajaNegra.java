package severo.ed.debug.Ejercicios.Ejercicio1;

import java.util.Scanner;

public class CajaNegra {
    public static int getInvertido(int numero) {
        int invertido = 0;
        if (numero>99 && numero <1000) {
            int resto;
            while (numero > 0) {
                resto = numero % 10;
                invertido = invertido * 10 + resto;
                numero /= 10;
            }
        }else {
            invertido = -1;
            System.err.println("Tienes que introducir un numero de 3 cifras");
        }
        return invertido;
    }
    public static void main(String[] args) {
        int numero, invertido = 0;
        Scanner consola = new Scanner(System.in);
        System.out.println("Dame un numero");
        numero = consola. nextInt();
        invertido= getInvertido(numero);
        System.out.println("Numero invertido: " + invertido);

    }
}
