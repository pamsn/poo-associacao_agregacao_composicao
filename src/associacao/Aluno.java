package associacao;


public class Aluno {
	
	private String nome;
    private Professor orientador;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public String getNome() {
        return nome;
    }

    public Professor getOrientador() {
        return orientador;
    }

}
