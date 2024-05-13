package Ejercicio7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import severo.ed.debug.Ejercicios.EjercicioCalculadora.Calculadora;

class CalculadoraTest {
    private Calculadora calcu;
    @BeforeEach
    public void preparar(){
        calcu = new Calculadora();
    }
    //Caja negra
   /* @Test
    void absoluto(){
        Assertions.assertEquals(8, calcu.absoluto(8));
        Assertions.assertEquals(4, calcu.absoluto(-4));
        Assertions.assertEquals(0, calcu.absoluto(0));
        //Assertions.assertEquals(-1, calcu.absoluto("a"));
    }*/
    //Caja blanca
    @Test
    void cajaBlanca(){
        calcu.suma(6,3);
        calcu.resta(6,3);
        calcu.multiplicacion(6,3);
        calcu.division(6,3);
        calcu.absoluto(6);
        calcu.absoluto(-6);
        calcu.esPar(6);
        calcu.inicializaMemoria();
        calcu.getMemoria();
    }
}