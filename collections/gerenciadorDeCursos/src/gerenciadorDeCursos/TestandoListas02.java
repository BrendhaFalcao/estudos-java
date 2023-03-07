package gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListas02 {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        //Cria um array de "Aula", que é uma classe        
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        //Como o array criado não foi de "Strings", e sim de "aula",
        //o método toString() que existe na mãe de "Aula" não funciona
        //é preciso sobrescrever ele na classe Aula
        
        //Collections.sort(aulas); *compara em ordem afabética*
        
        //Comparando pelo tempo de aula
        aulas.sort(Comparator.comparing(Aula::getTempo));
        
        System.out.println(aulas);
		
	}

}
