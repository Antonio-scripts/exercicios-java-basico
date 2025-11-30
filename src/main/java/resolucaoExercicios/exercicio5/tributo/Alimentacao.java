package resolucaoExercicios.exercicio5.tributo;

public record Alimentacao(double valor) implements Tributo {

    private static final double tributoPercetual = 0.01;

    @Override
    public double getTributo() {
        return valor * tributoPercetual;
    }
}
