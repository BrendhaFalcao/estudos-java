package gerenciadorDeCursos;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	// usa List<> pq é mais genérico e engloba todos os tipos de listas

	private Set<Aluno> alunos = new HashSet<>();
	// map para associar o nome dos alunos ao número de matrícula
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	// transformando esse get em read only para classes fora dessa aqui
	// método unmodifiableList()
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	// transformando a lista de cursos em string para poder
	// imprimir o objeto Curso instanciado
	@Override
	public String toString() {
		return "[Curso:" + this.getNome() + ",tempo total:" + this.getTempoTotal() + ", aulas: [" + this.aulas + "] ]";
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	// outra forma de fazer getTempoTotal() seria criando um atributo tempoTotal
	// e adicionando this.tempoTotal += aula.getTempo(); no método adiciona

	public void matricula(Aluno aluno) {
		// adiciona no set de alunos
		this.alunos.add(aluno);

		// cria a relanção no map
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		return this.matriculaParaAluno.get(numero);
	}
}
