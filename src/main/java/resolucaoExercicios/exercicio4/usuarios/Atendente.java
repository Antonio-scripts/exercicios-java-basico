package resolucaoExercicios.exercicio4.usuarios;

public class Atendente extends Usuario{
    private double totalCaixa;

    public Atendente(String nome, String email, String senha, boolean adiministrador, double totalCaixa) {
        super(nome, email, senha, false);
        this.totalCaixa = totalCaixa;
    }

    public Atendente(String nome, String email, String senha, double totalCaixa) {
        super(nome, email, senha);
        this.totalCaixa = totalCaixa;
    }

    public void receberPagamento(double valor) {
        totalCaixa += valor;
        System.out.printf("Pagamento R$ %s recebido \n", valor);
    }

    public void fecharCaixa() {
        System.out.printf("Total caixa = R$ %s \n", totalCaixa);
        System.out.println("Caixa fechado com sucesso!");
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
