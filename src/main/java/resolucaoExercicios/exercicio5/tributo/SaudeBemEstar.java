package resolucaoExercicios.exercicio5.tributo;

public record SaudeBemEstar(double valor) implements Tributo {
    private static final double tributoPercetual = 0.015;


    @Override
    public double getTributo() {
        return valor * tributoPercetual;
    }
}
