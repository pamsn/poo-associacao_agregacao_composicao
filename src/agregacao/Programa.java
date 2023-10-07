package agregacao;

public class Programa {
	
//	Neste exemplo, a classe Time tem um atributo capitao que é um objeto da classe Jogador. 
//	A associação é estabelecida quando o método definirCapitao() é chamado. 

	public static void main(String[] args) {
        Time time = new Time("Time A");
        Jogador jogador1 = new Jogador("Jogador 1");
        Jogador jogador2 = new Jogador("Jogador 2");

        time.definirCapitao(jogador1);

        System.out.println("Time: " + time.getNome());
        System.out.println("Capitão do time: " + time.getCapitao().getNome());
    }

	

}
