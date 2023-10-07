package associacao;

public class Programa {
	
//	Neste exemplo, a classe Aluno tem um atributo orientador que é um objeto da classe Professor. 
//	A associação é estabelecida quando o método setOrientador() é chamado. 

	public static void main(String[] args) {
        Aluno aluno = new Aluno("João");
        Professor professor = new Professor("Prof. A");

        aluno.setOrientador(professor);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Orientador do aluno: " + aluno.getOrientador().getNome());
   

	}

}
