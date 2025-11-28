package resolucaoExercicios.exercicio4.usuarios;

public  class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha, boolean adiministrador) {
        super(nome, email, senha, true);
    }

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatorio gerado financeiro gerado");
    }

    public void consultarVendas() {
        System.out.println("Consutando vendas");
    }

    @Override
    public void login() {
        super.login();
    }

    @Override
    public void logoff() {
        super.logoff();
    }

    @Override
    public void alterarDados(String novoNome, String novoEmail) {
        super.alterarDados(novoNome, novoEmail);
    }

    @Override
    public void alterarSenha(String novaSenha) {
        super.alterarSenha(novaSenha);
    }
}
