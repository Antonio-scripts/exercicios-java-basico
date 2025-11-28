package resolucaoExercicios.exercicio4.usuarios;

public class Vendedor extends Usuario{
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha, boolean adiministrador, int quantidadeVendas) {
        super(nome, email, senha, false);
        this.quantidadeVendas = quantidadeVendas;
    }

    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        super(nome, email, senha);
        this.quantidadeVendas = quantidadeVendas;
    }

    public void realizarVenda() {
        quantidadeVendas ++;
        System.out.println("Venda realizada");
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
