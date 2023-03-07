package bytebankHerancaConta;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(111, 1111);
		ContaPoupanca cp = new ContaPoupanca(222, 2222);

		cc.deposita(100);
		cp.deposita(200);

		cc.transfere(50, cp);

		System.out.println(cc.getSaldo());

	}

}
