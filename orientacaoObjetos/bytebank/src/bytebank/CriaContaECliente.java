package bytebank;

public class CriaContaECliente {

	public static void main(String[] args) {
		Conta contaDaBrendha = new Conta();
		// Cliente clienteBrendha = new Cliente();
		// outra forma de iniciar o objeto cliente
		contaDaBrendha.titular = new Cliente();
		contaDaBrendha.titular.nome = "Brendha Falcão";
		contaDaBrendha.titular.profissao = "Programadora";

		System.out.println("O nome do cliente é " 
				+ contaDaBrendha.titular.nome 
				+ ", e sua profissão é "
				+ contaDaBrendha.titular.profissao);

	}

}
