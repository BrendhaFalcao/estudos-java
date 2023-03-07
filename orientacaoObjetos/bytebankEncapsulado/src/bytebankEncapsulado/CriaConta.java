package bytebankEncapsulado;

public class CriaConta {

	public static void main(String[] args) {
		Conta conta = new Conta(1234, 65437);
		Cliente fabio = new Cliente();
		
		conta.setTitular(fabio);
		conta.deposita(100.0);

		conta.saca(50.0);

		conta.deposita(70.0);

	}

}
