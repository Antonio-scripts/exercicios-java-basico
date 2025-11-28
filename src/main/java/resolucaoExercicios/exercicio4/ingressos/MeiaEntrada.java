package resolucaoExercicios.exercicio4.ingressos;

public class MeiaEntrada extends Ingresso{

    public MeiaEntrada() {
    }

    public MeiaEntrada(double valor, String nomeFilme, boolean dublado) {
        super(valor, nomeFilme, dublado);
    }

    @Override
    public double valorReal() {
        return getValor() / 2 ;
    }

}
