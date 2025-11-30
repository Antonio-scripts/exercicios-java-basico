package resolucaoExercicios.exercicio5.mensagem;

public record Email() implements Mensagem {
    @Override
    public String getMensagem() {
        return "Mensagem enviada via E-mail";
    }
}
