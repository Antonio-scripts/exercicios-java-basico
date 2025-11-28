package resolucaoExercicios.exercicio4.ingressos;

public class IngressoFamilia extends Ingresso{
    private int quantidadePessoas;

    public IngressoFamilia(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int quantidadePessoas) {
        super(valor, nomeFilme, dublado);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double valorReal() {

        double total = getValor() * quantidadePessoas;

        if (quantidadePessoas > 3) {
            total *= 0.95;
        }
        return total;
    }
}
