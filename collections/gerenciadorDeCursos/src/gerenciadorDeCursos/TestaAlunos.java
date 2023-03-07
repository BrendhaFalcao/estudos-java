package gerenciadorDeCursos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Brendha Falcão");
		alunos.add("Patrick Sá");
		alunos.add("Enzo Falcão");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Enzo Falcão");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		

		System.out.println(pauloEstaMatriculado);
		System.out.println(alunos);
		
//		para usar um set como um list
//		List<String> alunosEmLista = new ArrayList<>(alunos);

	}

}
