package aula3;

// import aula.1.*; --> Importa todos arquivos da pasta

public class Revisao {
    public static void main(String[] args) {
        String linha = "Renata 1.57 23/05/89";
        String [] campos = linha.split(" ");  // Array de Strings

        String nome = campos[0];
        Double altura = Double.parseDouble(campos[1]);  // Converte String em Double
        String aniversario = campos[2];

        System.out.println("O nome da pessoa é "+nome);


    }
}
