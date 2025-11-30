package resolucaoExercicios.exercicio5.tributo;

public record Vestuario(double valor) implements Tributo {
    private static final double tributoPercetual = 0.025;


    @Override
    public double getTributo() {
        return valor * tributoPercetual;
    }
}
