package sintaxeVariaveisEFluxos;

public class testaLacoMultip {

	public static void main(String[] args) {
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("Tabuada do " + contador);
			for(int tabuada = 1; tabuada <=10; tabuada++) {
				System.out.print(tabuada * contador);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println();
		}

	}

}
