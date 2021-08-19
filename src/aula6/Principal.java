package aula6;

import java.time.LocalDate;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Date data = new Date(); e coloca data no parêmetro
        // ou new Date() no parâmetro
        Impressora impressora = new Impressora("Epson", "wifi", LocalDate.of(2021,9,15), 100);
        impressora.imprimir("Olá Mundo");
    }
}
