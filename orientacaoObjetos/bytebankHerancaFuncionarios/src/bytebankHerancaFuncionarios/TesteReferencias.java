package bytebankHerancaFuncionarios;

public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		Designer d = new Designer();
		
		g.setNome("Marcia");
		g.setSalario(5000.0);
		
		d.setNome("Bruna");
		d.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(d);
		
		System.out.println(d.getSalario());
		System.out.println(controle.getSoma());

	}

}
