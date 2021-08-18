package aula3;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se é Primo");
        long numero = scanner.nextLong();
        System.out.println(testePrimo(numero));
    }
    static boolean testePrimo(long numero) {
        for (int j = 2; j < numero/2; j++) {
            if (numero % j == 0)
                return false;
        }
       return true;
    }
}
