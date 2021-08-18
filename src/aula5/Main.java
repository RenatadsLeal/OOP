package aula5;

public class Main {
    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Letícia", "letiX");
        UsuarioJogo usuario2 = new UsuarioJogo("Amanda", "mandaBear");

        usuario1.setPontuacao(500);
        usuario1.Bonus(100);
        usuario1.setNivel();

        usuario2.setPontuacao(1000);
        usuario2.setNivel();
        usuario2.setNivel();

        System.out.printf("Nome de usuário: %s \n Nickname: %s \n Nível: %s \n Pontuação: %s \n",
                usuario1.getNome(), usuario1.getNickname(),usuario1.getNivel(), usuario1.getPontuacao());

        System.out.printf("Nome de usuário: %s \n Nickname: %s \n Nível: %s \n Pontuação: %s ",
                usuario2.getNome(), usuario2.getNickname(),usuario2.getNivel(), usuario2.getPontuacao());
    }
}
