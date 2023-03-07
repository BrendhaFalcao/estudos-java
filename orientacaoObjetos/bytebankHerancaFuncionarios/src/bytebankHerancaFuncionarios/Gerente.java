package bytebankHerancaFuncionarios;

public class Gerente extends Funcionario implements Autenticavel {

    private MetodosAutenticacao autenticador;

    public Gerente(){

        this.autenticador = new MetodosAutenticacao();
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
    
    @Override
	public double getBonificacao() {
		return this.getSalario() * 0.1;
	}

}
