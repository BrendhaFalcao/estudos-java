package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaUm = new Conta();
		contaUm.saldo = 100;
		contaUm.deposita(50);
		System.out.println(contaUm.saldo);

	}

}
