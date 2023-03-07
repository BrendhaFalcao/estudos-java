package bytebankHerancaFuncionarios;

public class Administrador extends Funcionario implements Autenticavel {

    private MetodosAutenticacao autenticador;

    public Administrador(){

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
