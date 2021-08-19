package aula6.mesa;

public class Principal {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Meg", "SRD", 2015, 22.0, true, false);

        dog.podeSerAdotado();
        System.out.println(dog.podeSerPerdido());
        System.out.printf(dog.getNome() + " tem " + dog.getPeso() + "kg e nasceu em " + dog.getAnoNascimento());
    }
}
