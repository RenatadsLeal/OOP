package exerciciospg.stringint;

import java.util.Scanner;

public class PraticaInt {
    public static void main(String[] args){
        String nome;
        String sobrenome;
        char inicial1;
        char inicial2;

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Insira seu nome");
        nome = scanner.nextLine();
        System.out.println("Insira seu sobrenome");
        sobrenome = scanner.nextLine();
        inicial1 = nome.charAt(0);
        inicial2 = sobrenome.charAt(0);
        System.out.println(""+ inicial1 + inicial2);
    }
}
