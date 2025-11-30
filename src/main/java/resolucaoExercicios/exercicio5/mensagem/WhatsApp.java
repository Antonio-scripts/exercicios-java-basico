package resolucaoExercicios.exercicio5.mensagem;

public record WhatsApp() implements Mensagem {
    @Override
    public String getMensagem() {
        return "Mesagem enviada via WhatsApp";
    }
}
