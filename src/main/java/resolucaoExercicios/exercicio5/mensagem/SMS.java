package resolucaoExercicios.exercicio5.mensagem;

public record SMS() implements Mensagem {

    @Override
    public String getMensagem() {
        return "Mensagem enviada via SMS";
    }
}
