package gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas01 {

	public static void main(String[] args) {
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		System.out.println(aulas.size());

		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula " + aula);
		});

		Collections.sort(aulas);
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);

	}

}
