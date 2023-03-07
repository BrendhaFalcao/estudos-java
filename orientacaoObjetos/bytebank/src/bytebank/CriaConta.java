package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		
		// new Conta() usa o modelo class Conta para criar
		// um novo objeto de conta, e o primeiraConta
		// dá um nome à ela
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		primeiraConta.transfere(50, segundaConta);

		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
	}
}