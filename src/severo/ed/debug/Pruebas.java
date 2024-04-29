package severo.ed.debug;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        int limite =10;
        for(int i = 0; i<limite; i++){
            System.out.print(funcionFibonacci(i) + ", ");
        }
    }

    public static int funcionFibonacci(int num){
        if(num == 0 || num==1)
            return num;
        else
            return funcionFibonacci(num-1) + funcionFibonacci(num-2);
    }

}
