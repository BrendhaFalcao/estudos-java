package bytebankHerancaFuncionarios;

public class Cliente implements Autenticavel {

    private MetodosAutenticacao autenticador;

    public Cliente(){

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

}
