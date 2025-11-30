package resolucaoExercicios.exercicio5.tributo;

public record Cultura(double valor) implements Tributo {
    private static final double tributoPercetual = 0.04;


    @Override
    public double getTributo() {
        return valor * tributoPercetual;
    }
}
