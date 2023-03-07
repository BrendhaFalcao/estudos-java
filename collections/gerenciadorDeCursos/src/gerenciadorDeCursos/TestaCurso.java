package gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		//instancia um novo objeto Curso
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

		/*
		 * 1 forma de adicionar aulas na lista do Curso
		 
		 *inclui na List<Aula> a lista de aulas
		List<Aula> aulas = javaColecoes.getAulas();
		
		*adiciona uma aula
		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
			
		 */
		
		//2 forma de adicionanar uma nova aula à lista do Curso
		//mais rápido
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		//não é possível usar o Collections.sort() aqui porque a lista de aulas é imutável
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);
        
        //"clonando" aulasImutáveis para poder usar o método sort       
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
		
	}

}
