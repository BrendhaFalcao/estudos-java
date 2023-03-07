package gerenciadorDeCursos;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	// Para que o Collections.sort consiga ordenar um objeto do
	// tipo "Aula", você precisa implementar a interface Comparable
	// definindo um critério de comparação para os objetos desse tipo
	// depois reescreve o método

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}

}
