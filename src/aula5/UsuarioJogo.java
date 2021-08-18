package aula5;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao = 0;
    private int nivel = 1;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void setPontuacao(int valor) {
        this.pontuacao += valor;
    }

    public void setNivel() {
        this.nivel++;
    }

    public void Bonus(int valor) {
        this.pontuacao += valor;
    }

    public String getNome() {
        return nome;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }
}
