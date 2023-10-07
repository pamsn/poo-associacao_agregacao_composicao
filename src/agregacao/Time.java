package agregacao;

public class Time {

	private String nome;
    private Jogador capitao;

    public Time(String nome) {
        this.nome = nome;
    }

    public void definirCapitao(Jogador jogador) {
        capitao = jogador;
    }

    public String getNome() {
        return nome;
    }

    public Jogador getCapitao() {
        return capitao;
    }

}
