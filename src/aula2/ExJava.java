package aula2;

import java.util.Scanner;

public class ExJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu primeiro nome");
        String nome = scanner.nextLine();
        System.out.println("Insira seu sobrenome");
        String sobrenome = scanner.nextLine();
        String iniciais = String.format("%s.%s.", nome.substring(0,1), sobrenome.substring(0,1));
        System.out.println("Digite o dia do seu nascimento:");
        int dia = scanner.nextInt();
        System.out.println("Digite o mês do seu nascimento:");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano do seu nascimento:");
        int ano = scanner.nextInt();

        System.out.printf("%s - %d/%d/%d", iniciais,dia,mes,ano);

    }
//    System.out.println("Iniciais:"+ nome.charAt(0) + sobrenome.charAt(0));
//    String meuNiverFormato = dataFormatada(dia,mes,ano);
//    static String dataFormatada(int dia, int mes, int ano) {      Função
//        return dia+"/"+mes"/"+ano;
//    }
}
