package aula6.mesa;

public class Cachorro {
    private String nome;
    private boolean estaParaAdocao;
    private String raca;
    private int anoNascimento;
    private Double peso;
    private boolean possuiChip;
    private boolean estaFerido;

    public Cachorro(String nome, String raca, int anoNascimento, Double peso, boolean possuiChip, boolean estaFerido) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.possuiChip = possuiChip;
        this.estaFerido = estaFerido;
    }

    public boolean podeSerPerdido(){
        return this.possuiChip;
    }

    public void podeSerAdotado(){
        if (!this.estaFerido & this.peso > 5) {
            this.estaParaAdocao = true;
            System.out.println("Pode ser adotado!");;
        }else {
            System.out.println("Não pode ser adotado! :(");;
        }
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public boolean possuiChip(){
        return this.possuiChip;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
