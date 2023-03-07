package gerenciadorDeCursos;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Brendha Falcão", 2345);
		Aluno a2 = new Aluno("Patrick Sá", 6534);
		Aluno a3 = new Aluno("Enzo Falcão", 9468);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
//		Aluno turini = new Aluno("Brendha Falcão", 2345);
//		System.out.println("E esse Turini, está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(turini));

	}

}
