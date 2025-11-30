package resolucaoExercicios.exercicio5.mensagem;

public record RedesSociais() implements Mensagem {
    @Override
    public String getMensagem() {
        return "Mensagem enviada via redes socias";
    }
}
